
import java.util.*;

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
        
        for(int i=1;i<n;i++)                //initializing from i=1
        {
            int key=a[i];                   //initializing key
            int j=i-1;

            while(j>=0&&a[j]>key)
            {
                a[j+1]=a[j];                //shifting the bigger to right (if ascending sorting is done)
                j=j-1;
            }
            a[j+1]=key;                     //putting key to its place

        }
        

        for(int i=0;i<n;i++)
        System.out.println(a[i]);

        
    }
}

//By ARUNODAY KUMAR
