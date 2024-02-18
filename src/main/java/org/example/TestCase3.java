package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestCase3 {
    @Test
    public void testMethod3(){
        Assert.assertTrue(true);
        System.out.println("test method3 is working as expected");
    }

    @AfterSuite
    public void getUrlAllure(){
        String jenkinsURL = System.getenv("JENKINS_URL");
        System.out.println("Jenkins URL: " + jenkinsURL);
    }
}
