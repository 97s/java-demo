package com.levo.dockerexample.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker-java-app")
public class HelloController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "{\"info\": \"接口调用测试服务\", \"method\": \"GET\", \"success\": true, \"time\": " + new Date() + ", \"by\": \"chenzhongrun\"}";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String testPost() {
		return "{\"info\": \"接口调用测试服务\", \"method\": \"POST\", \"success\": true, \"time\": " + new Date() + ", \"by\": \"chenzhongrun\"}";
	}

	@RequestMapping(value = "/test", method = RequestMethod.PUT)
	public String tesPut() {
		return "{\"info\": \"接口调用测试服务\", \"method\": \"PUT\", \"success\": true, \"time\": " + new Date() + ", \"by\": \"chenzhongrun\"}";
	}

	@RequestMapping(value = "/test", method = RequestMethod.DELETE)
	public String testDelete() {
		return "{\"info\": \"接口调用测试服务\", \"method\": \"DELETE\", \"success\": true, \"time\": " + new Date() + ", \"by\": \"chenzhongrun\"}";
	}
}


