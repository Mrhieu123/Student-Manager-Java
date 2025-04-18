package Seed;

import Domain.Student;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DataInit {
    public static List<Student> initStudent(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(i -> new Student(i, "Student-" + i, "Nam", Date.valueOf("2025-04-18"), 18))
                .collect(Collectors.toList());
    }
}
