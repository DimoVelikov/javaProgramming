package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;

    public int numberOfStars;

    ArrayList<Server> servers = new ArrayList<>();
    ArrayList<Chef> chef  = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }


    public void hireServer(Server hireServer){
        servers.add(hireServer);
    }

    public void hireServers(Server[] hireServers){
        servers.addAll(Arrays.asList(hireServers));
    }

    public void hireChef(Chef hireChef){
        chef.add(hireChef);
    }

    public void hireChefs(Chef[] hireChefs){
        chef.addAll(Arrays.asList(hireChefs));
    }

    public void terminateChef(int employeeID){

        chef.removeIf(p -> p.employeeID == employeeID);

    }

    public void terminateServer(int employeeID){
        servers.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chef=" + chef.size() +
                '}';
    }

    // toString(): Return (String) of all the information of a Restaurant object.
    // No need to print the whole list of Servers or Chefs. Print the number of
    // Servers and Chefs along side the other information




}
