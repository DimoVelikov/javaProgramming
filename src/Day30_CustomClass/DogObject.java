package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Brian Griffin";
        dog1.age = 35;
        dog1.breed = "pure";
        dog1.color = "white";
        dog1.gender = 'm';
        dog1.size = "medium";

        System.out.println(dog1);

        dog1.eat();
        dog1.bark();

        System.out.println("----------------");


        Dog dog2 = new Dog();

        dog2.name = "Lassy";
        dog2.breed = "German Shepard";
        dog2.age = 10;
        dog2.color = "gold";
        dog2.gender = 'f';
        dog2.size = "medium";

        System.out.println(dog2);
        System.out.println("---------------");

        Dog dog3 = new Dog();
        dog3.setInfo("Hektor", "street", 7, 'm', "big", "black");

        System.out.println(dog3);


        Dog dog4 = new Dog();

        dog4.setInfo("Bunny", "bulldog", 12, 'F', "small", "red");


        Dog dog5 = new Dog();

        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");


        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();

        ArrayList<Dog> maleDogs = new ArrayList<>();

        for (Dog each : dogs) {

            if (each.gender == 'f' || each.gender == 'F') {
                femaleDogs.add(each);
            }

        }

        System.out.println(femaleDogs);

        maleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

        maleDogs.removeIf(p -> p.gender == 'f' || p.gender == 'F');


        System.out.println(maleDogs);


    }


}
