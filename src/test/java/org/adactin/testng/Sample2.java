package org.adactin.testng;

import org.testng.annotations.Test;

public class Sample2 {
@Test(groups="smoke")
public void tc3() {
System.out.println("tc3");
}
@Test(groups="Login")
public void tc4() {
System.out.println("tc4");
}
}
