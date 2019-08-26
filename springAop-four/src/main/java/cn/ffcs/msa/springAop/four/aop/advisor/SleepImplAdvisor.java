package cn.ffcs.msa.springAop.four.aop.advisor;

public class SleepImplAdvisor implements ISleepAdvisorable
{
	private String name;

	@Override
	public String sleep(String name) {
		 System.out.println("I'm sleeping!");
		 return "sleep";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
