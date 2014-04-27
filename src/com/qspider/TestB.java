package com.qspider;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestB
{
@Test
public void Test()
   {
	Reporter.log("create login",true);
	}
@BeforeMethod
public void condition()
{
	Reporter.log("login",true);
}
@AfterMethod
public void postcondition()
{
	Reporter.log("logout",true);
}
@Test
public void Test1()
{
	Reporter.log("deleate ",true);
}
}
