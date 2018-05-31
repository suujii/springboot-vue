/*
 * Copyright Suji. All rights Reserved. 
 */
package com.study.suji.web.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.suji.web.sample.model.Sample;
import com.study.suji.web.sample.repoistory.SampleRepository;

/**
 * @author SuJi,Lee
 */
@Service
public class SampleServiceImpl implements SampleService {
	@Autowired
	private SampleRepository sampleRepository;

	@Override
	public int getDataCnt(String param) {
		return sampleRepository.selectDataCnt(param);
	}

	@Override
	public Sample getData(String param) {
		return sampleRepository.selectData(param);
	}
}
