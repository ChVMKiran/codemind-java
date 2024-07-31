import java.util.*;
import java.text.DecimalFormat;
public class kiran{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        DecimalFormat df=new DecimalFormat("0.00");
        double c=(a-b)*100.0/a;
        System.out.println(df.format(c));
    }
}