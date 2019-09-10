package cn.ffcs.msa.springAop.six;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring测试类测试，方便使用sping的注解
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class App2 
{
	@Autowired
    private CustomerBo customerBo;

	 @Test
	 public void method1() 
	 {
		 //ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
		 //CustomerBo customerBo = (CustomerBo) context.getBean("customerBo");
		 
		 //第二种方式 @Configuration代替xml文件
		 //@EnableAspectJAutoProxy代替aop:aspectj-autoproxy标签
		 //@ComponentScan扫描spring组件
		 //ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
		 //CustomerBo customerBo = (CustomerBo) context.getBean("customerBoImpl");
/*		 customerBo.addCustomer();
		
		 customerBo.addCustomerReturnValue();
		
		 try {
			 customerBo.addCustomerThrowException();
		 } catch (Exception e) {
		 }*/
		 customerBo.addCustomerAround("yiibai");
	 }
	 
}
