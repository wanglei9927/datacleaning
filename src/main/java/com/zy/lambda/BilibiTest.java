package com.zy.lambda;

/**
 * 策略模式->java8写法
 * 
 * @author wanglei
 *
 */
public class BilibiTest {

	private Strategy strategy;


	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public static void main(String[] args) {
		
		
		BilibiTest bilibiTest  = new BilibiTest();
		bilibiTest.setStrategy(a->{return Integer.parseInt(a);});
		bilibiTest.println();
		
	}
	
	public void println() {
		System.out.println(strategy.money("2"));
	}
	
}
