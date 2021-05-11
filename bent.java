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

    public static void bendford() {
        final static String one = "1";
        final static String two = "2";
        final static String three = "3";
        final static String four = "4";
        final static String five = "5";
        final static String six = "6";
        final static String seven = "7";
        final static String eight = "8";
        final static String nine = "9";
        //variables needed for barchart height aka the results but this is how I set it up
        //you can change the variable type for the result values if needed (im not sure what your code looks like)
        //may add (please add) the values
        //any necessary change to blend into code is welcomed
        final static String RESULT1_STRING;
        final static String RESULT2_STRING;
        final static String RESULT3_STRING;
        final static String RESULT4_STRING;
        final static String RESULT5_STRING;
        final static String RESULT6_STRING;
        final static String RESULT7_STRING;
        final static String RESULT8_STRING;
        final static String RESULT9_STRING;


        @Override public void start(Stage stage) {
            stage.setTitle("Bar Chart Sample");
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
            series1.getData().add(new XYChart.Data(one, RESULT1_STRING));
            series1.getData().add(new XYChart.Data(two, RESULT2_STRING));
            series1.getData().add(new XYChart.Data(three, RESULT3_STRING));
            series1.getData().add(new XYChart.Data(four, RESULT4_STRING));
            series1.getData().add(new XYChart.Data(five, RESULT5_STRING)); 
            series1.getData().add(new XYChart.Data(six, RESULT6_STRING));    
            series1.getData().add(new XYChart.Data(seven, RESULT7_STRING));    
            series1.getData().add(new XYChart.Data(eight, RESULT8_STRING));    
            series1.getData().add(new XYChart.Data(nine, RESULT9_STRING));    


            Scene scene  = new Scene(bc,800,600);
            bc.getData().addAll(series1);
            stage.setScene(scene);
            stage.show();
        }
    }
}
    



