package java_niit;

import java.util.*;

public class ProcessAtm {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    UserInfo currentUser = null;

	    while (currentUser == null) {
	        System.out.print("Nhập ID: ");
	        String Id = scanner.nextLine();
	        System.out.print("Nhập mật khẩu: ");
	        String password = scanner.nextLine();
	        currentUser = ATM.check(Id, password);
	        

	        if (currentUser == null) {
	            System.out.println("Thông tin đăng nhập không đúng");
	        }
	    }

	    System.out.println("Welcome " + currentUser.getName());

	    while (true) {
	        System.out.println("1. Rút tiền");
	        System.out.println("2. Tra cứu thông tin tài khoản");
	        System.out.println("3. Thoát chương trình");
	        System.out.print("Chọn thao tác: ");

	        String choice = scanner.nextLine();

	        switch (choice) {
	            case "1":
	                System.out.print("Nhập số tiền muốn rút: ");
	                try {
	                    int amount = Integer.parseInt(scanner.nextLine());
	                    currentUser.withdraw(amount);
	                    System.out.println("Bạn đã rút " + amount + " thành công. Số dư hiện tại: " + currentUser.getMoney());
	                } catch (NumberFormatException e) {
	                    System.out.println("Vui lòng nhập số hợp lệ");
	                } catch (IllegalArgumentException e) {
	                    System.out.println(e.getMessage());
	                }
	                break;
	            case "2":
	                System.out.println("Số dư tài khoản: " + currentUser.getMoney());
	                break;
	            case "3":
	                System.out.println("Good bye, see you later");
	                scanner.close();
	                return;
	            default:
	                System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
	        }
	    }
	}
	}


