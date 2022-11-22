package kasim_22_okulYonetimi;

import java.util.Locale;
import java.util.Scanner;

public class AnaMenu extends Kisi{
    /*
    ====================================
 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
====================================
 1- ÖĞRENCİ İŞLEMLERİ
 2- ÖĞRETMEN İŞLEMLERİ
 Q- ÇIKIŞ
     */
    void anaMenu(){
        System.out.println("====================================\n"
                           +" ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                           "====================================\n" +
                "1- ÖĞRENCİ İŞLEMLERİ\n" +
                "2- ÖĞRETMEN İŞLEMLERİ\n" +
                " Q- ÇIKIŞ" +
                "SECİMİNİZ:");

        Scanner scan=new Scanner(System.in);


        while (true){
            char secim=scan.next().toUpperCase().charAt(0);
            switch (secim){
                case'1':{

                }
                case'2':{

                }
                case'Q':{

                }
                default:{
                    System.out.println("Gecerli deger giriniz");
                    anaMenu();
                }
            }
        }
    }
}
