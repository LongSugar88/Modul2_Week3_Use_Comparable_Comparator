import java.util.ArrayList;
import java.util.Collections;

public class MyStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 19, "HN");
        Student student2 = new Student("Minh", 18, "HN");
        Student student3 = new Student("Anh", 20, "HN");
        Student student4 = new Student("Tuấn", 21, "HN");
        Student student5 = new Student("Châm", 18, "HN");

        ArrayList<Student> myList = new ArrayList<>();
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        myList.add(student4);
        myList.add(student5);
        Collections.sort(myList);
        System.out.println("Sắp xếp theo tên: ");

        for (Student element: myList
             ) {
            System.out.println(element.toString());
        }

        Comparator myComparator = new Comparator();
        Collections.sort(myList, myComparator);
        System.out.println("Sắp xếp theo tuổi: ");
        for (Student element: myList
        ) {
            System.out.println(element.toString());
        }

    }
}
