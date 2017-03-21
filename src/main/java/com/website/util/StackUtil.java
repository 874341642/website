package com.website.util;

import java.util.LinkedList;

public class StackUtil<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	
	public synchronized void push(T e) {// ��Ҫ����ͬ��
		storage.addFirst(e);
	}

	public T peek() {
		return storage.getFirst();
	}

	public void pop() {
		storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	@Override
	public String toString() {
		return storage.toString();
	}

}
