package com.demo;

class BusinessLogic{
	 void AddDemo() {
	        int number1 = 10;
	        int number2 = 20;
	        int result = number1 + number2;
	        System.out.println("sum of two numbers " + result);
	    }

	
}
public class AddNumber {
	  public static void main(String[] args) {
	        BusinessLogic b = new BusinessLogic();// created object here
	        b.AddDemo();
	        
	    }

}
