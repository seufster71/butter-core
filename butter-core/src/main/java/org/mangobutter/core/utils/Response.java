package org.mangobutter.core.utils;

import java.util.HashMap;
import java.util.Map;

public class Response {

	private Map<String,Object> params;
	
	public Response(){
		setParams(new HashMap<String,Object>());
	}

	public Map<String,Object> getParams() {
		return params;
	}

	public void setParams(Map<String,Object> params) {
		this.params = params;
	}
	
}