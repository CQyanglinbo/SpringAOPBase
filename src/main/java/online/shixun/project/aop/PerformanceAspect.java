package online.shixun.project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	@Pointcut("execution(public * online.shixun.project.service.RegisterService.*(**))")
	public void pointcut2(){
		
	}
	@Around(value = "pointcut2()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		long beforeTime=System.currentTimeMillis();
		pjp.proceed();
		long afterTime=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+"运行时间为:"+(afterTime-beforeTime)/1000+"s");
	}
}
