
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
        
        mergesort(a,0,4);
        

        for(int i=0;i<n;i++)
        System.out.println(a[i]);

        
    }
    static void mergesort(int a[],int l,int r)               //l=leftmost element,r=rightmost element,m=mid
    {
        if(l<r)
        {
           int m=(l+r)/2;
            mergesort(a,l,m);                          //recursive 
            mergesort(a,m+1,r);
            merge(a,l,m,r);

        }
    }
    static void merge(int a[],int l,int m,int r)
    {
        int i,j,k;
        int n1=m+1-l;
        int n2=r-m;
        int left[] = new int [n1]; 
        int right[] = new int [n2]; 
        for(i=0;i<n1;i++)
        left[i]=a[l+i];

        for(j=0;j<n2;j++)
        right[j]=a[m+1+j];

         i=0;j=0; k=l;
         while(i<n1&&j<n2)
         {
             if(left[i]<=right[j])
             {
                 a[k]=left[i];
                 i++;
             }
             else
             {
                 a[k]=right[j];
                 j++;
             }
             k++;
         }
         while (i < n1) 
    { 
        a[k] = left[i]; 
        i++; 
        k++; 
    } 
      while (j < n2) 
    { 
        a[k] = right[j]; 
        j++; 
        k++; 
    }    
        



    }
}

//By ARUNODAY KUMAR
