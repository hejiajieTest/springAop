package cn.ffcs.msa.springAop.four.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class AopAspectHelper
{
	public void aopBefore(JoinPoint joinPoint)
	{
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getTarget());
		System.out.println(Arrays.toString(joinPoint.getArgs()));
		 System.out.println("read to sleep ！");
		 //数据库做一个插入操作
	}
	
	/**
	 * returnValue 方法返回值
	 * method 执行的方法
	 * args 执行方法的参数
	 * target 执行的类
	 */
	public void aopAfter(JoinPoint joinPoint)
	{
		System.out.println("I'm awake.");
	}

}
