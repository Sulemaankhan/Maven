package com.service;

public class AddService {
	int a = 10, b = 30, result;

	public void logicCals() {

		result = a + b;
		// System.out.println("logic=" + result);
	}

	public int printResult() {
		return result;

	}

	public static void main(String[] args) {
		AddService add = new AddService();
		add.logicCals();
		int res = add.printResult();
		System.out.println(res);
		// add.logicCals();

	}

}
