package datastructures.linkedlist;

public class AnimalShelter<S> {
  Stack<String> stack1;
  Stack<String> stack2;

  public AnimalShelter() {
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
  }

  public void enqueue(String animal){
    stack1.push(animal);
  }

  public String dequeue(String pref){
      while(!stack1.isEmpty()){
        stack2.push(stack1.pop());
    }
      String result = null;
      while(!stack2.isEmpty()){
        String animal = stack2.peek();
        if (result == null && animal.equals(pref)){
          result = stack2.pop();
        } else {
          stack1.push(stack2.pop());
        }
      }
    return result;
  }
}
