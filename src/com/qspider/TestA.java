package com.qspider;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestA
{
@Test
public void test1()
{
	System.out.println("test1");
}
@BeforeMethod
public void postcondition()
{
	Reporter.log("loginbeforemethode",true);
}
@AfterMethod
public void precondition()
{
	Reporter.log("logoutaftermethod",true);
}
@Test
public void test()
{
	Reporter.log("login",true);
	Reporter.log("logout",true);
}
}
