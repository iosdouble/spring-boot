package com.nh.websocket.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

import java.io.IOException;

import static com.nh.websocket.utils.WebSocketUtils.ONLINE_USER_SESSIONS;
import static com.nh.websocket.utils.WebSocketUtils.sendMessageAll;

/**
 * @Classname ChatRoomServerEndpoint
 * @Description TODO
 * @Date 2019/9/10 12:15 AM
 * @Created by nihui
 */
@RestController
@ServerEndpoint("/chat-room/{username}")
public class ChatRoomServerEndpoint {
    @OnOpen
    public void openSession(@PathVariable("username") String username, Session session){
        ONLINE_USER_SESSIONS.put(username,session);
        String message = "欢迎用户"+username+"来到聊天室";
        sendMessageAll(message);
    }

    @OnMessage
    public void onMessage(@PathVariable("username") String username, String message){
        sendMessageAll("用户"+username+":"+message);
    }

    @OnClose
    public void onClose(@PathVariable("username") String username,Session session){
        ONLINE_USER_SESSIONS.remove(username);
        sendMessageAll("用户"+username+" 离开了聊天室");
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @OnError
    public void onError(Session session,Throwable throwable){
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(throwable.getMessage());
        }
    }
}
