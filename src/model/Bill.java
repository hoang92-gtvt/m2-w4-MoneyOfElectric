package model;

public class Bill implements Comparable<Bill> {
    private Family customer;
    private int oldnumber;
    private int newnumber;

    public Bill() {

    }

    public Bill(Family family, int oldnumber, int newnumber) {
        this.customer = family;
        this.oldnumber = oldnumber;
        this.newnumber = newnumber;
    }

    public Family getCustomer() {
        return customer;
    }

    public void setCustomer(Family customer) {
        this.customer = customer;
    }

    public int getOldnumber() {
        return oldnumber;
    }

    public void setOldnumber(int oldnumber) {
        this.oldnumber = oldnumber;
    }

    public int getNewnumber() {
        return newnumber;
    }

    public void setNewnumber(int newnumber) {
        this.newnumber = newnumber;
    }

    public  int getMoney(){
        return (this.newnumber-this.oldnumber)*750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", oldnumber=" + oldnumber +
                ", newnumber=" + newnumber +
                '}';
    }

    @Override
    public int compareTo(Bill bill) {
        if(this.getCustomer().getId().compareToIgnoreCase(bill.getCustomer().getId())>0){
            return 1;

        }else if(this.getCustomer().getId().compareToIgnoreCase(bill.getCustomer().getId())<0) {
            return -1;
        }else return 0;
    }
}
