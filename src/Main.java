import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ICS ics = new ICS();
        ics.beginICS();

        System.out.println("Bitte Stundenplan auswählen:\n" +
                "(1) Semester 4 I1\n" +
                "(2) Semester 4 Wahlmodule BI102, BI138\n" +
                "(3) NDBK WiSe 22/23\n" +
                "(4) IoT WiSe 22/23\n" +
                "(5) BK110 WiSe 22/23\n" +
                "(6) BK110 ÜL2 WiSe 22/23\n" +
                "(7) XWIA WiSe 22/23\n" +
                "(8) ANF WiSe 22/23\n" +
                "(9) ANF ÜL1 WiSe 22/23\n" +
                "(10) BI140 WiSe 22/23\n");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1 -> I1_SoSe22(ics);
            case 2 -> BI_SoSe22(ics);
            case 3 -> NDBK_WiSe22_23(ics);
            case 4 -> IoT_WiSe22_23(ics);
            case 5 -> BK110_WiSe22_23(ics);
            case 6 -> BK110_UL2_WiSe22_23(ics);
            case 7 -> XWIA_WiSe22_23(ics);
            case 8 -> ANF_WiSe22_23(ics);
            case 9 -> ANF_UL1_WiSe22_23(ics);
            case 10 -> BI140_WiSe22_23(ics);
        }
    }

    public static void I1_SoSe22(ICS ics) {
        for (Modul modul : new Saves().I1_SoSe22()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-Semester4-I1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void BI_SoSe22(ICS ics) {
        for (Modul modul : new Saves().BI_SoSe22()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-Semester4-Wahlmodule");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void NDBK_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().NDBK_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-NDBK-WiSe22-23_UL1");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void IoT_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().IoT_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-IoT-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void BK110_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().BK110_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-BK110-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void BK110_UL2_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().BK110_UL2_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-BK110-UL2-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void XWIA_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().XWIA_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-XWIA-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ANF_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().ANF_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-ANF-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ANF_UL1_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().ANF_UL1_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-ANF-UL1-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void BI140_WiSe22_23(ICS ics) {
        for (Modul modul : new Saves().BI140_WiSe22_23()) {
            ics.appendModul(modul);
        }
        ics.endICS();
        try {
            ics.createFile("FH-Stundenplan-BI140-WiSe22-23");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
