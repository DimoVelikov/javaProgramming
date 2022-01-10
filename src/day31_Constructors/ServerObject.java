package day31_Constructors;

public class ServerObject {
    public static void main(String[] args) {

        Server server1 = new Server();

        server1.setInfo("Tereza",10,15,false);

        System.out.println(server1);

        server1.cleanTable();
    }
}
