package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Kia","Sorento","white",2017,15000);

        Car car2 = new Car();

        car2.setInfo("Kia","Sorento","white",2017,15000);

        Car car3 = new Car();

        car3.setInfo("Opel","Record","red",1986,15000);

        ArrayList<Car> carsList = new ArrayList<>();

        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList) {

            System.out.println(each.brand + each.price);



        }


        System.out.println("-----------------------");


        carsList.removeIf(p -> p.brand.equals("Kia") && p.year>2000 &&p.year<2020);

        System.out.println(carsList);




    }
}
