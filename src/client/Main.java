package client;

import controller.BillManager;
import model.Bill;
import model.Family;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Bill>  listBill = new ArrayList<>();
    private static BillManager manager = new BillManager(listBill);
    private static String filePath = new Scanner(System.in).nextLine();

    private static void menu(){
        System.out.println("1: Thêm một Bill");
        System.out.println("2: Hiển thị danh sách");
        System.out.println("3: Xóa một Bill");
        System.out.println("4: Tính tiền một hộ gia đình theo Id");
        System.out.println("5: Thoát");
        System.out.println("Bạn chọn gì ");
        int choice = new Scanner(System.in).nextInt();
        switch(choice){
            case 1: add();
            break;
            case 2: show();
            break;
            case 3: delete();
            break;
            case 4: getMoney();
            break;


            default: System.exit(0);

            }
        }

    private static void delete() {
        System.out.println("Nhập Id của bill cần xóa");
        String id = new Scanner(System.in).nextLine();
        Bill billtoDele= manager.getBillById(id);
        manager.deleBill(billtoDele);
    }
    private static int getMoney(){
        System.out.println("Nhập id của gia đình cần xóa");
        String id = new Scanner(System.in).nextLine();
        Bill billtoMoney= manager.getBillById(id);
        return billtoMoney.getMoney();
    }

    private static void show() {
        manager.show();
    }
    private static void add() {
        Family family = inputFamily();
        System.out.println("Nhập số điện cũ ");
        int oldnumber = new Scanner(System.in).nextInt();
        System.out.println("Nhập số điện mới");
        int newnumber = new Scanner(System.in).nextInt();
        Bill bill = new Bill(family, oldnumber,newnumber);


    }
    private static Family inputFamily(){
        System.out.println("Nhập Tên chủ hộ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhập Địa chỉ chủ hộ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Nhập id mã số điện");
        String id = new Scanner(System.in).nextLine();

        return new Family(name,address,id);
    }


    public static void main(String[] args) {
        System.out.println("abc");
        while(true){
            menu();
        }

    }



}
