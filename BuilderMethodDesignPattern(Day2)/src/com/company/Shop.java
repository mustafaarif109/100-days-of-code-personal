package com.company;

public class Shop {

    public static void main(String[] args) {
	// write your code here
        Phone phone = new PhoneBuilder().setOs("abv").getPhone();
        System.out.println(phone);
    }
}
