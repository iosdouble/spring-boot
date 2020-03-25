package com.nihui.restlog.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 环境获取
 */
public class EnvironmentUtil {
	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:36:34
	 * @version 1.0
	 * @description 获取Liunx的hostName 
	 * @return
	 */
	public static String getHostNameForLiunx() {  
        try {  
            return (InetAddress.getLocalHost()).getHostName();  
        } catch (UnknownHostException uhe) {  
            String host = uhe.getMessage(); // host = "hostname: hostname"  
            if (host != null) {  
                int colon = host.indexOf(':');  
                if (colon > 0) {  
                    return host.substring(0, colon);  
                }  
            }  
            return "UnknownHost";  
        }  
    }  
	
	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:36:51
	 * @version 1.0
	 * @description 获取主机hostName，兼容windows和liunx 
	 * @return
	 */
    public static String getHostName() {  
        if (System.getenv("COMPUTERNAME") != null) {  
            return System.getenv("COMPUTERNAME");  
        } else {  
            return getHostNameForLiunx();  
        }  
    } 
}
