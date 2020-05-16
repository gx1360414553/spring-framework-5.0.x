package com.luban.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class IndexDao implements Dao {


	/**
	 * 取钱
	 */
	public void query(){
		System.out.println("index");
	}

	/**
	 * 取钱
	 */
	public IndexDao(IndexDao1 indexDao1){
		System.out.println("index" + indexDao1);
	}

//	public IndexDao() {
//		System.out.println(" indexDao init");
//	}
}
