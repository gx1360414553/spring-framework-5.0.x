package com.luban.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年05月16日 14:57:00
 */
@Component
public class OrderDao implements Order{

//	@Autowired
//	private IndexDao1 indexDao1;

	public void query(){
		System.out.println("OrderDao..........");
	}
}
