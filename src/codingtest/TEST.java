package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TEST {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student(100, "Yang"));
        student.add(new Student(100, "Cho"));
        student.add(new Student(80, "Lee"));
        student.add(new Student(60, "ha"));
        student.add(new Student(0, "yan"));


        Map<Integer, List<Student>> result = student
                .stream()
                .collect(Collectors.groupingBy(Student::getScore));

        List<Student> perfetct = result.get(1);
        perfetct.forEach(s -> System.out.println(s.getStudentNm()));
    }
}
