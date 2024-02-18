package org.example;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class TestCase1 {
    @Test
    public void testMethod1(){
        Assert.assertTrue(false);
        log.info("test method1 is not working as expected");
        String jenkinsURL = System.getenv("JENKINS_URL");
        log.info("Jenkins URL: " + jenkinsURL);
    }

    @Getter
    @Setter
    public class Person {

        private String firstname;
        private String lastname;
    }
}
