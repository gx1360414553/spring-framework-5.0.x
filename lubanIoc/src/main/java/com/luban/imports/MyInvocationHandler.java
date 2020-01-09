package com.luban.imports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年12月20日 22:32:00
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object object;

	public MyInvocationHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(object,args);
	}
}
