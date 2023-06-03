package com.crammie.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping("/seonil")
	public String seonil() {
		return "쵀선일 바보! ||ヽ(*￣▽￣*)ノミ|Ю";
	}
}
