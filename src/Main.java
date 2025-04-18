import Controller.StudentController;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Cập nhật sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: studentController.getStudents(); break;
                case 2:
                    System.out.println("Nhập id sinh viên muốn cập nhật: ");
                    studentController.updateStudent(Integer.parseInt(scanner.nextLine())); break;
                case 3:
                    System.out.println("Nhập id sinh viên muốn xóa: ");
                    studentController.deleteStudent(Integer.parseInt(scanner.nextLine())); break;
                case 4: System.exit(0);
                default: System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}