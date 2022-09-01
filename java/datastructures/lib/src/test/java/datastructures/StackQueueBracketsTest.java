package datastructures;

import datastructures.linkedlist.StackQueueBrackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackQueueBracketsTest {

  @Test
    public void validateBracketsTest() {
    assertTrue(StackQueueBrackets.validateBrackets("{}"));
    assertTrue(StackQueueBrackets.validateBrackets("{}(){}"));
    assertTrue(StackQueueBrackets.validateBrackets("()[[Extra Characters]]"));
    assertTrue(StackQueueBrackets.validateBrackets("(){}[[]]"));
    assertFalse(StackQueueBrackets.validateBrackets("[({}]"));
    assertFalse(StackQueueBrackets.validateBrackets("{Ma{n}dy)"));
  }
}
