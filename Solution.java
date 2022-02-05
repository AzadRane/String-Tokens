//coded by harish rane
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         if(!scan.hasNext()){
            System.out.println("0");
            return;
        }
        String s = scan.nextLine();
        // Write your code here.
        String arr[];
        
        arr = s.trim().split("[!,?.*_'@\\ ]+");
        
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        scan.close();
    }
}

