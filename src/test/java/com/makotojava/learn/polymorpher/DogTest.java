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
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Testing the Dog class")
public class DogTest {

  private Dog classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new Dog();
  }

  @AfterEach
  void done() {
    // Symmetry, son.
    classUnderTest = null;
  }

  @Test
  @DisplayName("Testing Dog.name()")
  public void testName() {
    assertEquals("WOOF!", classUnderTest.name());
  }

  @Test
  @DisplayName("Testing Dog.greet()")
  public void testGreet() {
    assertEquals("WOOF!", classUnderTest.greet());
  }

}
