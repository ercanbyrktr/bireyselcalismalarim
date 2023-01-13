package day39_overridding;

public class FSupra extends EToyota {
    @Override
    void yakit(){
        System.out.println("Supra benzin kullanir");
    }

    @Override
    void motor() {
        System.out.println("Sirali 6 silindir 2JZ motor kullanir");

        /*
        @Override notasyonu Javaya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overridden method'u silerseniz
        CTE verir
         */
    }
}


