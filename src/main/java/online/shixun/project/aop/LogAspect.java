package online.shixun.project.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import online.shixun.project.dao.RegisterDao;

@Component
@Aspect
public class LogAspect {
	@Pointcut("execution(public * online.shixun.project.dao.RegisterDao.*(**))")
	public void pointcut(){
		
	}
	@Before("pointcut()")
	public void before(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature()+"方法被调用");
		System.out.println("插入信息为:"+Arrays.toString(joinPoint.getArgs()));
	}
}
