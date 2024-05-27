import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Scanner scanner = new Scanner(System.in);
        int increse = scanner.nextInt();
        myCar.drive(increse);
        myCar.displaySpeed();
    }
}

class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public void drive(int increase) {
        speed += increase;
        if (speed > 200){
            speed  = 200;
        }
    }

    public void displaySpeed() {
        System.out.println(speed);
    }
}