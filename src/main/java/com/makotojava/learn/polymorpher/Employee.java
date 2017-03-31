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

/**
 * Concrete class that implements the
 * {@link com.makotojava.learn.polymorpher.Greeter Greeter}
 * and
 * {@link com.makotojava.learn.polymorpher.Greeter Greeter}
 * interfaces (via inheritance), and overrides the
 * {@link com.makotojava.learn.polymorpher.NamedEntity#name() name()}
 * method from the
 * {@link com.makotojava.learn.polymorpher.NamedEntity NamedEntity}
 * abstract class.
 * <p>
 * All of this is done through Java inheritance. This class could
 * use the implementations from
 * {@link com.makotojava.learn.polymorpher.Person Person}
 * but provides its own, and through that demonstrates polymorphism
 * in the two ways from the recipe.
 */
public class Employee extends Person {

  private String employeeId;

  @Override
  public String complain() {
    return null;
  }

  @Override
  public String name() {
    return null;
  }

  public Employee withEmployeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  @Override
  public Employee withFirstName(String firstName) {
    super.withFirstName(firstName);
    return this;
  }

  @Override
  public Employee withFamilyName(String familyName) {
    super.withFamilyName(familyName);
    return this;
  }

}
