package com.luban.app;

import com.luban.anno.EanbleLuabn;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import org.springframework.context.annotation.*;
@ComponentScan({"com.luban"})
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EanbleLuabn // 集成AOP插件
public class Appconfig {

//	@Bean
//	public IndexDao1 indexDao1(){
//
//		return new IndexDao1();
//	}
//
//	@Bean
//	public IndexDao indexDao(){
//		indexDao1();
//		indexDao1();
//		return new IndexDao();
//	}
}
