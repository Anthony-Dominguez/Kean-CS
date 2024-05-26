import java.util.Scanner;

public class MovieTheaterMannager {
    //        define max # of movie screenings
    static final int MAX_MOVIES = 100;
    //        paralle; arrays to wstate data
    static String[] moviesTitle = new String[MAX_MOVIES];
    static String[] moviesTimes = new String[MAX_MOVIES];
    static double[] moviesRating= new double[MAX_MOVIES];
    static int movieCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addMovieScreening(scanner);
                    break;
                case 2:
                    displayMovieScreening();
                    break;
                case 3:
                    findMovieScreening(scanner);
                    break;
                case 4:
                    calculateAverageRating();
                    break;
                case 5:
                    System.out.println("Exit Program");
                    return;
                default:
                    System.out.println("invalid choice");
            }

        }
    }
    public static void displayMenu() {
        System.out.print("\n Movie Theater Mannager");
        System.out.print("\n1. Add Movie Screening");
        System.out.print("\n2.Display all Screenings");
        System.out.print("\n3. Find Movie by Title ");
        System.out.print("\n4. Calculate Rating Avg");
        System.out.print("\n5. Exit Program");
        System.out.println("\nEnter your choice");
        return;
    }

    public static void addMovieScreening(Scanner scanner) {
        if(movieCount >= MAX_MOVIES) {
            System.out.println("Too many movies");
            return;
        }else {
            System.out.print("Enter movie title: ");
            String Title = scanner.nextLine();
            System.out.print("Enter movie time: ");
            String Time = scanner.nextLine();
            System.out.print("Enter movie rating(0.0-10.00) : ");
            double Rating = scanner.nextDouble();
            moviesTitle[movieCount] = Title;
            moviesTimes[movieCount] = Time;
            moviesRating[movieCount] = Rating;
            movieCount++;
            System.out.println("Movie Screening added");
        }
    }
    public static void displayMovieScreening() {
        if (movieCount == 0 ){
            System.out.println("No many movies");
            return;
        }else {
            System.out.println("\n Movie Screening List");
            for (int i = 0; i < movieCount; i++) {
                System.out.printf("Title: %s , Time: %s, Rating %.2f\n" , moviesTitle[i],moviesTimes[i],moviesRating[i]);
            }

            }
        }
        public static void findMovieScreening(Scanner scanner) {
            System.out.println("Enter movie title to search : ");

            String Title = scanner.nextLine();
            for (int i = 0; i < movieCount; i++) {
                if (moviesTitle[i].equals(Title)) {
                    System.out.printf("Movie Title found: %s , Title: %s , Rating %.2f  \n", moviesTitle[i], moviesTimes[i], moviesRating[i]);
                    return;
                }else {
                    System.out.println("Movie Title not found");
                }
            }
        }
        public static void calculateAverageRating() {
        if (movieCount == 0 ){
            System.out.println("No many movies");
        }else {
            double totalRating = 0.0;
            for (int i = 0; i < movieCount; i++) {
                totalRating += moviesRating[i];
            }
            double averageRating = totalRating / movieCount;
            System.out.printf("Average Rating is %.2f \n" , averageRating);
        }
        }
    }

