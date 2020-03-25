package com.nihui.restlog.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.google.common.collect.Maps;
import com.nihui.restlog.util.exception.JsonUtilErrorException;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author 王云龙
 * @date 2017年3月10日 上午9:40:37
 * @version 1.0
 * @description json处理工具类
 *
 */
public class JsonUtil {

	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:10:35
	 * @version 1.0
	 * @description bean转json 
	 * @param t
	 * @return
	 */
	public static <T> String toJson(T t) {
		if(t==null) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toJson转换错误", e);
		}
		return json;
	}
	
	/**
	 * 
	 * @author wangyunlong
	 * @date 2018年7月28日 上午8:24:31
	 * @version 1.0
	 * @description bean转json的同时，将Long类型转为String 
	 * @param t
	 * @return
	 */
	public static <T> String toJsonAndLongToString(T t) {
		if(t==null) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		/**
	     * 序列换成json时,将所有的long变成string
	     * 因为js中得数字类型不能包含所有的java long值
	     */
	    SimpleModule simpleModule = new SimpleModule();
	    simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
	    simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
	    mapper.registerModule(simpleModule);
		String json = null;
		try {
			json = mapper.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toJsonAndLongToString转换错误", e);
		}
		return json;
	}

	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:10:45
	 * @version 1.0
	 * @description 根据path将json中的某个部分转化为bean
	 * @param json 需要解析的json字符串
	 * @param path 需要解析json中的某个路径，例如：/user/type，如果为null，则默认转换这个json字符串
	 * @param clazz 需要转换的class type
	 * @return
	 */
	public static <T> T toObject(String json, String path, Class<T> clazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		T t = null;
		if (StringUtils.isBlank(path)) {
			try {
				t = mapper.readValue(json, clazz);
			} catch (IOException e) {
				e.printStackTrace();
				throw new JsonUtilErrorException("toObject转换错误", e);
			}
			return t;
		}
		try {
			JsonNode jsonRoot = mapper.readTree(json);
			JsonNode jsonNode = jsonRoot.at(path);
			if (jsonNode.isMissingNode()) {
				return t;
			}
			t = mapper.readValue(jsonNode.toString(), clazz);
		}  catch (IOException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toObject转换错误", e);
		}
		return t;
	}

	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:12:27
	 * @version 1.0
	 * @description 将json转化为bean 
	 * @param json 需要解析的json字符串
	 * @param clazz 需要转换的class type
	 * @return
	 */
	public static <T> T toObject(String json, Class<T> clazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		return toObject(json, null, clazz);
	}

	/**
	 * 
	 * @author 王云龙
	 * @date 2017年3月16日 下午5:40:57
	 * @version 1.0
	 * @description 
	 *
	 * @param json
	 * @param clazz
	 * @return
	 */
	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:13:12
	 * @version 1.0
	 * @description 将json字符串转为对象List 
	 * @param json 需要解析的json字符串
	 * @param clazz List中存储的对象类型
	 * @return
	 */
	public static <T> List<T> toObjectList(String json, Class<T> clazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, clazz);
		try {
			List<T> tList = mapper.readValue(json, javaType);
			return tList;
		} catch (IOException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toObjectList转换错误", e);
		}
	}

	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:14:48
	 * @version 1.0
	 * @description 根据path将json中的某个部分转化为List<Bean> 
	 * @param json 需要解析的json字符串
	 * @param path 需要解析json中的某个路径，例如：/user/type，如果为null，则默认转换这个json字符串
	 * @param clazz List中存储的对象类型
	 * @return
	 */
	public static <T> List<T> toObjectList(String json, String path, Class<T> clazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		if (StringUtils.isBlank(path)) {
			JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, clazz);
			try {
				List<T> tList = mapper.readValue(json, javaType);
				return tList;
			} catch (IOException e) {
				e.printStackTrace();
				throw new JsonUtilErrorException("toObjectList转换错误", e);
			}
		} else {
			try {
				JsonNode jsonRoot = mapper.readTree(json);
				JsonNode jsonNode = jsonRoot.at(path);
				if (jsonNode.isMissingNode()) {
					return null;
				}
				JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, clazz);
				List<T> tList = mapper.readValue(jsonNode.toString(), javaType);
				return tList;
			} catch (IOException e) {
				e.printStackTrace();
				throw new JsonUtilErrorException("toObjectList转换错误", e);
			}
		}
	}
	
	/**
	 * 
	 * @author wangyunlong
	 * @date 2018年7月9日 上午10:02:56
	 * @version 1.0
	 * @param <V>
	 * @description 将json字符串转换为Map 
	 * @param json	需要转换的JSON字符串
	 * @param keyClazz	Map中key的类型
	 * @param valueClazz	Map中value的类型
	 * @return
	 */
	public static <T, V> Map<T,V> toObjectMap(String json, Class<T> keyClazz, Class<V> valueClazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().constructParametricType(Map.class, keyClazz, valueClazz);
		try {
			Map<T,V> map = mapper.readValue(json, javaType);
			return map;
		} catch (IOException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toObjectMap转换错误----->"+json, e);
		}
	}
	
	public static <T, V> TreeMap<T,V> toObjectTreeMap(String json, Class<T> keyClazz, Class<V> valueClazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().constructParametricType(TreeMap.class, keyClazz, valueClazz);
		try {
			TreeMap<T,V> map = mapper.readValue(json, javaType);
			return map;
		} catch (IOException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toObjectTreeMap转换错误", e);
		}
	}
	
	/**
	 * 
	 * @author wangyunlong
	 * @date 2018年7月13日 下午6:48:11
	 * @version 1.0
	 * @description 将json字符串转换为泛型对象 
	 * @param json 需要转换的JSON字符串
	 * @param keyClazz 对象类型
	 * @param valueClazz 对象类型的泛型
	 * @return
	 */
	public static <T> T toObjectT(String json, Class<T> keyClazz, Class<?>... valueClazz) {
		if(StringUtils.isBlank(json)) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		JavaType javaType = mapper.getTypeFactory().constructParametricType(keyClazz, valueClazz);
		try {
			T t = mapper.readValue(json, javaType);
			return t;
		} catch (IOException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("toObjectT转换错误", e);
		}
	}

	/**
	 * 
	 * @author 王云龙
	 * @date 2017年3月27日 上午11:37:51
	 * @version 1.0
	 * @description 
	 *
	 * @param json
	 * @param nodes
	 * @return
	 */
	/**
	 * 
	 * @author wangyunlong
	 * @date 2017年8月13日 上午1:15:59
	 * @version 1.0
	 * @description 向已有json字符串添加新节点 
	 * @param json 原始的json字符串
	 * @param nodes 需要添加的到json字符串中的json节点
	 * @return
	 */
	public static String addJsonStrNode(String json, Map<String, Object> nodes) {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> jsonMap = null;
		String jsonResult = null;
		try {
			jsonMap = toObjectMap(json, String.class, Object.class);
			jsonMap.putAll(nodes);
			jsonResult = mapper.writeValueAsString(jsonMap);
			return jsonResult;
		}  catch (IOException e) {
			e.printStackTrace();
			throw new JsonUtilErrorException("addJsonStrNode转换错误", e);
		}
	}
	
	public static String mergeToStr(String...jsons) {
		if(jsons==null) {
			return null;
		}
		Map<String, Object> jsonMapResult = Maps.newHashMap();
		for (int i = 0; i < jsons.length; i++) {
			if(StringUtils.isNoneBlank(jsons[i])) {
				Map<String, Object> jsonMap = toObjectMap(jsons[i], String.class, Object.class);
				if(jsonMap!=null) {
					jsonMapResult.putAll(jsonMap);
				}
			}
		}
		String result = toJson(jsonMapResult);
		return result;
	}
	
	
//	public static void main(String[] args) {
//		String applyReason = "付费会员配置后台美豆规则统一---屏蔽返美豆数据缓存规划";
//		applyReason = "{\"reason\":\""+applyReason+"\"}";
//		Map<String, Object> map = toObjectMap(applyReason, String.class, Object.class);
//		System.out.println(map);
//	}
}
