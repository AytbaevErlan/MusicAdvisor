import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        int queryStart = url.indexOf("?");
        if (queryStart == -1) {
            return;
        }

        String query = url.substring(queryStart + 1);

        String[] pairs = query.split("&");

        StringBuilder result = new StringBuilder();
        String password = null;

        for (String pair : pairs){
            String[] keyValue = pair.split("=", 2);
            String key = keyValue[0];
            String value = keyValue.length > 1 ? keyValue[1] : "not found";
            if (value.isEmpty()) {
                value = "not found";
            }
            result.append(key).append(" : ").append(value).append("\n");
            if (key.equals("pass")) {
                password = value;
            }
        }

        System.out.print(result.toString());

        if (password != null && !password.equals("not found")) {
            System.out.print("password : " + password);
        }
    }
}