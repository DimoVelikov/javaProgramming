package day34_GarbageCollector_AccessModifiers;

public class iPhone {
    public String model, color, madeIn, designedIn;
    public int price,size;

    public iPhone(String model, String color, String madeIn, String designedIn, int price, int size) {
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.designedIn = designedIn;
        this.price = price;
        this.size = size;
    }

    static String brand, OS;
    static boolean isSmartPhone;

    static {
        brand = "Apple";
        OS = "iOS";
        isSmartPhone= true;
    }


     public static void printOperatingSystem(){
         System.out.println(OS);
     }

     public static void call(long phoneNumber){
         System.out.println("Calling: " + phoneNumber);

     }

     public static void text(long phoneNumber){
         System.out.println("Texting: " + phoneNumber);
     }

     public static void faceTime(long phoneNumber){
         System.out.println("FaceTime: " + phoneNumber);
     }

     public static void faceTime(String email){
         System.out.println("FaceTime: " + email);
     }

    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", designedIn='" + designedIn + '\'' +
                ", price= $" + price +
                ", size=" + size + "inches"+
                '}';
    }




}
