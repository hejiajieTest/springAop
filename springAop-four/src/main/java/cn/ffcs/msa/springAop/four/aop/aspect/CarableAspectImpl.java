package cn.ffcs.msa.springAop.four.aop.aspect;

public class CarableAspectImpl implements ICarableAspect{

	@Override
	public void byCar() 
	{
		System.out.println("I'm taking the train");
	}
	

}
