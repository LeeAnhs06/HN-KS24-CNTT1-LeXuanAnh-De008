import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhâp số lượng sinh viên
        System.out.println("Nhập số lượng sinh viên:");
        int n = sc.nextInt();

        //trường hợp N không hợp lệ sử dụng
        if (n <= 0) {
            System.out.println("Lỗi:Số lượng sinh viên không hợp lệ");
            return;
        }
        List<String> students = new ArrayList<>();
        System.out.println("Nhập tên sinh viên:");
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            students.add(name);
        }
        //hiển thị tên dài nhất
        String longestName = "";
        for (String name : students) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);
        //hiển thị danh sách theo thứ tự
        System.out.print("Sorted List:");
        students.sort(String::compareTo);
        for (String name : students) {
            System.out.print(name + " ");
        }
        //ddếm số sinh viên có tên bắt đầu bằng chữ A
        int countA = 0;
        for (String name : students) {
            if (name.startsWith("A") || name.startsWith("a")) {
                countA++;
            }
        }
        System.out.println("\nNumber of names starting with 'A': " + countA);
    }
}
