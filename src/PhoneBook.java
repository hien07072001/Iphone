import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone implements PhoneFunction {
    ArrayList<Phone> phoneList = new ArrayList<Phone>();

    public ArrayList<Phone> getListPhone() {
        return phoneList;
    }
    public void displayListPhone(){
        for (Phone phone:phoneList){
            System.out.println("Name:" + phone.getName() +",PhoneNumber: " + phone.getPhoneNumber());
        }
    }

    @Override
    public void insertPhone(String name, String phoneNumber) {
        Phone newPhone = new Phone(name,phoneNumber);
        phoneList.add(newPhone);
        System.out.println("Thêm thành công");
    }

    @Override
    public void removePhone(String name) {
        boolean had = false;
        for (Phone phone:phoneList){
            if (phone.getName().equals(name)){
                phoneList.remove(phone);
                System.out.println("Đã xóa");
                had = true;
                break;
            }
        }

        if (!had){
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean had = false;
        for (Phone phone:phoneList){
            if (phone.getName().equals(name)){
                System.out.println("Số diện thoại người dùng :" + phone.toString());
                had = true;
                break;
            }
        }
        if (!had){
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void updatePhone(String name, String phoneNumber) {
        boolean had = false;
        for (Phone phone:phoneList){
            if (phone.getName().equals(name)){
                phone.setPhoneNumber(phoneNumber);
                System.out.println("Đã sửa");
                had = true;
                break;
            }
        }
        if (!had){
            System.out.println("Số đã tồn tại");
        }
    }

    @Override
    public void sortPhone() {
        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone phone1, Phone phone2) {
                return phone1.getName().compareTo(phone2.getName());
            }
        });
        System.out.println("Đã sắp xếp");
    }


}
