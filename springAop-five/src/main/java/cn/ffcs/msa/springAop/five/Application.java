package cn.ffcs.msa.springAop.five;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		method1();
	}
	
	 //aop-advisor实现aop拦截
	 private static void method1() 
	 {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop3.xml");
        CustomerBo customerBo = (CustomerBo) context.getBean("customerBo");
		//customerBo.addCustomer();
		
		//customerBo.addCustomerReturnValue();
		
		//customerBo.addCustomerThrowException();
        customerBo.addCustomerAround("yiibai");
	 }
	 
	 
}
