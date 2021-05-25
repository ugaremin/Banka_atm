package com.company;

import java.security.PublicKey;
import java.util.Scanner;

public class Para_yatırma {

    public void Para_yatırma(){
        System.out.println("*********************");
        System.out.println("PARA YATIRMA MENÜSÜ");
        System.out.println("*********************");
        Bakiye bakiye=new Bakiye();
        Scanner input=new Scanner(System.in);
        System.out.println("YATIRMAK İSTEDİĞİNİZ TUTARI GİRİNİZ");
        int yatan=input.nextInt();
        Bakiye.bakiye=Bakiye.bakiye+yatan;
        System.out.println("HESABINIZA "+yatan+" TL YATIRILMIŞTIR.");
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
