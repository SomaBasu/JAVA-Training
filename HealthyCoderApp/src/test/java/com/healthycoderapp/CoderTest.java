package com.healthycoderapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoderTest {
	private Coder coder;
	
	@BeforeEach
    void setUp() throws Exception {
    }

   @AfterEach
    void tearDown() throws Exception {
    }

   @Test
    void ArgumentSetup() {
        coder = new Coder();
        coder.setAge(10);
        coder.setGender(Gender.MALE);
        coder.setHeight(100);
        coder.setWeight(40);
    }
}
