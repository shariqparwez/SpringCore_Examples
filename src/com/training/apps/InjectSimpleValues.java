package com.training.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;

public class InjectSimpleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		BeanFactory container = new ClassPathXmlApplicationContext("bean.xml");
		
		Customer cust1 = (Customer) container.getBean("custBean1");
		
		Customer cust2 = container.getBean("custBean1", Customer.class);
		
		Customer cust3 = container.getBean(Customer.class);
		
		System.out.println("Customer " + cust1);
		System.out.println("Hash Code Customer1 " + cust1.hashCode());
		System.out.println("Customer " + cust2);
		System.out.println("Hash Code Customer2 " + cust2.hashCode());
		System.out.println("Customer " + cust3);
		System.out.println("Hash Code Customer3 " + cust3.hashCode());
	}

}
