import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();                //n=length of array
        int a[]=new int[n];                //initializing array
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int min_index=i;                //
            for(int j=i+1;j<n;j++)          //
            {                               //  finding index of smallext number
                if(a[min_index]>a[j])       //
                min_index=j;                //
            }
            int temp=a[min_index];          //
            a[min_index]=a[i];              //  swapping
            a[i]=temp;                      //
        }

        for(int i=0;i<n;i++)
        System.out.println(a[i]);

        
    }
}

//By ARUNODAY KUMAR
