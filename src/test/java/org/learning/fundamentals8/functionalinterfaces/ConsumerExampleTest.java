/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.fundamentals8.functionalinterfaces;

import org.junit.Test;
import org.learning.java8.functionalinterfaces.ConsumerExample;

public class ConsumerExampleTest {

  @Test
  public void test() {
    ConsumerExample example = new ConsumerExample();
    example.test();
    example.test02();
    example.enhancedTest();
  }
}
