package static_.homework;

import java.util.Scanner;

public class FruitMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruit [] fruit = new Fruit[3];
        for(int i=0;i<3;i++){
            System.out.print("pum을 입력하세요: "); String pum = scanner.next();
            System.out.print("jan을 입력하세요: "); int jan = scanner.nextInt();
            System.out.print("feb을 입력하세요: "); int feb = scanner.nextInt();
            System.out.print("mar을 입력하세요: "); int mar = scanner.nextInt();
            fruit[i]= new Fruit(pum,jan,feb,mar);
            fruit[i].calcTot();
        }
        System.out.println("---------------------------------------");
        System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
        for(int i=0;i<3;i++){
            fruit[i].display();
        }
        Fruit.output();

    }
}
