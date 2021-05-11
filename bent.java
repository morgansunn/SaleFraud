import java.util.*;
import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage

public class bent {
    public static void main(String[] args) {
        reader();
        launch(args);
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
    /*
    * Nicole Padoun - Export Digit Frequency into API 
    * @param String one, two, three, four, five, six, seven, eight, nine - printed out digit values (only used for graphics)
    * @param o, t, thr, f, fi, s, sev, ei, n - values of percentage 
    */
    public static void bendford() {
        //setup of final variables
        final static String one = "1";
        final static String two = "2";
        final static String three = "3";
        final static String four = "4";
        final static String five = "5";
        final static String six = "6";
        final static String seven = "7";
        final static String eight = "8";
        final static String nine = "9";
    
        /*
        * Nicole Padoun - start of graph
        * not sure how to docstring for javafx coding but this is the set up of graphics
        */
        @Override public void start(Stage stage) {
            stage.setTitle("Bar Chart Sample"); //setting titles
            final CategoryAxis xAxis = new CategoryAxis();
            final NumberAxis yAxis = new NumberAxis();
            final BarChart<String,Number> bc = 
                new BarChart<>(xAxis,yAxis);
              //slight hard coding here just to establish proper titles (easiest way on javafx)
            bc.setTitle("Benford's law results");
            xAxis.setLabel("Digit");       
            yAxis.setLabel("Percent");
            bc.setBarGap(3);

            XYChart.Series series1 = new XYChart.Series();
            series1.setName("results");
            //set up of all bars in bar chart
            series1.getData().add(new XYChart.Data(one, o));
            series1.getData().add(new XYChart.Data(two, t));
            series1.getData().add(new XYChart.Data(three, thr));
            series1.getData().add(new XYChart.Data(four, f));
            series1.getData().add(new XYChart.Data(five, fi)); 
            series1.getData().add(new XYChart.Data(six, s));    
            series1.getData().add(new XYChart.Data(seven, sev));    
            series1.getData().add(new XYChart.Data(eight, ei));    
            series1.getData().add(new XYChart.Data(nine, n));    


            Scene scene  = new Scene(bc,800,600);
            bc.getData().addAll(series1);
            stage.setScene(scene);
            stage.show();
        }
    }
}
    



