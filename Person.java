public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Nikhil");
        Person person2 = new Person("Amrit");

        person1.introduce();
        person2.introduce();
    }
}
