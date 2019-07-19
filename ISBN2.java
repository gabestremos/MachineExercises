package com.whitecloak.MachineProblems;

import java.util.Scanner;

public class ISBN2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 9 digit number:");
        String isbnInput=input.nextLine();

        int totalsum=0;
        for(int z=1;z<isbnInput.length();z++){
            int mul=z+1;
            char each=isbnInput.charAt(z);
            int number=Integer.parseInt(Character.toString(each));
            int prod=number*mul;
            //System.out.println(prod);
            totalsum+=prod;
        }
        int checkDigit=totalsum%11;
        String ISBN=isbnInput.substring(0,1)+"-"+isbnInput.substring(1,4)+"-"+isbnInput.substring(4, isbnInput.length())+"-";
        //System.out.println(checkDigit);
        if (checkDigit==10){
            System.out.println("ISBN Number:"+ISBN+"X");
        }else {
            System.out.println("ISBN Number:"+ISBN+checkDigit);
        }
    }
}
