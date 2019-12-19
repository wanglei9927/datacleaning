package com.zy.sgg;

/**
 * 数组模拟队列
 * @author wanglei
 * @param <T>
 *
 */
public class Queue {

	private int maxSize;
	private int front=-1;
	private int rear=-1;
	
	private Object[] array;
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.array = new Object[maxSize];
	}
	
	public Object addQueue(Object value)  {
		
		//判断是否满
		if(rear>maxSize-1) {
			System.err.println("队列已满");
		}else {
			rear++;
			array[rear] =  value;
		}
		return value;
	}
	
	public Object getOueue() {
		
		if(rear==front) {
			return null;
		}
		
		Object value =  array[front+1];
		
		front++;
		
		return value;
		
	}
}
