package cn.ffcs.msa.springAop.four.aop.advisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		method1();
	}
	
	 //aop-advisor实现aop拦截
	 private static void method1() 
	 {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        ISleepAdvisorable sleeper = (ISleepAdvisorable) context.getBean("human");
        sleeper.sleep("human");
        System.out.println("=======================================");
        ICarAdvisorable car = (ICarAdvisorable) context.getBean("carableAdvisorImpl");
        car.byCar();
	 }
	 
}
