package org.adactin.testng;

import org.testng.annotations.Test;

public class Sample3 {
@Test(groups="Regression")
public void tc5() {
System.out.println("5");
}
@Test(groups="re-run")
public void tc6() {
System.out.println("6");
}
}
