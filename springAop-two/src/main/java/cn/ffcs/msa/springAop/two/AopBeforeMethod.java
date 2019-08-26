package cn.ffcs.msa.springAop.two;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AopBeforeMethod implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) 
	{
		 System.out.println("HijackBeforeMethod : Before method hijacked!");
	}

}
