package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Bakiye_sorma {

    public void Bakiye_sorma(){

        System.out.println("*********************");
        System.out.println("BAKİYE MENÜSÜ");
        System.out.println("*********************");
        System.out.println("BAKİYENİZ:"+ Bakiye.bakiye+" TL");
        Scanner input=new Scanner(System.in);
        System.out.println("ANA MENÜYE DÖNMEK İÇİN 1 E BASINIZ");
        System.out.printf("ÇIKIŞ YAPMAK İÇİN 0 A BASINIZ\n");
        int islem=input.nextInt();
        if (islem==1){
            Ana_menu ana_menu=new Ana_menu();
            ana_menu.Ana_menu();
        }
        else if(islem==0){
            System.exit(0);
        }

    }
}
