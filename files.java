
import java.util.*;
import java.io.*;

public class files{

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("animals.txt");
        Scanner scanner = new Scanner(file);
        int count = 0; 
        while(scanner.hasNext()){
            String line = scanner.nextLine().trim();
            if(!line.isEmpty()){
                count++;
            }
        }
        System.out.println("Count:"+count);
        scanner.close();

        Scanner sc = new Scanner(file);
        String[] animals = new String[count];
        int j=0;
         
        while(sc.hasNext()){
            String line = sc.nextLine().trim();
            if(!line.isEmpty()){
                animals[j]=line;
                j++;
            }
        }

        sc.close();

        for(int i=0; i<animals.length;i++){
            System.out.println(animals[i]);
        }







    }












}