package cn.ffcs.msa.springAop.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main(String[] args) 
	{
		method1() ;
	}
	 //aop-advisor实现aop拦截
	 private static void method1() 
	 {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
       CustomerBo customerBo = (CustomerBo) context.getBean("customerBo");
		customerBo.addCustomer();
		
		customerBo.addCustomerReturnValue();
		
		try {
			customerBo.addCustomerThrowException();
		} catch (Exception e) {
		}
       customerBo.addCustomerAround("yiibai");
	 }
	 
}
