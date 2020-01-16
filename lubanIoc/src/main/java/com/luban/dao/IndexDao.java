package com.luban.dao;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class IndexDao implements Dao, Serializable {


	/**
	 * 取钱
	 */
	public void query(){
		System.out.println("index");
		System.out.println("index");
		System.out.println("index");
		System.out.println("index");
		System.out.println("index");
		System.out.println("index");
		System.out.println("index");

	}


}
