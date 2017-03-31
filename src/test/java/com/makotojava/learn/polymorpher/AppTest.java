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

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Testing the main app")
public class AppTest {

  private App classUnderTest;

  @BeforeEach
  void init() {
    classUnderTest = new App();
  }

  @AfterEach
  void done() {
    // Do we need to? No.
    // Should we? Probably not. But maybe. Yes, definitely.
    // Symmetry. It's all about symmetry, man.
    classUnderTest = null;
  }

  @Nested
  @DisplayName("Testing Dog instances")
  class DogImplementationTest {

    private Dog dog;

    @BeforeEach
    void init() {
      dog = new Dog();
    }

    @Test
    @DisplayName("Polymoprhic through the Greeter interface")
    public void testProcessGreeting() {
      Greeter greeter = dog;
      assertEquals("WOOF!", classUnderTest.processGreeting(greeter));
    }

    @Test
    @DisplayName("Polymoprhic through the NamedEntity abstract class")
    public void testProcessNamedEntity() {
      assertEquals("WOOF!", classUnderTest.processName(dog));
    }

    @AfterEach
    void done() {
      // Symmetry
      dog = null;
    }

  }

  @Nested
  @DisplayName("Testing Person instances")
  class PersonImplementationTest {

    private Person person;

    @BeforeEach
    void init() {
      person = new Person().withFamilyName("Johnson").withFirstName("Joe");
    }

    @Test
    @DisplayName("Polymoprhic through the Greeter interface")
    public void testProcessGreeting() {
      Greeter greeter = person;
      // Polymorphic: passed through the Greeter interface
      assertEquals("Hello", classUnderTest.processGreeting(greeter));
    }

    @Test
    @DisplayName("Compile-time (not polymorphic)")
    public void testProcessAdditionalGreeting() {
      // Not Polymorphic: passed through the Person type
      assertEquals("Hello, also: I'm a Person!", classUnderTest.processGreeting(person));
    }

    @Test
    @DisplayName("Polymoprhic through the Complainer interface")
    public void testProcessComplaint() {
      Complainer complainer = person;
      // Polymorphic: passed through the Complainer interface
      assertEquals("My feet hurt", classUnderTest.processComplaint(complainer));
    }

    @Test
    @DisplayName("Polymoprhic through the NamedEntity abstract class")
    public void testProcessNamedEntity() {
      assertEquals("My name is Joe Johnson", classUnderTest.processName(person));
    }

  }

  @Nested
  @DisplayName("Testing Employee instances")
  class EmployeeImplementationTest {

    private Employee employee;

    @BeforeEach
    void init() {
      employee = new Employee().withFamilyName("Johnson").withFirstName("Joe").withEmployeeId("EMP000238");
    }

    @Test
    @DisplayName("Polymoprhic through the Greeter interface")
    public void testProcessGreeting() {
      Greeter greeter = employee;
      assertEquals("Hello", classUnderTest.processGreeting(greeter));
    }

    @Test
    @DisplayName("Compile-time (not polymorphic)")
    public void testProcessAdditionalGreeting() {
      assertEquals("Hello, also: I'm an Employee!", classUnderTest.processGreeting(employee));
    }

    @Test
    @DisplayName("Polymoprhic through the Complainer interface")
    public void testProcessComplaint() {
      Complainer complainer = employee;
      assertEquals("I deserve a raise", classUnderTest.processComplaint(complainer));
    }

    @Test
    @DisplayName("Polymoprhic through the NamedEntity abstract class")
    public void testProcessNamedEntity() {
      assertEquals("My name is Joe Johnson, and my employee ID is: EMP000238", classUnderTest.processName(employee));
    }

    @Nested
    @DisplayName("Passed as Person parameter")
    class EmployeeImplementationAsPersonTest {

      private Person person;

      @BeforeEach
      void init() {
        // Create Employee, but store it as a Person reference
        person = new Employee().withFamilyName("Smith").withFirstName("Jane").withEmployeeId("EMP111238");
      }

      @Test
      @DisplayName("Compile-time (not polymorphic)")
      public void testProcessAdditionalGreetingAsPerson() {
        // Pass as Person - compile-time bound, or runtime resolved?
        // Calls App.processGreeting(Person) - why?
        assertEquals("Hello, also: I'm a Person!", classUnderTest.processGreeting(person));
      }

      @Test
      @DisplayName("Runtime (polymorphic)")
      public void testProcessNamedEntity() {
        // Pass as Person - compile-time bound, or runtime resolved?
        // Calls Employee.name() - why?
        assertEquals("My name is Jane Smith, and my employee ID is: EMP111238", classUnderTest.processName(person));
      }

    }

  }

  @Nested
  @DisplayName("Testing anonymous instances")
  class LambdaTest {

    @Test
    @DisplayName("Polymorphic through the Greeter interface")
    public void testProcessGreeting() {
      assertAll("Alien greetings",
          () -> assertEquals("Greetings, Earthlings", classUnderTest.processGreeting(() -> "Greetings, Earthlings")),
          () -> assertEquals("Take me to your leader", classUnderTest.processGreeting(() -> "Take me to your leader")));
    }

    @Test
    @DisplayName("Polymorphic through the Complainer interface")
    public void testProcessComplaint() {
      assertAll("Alient complaints",
          () -> assertEquals("No intelligent life here",
              classUnderTest.processComplaint(() -> "No intelligent life here")),
          () -> assertEquals("We will not be staying",
              classUnderTest.processComplaint(() -> "We will not be staying")));
    }

    private NamedEntity alien = new NamedEntity() {
      @Override
      public String name() {
        return "My name is Zorg Norg";
      }

      @Override
      public String doSomethingConcrete() {
        return "Concrete? How primitive!";
      }
    };

    @Test
    @DisplayName("Polymorphic (and anoymous) through the NamedEntity abstract class")
    public void testProcessName() {
      assertEquals("My name is Zorg Norg", classUnderTest.processName(alien));
    }

  }

}
