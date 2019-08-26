package cn.ffcs.msa.springAop.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		CustomerService cust = new CustomerService() ;
		cust.setName("YiiBaii Mook Kim");
		cust.setUrl("http://www.yiibai.com");
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {

		}
    }
}
