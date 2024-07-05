import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /***
     * add_thousands_separator receives a integer and must return a string version of this interger,
     * with a quote every thousands.
     *
     * e.g. 2738777 must be converted into 2'738'777
     */
    // ### EXERCISE BEGIN


    static String addThousandsSeparator(long num) {
        String numConverted = Long.toString(num);
        StringBuilder result  = new StringBuilder();
        int length = numConverted.length();
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            result.append(numConverted.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                result.append('\'');
            }
        }
        return result.reverse().toString();
    }


    // ### EXERCISE END

    static int checkResult(String testName, String expected, String computed)
    {
        if (!expected.equals(computed))
        {
            System.out.println(" - "+testName+" failed:");
            System.out.println("    - Expected '"+expected+"' got '"+computed+"'");
            return 1;
        }
        return 0;
    }


    public static void main(String[] args)
    {
        int aNbErrors = 0;
        aNbErrors += checkResult("less than 3 digits", "985", addThousandsSeparator(985));
        aNbErrors += checkResult("multiple of 3 digits", "738'777", addThousandsSeparator(738777));
        aNbErrors += checkResult("10 digits", "1'435'738'400", addThousandsSeparator(1435738400));
        if (aNbErrors == 0)
        {
            System.out.println("All tests passed. Congratz !");
        }
    }

}
