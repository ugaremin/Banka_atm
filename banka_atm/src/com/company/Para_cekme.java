package com.company;

import java.util.Scanner;

public class Para_cekme {

    public void Para_cekme(){
        System.out.println("*********************");
        System.out.println("PARA ÇEKME MENÜSÜ");
        System.out.println("*********************");
        Bakiye bakiye=new Bakiye();
        Scanner input=new Scanner(System.in);
        System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ");
        int cekim=input.nextInt();
        if (cekim>Bakiye.bakiye){
            System.out.println("YETERLİ BAKİYENİZ BULUNMAMAKTADIR");
            Ana_menu ana_menu=new Ana_menu();
            ana_menu.Ana_menu();
        }
        else{
            Bakiye.bakiye=Bakiye.bakiye-cekim;
            System.out.println("HESABINIZDAN "+cekim+" TL PARA ÇEKİLMİŞTİR.");
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
}
