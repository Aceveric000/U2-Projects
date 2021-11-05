import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class WidgetFactory {


    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00
     Cost of Production4: $9,240.00
     Profit: $760.00

     */


    public static void main(String[] args) {
        double machine = Integer.parseInt(JOptionPane.showInputDialog("Num of widgets "));
        double days = Integer.parseInt(JOptionPane.showInputDialog("  how many days did you work?"));


        JOptionPane.showMessageDialog(null,
                "\nThe widgets made are. " + Cost(machine)
                + "\nDays worked. " + hours(days)
                +"\nLabor cost. " + production(days) +
                        "\nThe widgets cost " + CostWidgets(machine) +
        "\nTotal profit is. " + profit(days, machine));


    }

    public static String Cost(double machine) {
        DecimalFormat round = new DecimalFormat("$#.00");

        return round.format(machine * 10);
    }

    public static String hours(double days) {
        DecimalFormat round = new DecimalFormat("#");
        return round.format (days);
    }

    public static String production(double days) {
        DecimalFormat round = new DecimalFormat("$#.00");
        return round.format (16.5 * days * 16 * 5);

    }

    public static String CostWidgets(double machine) {
        DecimalFormat round = new DecimalFormat("$#.00");

        return round.format(machine * 10 );
    }

    public static String profit(double days , double machine) {
        DecimalFormat round = new DecimalFormat("$#.00");

        double mathOne = (16.5 * days * 16 * 5);
        double mathTwo = machine * 10 ;
        return round.format(mathTwo-mathOne);

    }
}