import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Hallo gib bitte etwas ein: " );
        //ist quasie wie ein funktions aufruf bei python, kann aber wissensstand aktuell nur ein der darauffolgenden zeile eingegeben werden.
        String userinput =scan.nextLine();
        //gibt den userinput als String aus
        System.out.println(userinput);
    }

}
