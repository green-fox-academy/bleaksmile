import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {
    public static void main(String[] args) {
        System.out.println("Give me the number of the players");
        Scanner input = new Scanner(System.in);
        int members = input.nextInt();
        josephus(members);
    }

    public static void josephus(int a){
        ArrayList < Integer > arrayList = new ArrayList<>();
        for (int i = 0; i < a ; i++) {
            arrayList.add(8);
        }

        for (int m = 0; m <a-1 ; m++) {

            for (int j = 0; j <a; j += 2) {
                System.out.println(arrayList.get(j));
                if ((j + 1) < arrayList.size()) {
                    arrayList.set(j + 1, 1);
                    System.out.println(arrayList.get(j + 1));
                }
            }
            System.out.println("--------");
            for (int k = 0; k <a; k+=3 ) {
                System.out.println(arrayList.get(k));
                System.out.println(arrayList.get(k+1));
                if ((k + 3) < arrayList.size()) {
                    arrayList.set(k + 2, 1);
                    System.out.println(arrayList.get(k + 1));
                }

            }

        }
    }


}

