package day03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class OnlineAlisverisSitesi {

    static Scanner input=new Scanner(System.in);

    static List<String> urunListesi= new ArrayList<>();
    static List<Double> urunFiyatlari= new ArrayList<>();

    static double odenecekMiktar;





    public static void main(String[] args) {
        urunListesi.add("Saat Urun Kodu 0");
        urunListesi.add("Monitor Urun Kodu 1");
        urunListesi.add("Canta Urun Kodu 2");
        urunListesi.add("TV Urun Kodu 3");
        urunListesi.add("Kitap Urun Kodu 4");

        urunFiyatlari.add(150.0);
        urunFiyatlari.add(3000.0);
        urunFiyatlari.add(5000.0);
        urunFiyatlari.add(6000.0);
        urunFiyatlari.add(100.0);

        List<String>yeniUrunler=new ArrayList<>();
        yeniUrunler.add("Taki Urun Kodu 5");
        yeniUrunler.add("Tencere Urun Kodu 6");
        yeniUrunler.add("Kiyafet Urun Kodu 7");

        List<Double>yeniUrunFiyatlari=new ArrayList<>();
        yeniUrunFiyatlari.add(9000.0);
        yeniUrunFiyatlari.add(200.0);
        yeniUrunFiyatlari.add(400.0);

        urunListesi.addAll(yeniUrunler);  //Lİst i Liste ekledik
        urunFiyatlari.addAll(yeniUrunFiyatlari);

        musteriSecim();






    }

    public static void musteriSecim() {
        urunListesiniGoster();
        System.out.println("Lütfen urun kodunu giriniz");
        int urunKodu=input.nextInt();
        if (urunKodu>=0 && urunKodu<=urunListesi.size()){
            System.out.println("Kac adet istediğinizi giriniz");
            int adet=input.nextInt();
            double toplamUrunFiyatı=urunFiyatlari.get(urunKodu)*adet;
            odenecekMiktar +=toplamUrunFiyatı;
           devamMi();
        }else {
            System.out.println("Lütfen gecerli bir urun kodu giriniz...");
            musteriSecim(); // recursive method. method içinden aynı methodu tekrar cagırmak.yinelenen method.
        }
    }

    public static void devamMi() {
        System.out.println("Alisverise Devam Etmek Istiyormusunuz \nEvet ise ==>1 \nHayir ise ==>2'ye basın");
        int devamMi=input.nextInt();
        if (devamMi==1){
            musteriSecim();
        }else if(devamMi==2){
            odemeYap();
        }else {
            System.out.println("Gecersiz bir secim yaptınız");
            devamMi();
        }
    }

    public static void odemeYap() {
        LocalDate kurulusGunu = LocalDate.of(2022,04,9);
        LocalDate date = LocalDate.now();
        if(date.isEqual(kurulusGunu)){
            slowPrintln("TechPro Alisveris Sitesine Hosgeldiniz." +
                    "\nBugun Bizim Yil Donumumuz.\nBorcunuz Yoktur",60);
        }else{
            slowPrintln("TechPro Alisveris Sitesini Tercih Ettiginiz Icin Tesekkur Ederiz",80);
            System.out.println(odenecekMiktar+" TL");
        }


    }

    private static void slowPrintln(String metin, int gecikme) {
        for (char ch:metin.toCharArray()) {      //toCharArray() string bi datadan aldıgını harf harf char a dönüştürüyo
            System.out.print(ch);
            try {
                Thread.sleep(gecikme);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void urunListesiniGoster() {

        System.out.println("***********Urun Listesi***********");

        for (int i=0;i<urunListesi.size();i++){
            System.out.println(i +" - "+urunListesi.get(i)+" Fiyat "+urunFiyatlari.get(i)+" TL");
        }










    }
}
