class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Shimul"; // Default name
        this.age = 50; // Default age
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class ICE {
    public static void main(String[] args) {
        // Creating objects using constructors
        Person person1 = new Person(); // Default constructor
        Person person2 = new Person("Shimul", 2225); // Parameterized constructor

        // Accessing object attributes
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
