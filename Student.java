public class Student {
    private String name;
    private int age;

    public Student() {
        name = "No name yet.";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Genesis", 20);
        
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
    }
}

