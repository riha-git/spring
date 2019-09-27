package com.example.web.db;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.ProductInfo;
import com.example.domain.SearchProductInfo;
import com.example.service.DBSampleService;

@Controller
public class SearchSampleController {
	
	@Autowired
	private DBSampleService service;
	
	@ModelAttribute("searchForm")
	public SearchSampleForm setForm()
	{
		return new SearchSampleForm();
	}
	
	@RequestMapping("/search-sample")
	public String search()
	{
		return "db/searchSample";
	}
	
	@RequestMapping("/search-sample-list")
	public String list(@ModelAttribute("searchForm") SearchSampleForm form, Model model)
	{
		// データ検索に利用するドメインクラスのインスタンス化
		SearchProductInfo searchProductInfo = new SearchProductInfo();

		// formクラスの値をドメインクラスにコピー
		BeanUtils.copyProperties(form, searchProductInfo);
		
		// データ検索用サービス処理呼び出し
		List<ProductInfo> list = service.searchProductInfo(searchProductInfo);
		
		//Modelオブジェクトに格納
		model.addAttribute("productInfoList", list);

		// 完了画面へのリダイレクト
		return "db/searchSample";
	}
}
