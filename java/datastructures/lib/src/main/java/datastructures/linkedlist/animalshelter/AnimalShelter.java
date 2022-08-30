package datastructures.linkedlist.animalshelter;


import java.util.ArrayList;
import java.util.Queue;

public class AnimalShelter{
  Queue<Animal> animals;

  public AnimalShelter(Queue<Animal> animals) {
    this.animals = animals;
  }

  public Queue<Animal> getAnimals() {
    return animals;
  }

  public void setAnimals(Queue<Animal> animals) {
    this.animals = animals;
  }

  public void enqueue(Animal animal){
    
  }
}
