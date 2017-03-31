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
package com.makotojava.learn.polymorpher.solution;

/**
 * Implements the
 * {@link com.makotojava.learn.polymorpher.Greeter Greeter}
 * and
 * {@link com.makotojava.learn.polymorpher.Complainer Complainer}
 * interfaces, and extends the
 * {@link com.makotojava.learn.polymorpher.NamedEntity NamedEntity}
 * abstract class.
 * <p>
 * In addition, this class demonstrates a Java feature often
 * confused with polymorphism via method overriding that is really
 * method OVERLOADING, via the
 * {@link com.makotojava.learn.polymorpher.Person#greet(String) greet(String)}
 * method.
 */
public class Person extends NamedEntity implements Greeter, Complainer {

  private String firstName;
  private String familyName;

  @Override
  public String greet() {
    return "Hello";
  }

  /**
   * This is an OVERLOADED method of greet().
   * 
   * @param additionalGreeting
   *          The additional greeting to add.
   * 
   * @return String - a greeting, comprised of the base
   *         greeting provided through the
   *         {@link com.makotojava.learn.polymorpher.Greeter Greeter}
   *         interface implementation, along with the value of the <code>additionalGreeting</code>
   *         parameter.
   */
  public String greet(String additionalGreeting) {
    return greet() + ", also: " + additionalGreeting;
  }

  @Override
  public String name() {
    return "My name is " + getFirstName() + " " + getFamilyName();
  }

  @Override
  public String complain() {
    return "My feet hurt";
  }

  public Person withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public Person withFamilyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  public String getFamilyName() {
    return this.familyName;
  }

}
