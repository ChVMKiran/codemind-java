import java.util.Scanner;
import java.text.DecimalFormat;
public class Java{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        int a=scan.nextInt(),b=scan.nextInt();
        // System.out.print(df.format(Math.sqrt(Math.pow(a,2)+Math.pow(b,2))));
        System.out.printf("%.2f",Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
    }
}