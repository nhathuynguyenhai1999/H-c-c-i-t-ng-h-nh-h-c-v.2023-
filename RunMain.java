package Main;

import java.util.Scanner;

public class RunMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Nhập vào cạnh 1:");
            int side1 = scanner.nextInt();
            System.out.println("Nhập vào cạnh 2:");
            int side2 = scanner.nextInt();
            System.out.println("Nhập vào cạnh 3:");
            int side3 = scanner.nextInt();
            //------------------------------------//
            Triangle.checkTriangle(side1,side2,side3);
            System.out.println("Đây là một tam giác hợp lệ.");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Lỗi:" + e.getMessage());
        } catch (Exception e){
            System.out.println("Lỗi không xác định. Vui lòng kiểm tra lại đầu vào.");
        } finally {
            scanner.close();
        }
    }
}
