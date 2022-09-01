package datastructures.linkedlist;

public class StackQueueBrackets {

  public static boolean validateBrackets(String input){
    boolean result = false;
    Stack<Character> bracketStack = new Stack<>();
    Queue<Character> validateQ = new Queue<>();
    for (Character ch : input.toCharArray()) {
      if ((ch.toString().equals("(")) ||
        (ch.toString().equals("{")) ||
        (ch.toString().equals("[")) ||
        (ch.toString().equals(")")) ||
        (ch.toString().equals("}")) ||
        (ch.toString().equals("]"))){
        bracketStack.push(ch);
      }
    }
    while (!bracketStack.isEmpty()){
      validateQ.enqueue(bracketStack.pop());
    }
    while((validateQ.queueSize > 1)){
      System.out.println(validateQ.front);
      String nextVal = (validateQ.front.next.value).toString();
      switch ((validateQ.front.value).toString()){
        case ")":
          if (nextVal.equals("("))
            result = true;
          break;
        case "]":
          if (nextVal.equals("["))
            result = true;
          break;
        case "}":
          if (nextVal.equals("{"))
            result = true;
          break;
        default:
          result = false;
      }
      validateQ.dequeue();
    }
    return result;
  }
}
