import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class ICS {
    StringBuilder builder = new StringBuilder();


    public void beginICS() {
        builder.append(
                "BEGIN:VCALENDAR\n" +
                "VERSION:2.0\n" +
                "PRODID:-//No Enterprise//FH Kiel//Own//v3\n" +
                "METHOD:PUBLISH\n" +
                "BEGIN:VTIMEZONE\n" +
                "TZID:Europe/Berlin\n" +
                "BEGIN:STANDARD\n" +
                "DTSTART:20001029T030000\n" +
                "RRULE:FREQ=YEARLY;BYDAY=-1SU;BYMONTH=10\n" +
                "TZNAME:CET\n" +
                "TZOFFSETFROM:+0200\n" +
                "TZOFFSETTO:+0100\n" +
                "END:STANDARD\n" +
                "BEGIN:DAYLIGHT\n" +
                "DTSTART:20000326T020000\n" +
                "RRULE:FREQ=YEARLY;BYDAY=-1SU;BYMONTH=3\n" +
                "TZNAME:CEST\n" +
                "TZOFFSETFROM:+0100\n" +
                "TZOFFSETTO:+0200\n" +
                "END:DAYLIGHT\n" +
                "END:VTIMEZONE\n");
    }

    public void endICS() {
        builder.append("END:VCALENDAR");
    }

    public void appendModul(Modul modul) {
        builder.append(modul.createICS());
    }

    public void createFile(String filename) throws IOException {
        PrintWriter out = new PrintWriter(filename + ".ics");
        out.println(builder.toString());
        out.close();
    }
}
