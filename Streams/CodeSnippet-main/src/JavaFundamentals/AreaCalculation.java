import java.util.Scanner;

public class AreaCalculation {
    //using scanner input
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter width:");
        width=scanner.nextDouble();
        System.out.println("Enter height:");
        height=scanner.nextDouble();
        area = width *height;
        //windows (numlock on +alt+0178 for cm)
        System.out.println("Area is: "+area+ " cm^2");
        scanner.close();
    }

    
}