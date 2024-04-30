package com.example.amreth_day16_cw1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration  
@Aspect    

public class AmrethMyAspect {

    Logger logger=LoggerFactory.getLogger(getClass());
    
    @Before(value="execution(* com.example.gurucharanq2.controller.*.*(..)) ")
    public void beforeAdvice (JoinPoint joinpoint){
    	logger.info("Inside Befroe Advice");
    }

    @After(value="execution(* com.example.gurucharanq2.controller.*.*(..)) ")
    public void afterAdvice (JoinPoint joinpoint){
    	logger.info("Inside After Advice");
    }
  

    @AfterReturning(value="execution(* com.example.gurucharanq2.controller.MyService.AppService(..)) ")
    public void afterReturningAdvice (JoinPoint joinpoint){
    	logger.info("Inside AfterReturning Advice");
    }

    }
