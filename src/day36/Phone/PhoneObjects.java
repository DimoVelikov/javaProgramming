package day36.Phone;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone iPhone13 = new IPhone();
        iPhone13.setInfo("Apple","13","5.6","black",1000);
        iPhone13.faceTime(12341231);
        iPhone13.faceTime("dve@gmai.com");
        iPhone13.call(511242132);

        Samsung phone1 = new Samsung();
        phone1.setInfo("Samsung","Galaxy","5.0","white",800);

        phone1.freeze();
        phone1.text(132145534);

        System.out.println(phone1);
        System.out.println(iPhone13);

        Nokia nokia3310 = new Nokia();

        nokia3310.setInfo("Nokia","3310","gray","graty",10);

        System.out.println(nokia3310);
        nokia3310.selfDefense();

    }

}
