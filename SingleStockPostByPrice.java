package com.stockInfo.exception;

public class SingleStockPostByPrice extends RuntimeException{
	public SingleStockPostByPrice(String message) {
		super(message);
	}
}
