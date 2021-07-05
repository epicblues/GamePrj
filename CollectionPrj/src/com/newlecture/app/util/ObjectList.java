package com.newlecture.app.util;

public class ObjectList {
	
	private Object[] nums;
	private int current;
	
	public ObjectList() {
		nums = new Object[3];
		current = 0;
	}

	public void add(Object num) {
		if (current == nums.length) {
			Object [] temp = new Object[nums.length + 3];
			temp[nums.length] = num;
			for (int i=0 ; i < nums.length ; i ++) {
				temp[i] = nums[i];
			}
			nums = temp;
			
		}
		else {
			nums[current]= num;
			
		}
		current ++;
		
		
	}

	public void clear() {
		nums = new Object[3]; // 기존 배열은 garbage collector에 의해서 수거.
		current = 0;
		
	}

	public int size() {
		return current;
	}

	public Object get(int num) throws TooLargeNum {
		if (num >= current) 
			throw new TooLargeNum();
		
		return nums[num];
	}

}
