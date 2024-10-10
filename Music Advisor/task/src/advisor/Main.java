package advisor;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // Hardcoded responses for different commands
    private static final String CLIENT_ID = "6b4bd2b9d0fb4ae4ae8c0de3d2f024eb";
    private static final String REDIRECT_URI = "http://www.erlanproject.com/code=2angkqw2DAsdfkQ";  // Update your correct Redirect URI here

    private static final String AUTH_URL = "https://accounts.spotify.com/authorize?client_id=" + CLIENT_ID +
            "&redirect_uri=" + REDIRECT_URI + "&response_type=code";

    private static boolean isAuthorized = false;
    private static final String NEW_RELEASES = "---NEW RELEASES---\n" +
            "Mountains [Sia, Diplo, Labrinth]\n" +
            "Runaway [Lil Peep]\n" +
            "The Greatest Show [Panic! At The Disco]\n" +
            "All Out Life [Slipknot]";

    private static final String FEATURED_PLAYLISTS = "---FEATURED---\n" +
            "Mellow Morning\n" +
            "Wake Up and Smell the Coffee\n" +
            "Monday Motivation\n" +
            "Songs to Sing in the Shower";

    private static final String CATEGORIES = "---CATEGORIES---\n" +
            "Top Lists\n" +
            "Pop\n" +
            "Mood\n" +
            "Latin";

    private static final Map<String, String> CATEGORY_PLAYLISTS = new HashMap<>();

    static {
        CATEGORY_PLAYLISTS.put("Mood", "---MOOD PLAYLISTS---\n" +
                "Walk Like A Badass\n" +
                "Rage Beats\n" +
                "Arab Mood Booster\n" +
                "Sunday Stroll");
        // You can add more categories and their playlists here
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine().trim();

            if (input.equals("exit")) {
                System.out.println("---GOODBYE!---");
                break;
            }

            if (!isAuthorized && !input.equals("auth")) {
                System.out.println("Please, provide access for application.");
                continue;
            }

            switch (input) {
                case "auth":
                    System.out.println(AUTH_URL);
                    isAuthorized = true;  // Mark the application as authorized
                    System.out.println("---SUCCESS---");
                    break;
                case "new":
                    System.out.println(NEW_RELEASES);
                    break;
                case "featured":
                    System.out.println(FEATURED_PLAYLISTS);
                    break;
                case "categories":
                    System.out.println(CATEGORIES);
                    break;
                default:
                    if (input.startsWith("playlists ")) {
                        String category = input.substring(10);
                        if (CATEGORY_PLAYLISTS.containsKey(category)) {
                            System.out.println(CATEGORY_PLAYLISTS.get(category));
                        } else {
                            System.out.println("Category not found.");
                        }
                    } else {
                        System.out.println("Invalid command.");
                    }
                    break;
            }
        }

        scanner.close();
    }
}
