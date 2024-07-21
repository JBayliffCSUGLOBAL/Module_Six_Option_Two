// Main.java
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", "123 Maple St"));
        students.add(new Student(1, "Bob", "456 Oak St"));
        students.add(new Student(4, "Charlie", "789 Pine St"));
        students.add(new Student(2, "David", "101 Elm St"));
        students.add(new Student(5, "Eve", "202 Birch St"));
        students.add(new Student(6, "Frank", "303 Cedar St"));
        students.add(new Student(7, "Grace", "404 Fir St"));
        students.add(new Student(8, "Hannah", "505 Spruce St"));
        students.add(new Student(9, "Ivy", "606 Willow St"));
        students.add(new Student(10, "Jack", "707 Aspen St"));

        // Display students before sorting
        System.out.println("Students before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort using MergeSort and RollnoComparator
        RollnoComparator comparator = new RollnoComparator();
        MergeSort.mergeSort(students, comparator);

        // Display students after sorting
        System.out.println("\nStudents after sorting by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
