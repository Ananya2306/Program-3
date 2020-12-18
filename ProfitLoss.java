import java.util.Scanner;
public class ProfitLoss{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Cost Price of the Article");
        double cp = in.nextDouble();
        System.out.println("Enter Selling Price of the Article");
        double sp = in.nextDouble();

        double pl = sp - cp;
        double percent = Math.abs(pl)/cp*100;
        if(pl>0){
            System.out.println("Profit = " + pl);
            System.out.println("Profit Percent = " + percent);
        }else
        if(pl<0){
            System.out.println("Lose = " + Math.abs(pl));
            System.out.println("Lose Percent = " + percent);
        }else{
            System.out.println("Neither Profit Nor Loss ....");
        }
    }
}