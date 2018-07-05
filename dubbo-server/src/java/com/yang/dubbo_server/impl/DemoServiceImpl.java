package com.yang.dubbo_server.impl;

import com.yang.dubbo_server.DemoService;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		System.out.println("init:"+name);
		return "hello "+name;
	}

}
