
//Mini project : Cab Fare Calculation
import java.util.Scanner;


public class RideCab {
    public static void main(String[] args) {
        int cd; //distance of cab from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance of cab from you : ");
        cd = sc.nextInt();
        if(cd > 5){
            Cab ob = new Cab(50 + 10 *(cd-5));
            System.out.print("Enter the distance travelled : ");
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.println("Total fare Rs: "+ ob.fare);

        }
        else{
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled : ");
            ob.d = sc.nextInt();
            ob.fare += 10 * ob.d;
            System.out.println("Total fare Rs: "+ ob.fare);

        }
        
    }
}

class Cab{
    int fare;
    int d;
    Cab(){
        fare = 50;
    }

    public Cab(int amt){
      fare = amt;
    }
}
