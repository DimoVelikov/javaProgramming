package day04_Variables;

public class Currencies {
    public static void main(String[] args) {

        int dollar = 1;
        double lira = dollar * 9.53;
        double euro =  dollar * 0.86;
        double jpy =  dollar * 114.14;
        double pound = dollar * 0.73;
        double peso = dollar  * 20.84;
        double cad = dollar * 1.24;
        double riyal = dollar * 3.75;
        double rub = dollar * 71.50;
        double lv = dollar * 1.69;
        double dong = dollar * 22755;
        //jpy, pound, peso, cad, riyal, rub ...

        System.out.println("dollar = $" + dollar);
        System.out.println("lira = $" + lira);
        System.out.println("euro = $" + euro);
        System.out.println("jpy = $" + jpy);
        System.out.println("pound $= " + pound);
        System.out.println("peso $= " + peso);
        System.out.println("cad $= " + cad);
        System.out.println("riyal $= " + riyal);
        System.out.println("rub $= " + rub);
        System.out.println("lv $= " + lv);
        System.out.println("dong $= " + dong);
    }
}
