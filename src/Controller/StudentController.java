package Controller;

import Domain.Student;
import Seed.DataInit;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StudentController {

    private List<Student> studentList = DataInit.initStudent();
    private Scanner sc = new Scanner(System.in);

    public void getStudents(){
        studentList.forEach(System.out::println);
    }

    public void updateStudent(int idFromUser){
        Student existStudent = studentList.stream()
                .filter(student -> student.getId() == idFromUser)
                .findFirst()
                .orElse(null);

        if  (Objects.nonNull(existStudent)){
            System.out.println("Cập nhật tên sinh viên: ");
            existStudent.setName(sc.nextLine());
        }
    }

    public void deleteStudent(int idFromUser){
        Student existStudent = studentList.stream()
                .filter(student -> student.getId() == idFromUser)
                .findFirst()
                .orElse(null);
        if(Objects.nonNull(existStudent)){
            studentList.remove(existStudent);
        }
    }

}
