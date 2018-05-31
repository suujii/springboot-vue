/*
 * Copyright Suji. All rights Reserved. 
 */
package com.study.suji.web.sample.repoistory;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.suji.web.sample.model.Sample;

/**
 * @author SuJi,Lee
 */
@Service
public class SampleRepositoryImpl implements SampleRepository {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	private static final String NAMESPACE = "SampleRepositoryImpl.";

	@Override
	public int selectDataCnt(String param) {
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectDataCnt", param);
	}

	@Override
	public Sample selectData(String param) {
		return sqlSessionTemplate.selectOne(NAMESPACE + "selectData", param);
	}
}
