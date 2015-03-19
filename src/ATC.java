import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class ATC {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter base salary: ");
        String input1 = br.readLine();
        double salary = Double.parseDouble(input1);

        System.out.println("Enter number of 15 minutes worked on weekdays: ");
        String input2 = br.readLine();
        double minutes = Double.parseDouble(input2);

	    System.out.println("Enter number of 15 minutes worked on weekends and holidays: ");
        String input3 = br.readLine();
        double mins = Double.parseDouble(input3);

        System.out.println("Enter number of meals: ");
        String input4 = br.readLine();
        double meals = Double.parseDouble(input4);

        double x = (salary/20/6/4)*minutes*2.5;
	    double y = (salary/20/6/4)*mins*3;

	    double z = x+y+ meals*32;
	

        DecimalFormat num2Places = new DecimalFormat("##.00");
        String overtime = "$" + num2Places.format(z);

        System.out.println("Overtime to be paid: "+overtime);
    }
}
