/*
 * Copyright 2017 Makoto Consulting Group, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.makotojava.learn.polymorpher;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Testing the Employee class")
public class EmployeeTest {

  private Employee classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new Employee().withFamilyName("Major").withFirstName("Major").withEmployeeId("EMP000101");
  }

  @AfterEach
  void done() {
    classUnderTest = null;
  }

  @Test
  @DisplayName("Testing Employee.greet()")
  public void testGreet() {
    assertEquals("Hello", classUnderTest.greet());
  }

  @Nested
  @DisplayName("Testing Employee overloaded methods")
  class EmployeeOverloadTest {

    @Test
    @DisplayName("Testing Employee.greet(String)")
    public void testGreet() {
      assertEquals("Hello, also: I am an Employee", classUnderTest.greet("I am an Employee"));
    }

  }

  @Test
  @DisplayName("Testing Employee.name()")
  public void testName() {
    assertEquals("My name is Major Major, and my employee ID is: EMP000101", classUnderTest.name());
  }

  @Test
  @DisplayName("Testing Employee.complain()")
  public void testComplain() {
    assertEquals("I deserve a raise", classUnderTest.complain());
  }

}
