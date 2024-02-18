package org.example;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class TestCase2 {
    @Test
    public void testMethod2(){
        Assert.assertTrue(true);
        log.info("test method1 is not working as expected");
        String jenkinsURL = System.getenv("JENKINS_URL");
        log.info("Jenkins URL: " + jenkinsURL);
    }

}
