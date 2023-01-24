package day48_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {

    public static void main(String[] args) {

        Map<Integer,String>ogrenciMap=ReausableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        // value'lari sira numarali olarak yazdirin
        ReausableMethods.tumValueSiraliYazdir(ogrenciMap);

        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList=ReausableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
    }
}
