package cn.ffcs.msa.springAop.two;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AopAfterMethod2 implements AfterReturningAdvice
{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) 
	{
		System.out.println("HijackAfterMethod : After method hijacked!2");
	}

}
