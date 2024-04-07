package _0_encapsulation;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        System.out.println("Nom : " + person.getName());
        System.out.println("Âge : " + person.getAge());
    }
}