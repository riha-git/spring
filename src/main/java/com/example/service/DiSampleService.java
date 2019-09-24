package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class DiSampleService {
	
	public String getDateMessage(Integer month, Integer day)
	{
		if(month == null || day == null)
		{
			return "現在日付は不明です";
		}
		else
		{
			return "現在日付は、" + month + "月" + day + "日";
		}
	}

}
