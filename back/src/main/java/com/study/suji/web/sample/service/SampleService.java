/*
 * Copyright Suji. All rights Reserved. 
 */
package com.study.suji.web.sample.service;

import com.study.suji.web.sample.model.Sample;

/**
 * @author SuJi,Lee
 */
public interface SampleService {
	int getDataCnt(String param);

	Sample getData(String param);

}
