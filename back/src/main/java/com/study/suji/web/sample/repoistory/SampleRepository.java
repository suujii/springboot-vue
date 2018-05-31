/*
 * Copyright Suji. All rights Reserved. 
 */
package com.study.suji.web.sample.repoistory;

import com.study.suji.web.sample.model.Sample;

/**
 * @author SuJi,Lee
 */
public interface SampleRepository {
	int selectDataCnt(String param);

	Sample selectData(String param);

}
