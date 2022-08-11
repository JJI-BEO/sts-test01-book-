package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {
	
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
		
		//pointcut 실행전
		System.out.println("[BEFORE] : 비즈니스 메소드 수행 전에 처리할 내용 ...");
		
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		
		Object returnObj = pjp.proceed();
		//pointcut 실행후
		stopWatch.stop();
		System.out.println(method + "()메소드 수행에 걸린시간 : " + stopWatch.getTotalTimeSeconds());
		
		System.out.println("[AFTER] : 비즈니스 메소드 수행 후에 처리할 내용 ...");
		
		return returnObj;
		
	}
}
