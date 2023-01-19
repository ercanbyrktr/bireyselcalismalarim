package day45_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da oldugumuzu düsünsek
    iki tane acces modifier kullanma ihtimali OLAMAZ

    asagidaki method'da goreceginiz gibi
    interface'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java 8'den sonra kullanilmaya baslamistir
    bu ozellikten once,bir interface'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i implement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi

    bu ozellik sayesinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindn override edilme MECBURİYETİ OLMAZ
    ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz

    bu methodların body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir

    o zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    bu iki farkli kelimenin amaci
    child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
    static keyword kullanilirsa, child class'dan bu method'a erismek icin
    InterfaceAdi.öethodAdi yeterli olur

    default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir
     */

    public default void teker(){
        System.out.println("default...tum arabalarin tekeri vardir");
    }
    public static void direksiyon(){
        System.out.println("static...tum arabalarin direksiyonu vardir");
    }
}
