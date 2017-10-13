package online.shixun.project.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import online.shixun.project.service.RegisterService;

@Component
public class SpringAOPTest {
	
	@Autowired
	private RegisterService service;
	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringAOPTest iocTest=ac.getBean(SpringAOPTest.class);
		iocTest.testRegister();
		((ClassPathXmlApplicationContext)ac).close();
	}
	public void testRegister(){
		service.doRegister("轻实训");
	}
}
