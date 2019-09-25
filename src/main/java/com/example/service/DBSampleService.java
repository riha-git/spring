package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.ProductInfo;
import com.example.persistence.ProductInfoMapper;

@Service
public class DBSampleService {
	
	@Autowired
	private ProductInfoMapper mapper;
	
	// insert data method
	public void insertProductInfo(ProductInfo productInfo)
	{
		mapper.insert(productInfo);
	}
}
