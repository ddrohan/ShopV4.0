import javax.swing.*;
import java.util.Scanner;

/**
 * This class provides methods for
 * the robust handling of I/O using
 * JOptionPane.
 *
 * @author Dave Drohan
 * @version 1.0
 *
 */

public class JScannerInput {

    /**
     * Read an int from the user.  If the entered data isn't actually an int,
     * the user is prompted again to enter the int.
     *
     * @param prompt  The information passed to JOptionPane for the user to read
     * @return The number read from the user and verified as an int.
     */
    public static int readNextInt(String prompt) {
        do {

            try {
                String input = JOptionPane.showInputDialog(
                        null,
                        prompt,
                        "Data Entry",
                        JOptionPane.OK_CANCEL_OPTION);

                return Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "\tEnter a number please.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
            }
        }  while (true);
    }

    /**
     * Read a double from the user.  If the entered data isn't actually a double,
     * the user is prompted again to enter the double.
     *
     * @param prompt  The information passed to JOptionPane for the user to read
     * @return The number read from the user and verified as a double.
     */
    public static double readNextDouble(String prompt) {
        do {
            try{
                String input = JOptionPane.showInputDialog(
                        null,
                        prompt,
                        "Data Entry",
                        JOptionPane.OK_CANCEL_OPTION);
                return Double.parseDouble(input);
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "\tEnter a number please.",
                        "Error Message",
                        JOptionPane.ERROR_MESSAGE);
            }
        }  while (true);
    }

    /**
     * Read a line of text from the user.  There is no validation done on the entered data.
     *
     * @param prompt  The information passed to JOptionPane for the user to read
     * @return The String read from the user.
     */
    public static String readNextLine(String prompt) {
        String input = JOptionPane.showInputDialog(
                null,
                prompt,
                "Data Entry",
                JOptionPane.OK_CANCEL_OPTION);
        return input;
    }

    /**
     * Read a single character of text from the user.  There is no validation done on the entered data.
     *
     * @param prompt The information passed to JOptionPane for the user to read
     * @return The char read from the user.
     */
    public static char readNextChar(String prompt) {
        String input = JOptionPane.showInputDialog(
                null,
                prompt,
                "Data Entry",
                JOptionPane.OK_CANCEL_OPTION);
        return input.charAt(0);
    }

}