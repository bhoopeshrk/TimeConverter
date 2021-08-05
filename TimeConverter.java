import java.io.*;

public class TimeConverter {
    public static void main(String args[]) throws Exception
    {
        System.out.print("Enter day(s) : ");
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(input.readLine());
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println(days + " day(s) is converted into " + seconds + " seconds");
    }
}
