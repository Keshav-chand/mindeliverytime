import java.util.PriorityQueue;
import java.util.Scanner;

public class mindeliverytime{
    int sec;
    Scanner sc=new Scanner(System.in);
    PriorityQueue<Integer>queue=new PriorityQueue<>(java.util.Collections.reverseOrder());//t orders its elements in descending order

    public void getdata(){
        System.out.println("Total no of order for Manogo milkshake");
        queue.add(sc.nextInt());

        System.out.println("Total no of order for Orange milkshake");
        queue.add(sc.nextInt());

        System.out.println("Total no of order for Pineapple milkshake");
        queue.add(sc.nextInt());
    }
    public void Mintime(){
        while(!queue.isEmpty()){
            int val1=0,val2=0;

            if(!queue.isEmpty()){
                val1=queue.poll();// Retrieve and remove the head of the queue (largest element)
            }

            if(!queue.isEmpty()){
                val2=queue.poll();// Retrieve and remove the head of the queue (largest element)
            }
            if(val1==0 && val2>0){//if one of the two milkshake is 0 then  remaining time needed to the total
                sec=sec+val2;
                break;
            }
            if(val1>0 && val2==0){//if one of the two milkshake is 0 then  remaining time needed to the total 
                sec=sec+val1;
                break;
            }
            if(val1>0 && val2>0){//// If both the variables have value > 0 then add a second and decrease both the variable value by 1
                val1--;
                val2--;
                sec++;
            }
            if(val1>0){
                queue.add(val1);
            }
            if(val2>0){
                queue.add(val2);
            }
        }
        }
    
    public static void main (String args[]){
        mindeliverytime m = new mindeliverytime();
        m.getdata();
        m.Mintime();
        System.out.println("\nMinimum time required for the orders is:"+ m.sec);
    }
}


