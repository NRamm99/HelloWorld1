import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dit navn?");
        String name = input.nextLine();
        System.out.println("Dit navn er " + name);

        System.out.println("Dit efternavn?");
        String lastName = input.nextLine();
        System.out.println();
        System.out.println("Dit fornavn er " + name + " og dit efternavn er " + lastName);
    }
}