package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.ProductInfo;
import com.example.domain.SearchProductInfo;
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
	
	// search data method
	public List<ProductInfo> searchProductInfo(SearchProductInfo searchProductInfo)
	{
		List<ProductInfo> list = mapper.select(searchProductInfo);
		return list;
	}
	
	// count data method
	public int selectProductCount(ProductInfo productInfo)
	{
		int num = mapper.count(productInfo);
		return num;
	}
}
