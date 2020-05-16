package com.luban.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class IndexDao1 {

	@Autowired
	OrderDao orderDao;

	public IndexDao1(){
		System.out.println("dao1-init");
	}

	public void query(){
		System.out.println("index1");
	}


}
