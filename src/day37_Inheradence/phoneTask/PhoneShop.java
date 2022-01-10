package day37_Inheradence.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 12","6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("Galaxy s19","6 inches",900,"White");

        Nokia nokia = new Nokia("3310","5 inches",50,"gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(2423423);
        iphone.faceTime(20202020);
        iphone.faceTime("dv@gmail.com");

        System.out.println("--------------------------");

        samsung.call(911);
        samsung.text(21321312);
        samsung.freeze();
        System.out.println("--------------------------");

        nokia.call(911);
        nokia.text(213121321);
        nokia.selfDefense();


    }


}
