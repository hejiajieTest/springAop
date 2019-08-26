package cn.ffcs.msa.springAop.four.aop.advisor;

import org.springframework.stereotype.Component;

@Component
public class CarableAdvisorImpl implements ICarAdvisorable{

	@Override
	public void byCar() 
	{
		System.out.println("I'm taking the train");
	}
	

}
