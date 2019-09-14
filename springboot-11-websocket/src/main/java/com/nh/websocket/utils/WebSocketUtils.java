package com.nh.websocket.utils;

import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname WebSocketUtils
 * @Description TODO
 * @Date 2019/9/10 12:09 AM
 * @Created by nihui
 */
public class WebSocketUtils {
    public static final Map<String,Session> ONLINE_USER_SESSIONS = new ConcurrentHashMap<>();


    public static void sendMessage(Session session,String message){
        if (session ==null){
            return ;
        }
        final RemoteEndpoint.Basic basic = session.getBasicRemote();

        if (basic==null){
            return;
        }
        try{
            basic.sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendMessageAll(String message){
        ONLINE_USER_SESSIONS.forEach((sessionId,session)->sendMessage(session,message));
    }
}
