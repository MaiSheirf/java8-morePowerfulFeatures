package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> gradePredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = student -> student.getGradeLevel()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream(). //.parallelStream dont forger.
                filter(gpaPredicate) // Stream<Student>
                .collect(Collectors.toMap(Student::getName ,Student::getActivities ));

        System.out.println("studentMap  : " + studentMap);
    }


}
