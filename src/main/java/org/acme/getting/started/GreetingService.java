package org.acme.getting.started;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class GreetingService {
  List<Person> personList = new ArrayList<>();
  public String memoryStress() {
    for (int i = 0; i < 1_000_000; i++) {
      personList.add(new Person("Maionese"+i, 40, Math.random()));
      personList.add(new Person("Cabritones"+i, 42,Math.random()));
      personList.add(new Person("Graciano"+i, 40, Math.random()));
    }
    return String.valueOf(personList.size());
  }
}

class Person {
  String name;
  Integer age;
  Double balance;

  public Person(String name, Integer age, Double balance) {
    this.name = name;
    this.age = age;
    this.balance = balance;
  }
}
