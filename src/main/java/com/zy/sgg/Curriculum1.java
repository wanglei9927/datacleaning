package com.zy.sgg;

import org.junit.Test;

public class Curriculum1 {
	
	/**
	 * 二维数组转稀疏数组
	 */
	@Test
	public void test1() {
		
		int[][] arr = new int[11][11];
		
		arr[2][3] = 1;
		
		arr[10][3] = 2;
		//arr[11][11]=4;
		
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			 for(int j=0; j<arr[i].length; ++j) {
				 int  value = arr[i][j];
				 
				 System.out.print(value);
			 }
			System.out.println();
		}
		
		
	}
	
	/**
	 * 队列1
	 */
	@Test
	public void test2() {
		
		Queue q = new Queue(3);
		q.addQueue("0");
		q.addQueue("1");
		
		System.out.println(q.getOueue());
		System.out.println(q.getOueue());
		System.out.println(q.getOueue());
	}
	
	@Test
	public void test3() {
		System.out.println(System.currentTimeMillis());
	}

	
}
