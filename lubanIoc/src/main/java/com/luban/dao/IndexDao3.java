package com.luban.dao;

import com.luban.test.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;


public class IndexDao3 implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//返回代理对象  Aop是实现AbstractAutoProxyCreator
		if (beanName.equals("indexDao")){
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{Dao.class},new MyInvocationHandler(bean));

		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}



}
