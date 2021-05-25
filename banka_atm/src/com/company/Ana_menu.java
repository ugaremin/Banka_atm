package com.company;
import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Ana_menu {
    public void Ana_menu(){
        System.out.println("*********************");
        System.out.println("ANA MENÜ");
        System.out.println("*********************");
        System.out.println("1 PARA YATIRMA");
        System.out.println("2 PARA ÇEKME");
        System.out.println("3 BAKİYE SORGULA");
        System.out.println("0 ÇIKIŞ");
        System.out.println("*********************");

        Scanner input=new Scanner(System.in);
        System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ");
        int islem=input.nextInt();
        if (islem==1){
            Para_yatırma para_yatırma=new Para_yatırma();
            para_yatırma.Para_yatırma();
        }
        else if (islem==2){
            Para_cekme para_cekme=new Para_cekme();
            para_cekme.Para_cekme();
        }
        else if (islem==3){
            Bakiye_sorma bakiye_sorma=new Bakiye_sorma();
            bakiye_sorma.Bakiye_sorma();
        }

        else if (islem==0){System.exit(0);}

        else{
            System.out.println("YANLIŞ TUŞLAMA YAPTINIZ");
            Ana_menu();
        }
    }
}
