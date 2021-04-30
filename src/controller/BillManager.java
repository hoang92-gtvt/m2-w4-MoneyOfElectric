package controller;

import model.Bill;
import model.Family;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BillManager  {
    ArrayList<Bill> lisBill ;
    private String pathFile;

    public BillManager() {
    }

    public BillManager(ArrayList<Bill> lisBill) {
        this.lisBill = lisBill;
    }

    public ArrayList<Bill> getLisBill() {
        return lisBill;
    }

    public void setLisBill(ArrayList<Bill> lisBill) {
        this.lisBill = lisBill;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public void addBill(Bill bill){
        lisBill.add(bill);

    }
    public void show(){
        for (Bill b:lisBill
             ) {
            System.out.println(b);

        }
    }

    public void deleBill(Bill bill){
        lisBill.remove(bill);

    }

    public Family getFamilyById(String id){
        for (Bill b:lisBill
             ) {
            if( b!=null){
               String idOfcustomer = b.getCustomer().getId();
               if(idOfcustomer.equals(id)){
                   return b.getCustomer();
               }
            }

        }
        return null;

    }
    public Bill getBillById(String id){
        for (Bill b : lisBill) {
            if (getFamilyById(id).equals(b)) {
                return b;
            }
        }
        return null;
    }

    public void sortBill(){
        Collections.sort(lisBill);
    }



}
