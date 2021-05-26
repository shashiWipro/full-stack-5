package com.full.stack.test.controller.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception
	{
		ResponseStatus responseStatus = new ResponseStatus(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(responseStatus, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(UserNotAvailableException.class)
	public final ResponseEntity<Object> handleUserNotAvailableException(UserNotAvailableException ex, WebRequest request) throws Exception
	{
		ResponseStatus responseStatus = new ResponseStatus(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(responseStatus, HttpStatus.NOT_FOUND);
	}
}
