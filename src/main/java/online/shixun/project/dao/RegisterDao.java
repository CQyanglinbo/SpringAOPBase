package online.shixun.project.dao;

import org.springframework.stereotype.Repository;

@Repository //表明这是一个数据持久化类
public class RegisterDao {
	public void saveUser(String userName){
		System.out.println("用户信息已被保存！");
	}
}
