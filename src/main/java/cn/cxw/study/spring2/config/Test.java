package cn.cxw.study.spring2.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name:names) {
			System.out.println(name);
		}
	}
}
