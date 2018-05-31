/*
 * Copyright Suji. All rights Reserved. 
 */
package com.study.suji.web.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.suji.web.sample.model.Sample;
import com.study.suji.web.sample.service.SampleService;

/**
 * @author SuJi,Lee
 */
@RestController
public class SampleController {
	@Autowired
	private SampleService SampleService;

	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}

	@RequestMapping("/sample/cnt/{id}")
	public int sample1(@PathVariable("id") String id) {
		return SampleService.getDataCnt(id);
	}

	@RequestMapping("/sample/info/{id}")
	public Sample sample2(@PathVariable("id") String id) {
		return SampleService.getData(id);
	}
}
