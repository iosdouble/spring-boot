package com.nihui.restlog.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ExceptionMsg implements Serializable {
	
	private static final long serialVersionUID = -7447689818750410956L;


	@JsonProperty("error_id")
	private String errorId;
	

	@JsonProperty("error_code")
	private String errorCode;
	

	@JsonProperty("error_msg")
	private String errorMsg;

}
