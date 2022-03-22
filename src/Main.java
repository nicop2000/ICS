import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ICS ics = new ICS();
        ics.beginICS();

        System.out.println("Bitte Stundenplan auswählen:\n(1) Semester 4 I1\n(2) Semester 4 Wahlmodule BI102, BI138\n");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1 -> I1(ics);
            case 2 -> BI(ics);
        }
    }

    public static void I1(ICS ics) {
        for (Modul modul : new Saves().I1()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-Semester4-I1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void BI(ICS ics) {
        for (Modul modul : new Saves().BI()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-Semester4-Wahlmodule");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
