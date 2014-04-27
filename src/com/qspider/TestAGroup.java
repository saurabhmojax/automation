package com.qspider;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAGroup 
{
@BeforeMethod(groups={"all"})
public void precndition()
{
	Reporter.log("login",true);	
}
@AfterMethod(groups={"all"})
public void postcondition()
{
Reporter.log("logout",true);	
}
@Test(groups={"customer","smoke"})
public void test1()
{
	Reporter.log("create customer",true);
}
@Test(groups={"customer","invalied"})
public void test2()
{
	Reporter.log("Deleate customer",true);	
}
@Test(groups={"product","smoke"})
public void test3()
{
	Reporter.log("create product",true);
}
@Test(groups={"product","invalied"})
public void test4()
{
	Reporter.log("deleate product",true);
}
}
