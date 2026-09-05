package com.orangehrm.test;

import com.orangehrm.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DummyTestClass extends BaseClass {

    @Test
    public void dummyTest() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Test Failed - Title is not matching");
        System.out.println("Test Passed - Title is matching");
    }
}
