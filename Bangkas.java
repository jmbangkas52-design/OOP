public class Bangkas {
    String name;
    int age;
    String course;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        System.out.println("Student Information");
        System.out.println("-------------------");

        Bangkas student1 = new Bangkas();
        student1.name = "IJ";
        student1.age = 19;
        student1.course = "BSBA";

        Bangkas student2 = new Bangkas();
        student2.name = "JM";
        student2.age = 18;
        student2.course = "BSIT";

        student1.displayInfo();
        student2.displayInfo();
    }
}