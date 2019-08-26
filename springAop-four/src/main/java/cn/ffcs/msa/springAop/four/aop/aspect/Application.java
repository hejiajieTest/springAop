package cn.ffcs.msa.springAop.four.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ffcs.msa.springAop.four.aop.advisor.ICarAdvisorable;

public class Application {

	public static void main(String[] args) {
		method1();
	}
	
	 //aop-advisor实现aop拦截
	 private static void method1() 
	 {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop2.xml");
        ISleepAspectable sleeper = (ISleepAspectable) context.getBean("human");
        sleeper.sleep("human");
        System.out.println("=======================================");
        ICarableAspect car = (ICarableAspect) context.getBean("carable");
        car.byCar();
	 }
	 
	 
}
