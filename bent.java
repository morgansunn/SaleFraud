import java.util.*;
import java.io.*;

public class bent {
    public static void main(String[] args) {
        reader();
    }

    public static void reader() {
        int o = 0;
        int t = 0;
        int thr = 0;
        int f = 0;
        int fi = 0;
        int s = 0;
        int sev = 0;
        int ei = 0;
        int n = 0;
        int[] counter = new int[9];
        
        BufferedReader reader;
        try {
            // Scans/Reads the postal_codes.csv file
            reader = new BufferedReader(new FileReader("sales.csv"));
            // Checks if the user input is a null value
            String line = reader.readLine();
            while (line != null) {
                // While loop through each line
                line = reader.readLine();
                if (line == null) {
                    break;
                    // Breaks if the value is null
                }
                // Checks if the user input is equal to the line in CSV
                String format = line.substring(4);
                String fdigit = format.substring(0,1);

                int inum = Integer.parseInt(fdigit);

                switch(inum) {
                    case 1:
                        ++o;
                        counter[0] = o;
                        break;
                    case 2:
                        ++t;
                        counter[1] = t;
                        break;
                    case 3:
                        ++thr;
                        counter[2] = thr;
                        break;
                    case 4:
                        ++f;
                        counter[3] = f;
                        break;
                    case 5:
                        ++fi;
                        counter[4] = fi;
                        break;
                    case 6:
                        ++s;
                        counter[5] = s;
                        break;
                    case 7:
                        ++sev;
                        counter[6] = sev;
                        break;
                    case 8:
                        ++ei;
                        counter[7] = ei;
                        break;
                    default:
                        ++n;
                        counter[8] = n;
                }   
            }
            // Catches exceptions and prints out the exception
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

    public static void bendford() {

    }
}
    



