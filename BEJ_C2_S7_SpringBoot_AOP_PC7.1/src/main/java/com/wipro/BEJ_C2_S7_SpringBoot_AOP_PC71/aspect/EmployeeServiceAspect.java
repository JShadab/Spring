package com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service.EmployeeService.*(..)) and args(name,empId)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
		log.info("Before method:" + joinPoint.getSignature());

		log.info("Creating Employee with name - " + name + " and id - " + empId);
	}

	@After(value = "execution(* com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service.EmployeeService.*(..)) and args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
		log.info("After method:" + joinPoint.getSignature());

		log.info("Successfully created Employee with name - " + name + " and id - " + empId);
	}

	@AfterReturning(value = "execution(* com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service.EmployeeService.*(..)) and args(name,empId)", returning = "retVal")
	public void afterReturnFromCreateEmployeeAdvice(JoinPoint joinPoint, String name, String empId, Object retVal) {

		Employee emp = (Employee) retVal;
		log.info("After Returning method:" + emp.getEmpId());

	}

	@AfterThrowing(value = "execution(* com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service.EmployeeService.*(..))", throwing = "ex")
	public void afterThrowingAdvice(JoinPoint joinPoint,  NumberFormatException ex) {
		log.info("AfterThrowing method:" + ex.getMessage());

	}

	@After(value = "execution(* com.wipro.BEJ_C2_S7_SpringBoot_AOP_PC71.service.EmployeeService.*(..))")
	public void afterDeleteAdvice(JoinPoint joinPoint) {
		log.info("After method:" + joinPoint.getSignature());

	}
}