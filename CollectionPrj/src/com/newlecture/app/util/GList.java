package com.newlecture.app.util;

public class GList<T> {
	
	private Object[] list; // 모든 참조 유형을 받으려면 object 방식으로 만들어야 한다.
	private int current;
	private int capacity;
	private int amount;
	
	public GList() {
		current = 0;
		capacity = 3;
		list = new Object[capacity];
		amount = 5;
	}

	public void add(T num) { // 외부에서 들어오는 데이터에 맞는 입력을 수행하는 기능. 
		if (current == capacity) {
			capacity += amount;
			Object [] temp = new Object[capacity];
			
			for (int i=0 ; i < current ; i ++) {
				temp[i] = list[i];
			}
			
			list = temp;
			System.out.printf("Capacity : %d\n", capacity);
		}
		list[current]= num;
		current ++;
	}

	public void clear() {
		list = new Object[capacity]; // 기존 배열은 garbage collector에 의해서 수거.
		current = 0;
		
	}

	public int size() {
		return current;
	}

	public T get(int num) throws TooLargeNum { 
		if (num >= current) 
			throw new TooLargeNum();
		
		return (T)list[num]; // 제네릭 객체의 데이터를 외부로 출력할 때는 객체에서 제시한 타입에 맞게 변환.
	}

}
