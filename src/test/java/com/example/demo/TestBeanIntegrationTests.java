package com.example.demo;

import com.example.demo.ch3.TestBean;
import com.example.demo.ch3.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@ActiveProfiles("dev")
public class TestBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void devBeanTest() {
        Assert.assertTrue(testBean.getContext().contains("dev"));
    }

}
