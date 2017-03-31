package com.makotojava.learn.polymorpher;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("Running all tests in the project")
@SelectPackages("com.makotojava.learn.polymorpher")
/**
 * RunAllTests - runs all tests in the com.makotojava.learn.polymorpher
 * package, which just happens to be all the tests in the project.
 * Provided as a convenience so you can run all of the tests in one
 * shot.
 */
public class RunAllTests {
  // Nothing to do
}
