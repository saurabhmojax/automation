package com.qspider;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTestNG
{
@BeforeMethod
public void precondition()
{
Reporter.log("login",true);	
}
@AfterMethod
public void postcondition()
{
Reporter.log("logout",true);
}
}
