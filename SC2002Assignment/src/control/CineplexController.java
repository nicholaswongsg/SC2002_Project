package control;

import java.util.ArrayList;
import java.util.Scanner;

import boundary.CommonUI;
import boundary.MovieUI;
import entity.Cinema;
import entity.CinemaClass;
import entity.CinemaType;
import entity.Cineplex;
import entity.DataPath;
import entity.Movie;
import entity.MovieGoer;
import entity.MovieType;
import entity.ReleaseRating;
import entity.ReviewRating;
import entity.Serialization;
import entity.ShowingStatus;

public class CineplexController {

    public static void addCineplex() {
        ArrayList<Cineplex> cineplexList = (ArrayList<Cineplex>) Serialization.readSerializedObject(DataPath.CINEPLEX);
        if (cineplexList == null) {
            cineplexList = new ArrayList<Cineplex>();
        }
        CommonUI.displaySingleMessage("");
        String cinename = getCineplexName();
        ArrayList<String> cinema = getCinema();

        Cineplex cineplex = new Cineplex(cinename);

        cineplexList.add(cineplex);

        Serialization.writeSerializedObject(DataPath.CINEPLEX, cineplexList);

        CommonUI.displaySingleMessage("The cineplex has been added!\n");
    
//        ArrayList<Cineplex> cineplexes = new ArrayList<Cineplex>();
//        
//        Cinema cinema1 = new Cinema("GV1", CinemaClass.NORMAL);
//        Cinema cinema2 = new Cinema("GV2", CinemaClass.NORMAL);
//        Cinema cinema3 = new Cinema("GV3", CinemaClass.PLATINUM_MOVIE_SUITE);
//        
//        String cinename = getCineplexName();
//        Cineplex cineplex1 = new Cineplex(cinename);
//        
//        cineplex1.getCinemas().add(cinema1);
//        cineplex1.getCinemas().add(cinema2);
//        cineplex1.getCinemas().add(cinema3);
//      
//        Cinema cinema4 = new Cinema("GV4", CinemaClass.NORMAL);
//        Cinema cinema5 = new Cinema("GV5", CinemaClass.NORMAL);
//        Cinema cinema6 = new Cinema("GV6", CinemaClass.PLATINUM_MOVIE_SUITE);
//      
//        cineplexes.add(cineplex1);
//
//        Serialization.writeSerializedObject(DataPath.CINEPLEX, cineplexes);
//    
//        ArrayList<Cineplex> cineplexList = (ArrayList<Cineplex>) Serialization.readSerializedObject(DataPath.CINEPLEX);
//    
//        for (int i = 0; i < cineplexList.size(); i++) {
//            Cineplex cineplex = cineplexList.get(i);
//            System.out.println(cineplex.getName());
//            for (int j = 0; j < cineplex.getCinemas().size(); j++) {
//                System.out.println(cineplex.getCinemas().get(j).getCinemaCode());
//            }
//        }
//
//        CommonUI.displaySingleMessage("New cineplex added!\n");
    }
    
    public static void displayCineplex() {
//        ArrayList<Cineplex> cineplexList = (ArrayList<Cineplex>) Serialization.readSerializedObject(DataPath.CINEPLEX);
//        if (cineplexList == null || cineplexList.size() == 0) {
//            CommonUI.displaySingleMessage("\nThere is no cineplex now!\n");
//            return;
//        }
//
//        for (int i = 1; i < cineplexList.size(); i++) {
//            Cineplex cineplex = cineplexList.get(i);
//            System.out.println(cineplex.getName());
//            for (int j = 0; j < cineplex.getCinemas().size(); j++) {
//                System.out.println(cineplex.getCinemas().get(j).getCinemaCode());
//            }
//        }
  }

    public static void removeCineplex() {
//        ArrayList<Cineplex> cineplexList = (ArrayList<Cineplex>) Serialization.readSerializedObject(DataPath.CINEPLEX);
//
//        int choice = chooseCineplexFromList(cineplexList);
//
//        if (choice == -1) {
//            CommonUI.displaySingleMessage("\nThere is no cineplex to remove!\n");
//            return;
//        }
//
//        cineplexList.remove(choice - 1);
//
//        Serialization.writeSerializedObject(DataPath.CINEPLEX, cineplexList);
//
//        CommonUI.displaySingleMessage("The cineplex has been removed!\n");
//
//        return;
    }

    private static String getCineplexName() {
        Scanner input = new Scanner(System.in);
        CommonUI.displaySingleMessage("Enter cineplex name:");
        String cineplexname = input.nextLine();
        return cineplexname;
    }
    
//    public static int chooseCineplexFromList(ArrayList<Cineplex> cineplexList) {
//        int choice = -1;
//        if (cineplexList == null || cineplexList.size() == 0) {
//            return choice;
//        }
//
//        choice = 0;
//        Scanner input = new Scanner(System.in);
//        while (choice < 1 || choice > cineplexList.size()) {
////            MovieUI.displayMovieList(cineplexList);
//            CommonUI.displaySingleMessage("Enter your choice:");
//            choice = input.nextInt();
//        }
//        return choice;
//    }
    
    private static ArrayList<String> getCinema() {
        ArrayList<String> cinema = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        CommonUI.displaySingleMessage("Enter cinema size:");
        Integer cinemaSize = input.nextInt();
        input.nextLine();
        for (int i = 0; i < cinemaSize; i++) {
            CommonUI.displaySingleMessage("Enter cinema name " + (i + 1) + ":");
            String cinemaName = input.nextLine();
            cast.add(castName);
        }

        return cast;
    }

}
