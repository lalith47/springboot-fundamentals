/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.designpattern.structural.decorator;

import org.junit.Test;

/**
 * This decorator pattern is more like an adapter pattern
 * however it can be used to provide the additional functionality
 */

public class ChristmasTreeDecoratorTest {

  @Test
  public void test() {
    IChristmasTree tree = new ChristmasTree();
    IChristmasTree decoratorTree = new ChristmasTreeDecorator(tree);
    IChristmasTree advDecoratorTree = new ChristmasTreeFlowerDecorator(decoratorTree);
    System.out.println(advDecoratorTree.decorateTree());
  }
}