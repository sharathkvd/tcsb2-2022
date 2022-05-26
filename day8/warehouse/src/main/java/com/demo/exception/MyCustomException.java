package com.demo.exception;

@SuppressWarnings("serial")
public class MyCustomException extends RuntimeException {

	MyCustomException(String exceptionmessage) {

		super(String.format("username %s not found . ", exceptionmessage));

	}

}