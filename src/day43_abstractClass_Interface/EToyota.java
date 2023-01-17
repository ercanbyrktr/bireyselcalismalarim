package day43_abstractClass_Interface;

public class EToyota extends DAraba{


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");

    }
    /*
    parent class'daki standart belirleyici method'lar
    (abstract method)'larin tamami child class tarafindan override edilmelidir

    concrete methodlarin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz

    Aslinda Toyota class'i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class'inin da abstract yapmaniz guzel olur
     */
}
