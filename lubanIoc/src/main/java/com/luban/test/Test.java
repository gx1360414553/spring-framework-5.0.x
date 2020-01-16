package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.dao.Dao;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import com.luban.dao.IndexDao3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 高雄
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年12月20日 22:36:00
 */
public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:xxx.xml");
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		//添加自定义的BeanFactoryPostProcessor
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(xxxxxBeanFactoryPostProcessor);下面的也可以
//		annotationConfigApplicationContext.getBeanFactoryPostProcessors().add(xxxxxBeanFactoryPostProcessor);
		Dao dao = (Dao) annotationConfigApplicationContext.getBean("indexDao");

		dao.query();

	}
}
