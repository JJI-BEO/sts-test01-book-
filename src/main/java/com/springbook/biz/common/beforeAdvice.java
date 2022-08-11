package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class beforeAdvice {
	public void before(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[사전 처리]" + method + "()메소드 ARGS정보" + args[0].toString());
	}
}
