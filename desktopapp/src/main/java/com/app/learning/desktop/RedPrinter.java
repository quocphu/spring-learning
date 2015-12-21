package com.app.learning.desktop;

import com.app.learning.common.print.Printer;

public class RedPrinter extends Printer {
	@Override
	public String hello(){
		return "Red " + super.hello();
	}
}
