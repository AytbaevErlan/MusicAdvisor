class Patient {

    String name;

    public Patient() {
    }

    public Patient(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("Hello, my name is " + name + ", I need a doctor.");
    }
}