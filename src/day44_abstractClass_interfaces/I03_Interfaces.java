package day44_abstractClass_interfaces;

public interface I03_Interfaces {

    int SAYI=20;
    /*
    int sayi;
    Interface'lerde tum variable'lar public static ve final'dir
    dolayisiyla sonradan deger atama sansimiz yoktur
    bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz

    Bir interface bir class'i parent edinemez
     */

    void yakit();
    /*
    Interface icerisindeki her method
    public abstract ozelliklerine sahiptir

    abstract bir method'un bodysi olmasi mumkun degildir
    Java sonradan developerlarin istegi uzerine
    kısmi bir update yapmıstir

    Bir interface'e sonradan bir abstract method eklerseniz
    o interface'i daha once implement etmis tum class'lara gidip
    hepsinde yeni eklenen method'u override etmeniz gerekir
    Bu da buyuk ve eskiden gelen projeler icin cok zor bir islemdir

    bunun icin java java8'den itibaren
    interfacelere sonradan body'si olan method eklenmesine izin vermistir

    bu methodlarin body'si olsa da Interface'in yapisi geregi
    bu methodlara concrete denmez
    body'si olan bu methodlar istisna olarak kabul edilebilir
     */

    public void motor();
    public abstract void teker();


}
