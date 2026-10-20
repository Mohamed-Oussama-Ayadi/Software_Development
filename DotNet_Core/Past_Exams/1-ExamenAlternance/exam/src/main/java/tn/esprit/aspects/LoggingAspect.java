package tn.esprit.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StopWatch;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

//	@Before("execution(* tn.esprit.controllers.*.ajouter*(..))")
//	public void logMethodEntry(JoinPoint joinPoint) {
//
//		String name = joinPoint.getSignature().getName();
//
//		log.info("Début Exécution :" + name );
//	}
	
	
	@After ("execution(* tn.esprit.services.*.add*(..))")
	public void logMethodExit(JoinPoint joinPoint) {



		log.info("Successfuly assined" );
	}

//	@Around ("execution(public * tn.esprit.services.*.add*(..))")
//	public Object executionTime(ProceedingJoinPoint pjp ) throws Throwable {
//		StopWatch stopWatch  = new StopWatch();
//		stopWatch.start();
//		Object o = pjp.proceed();
//		stopWatch.stop();
//		String methodName = pjp.getSignature().getName();
//		log.info("The runtime of the method ( {} ) =  {}  milliseconds.",methodName,stopWatch.getTotalTimeMillis());
//		return o;
//
//	}


}	