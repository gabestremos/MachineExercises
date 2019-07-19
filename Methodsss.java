package com.whitecloak.MachineProblems;

import javax.swing.*;

public class Methodsss {
    public static int get_num(String fract){
        //accepts a string fraction and returns the numerator
        //e.g. 12/45, returns 12 as an integer
        int num=Integer.parseInt(fract.split("/")[0]);
        return num;
    }

    public static int get_denum(String fract){
        //accepts a string fraction and returns the denominator
        //e.g. 12/45, returns 45 as an integer
        int denum=Integer.parseInt(fract.split("/")[1]);
        return denum;

    }

    public static int gcd(int num, int denom){
        //accepts two integers and returns their greatest common divisor
        //e.g. 12/45, returns 3
        if(denom==0){
            return num;
        } else {
            return gcd(denom,(num % denom));
        }

    }

    public static String simplify(int num, int denom){
        //accepts two integers and returns its simplest form as a string
        //e.g. 12/45, returns 4/15
        int gcd=gcd(num,denom);
        int newNum=num/gcd;
        int newDenom=denom/gcd;
        String simplified=(newNum+"/"+newDenom);
        if(newDenom==1){
            simplified=String.valueOf(newNum);
            return simplified;
        }else{
            return simplified;
        }

    }

    public static void print_answer(String fract1, String fract2, String operation, String answer){
        //accepts two fractions in string and prints out the formatted output in simplest form
        //e.g. fract1-12/45, fract2-1/45, operation-1, answer - 13/45
        //prints out "12/45 + 6/45 = 2/5", no data being returned
        //when the denominator is equal to one, it prints only the numerator
        System.out.println(fract1+operation+fract2+"="+answer);
        return;
    }

    public static void f_sum(String fract1, String fract2){
        //accepts two fractions in string, adds the fractions and prints out the formatted output in simplest form
        //e.g. fract1=12/45, fract2=1/45, answer=13/45
        //prints out "12/45 + 6/45 = 2/5", no data being returned
        int sum_num=(get_num(fract1)*get_denum(fract2))+(get_num(fract2)*get_denum(fract1));
        int sum_denum=get_denum(fract1)*get_denum(fract2);
        String simplified=simplify(sum_num,sum_denum);
        print_answer(fract1,fract2,"+",simplified);
    }



    public static void f_mult(String fract1, String fract2){
        //accepts two fractions in string, multiplies the fractions and prints out the formatted output in simplest form
        //e.g. fract1=12/45, fract2=1/45, answer=4/745
        //prints out "12/45 * 1/45 = 4/745", no data being returned
        int mul_num=get_num(fract1)*get_num(fract2);
        int mul_denum=get_denum(fract1)*get_denum(fract2);
        String simplified=simplify(mul_num,mul_denum);
        print_answer(fract1,fract2,"*",simplified);

       // System.out.println(mul_num+"/"+mul_denum);
    }



    public static void f_div(String fract1, String fract2){
        //accepts two fractions in string, divides the fractions and prints out the formatted output in simplest form
        //e.g. fract1=12/45, fract2=1/45, answer=12/1
        //prints out "12/45 / 1/45 = 12", no data being returned
        int div_num=get_num(fract1)*get_denum(fract2);
        int div_denum=get_denum(fract1)*get_num(fract2);
        String simplified=simplify(div_num,div_denum);
        print_answer(fract1,fract2,"/",simplified);

    }



    public static void f_sub(String fract1, String fract2){
        //accepts two fractions in string, subtracts the fractions and prints out the formatted output in simplest form
        //e.g. fract1=12/45, fract2=1/45, answer=11/45
        //prints out "12/45 - 1/45 = 11/45", no data being returned
        int sub_num=(get_num(fract1)*get_denum(fract2))-(get_num(fract2)*get_denum(fract1));
        int sub_denum=get_denum(fract1)*get_denum(fract2);
        String simplified=simplify(sub_num,sub_denum);
        print_answer(fract1,fract2,"-",simplified);
    }

    public static void main(String[] args) {

        String fract1 = JOptionPane.showInputDialog( "Type fraction 1: ");
        String fract2 = JOptionPane.showInputDialog( "Type fraction 2: ");
        String op = JOptionPane.showInputDialog("Choose operator 1-4: ");

        switch(op){
            case "1":	f_sum(fract1, fract2);
                break;
            case "2":	f_sub(fract1, fract2);
                break;
            case "3":	f_mult(fract1, fract2);
                break;
            case "4":	f_div(fract1, fract2);
                break;

        }

    }
}
