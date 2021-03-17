package org.adactin.testng;

import org.testng.annotations.Test;

public class Sample1 {
@Test(invocationCount=2,priority=-1,groups="Login")
public void tc1() {
System.out.println("1");
}
@Test(priority=2,groups="Regression")
public void tc2() {
System.out.println("2");
}
}
