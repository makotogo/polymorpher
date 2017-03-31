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
@DisplayName("Testing the Person class")
public class PersonTest {

  private Person classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new Person().withFamilyName("Jones").withFirstName("Sue");
  }

  @AfterEach
  void done() {
    classUnderTest = null;
  }

  @Test
  @DisplayName("Testing Person.name()")
  public void testName() {
    assertEquals("My name is Sue Jones", classUnderTest.name());
  }

  @Test
  @DisplayName("Testing Person.greet()")
  public void testGreet() {
    assertEquals("Hello", classUnderTest.greet());
  }

  @Nested
  @DisplayName("Testing Person overloaded methods")
  class PersonOverloadTest {

    @Test
    @DisplayName("Testing Person.greet(String)")
    public void testGreet() {
      assertEquals("Hello, also: I am a Person", classUnderTest.greet("I am a Person"));
    }

  }

  @Test
  @DisplayName("Testing Person.complain()")
  public void testComplain() {
    assertEquals("My feet hurt", classUnderTest.complain());
  }

}
