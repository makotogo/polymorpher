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
 * Behavior provided by an object claiming to be capable
 * of performing some type of greeting.
 * <p>
 * This interface serves as the contract for that behavior.
 */
public interface Greeter {

  /**
   * Provide a greeting. Will be different for every top-level
   * implementation.
   * 
   * @return String - the greeting provided by the implementation.
   */
  public String greet();

}
