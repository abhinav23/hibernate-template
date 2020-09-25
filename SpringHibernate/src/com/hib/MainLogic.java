package com.hib;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
	Resource r=new ClassPathResource("spring.xml");
	BeanFactory b=new XmlBeanFactory(r);
InsertData id=(InsertData)b.getBean("hto");
Student making=new Student();
making.setSid(105);
making.setSmarks(877);
making.setSname("N Street");
id.insert(making);
	}

}
