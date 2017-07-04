import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("INPUT.txt"));
        String step = scanner.next();
        Pattern p = Pattern.compile("^[A-H][1-8]-[A-H][1-8]$");
        Matcher m = p.matcher(step);

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("OUTPUT.txt"), "UTF-8"));

        if(m.matches()){
            char x = step.substring(0,1).charAt(0);
            char y = step.substring(1,2).charAt(0);

            char to_x = step.substring(3,4).charAt(0);
            char to_y = step.substring(4,5).charAt(0);

            int length_x = Math.abs(x - to_x);
            int length_y = Math.abs(y - to_y);

            if(length_x == 1 && length_y == 2 || length_x == 2 && length_y == 1){
                out.write("YES");
                out.close();
            }
            else
            {
                out.write("NO");
                out.close();
            }
            return;
        }
        out.write("ERROR");
        out.close();
    }
}
