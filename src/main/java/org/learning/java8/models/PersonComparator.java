/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.java8.models;

import java.io.Serializable;
import java.util.Comparator;

public class PersonComparator implements Comparator<Person>, Serializable {

  @Override
  public int compare(Person p1, Person p2) {
    return (int) (p1.getSalary() - p2.getSalary());
  }
}
