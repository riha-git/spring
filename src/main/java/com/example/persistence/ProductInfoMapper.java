package com.example.persistence;
import java.util.List;

import com.example.domain.ProductInfo;
import com.example.domain.SearchProductInfo;

public interface ProductInfoMapper {
	public void insert(ProductInfo productInfo);
	public List<ProductInfo> select(SearchProductInfo searchProductInfo);
	public int count(ProductInfo productInfo);
}
