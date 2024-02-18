package org.example;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

@Slf4j
public class TestCase3 {
    @Test
    public void testMethod3(){
        Assert.assertTrue(true);
        System.out.println("test method3 is working as expected");
    }

    @AfterSuite
    public void getUrlAllure(){
        String jenkinsURL = System.getenv("JENKINS_URL");
        log.info("Jenkins URL: " + jenkinsURL);
    }
}
