package com.whitecloak.MachineProblems;

import java.util.Scanner;

public class MainProblem1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double total=0;
        int count=0;
        System.out.print("Enter a string:");
        String inputString= input.nextLine();
        String equalWords[]={"wth","omg","happy","great","awesome","sad","disappointing","hello","relieved","damn","hard"};
        int equalValue[]={4,7,10,10,8,1,2,2,9,3,4};

        String words[]=inputString.toLowerCase().split(" ");
        for(int x=0;x<=words.length-1;x++){
            for(int z=0;z<=equalWords.length-1;z++){
                if(words[x].contains(equalWords[z])){
                    total+=equalValue[z];
                    count++;
                }
            }
        }
        double ans=total/count;
        System.out.println("Total:"+ ans);
        if(ans>=5){
            System.out.println("Happy!");
        }
        else {
            System.out.println("Sad.");
        }


    }
}
