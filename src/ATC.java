import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class ATC{
    public static void main(String[] args) throws IOException {
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

        Overtime o = new Overtime();
        //o.ovr(sal,hrs,hrswh,mls);
        DecimalFormat num2Places = new DecimalFormat("##.00");
        String total = "$" + num2Places.format(o.ovr(sal,hrs,hrswh,mls));
        System.out.println("Overtime to be paid: " + total);
    }
}
