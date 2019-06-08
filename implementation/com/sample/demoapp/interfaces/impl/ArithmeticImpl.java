package com.sample.demoapp.interfaces.impl;

import com.sample.demoapp.interfaces.Arithmetic;

public class ArithmeticImpl implements Arithmetic {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		return a / b;
	}

}

