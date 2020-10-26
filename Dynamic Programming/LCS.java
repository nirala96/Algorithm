public class LCS {
    public static void main(String[] args){
        String s1 = "ARUNODAY";
        String s2 = "KUMAR";

        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();
        int x_length = x.length;
        int y_length = y.length;

        System.out.println("Lenght of LCS is: " + lcs(x,y,x_length,y_length));
    }

    public static int lcs(char x[],char y[],int m,int n){
       
        if(m == 0 ||n == 0)
        return 0;

        if(x[m-1] == y[n-1])
        return 1+lcs(x,y,m-1,n-1);

        else
        return Math.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));


    }
}
