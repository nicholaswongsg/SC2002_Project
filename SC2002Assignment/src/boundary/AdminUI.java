package boundary;

import java.util.ArrayList;
import java.util.Scanner;

import control.AdminController;
import control.CineplexController;
import control.MovieController;
import control.PricingSchemeController;
import control.ShowTimeController;
import entity.Admin;

public class AdminUI {

    private static Scanner input = new Scanner(System.in);

    public static void displayAdminMainUI() {
        System.out.println("===== Welcome to Admin UI =====");
        
        int choice = 0;
        boolean errorFlag = false;
        do{
            System.out.println("1. Log in");
            System.out.println("2. Sign up");
            System.out.println("3. Quit Admin UI");
            System.out.println("Enter your choice:");

            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            AdminController.adminLogIn();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            AdminController.adminSignUp();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        return;
                    default:
                        break;
                }
            }else{
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
        
    }

    public static void displayAdminServicesUI(Admin admin) {
        int choice = 0;
        System.out.println("Hi " + admin.getName());
        System.out.println("===== What would you like to do? =====");
        boolean errorFlag = false;
        
        do {
            System.out.println("1. Modify Movie Listings");
            System.out.println("2. Modify Cinema Showtimes");
            System.out.println("3. Modify Ticket Pricing Scheme");
            System.out.println("4. List Top 5 Movies");
            System.out.println("5. Modify Cineplex");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        displayAdminMovieServicesUI();
                        break;
                    case 2:
                        displayAdminShowtimeServicesUI();
                        break;
                    case 3:
                        displayAdminPricingSchemeServicesUI();
                        break;
                    case 4:
                        displayAdminListTopMovieServicesUI();
                        break;
                    case 5:
                        displayCineplexServicesUI();
                        break;
                    default:
                        break;
                }
            }else {
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
    }

    public static void displayAdminMovieServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
        System.out.println("===== What would you like to do? =====");
        
        do{
            System.out.println("1. View movie details");
            System.out.println("2. Add a Movie");
            System.out.println("3. Update a Movie");
            System.out.println("4. Remove a Movie");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            MovieController.viewMovieDetail();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            MovieController.addMovie();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        try {
                            MovieController.updateMovie();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        try {
                            MovieController.removeMovie();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }else {
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
    }

    public static void displayAdminShowtimeServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
        System.out.println("===== What would you like to do? =====");

        do {
            System.out.println("1. View movie showtimes");
            System.out.println("2. Add a Show Time");
            System.out.println("3. Update a Show Time");
            System.out.println("4. Remove a Show Time");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            ShowTimeController.viewShowTimeAdmin();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            ShowTimeController.addShowTime();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        try {
                            ShowTimeController.updateShowTime();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        try {
                            ShowTimeController.removeShowTime();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }else {
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
    }
    
    public static void displayAdminPricingSchemeServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
        System.out.println("===== What would you like to do? =====");

        do {
            System.out.println("1. Modify base price");
            System.out.println("2. Modify multipliers");
            System.out.println("3. Modify holiday list");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            PricingSchemeController.modifyBasePrice();;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        displayAdminMultiplierServicesUI();
                        break;
                    case 3: 
                        displayAdminHolidayServicesUI();
                        break;
                    default:
                        break;
                }
            }else{
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
    }
    
    public static void displayAdminMultiplierServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
        System.out.println("===== Select a type of multiplier =====");

        do {
            System.out.println("1. Cinema Class");
            System.out.println("2. Age Group");
            System.out.println("3. Movie Type");
            System.out.println("4. Date Type");
            System.out.println("5. Seat Type");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            PricingSchemeController.updateCinemeClassMutiplier();;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            PricingSchemeController.updateAgeGroupMutiplier();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        try {
                            PricingSchemeController.updateMovieTypeMutiplier();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        try {
                            PricingSchemeController.updateDateTypeMutiplier();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        try {
                            PricingSchemeController.updateSeatTypeMutiplier();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }else{
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
    }
    
    public static void displayAdminHolidayServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
        System.out.println("===== What would you like to do? =====");

        do {
            System.out.println("1. Add holiday");
            System.out.println("2. Remove holiday");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            PricingSchemeController.addHoliday();;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            PricingSchemeController.removeHoliday();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }else{
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
    }

    public static void displayAdminListTopMovieServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
        System.out.println("Top 5 movies by ... ");

        do {
            System.out.println("1. Ratings");
            System.out.println("2. Ticket sales");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            MovieController.listTopMovieByRating();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            MovieController.listTopMovieBySales();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }else{
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
        
    }
    
    public static void displayCineplexServicesUI() {
        boolean errorFlag = false;
        int choice = 0;
                
        System.out.println("===== What would you like to do? =====");
        
        do {
            System.out.println("1. Add cineplex");
            System.out.println("2. Display cineplex");
            System.out.println("3. Remove cineplex");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            if(input.hasNextInt()){
                choice = input.nextInt();
                errorFlag = true;
                
                switch (choice) {
                    case 1:
                        try {
                            CineplexController.addCineplex();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                        
                    case 2:
                        try {
                            CineplexController.displayCineplex();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                        
                    case 3:
                        try {
                            CineplexController.removeCineplex();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
                        break;
                }
            }else{
                input.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        }while(!errorFlag);
    }
}
