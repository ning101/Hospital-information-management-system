package com.example.his.test;

public class test {
    public static void main(String[] args) {
        Te t1 = new Te(1);
        Te t2 = new Te(1);
        if (t1.compareTo(t2) == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

class Te implements Comparable{
    private int price;

    public Te(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Object o) {
        Te t = (Te)o;
        if (price > t.price)
            return 1;
        else if (price == t.price)
            return 0;
        else
            return -1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}