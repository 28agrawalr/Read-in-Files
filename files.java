
import java.util.*;
import java.io.*;

public class files{

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("numbers.txt");
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
        //String[] animals = new String[count];
        int[] numList = new int[count];
        int j=0;
         
        while(sc.hasNext()){
            String line = sc.nextLine().trim();
            int num = Integer.parseInt(line);
            if(!line.isEmpty()){
                numList[j]=num;
                j++;
            }
        }

        System.out.println("Value:"+(numList[2]+numList[6]));
        sc.close();

        for(int i=0; i<numList.length;i++){
            System.out.println(numList[i]);
        }







    }












}