package com.nihui.restlog.bean;


import com.nihui.restlog.util.JsonUtil;

/**
 *
 * @description Response抽象基础类，继承了序列化接口，同时显示了toJson方法
 *
 */
public abstract class AbsJsonResp implements IResp {

	private static final long serialVersionUID = 3451833393183790558L;

	public String toJson() {
		return JsonUtil.toJsonAndLongToString(this);
	}

	/**
	 * 
	 * @author 王云龙
	 * @date 2017年12月25日 上午11:23:14
	 * @version 1.0
	 * @description 重写toString方法，返回json
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return this.toJson();
	}
	
	
}
