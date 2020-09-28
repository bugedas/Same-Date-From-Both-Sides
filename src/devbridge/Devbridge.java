/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devbridge;
import java.io.*;

/**
 *
 * @author buged
 */
public class Devbridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }




    static void printBonusDatesBetween(int fromYear, int toYear){

        int x = fromYear;

        while (x < toYear){        // Year cycle

            int day = 1;
            int month = 1;

            while(month <= 12){         // Month cycle
                
                int daysThisMonth = 31;
                //---------------------- If's to get count of days in current month-----------
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    daysThisMonth = 31;
                }
                else if(month == 4 || month == 6 || month == 9 || month == 11){
                    daysThisMonth = 30;
                }
                else if((month == 2) && (x % 4 == 0)){
                    daysThisMonth = 29;
                }
                else if((month == 2) && (x % 4 != 0)){
                    daysThisMonth = 28;
                }
                //-----------------------------------------------------------------------------
            
                while(day <= daysThisMonth){            //Days cycle

                    String monthString = "" + month;
                    if(month < 10){
                        monthString = "0" + monthString;
                    }

                    String dayString = "" + day;
                    if(day < 10){
                        dayString = "0" + dayString;
                    }

                    String thisDateStr = x + "" + monthString + "" + dayString;

                    char[] thisDate = thisDateStr.toCharArray();

                    int i = 0;
                    int j = thisDate.length-1;
                    boolean is = true;
                    if(j % 2 != 1){
                        is = false;
                    }
                    while(i < j){

                        if(thisDate[i] != thisDate[j]){
                            is = false;
                            break;
                        }
                        i++;
                        j--;

                    }

                    if(is){
                        System.out.println("" + x + "-" + monthString + "-" + dayString);
                    }

                    day = day + 1;
                }
                month = month + 1;
                day = 1;
            }
            

            
            x=x+1;
        }





    }
    
}
