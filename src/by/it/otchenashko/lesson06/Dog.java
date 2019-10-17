package by.it.otchenashko.lesson06;

public class Dog {
  private  String name;

    private int age;
    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + " возраст: " + age;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
