class MergeSort{

    void merge(int arr[],int l,int m,int r){
        //creating two new array,s size 
        int n1 = m-l+1; 
        int n2 = r - m;
        
        //creating two new arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //assigning values to both array
        for(int i=0;i<n1;i++)
            L[i] = arr[i+l];
        for(int j=0;j<n2;j++)
            R[j] = arr[m+1+j];
        
        //main section of comparing 2 values and inserting at proper place 
        int i=0,j=0;
        //the (forgot the name of that '|')
        int k = l;
        //comparing and inserting till smaller array is all sorted
        while(i<n1 && j<n2){
            if(L[i]<=R[j]) {
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //this section is for the left over part(probably only one)
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;

        }
    }

    void sort(int arr[],int l,int r){
        if(l < r){
            //finding the middle term in order to split the array in 2 parts
            int m = (l + r)/2;
            //recursively calling to get it to the molecular stage
            sort(arr,l,m);
            sort(arr,m+1,r);
            
            //calling merge of the molecular level array
            merge(arr,l,m,r);
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
    
    public static void main(String []args){

        //initialize array
        int arr[] = {3,6,2,7,1}; 

        System.out.println("Given array is: ");
        print(arr);     

        //making object of the class
        MergeSort ob = new MergeSort();
        ob.sort(arr,0,arr.length-1);

        //final sorted array
        System.out.println("Sorted array is: ");
        print(arr);
        

    }


}
