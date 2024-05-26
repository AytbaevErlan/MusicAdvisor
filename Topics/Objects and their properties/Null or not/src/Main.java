
class Solution {

    public void printIsNull(Object o) {
        if (o != null){
            System.out.println("It's an object");
        } else {
            System.out.println("It's null");
        }
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        StringBuilder firstBuilder = new StringBuilder("Java");

        firstBuilder
                .append("J")
                .append("a")
                .append("v")
                .append("a");

        firstBuilder.deleteCharAt(0);

        StringBuilder secondBuilder = new StringBuilder(firstBuilder);
        secondBuilder.append(firstBuilder);

        int currentLength = secondBuilder.length();
        System.out.println(currentLength);
    }
}