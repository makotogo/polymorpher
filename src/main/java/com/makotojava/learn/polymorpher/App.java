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
 * A Simple application that demonstrates polymorphism.
 */
public class App {

  // private static final Logger log = Logger.getLogger(App.class.getName());

  /**
   * <i>Polymorphic? YES</i>
   * <p>
   * <i>How? Interface</i>
   * <p>
   * Take the specified
   * {@link com.makotojava.learn.polymorpher.Greeter Greeter}
   * interface implementation, and invoke its
   * {@link com.makotojava.learn.polymorpher.Greeter#greet() greet()}
   * method to retrieve the greeting, and return the greeting to the caller.
   * 
   * @param greeter
   *          The
   *          {@link com.makotojava.learn.polymorpher.Greeter Greeter}
   *          interface implementation. The underlying
   *          type will be resolved at runtime, and be different for different
   *          objects that implement the Greeter interface (after all, that's what
   *          polymorphism is).
   * 
   * @return String - the greeting provided by the
   *         {@link com.makotojava.learn.polymorpher.Greeter Greeter} implementation.
   */
  public String processGreeting(Greeter greeter) {
    return null;
  }

  /**
   * <i>Polymorphic? NO</i>
   * <p>
   * Take the specified
   * {@link com.makotojava.learn.polymorpher.Person Person}
   * object, and invoke its
   * {@link com.makotojava.learn.polymorpher.Person#greet() greet()}
   * method to retrieve the greeting, and return the greeting to the caller.
   * <p>
   * This method demonstrates compile-time method binding, not polymorphism.
   * 
   * @param person
   *          The
   *          {@link com.makotojava.learn.polymorpher.Person Person}
   *          object. The underlying type will be resolved at compile time.
   *          The caller must make the method invocation using an Person object,
   *          or this method will not be called.
   * 
   * @return String - the greeting provided by the
   *         {@link com.makotojava.learn.polymorpher.Person Person} object.
   */
  public String processGreeting(Person person) {
    return null;
  }

  /**
   * <i>Polymorphic? NO</i>
   * <p>
   * Take the specified
   * {@link com.makotojava.learn.polymorpher.Employee Employee}
   * object, and invoke its
   * {@link com.makotojava.learn.polymorpher.Employee#greet() greet()}
   * method to retrieve the greeting, and return the greeting to the caller.
   * <p>
   * This method demonstrates compile-time method binding, not polymorphism.
   * 
   * @param employee
   *          The
   *          {@link com.makotojava.learn.polymorpher.Employee Employee}
   *          object. The underlying type will be resolved at compile time.
   *          The caller must make the method invocation using an Employee
   *          object, or this method will not be called.
   * 
   * @return String - the greeting provided by the
   *         {@link com.makotojava.learn.polymorpher.Employee Employee} object.
   */
  public String processGreeting(Employee employee) {
    return null;
  }

  /**
   * <i>Polymorphic? YES</i>
   * <p>
   * <i>How? Interface</i>
   * <p>
   * Take the specified
   * {@link com.makotojava.learn.polymorpher.Complainer Complainer}
   * interface implementation, and invoke its
   * {@link com.makotojava.learn.polymorpher.Complainer#complain() complain()}
   * method to retrieve the complaint, and return the complaint to the caller.
   * 
   * @param complainer
   *          The
   *          {@link com.makotojava.learn.polymorpher.Complainer Complainer}
   *          interface implementation. The underlying
   *          type will be resolved at runtime, and be different for different
   *          objects that implement the Complainer interface (after all, that's what
   *          polymorphism is).
   * 
   * @return String - the complaint provided by the
   *         {@link com.makotojava.learn.polymorpher.Complainer Complainer} implementation.
   */
  public String processComplaint(Complainer complainer) {
    return null;
  }

  /**
   * <i>Polymorphic? YES</i>
   * <p>
   * <i>How? Abstract method</i>
   * <p>
   * Take the specified
   * {@link com.makotojava.learn.polymorpher.NamedEntity NamedEntity}
   * subclass, and invoke its
   * {@link com.makotojava.learn.polymorpher.NamedEntity#name() name()}
   * method to retrieve the name, and return the name to the caller.
   * 
   * @param namedEntity
   *          The
   *          {@link com.makotojava.learn.polymorpher.NamedEntity NamedEntity}
   *          subclass. The underlying
   *          type will be resolved at runtime, and be different for different
   *          objects that extend the NamedEntity abstract class (after all, that's what
   *          polymorphism is).
   * 
   * @return String - the greeting provided by the
   *         {@link com.makotojava.learn.polymorpher.NamedEntity NamedEntity} subclass.
   */
  public String processName(NamedEntity namedEntity) {
    return null;
  }

}
