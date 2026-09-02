package Jobsheet1;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        System.out.println("Status awal dragon 1");
        dragon1.printStatus();

        System.out.println("\nDragon 1 bergerak 3 langkah");
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\nDragon1 ganti arah ke kanan, lalu bergerak 3 langkah ");

        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();
 
        System.out.println("\nDragon1 ganti arah ke nilai tidak valid");
        dragon1.changeDirection(9); 
        dragon1.printStatus();
 
        Dragon dragon2 = new Dragon();
        System.out.println("\n\nStatus awal dragon2");
        dragon2.printStatus();
 
        System.out.println("\nDragon2 ganti arah ke bawah, lalu bergerak 4 langkah");
        dragon2.changeDirection(3);
        dragon2.move(4);
        dragon2.printStatus();
 
        System.out.println("\nDragon2 ganti arah ke kiri, lalu bergerak 2 langkah");
        dragon2.changeDirection(4);
        dragon2.move(2);
        dragon2.printStatus();
    }
}
