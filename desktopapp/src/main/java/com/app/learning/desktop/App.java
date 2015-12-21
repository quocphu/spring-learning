package com.app.learning.desktop;

import com.app.learning.common.print.Printer;

public class App {

	public static void main(String[] args) {
		Printer p = new RedPrinter();
		System.out.println(p.hello());
	}
}
