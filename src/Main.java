import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Chleba", "Rohlík", "Rýže", "Jablko", "Kofola", "Twix", "Kit-Kat", "Toustový chléb", "Hovězí maso"};
        int[] quantity = new int[products.length];
        int total = 0;

        for (int i = 0; i < quantity.length; i++) {
            System.out.println(i + 1 + " = " + products[i]);
        }
        System.out.format("Co si dáte?: ");

        int num = sc.nextInt();
        String s = Integer.toString(num);
        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        int[] choose;
        choose = intArray;

        for (int j = 0; j < choose.length; j++) {
            int k = choose[j];

            switch (k) {
                case 1:
                    total += 30;
                    quantity[0]++;
                    break;
                case 2:
                    total += 2;
                    quantity[1]++;
                    break;
                case 3:
                    total += 38;
                    quantity[2]++;
                    break;
                case 4:
                    total += 10;
                    quantity[3]++;
                    break;
                case 5:
                    total += 25;
                    quantity[4]++;
                    break;
                case 6:
                    total += 15;
                    quantity[5]++;
                    break;
                case 7:
                    total += 23;
                    quantity[6]++;
                    break;
                case 8:
                    total += 50;
                    quantity[7]++;
                    break;
                case 9:
                    total += 180;
                    quantity[8]++;
                    break;
                default:
                    System.out.println("Neznámá položka");
                    break;
            }
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(quantity[i] + "-" + " " + products[i]);
        }
        System.out.format("%n" + "Total: " + total + " Kč");
    }
}


