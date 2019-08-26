package cn.ffcs.msa.springAop.four.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AopAdvisorHelper implements MethodBeforeAdvice,AfterReturningAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable 
	{
		System.out.println("类"+target+"执行了"+method.getName()+"方法。");
		 //数据库做一个插入操作
	}
	
	/**
	 * returnValue 方法返回值
	 * method 执行的方法
	 * args 执行方法的参数
	 * target 执行的类
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable 
	{
		System.out.println("类"+target+"执行了"+method.getName()+"方法。");
	}

}
