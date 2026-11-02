package pkg;
import java.util.Scanner;
import java.util.Random;

public class Movie{
    private String movieName;
    private double rating;
    private int numRatings;
    private double revenue;

    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String na, double ra, int n, double r){
        movieName = na;
        rating = ra;
        numRatings = n;
        revenue = r;
    }

    public void movieToString(){
        System.out.println("Movie : " + movieName);
        System.out.println("Rating : " + rating);
        System.out.println("Number of ratings : " + numRatings);
        System.out.println("Revenue : " + revenue);
        System.out.println(""); 
    }
    public String getMovieName(){
        return movieName;
    }
    public double getRevenue(){
        return revenue;   
    }
    public void addRating(double r){
        double rate = ((numRatings*rating)+r);
        numRatings++;
        rating = rate/numRatings;
    }
    public double getRating(){
        return rating;
    }
    public boolean compareRatings(Movie x){
        if(rating>x.getRating()){
            return true;
        }
        else{
            return false;
        }

    }
    public String movieToString(){
        String change = movieName
        return change;
    }
}