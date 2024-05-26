class Car {

    int yearModel;
    String make;
    int speed;

    public Car() {
    }

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    public void accelerate(){
        this.speed += 5;
    }

    public void brake(){
        this.speed -= 5;
        if (this.speed < 0){
            this.speed = 0;
        }
    }
}