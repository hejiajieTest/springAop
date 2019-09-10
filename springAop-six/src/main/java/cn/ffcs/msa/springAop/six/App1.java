package cn.ffcs.msa.springAop.six;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * 注解版 @Configuration代替xml文件
 * @author Lenovo
 *
 */
public class App1 
{
	public static void main(String[] args) 
	{
		method1() ;
	}
	 //aop-advisor实现aop拦截
	 private static void method1() 
	 {
		 //ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		 //CustomerBo customerBo = (CustomerBo) context.getBean("customerBo");
		 
		 //第二种方式 @Configuration代替xml文件
		 //@EnableAspectJAutoProxy代替aop:aspectj-autoproxy标签
		 //@ComponentScan扫描spring组件
		 ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		 CustomerBo customerBo = (CustomerBo) context.getBean("customerBoImpl");
		 customerBo.addCustomer();
		
		 customerBo.addCustomerReturnValue();
		
		 try {
			 customerBo.addCustomerThrowException();
		 } catch (Exception e) {
		 }
		 customerBo.addCustomerAround("yiibai");
	 }
	 
}
