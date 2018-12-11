package src;

import java.util.Scanner;
public class Date {

    private int year;
    private int month;
    private int day;
    private static Scanner sc = new Scanner(System.in);


    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }
    public static Date  getDAte(){

        String date = sc.nextLine();
        String []date1=date.split("\\.");
        if(date1.length != 3){
            System.out.println("podales zly format");
            return null;
        }else{
        System.out.println(date1.length);
        sc.close();
        //if(date1.length==3 && (Integer.parseInt(date1[0])>=0 && Integer.parseInt(date1[0])<=9999))
        return new Date(Integer.parseInt(date1[0]),Integer.parseInt(date1[1]),Integer.parseInt(date1[2]));
       }


    }
    @Override
    public String toString() {
        return String.format("%4d/%02d/%02d", year, month, day);
    }

//    @Override
//    public String toString() {
//        return "Date{" +
//                "year=" + year +
//                ", month=" + month +
//                ", day=" + day +
//                '}';
//    }

//    public String toString(){
//        String info="Rok " +year + " Miesiac " +month+ " Dzien " +day;
//
//       // System.out.println("Rok " +year + " Miesiac " +month+ " Dzien " +day);
//        return info;
//
//    }
}