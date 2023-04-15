package Interfaces.Comparable;

//comparable orders by natural order (lexicographical)
public class ComparableInterface implements Comparable<ComparableInterface> {

    String name, school;
    int age;

    public ComparableInterface(String name, String school, Integer age) {
        this.name = name;
        this.school = school;
        this.age = age;
    }

    public ComparableInterface() {};

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

    //revisit how to override compareTo method
    @Override
    public int compareTo(ComparableInterface o) {

        if (this.getAge().compareTo(o.getAge()) != 0) {
            return this.getAge().compareTo(o.getAge());
        } else {
            return this.getName().compareTo(o.getName());
        }

    }
}
