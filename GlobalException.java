package com.stockInfo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> prodExc(ProductNotFoundException pe){
		return new ResponseEntity<>("Product not found handled",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InsufficientStockException.class)
	public ResponseEntity<Object> prodExc(InsufficientStockException ie){
		return new ResponseEntity<>(ie.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(SingleStockPostByPrice.class)
	public ResponseEntity<Object> prodPrice(SingleStockPostByPrice ssp){
		return new ResponseEntity<>("Invalid Product Price Handled", HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(ManufacturerNotFound.class)
	public ResponseEntity<Object> manNotFound(ManufacturerNotFound mnf){
		return new ResponseEntity<>("Handled Manufacturer not found exception",
				HttpStatus.NOT_FOUND);
	}
}
