import java.util.Scanner;
public class ex10 {
    public static double checkPos () {
        Scanner input = new Scanner(System.in);

        double i = 0, temp2;
        boolean valid;
        do{

            System.out.println("Introduza um valor inteiro e positivo:");
            i = input.nextDouble();

            int temp = (int)i;
            temp2 = temp;

            if (i == temp2){
                valid = true;
            }else {
                valid = false;
            }

        }while (!valid || i <= 0);

        return i;
    }

    public static void aster ( double x){

        for(int i=1; i <= x; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        aster(checkPos());

    }
}
