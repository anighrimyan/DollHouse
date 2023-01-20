import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int size = 3;
        ArrayList<ArrayList<DollHouse>>  collection = new ArrayList<ArrayList<DollHouse>>(size);
        for (int i = 0; i < size; ++i) {
            System.out.println("DollHouse ArrayList.");
            ArrayList<DollHouse> dollHouses = new ArrayList<DollHouse>();
              for (int j = 0; j < size; ++j) {
                  System.out.println("Doll houses.");
                  DollHouse dollHouse = new DollHouse(sr.nextInt(), new Doll(sr.nextInt(), sr.nextLine()));
            }
              collection.add(dollHouses);
        }
    }
}