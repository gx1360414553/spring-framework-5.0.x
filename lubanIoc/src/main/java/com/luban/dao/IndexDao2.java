package com.luban.dao;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.beans.BeansException;

public class IndexDao2 extends AbstractAutoProxyCreator {
	public IndexDao2(){

		System.out.println("dao1-init");
	}

	public void query(){
		System.out.println("index1");
	}


	@Override
	protected Object[] getAdvicesAndAdvisorsForBean(Class<?> beanClass, String beanName, TargetSource customTargetSource) throws BeansException {


		return new Object[0];
	}
}
