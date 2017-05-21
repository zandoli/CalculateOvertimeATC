import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ATC {
    private static double ovr(double sal, double hrs, double hrswh, double mls){
        double x = (sal/20/6/4)*hrs*4*2.5;
        double y = (sal/20/6/4)*hrswh*4*3;
        return x+y+ mls*32;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter base salary: ");
        String input1 = br.readLine();
        double sal = Double.parseDouble(input1);

        System.out.println("Enter number of hours and part thereof(eg. 0.25, 0.5, 0.75) worked on weekdays: ");
        String input2 = br.readLine();
        double hrs = Double.parseDouble(input2);

        System.out.println("Enter number of hours and part thereof(eg. 0.25, 0.5, 0.75) worked on weekends and holidays: ");
        String input3 = br.readLine();
        double hrswh = Double.parseDouble(input3);

        System.out.println("Enter number of meals: ");
        String input4 = br.readLine();
        double mls = Double.parseDouble(input4);

        DecimalFormat num2Places = new DecimalFormat("##.00");
        String overtime = "$" + num2Places.format(ovr(sal,hrs,hrswh,mls));
        System.out.println("Overtime to be paid: "+overtime);
    }
}
