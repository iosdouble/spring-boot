package com.nihui.restlog.bean;

import java.io.Serializable;

/**
 * @description Response对象的基础接口，继承了序列化接口
 *
 */
public interface IResp extends Serializable {
	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 下午10:37:49
	 * @version 1.0
	 * @description 将本对象json化 
	 * @return
	 */
	public String toJson();
}
