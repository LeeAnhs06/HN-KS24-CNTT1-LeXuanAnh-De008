import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên muốn nhập:");
        int n = sc.nextInt();
        //trường hợp ko có dữ liệu
        if (n <= 0) {
            System.out.println("Lỗi:Số lượng phần tử không hợp lệ");
            return;
        }
        Map<Integer, Integer> listNumber = new java.util.HashMap<>();
        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            listNumber.put(num, listNumber.getOrDefault(num, 0) + 1);
        }
        //sắp xếp các số theo thứ tự tăng dần
        for (Map.Entry<Integer, Integer> entry : listNumber.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }
        //số xuất hiện nhiều nhất
        int maxCount = 0;
        int mostFreNumber = listNumber.entrySet().iterator().next().getKey();
        for (Map.Entry<Integer, Integer> entry : listNumber.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFreNumber = entry.getKey();
            }
        }
        System.out.println("Số xuất hiện nhiều nhất " + mostFreNumber + " với " + maxCount + " lần");
    }
}



