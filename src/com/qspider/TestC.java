package com.qspider;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestC
{
@Test
public void st()
{
	Reporter.log("give arakhan",true);
}
@AfterMethod
public void postconditon()
{
	Reporter.log("login",true);
}
@BeforeMethod
public void precondition()
{
	Reporter.log("logout",true);
}
@Test
public void est()
{
	Reporter.log("not give arakhan",true);
}
}
