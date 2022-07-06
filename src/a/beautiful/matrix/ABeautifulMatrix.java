
package a.beautiful.matrix;

import java.util.ArrayList;
import java.util.Scanner;


public class ABeautifulMatrix {
    public static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> FinalData = new ArrayList<>();
        ArrayList<Integer> temp;
        int data , Final;
        Final = 0;
        for(int i = 0 ; i < 5 ; i++){
             temp = new ArrayList<>();
             for(int j = 0 ; j < 5 ; j++){
                 data = inp.nextInt();
                 temp.add(data);   
            }
            FinalData.add(temp);
        }
        for(int i = 0 ; i < FinalData.size() ; i++){
            for(int j = 0 ; j < FinalData.get(i).size(); j++){
               if(FinalData.get(i).get(j) == 1){
                     int temp1 = Math.abs((i+1)-3);
                     int temp2 = Math.abs((j+1)-3);
                     Final = temp1+temp2;
               }
            } 
        }
        System.out.println(Final);
    }
    
}
