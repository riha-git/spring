package com.example.web.db;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.domain.ProductInfo;
import com.example.service.DBSampleService;

@Controller
//セッションで管理するオブジェクトのキー名を指定
@SessionAttributes("insertForm")
public class InsertSampleController {
	
	@Autowired
	private DBSampleService service;
	
	@ModelAttribute("insertForm")
	public InsertSampleForm setForm()
	{
		return new InsertSampleForm();
	}
	
	@RequestMapping("/insert-sample-input")
	public String input()
	{
		return "db/insertSampleInput";
	}
	
	@RequestMapping("/insert-sample-conf")
	public String conf(@Validated @ModelAttribute("insertForm") InsertSampleForm form, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "db/insertSampleInput";
		}
		return "db/insertSampleConf";
	}
	
	@RequestMapping(value = "/insert-sample-end", params = "back_btn")
	public String back(@ModelAttribute("insertForm") InsertSampleForm form)
	{
		return "db/insertSampleInput";
	}
	
	@RequestMapping(value = "/insert-sample-end", params = "insert_btn")
	public String end(@ModelAttribute("insertForm") InsertSampleForm form)
	{
		// データ登録に利用するドメインクラスのインスタンス化
		ProductInfo productInfo = new ProductInfo();

		// formクラスの値をドメインクラスにコピー
		BeanUtils.copyProperties(form, productInfo);
		
		// データ登録用サービス処理呼び出し
		service.insertProductInfo(productInfo);

		// 完了画面へのリダイレクト
		return "redirect:/insert-sample-end?finish";
	}
	
	@RequestMapping(value="/insert-sample-end", params="finish")
	public String finish(SessionStatus sessionStatus)
	{
		// @SessionAttributesで指定したオブジェクトをセッションから破棄
		sessionStatus.setComplete();
		
		return "db/insertSampleEnd";
	}
}
