package day50_maps_TheEnd;

import day48_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("cleardan sonra map :" + sinifListMap);

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104,"Aradiginiz key yok"));
        //Derya, Deniz, Devops
        System.out.println(sinifListMap.getOrDefault(110,"Aradiginiz key yok"));
        //Aradiginiz key yok

        System.out.println(sinifListMap.isEmpty());//false

        sinifListMap.putIfAbsent(104,"Derya,Okyanus,Developer");
        sinifListMap.putIfAbsent(108,"Aysun,Can,Devops");
        ReusableMethods.entryYazdir(sinifListMap);

        /*
        SinifListesiMap'e key 106 yoksa , value "Mevlut, Han, Tester" ekleyin
        106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz?"
        yazdirin
         */


    }
}
