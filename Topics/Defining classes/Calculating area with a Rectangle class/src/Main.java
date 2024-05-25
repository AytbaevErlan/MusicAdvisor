import java.util.Scanner;
class Rectangle{
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int area(int width, int height){
        int area = width * height;
        return area;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        int ans = rectangle.area(width, height);
        System.out.println(ans);

    }
}