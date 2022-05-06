package com.product.management.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> ResourceNotFoundException
	(ResourceNotFoundException exception,WebRequest request)
	{
		ApiException ae=new ApiException(new Date(), exception.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(ae,HttpStatus.NOT_FOUND);
	}
	
}
