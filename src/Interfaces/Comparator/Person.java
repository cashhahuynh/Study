package Interfaces.Comparator;

//comparator orders based on fields
public class Person {

    String name, school;
    int age;

    public Person(String name, String school, Integer age) {
        this.name = name;
        this.school = school;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", school = '" + school + '\'' +
                ", age = " + age;
    }
}