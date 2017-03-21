package com.love.test;

import com.website.util.StackUtil;

public class StackTest {

	public static void main(String[] args) {

		StackUtil<String> stack = new StackUtil<String>();
		for (String s : "the prefect code".split(" ")) {
			stack.push(s);
		}
		
		while (!stack.empty()) {
			System.out.print(stack.peek() + " ");
			stack.pop();
		}
		
		System.out.println();
		for (char s : "д�˸�һ�仰������˵�ĳ���".toCharArray()) {
			stack.push(String.valueOf(s));
		}
		
		while (!stack.empty()) {
			System.out.print(stack.peek());
			stack.pop();
		}
	}

}
