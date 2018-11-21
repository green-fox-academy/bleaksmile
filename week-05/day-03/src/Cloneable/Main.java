package Cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("John", 20, "male", "BME");
        Student johnTheClone = (Student) student.clone();
        student.introduce();
        johnTheClone.introduce();



    }
}
