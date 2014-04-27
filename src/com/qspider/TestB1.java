package com.qspider;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB1 extends SuperTestNG
{
	@Test
	public void test1()
	{
		Reporter.log("create product",true);
	}
	@Test
	public void test2()
	{
Reporter.log("deleate product",true);
	}
}
