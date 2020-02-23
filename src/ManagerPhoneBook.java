import java.util.Scanner;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        int choose;
        menu();

        while (true) {
            String name;
            String phoneNumber;
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Nhập tên");
                    name = sc1.nextLine();
                    System.out.println("Nhập số điện thoại");
                    phoneNumber = sc1.nextLine();
                    phoneBook.insertPhone(name,phoneNumber);
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Nhập tên cần xóa");
                    name = sc2.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Nhâp tên cần thay đổi");
                    name = sc3.nextLine();
                    System.out.println("Nhập số muốn thay đổi");
                    phoneNumber = sc3.nextLine();
                    phoneBook.updatePhone(name, phoneNumber);
                    break;
                case 4:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Nhập tên số cần tìm");
                    name = sc4.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sortPhone();
                    break;
                case 6:
                    System.out.println("Danh sách số điện thoại");
                    phoneBook.displayListPhone();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }

    public static void menu(){
        System.out.println("MENU");
        System.out.println("1.Insert phone");
        System.out.println("2.Remove phone");
        System.out.println("3.Update phone");
        System.out.println("4.Search phone");
        System.out.println("5.Sort phone");
        System.out.println("6.Danh sách số điện thoại");
        System.out.println("0.Exit");
        System.out.println("Mời bạn chọn 1 mục ");
    }
}