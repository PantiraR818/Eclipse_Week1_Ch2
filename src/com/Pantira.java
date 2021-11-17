package com;

public class Pantira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ข้อ 1 
		
	   /* double myMoney;
		myMoney = futureValue(1000,0.05,20);
		System.out.println("Future Money = >"+ myMoney);
		*/
		
		
		//ข้อ2
		long num;
		num = factorial(5);
		System.out.println("----- Answer = Result  "+ num + " -----");
		
	}


	//method ข้อ 1 
	
	/*public static double futureValue (int present, Double interestRate, int period) {
		double futureVal = 0f;
		futureVal = Math.pow((1+interestRate),period)*present;
		return futureVal;
	}
	*/
	
	//method ข้อ 2 
	public static long factorial (int n) {
	long result=1; 	
		for(int i =n; i >=1; i--) {
			result *= i;
		}
		return result;	
	}	
	
}
