package cn.ffcs.msa.springAop.six;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
//@ComponentScan(basePackages="cn.ffcs.msa.springAop.six")
@ComponentScan
public class ConcertConfig {
	public ConcertConfig() {
        System.out.println("TestConfiguration容器启动初始化。。。");
    }
}
