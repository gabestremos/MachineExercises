package com.whitecloak.MachineProblems;

import java.util.Scanner;

public class MainProblem3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String cheapestItems="";
        int totalPrice=0;
        int price[]=new int[3];
        String items[]=new String[3];
        System.out.println("Please enter 5 commodities");
        for(int a=0;a<5;a++){
            System.out.print("Enter products:");
            String commodity= input.nextLine();
            String com=commodity.replaceAll("\\s","");
            String commo[]=com.split("\\,");
            for(int s=0;s<commo.length;s++){
                String itemWithPrice=commo[s];
                price[s]=Integer.parseInt(itemWithPrice.substring(itemWithPrice.indexOf("-")+1));
                items[s]=itemWithPrice.substring(0,itemWithPrice.indexOf("-"));
            }
        int min=price[0];
        int index=0;
            for (int x=0;x<price.length;x++){
                if(min>=price[x]){
                    min=price[x];
                    index=x;
                }
            }
            totalPrice+=price[index];
            cheapestItems+=items[index]+",";
        }
        cheapestItems=cheapestItems.substring(0,cheapestItems.length()-1);
            System.out.println("Cheapest:"+cheapestItems);
            System.out.println("Total:"+totalPrice);
    }
}
