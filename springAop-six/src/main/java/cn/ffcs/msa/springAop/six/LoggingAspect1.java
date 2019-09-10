package cn.ffcs.msa.springAop.six;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect1 {

	@Before("execution(* cn.ffcs.msa.springAop.six.CustomerBoImpl.addCustomer(..))")
	public void logBefore1(JoinPoint joinPoint) {

		System.out.println("logBefore1() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("hijacked : " + joinPoint.getTarget());
		System.out.println("******");
	}

	@After("execution(* cn.ffcs.msa.springAop.six.CustomerBoImpl.addCustomer(..))")
	public void logAfter1(JoinPoint joinPoint) {
		
		System.out.println("******");
		System.out.println("logAfter1() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}
	
	
	@AfterReturning(pointcut="execution(* cn.ffcs.msa.springAop.six.CustomerBoImpl.addCustomerReturnValue(..))", returning= "result")
	public void logAfterReturning1(JoinPoint joinPoint, Object result) {

		System.out.println("logAfterReturning1() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		System.out.println("******");

	}
	
	@AfterThrowing(pointcut="execution(* cn.ffcs.msa.springAop.six.CustomerBoImpl.addCustomerThrowException(..))",throwing="error")
	public void logAfterThrowing1(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing1() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("******");

	}
	
	@Around("execution(* cn.ffcs.msa.springAop.six.CustomerBoImpl.addCustomerAround(..))")
	public void logAround1(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround1() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
		
		System.out.println("Around before is running!");
		joinPoint.proceed();
		System.out.println("Around after is running!");
		
		System.out.println("******");

	}
	
}