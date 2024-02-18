package org.example;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test
    public void testMethod1(){
        Assert.assertTrue(false);
        System.out.println("test method1 is not working as expected");
    }

    @Getter
    @Setter
    public class Person {

        private String firstname;
        private String lastname;
    }
}
