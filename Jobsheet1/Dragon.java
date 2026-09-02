package Jobsheet1;

public class Dragon {
    int x;  
    int y;
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if(newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid! Gunakan 1 (Atas), 2 (Kanan), 3 (Bawah), atau 4 (Kiri).");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: 
            y += steps;
            break;

            case 2:
            x += steps;
            break;

            case 3:
            y -= steps;
            break;

            case 4:
            x -= steps;
            break;

            default:
            System.out.println("Dragon tidak bisa bergerak, arah belum valid.");
        }
    }

    public void printStatus() {
        String arahText;
        switch (direction) {
            case 1: 
            arahText = "Atas"; 
            break;

            case 2: 
            arahText = "Kanan"; 
            break;
            
            case 3: 
            arahText = "Bawah"; 
            break;
            
            case 4: 
            arahText = "Kiri"; 
            break;

            default: 
            arahText = "Tidak diketahui";
        }

        System.out.println("Posisi: (" + x + ", " + y + ")");
        System.out.println("Arah: " + arahText);
        System.out.println("--------------------");
    }
}
