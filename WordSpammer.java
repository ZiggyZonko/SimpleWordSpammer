import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class WordSpammer {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Text to Spam: ");
        String Text = sc.nextLine();

        StringSelection stringSelection = new StringSelection(Text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        System.out.println("Spamming will begin in 5 seconds");
        Thread.sleep(5000);

        while(true) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(300);
        }
    }
}
