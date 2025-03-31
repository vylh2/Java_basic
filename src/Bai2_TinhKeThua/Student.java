package Bai2_TinhKeThua;

public class Student extends Person {

    private String phone = "12345";

    public Student(String name, int age, float height) {
        super(name, age, height); //Đảm bảo đúng cấu trúc hàm xây dựng từ class cha Person
    }

    public Student(String name, int age, float height, String phone) {
        super(name, age, height, phone); //Đảm bảo đúng cấu trúc hàm xây dựng từ class cha Person
    }

    public void showInfo(){
        System.out.println("This is child class.");
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
        System.out.println("Phone:" + super.phone); //Gọi biến phone từ class cha Person
        System.out.println("Address:" + "Cần Thơ");
        super.getInfo(); //Gọi hàm từ class cha Person
    }

    public static void main(String[] args) {
        Student student = new Student("Hương", 30, 158.5F, "0939206009");

        System.out.println("Variable name: " + student.name);

        student.showInfo();

        Student student2 = new Student("Nhi", 28, 158.5F);
        student2.getInfo();

        Person person = new Person("Hương", 30, 158.5F, "0939206009");
        person.getInfo();

    }
}
