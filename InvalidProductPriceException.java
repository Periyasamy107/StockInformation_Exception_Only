package com.stockInfo.exception;

public class InvalidProductPriceException extends RuntimeException{
	
	public InvalidProductPriceException() {}
	
	public InvalidProductPriceException(String message) {
		super(message);
	}
	 
}
