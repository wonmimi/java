package GrammarPractice.Chapter02.ch08;

public class Person {
    public String name;
    public int height;
    public int weight;
    public int age;

    public Person(String name, int height, int weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public  void printPerson(Person person){
        System.out.println(person.name+"씨("+person.age+")는 " +
                "키가 "+person.height+"cm이고, " +
                "몸무게는 "+person.weight+"kg이다.");
    }
}
