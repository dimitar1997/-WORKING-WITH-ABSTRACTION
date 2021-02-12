public class Person {
    private  String name;
    private int age;
    private double grade;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public Person(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
