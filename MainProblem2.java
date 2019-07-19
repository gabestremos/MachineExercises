package com.whitecloak.MachineProblems;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MainProblem2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first name:");
        String firstName=input.nextLine().toUpperCase();
        System.out.print("Enter second name:");
        String secondName=input.nextLine().toUpperCase();
        String firstNameFinal=firstName;
        String secondNameFinal=secondName;
        int count=0;

        for(int s=0;s<secondName.length();s++){
            char sIndex=secondName.charAt(s);
            String fname=String.valueOf(sIndex);
            if(sIndex!='.'){
                firstNameFinal=firstNameFinal.replaceAll(fname,"");
            }else {
                firstNameFinal=firstNameFinal.replaceAll("\\s.","");
            }
        }
        for(int d=0;d<firstName.length();d++){
            char fIndex=firstName.charAt(d);
            String sname=String.valueOf(fIndex);
            if(fIndex!='.'){
                secondNameFinal=secondNameFinal.replaceAll(sname,"");
            }else {
                secondNameFinal=secondNameFinal.replaceAll("\\s.","");
            }
        }
        String allNames=firstNameFinal+secondNameFinal;

        for(int q=0;q<allNames.length();q++){
            if(Character.isLetter(allNames.charAt(q))){
                count++;
            }
        }
        System.out.println(allNames+"="+count);
        if(count>6){
            count=count%6;
        }
        if(count<=6) {
            if (count==1) {
                System.out.println("FRIENDSHIP!");
            }
            else if(count==2) {
                System.out.println("LOVE!");
            }
            else if(count==3){
                System.out.println("AFFECTION!");
            }
            else if(count==4) {
                System.out.println("MARRIAGE!");
            }
            else if(count==5) {
                System.out.println("ENEMY!");
            }
            else if(count==6) {
                System.out.println("SOULMATE!");
            }
        }
    }
}
