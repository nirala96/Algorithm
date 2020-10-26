public class AssemblyLineScheduling {
    
    public static void main(String[] args){

        int cost_cities[][] = {{6,3,7,4},{4,5,6,7}};
        int cost_transport[][] = {{4,3,4},{6,3,7}};
        int initial_stage[] = {4,8};
        int final_stage[] = {3,4};

        System.out.println("Minimum cost required is: "+ assembly(cost_cities,cost_transport,initial_stage,final_stage));

    }

    public static int assembly(int cost_cities[][],int cost_transport[][],int initial_stage[],int final_stage[]){
        int n = cost_cities[0].length; //tells the number of stations in a city

        int first = initial_stage[0]+cost_cities[0][0];   //performing the first step case 1
        int second = initial_stage[1]+cost_cities[1][0];  //performing the first step case 2

        for(int i = 1;i < n; i++){
            int first_city = Math.min(first+cost_cities[0][i],second +cost_transport[1][i-1]+ cost_cities[0][i]);
            int second_city = Math.min(second + cost_cities[1][i], first +cost_transport[0][i-1]+cost_cities[1][i]);

            first = first_city;
            second = second_city;
        }
        first += final_stage[0];
        second += final_stage[1];
        return Math.min(first,second); 


    
    }
}
