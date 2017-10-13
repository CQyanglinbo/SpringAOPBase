package online.shixun.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.aop.PerformanceAware;
import online.shixun.project.dao.RegisterDao;

@Service  //表明这是一个服务类（处理业务逻辑）
public class RegisterService {
	
	private RegisterDao registerDao;
	
	@Autowired
	public RegisterService(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}
	@PerformanceAware  //切入点匹配
	public void doRegister(String userName){
		int randomSleepTime=(int) (Math.random()*5000);
		try {
			Thread.sleep(randomSleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		registerDao.saveUser(userName);
	}

	
}
