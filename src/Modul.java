import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public class Modul {
    private final Modulnamen modulname;
    private final LocalDateTime start;
    private final LocalTime end;

    private final StringBuilder builder = new StringBuilder();

    public Modul(Modulnamen modulname, LocalDateTime start, LocalTime end) {
        this.modulname = modulname;
        this.start = start;
        this.end = end;
    }


    public String createICS() {
        builder.append("BEGIN:VEVENT");
        builder.append("\n");
        builder.append("UID:").append(UUID.randomUUID()).append("@icsParser.de");
        builder.append("\n");
        builder.append("LOCATION:").append(modulname.raum());
        builder.append("\n");
        builder.append("SUMMARY:").append(modulname.abbrev());
        builder.append("\n");
        builder.append("DESCRIPTION:" + "Professor: ").append(modulname.dozent()).append("\\nOriginaltitel: ").append(modulname).append("\\n");
        builder.append("\n");
        builder.append("CLASS:PUBLIC");
        builder.append("\n");
        builder.append("STATUS:CONFIRMED");
        builder.append("\n");
        builder.append("DTSTART;TZID=Europe/Berlin:").append(start.toString().replace(":", "").replace("-", "")).append("00");
        builder.append("\n");
        builder.append("DTEND;TZID=Europe/Berlin:").append(start.toLocalDate().atTime(end).toString().replace(":", "").replace("-", "")).append("00");
        builder.append("\n");
        builder.append("END:VEVENT");
        builder.append("\n");
        return builder.toString();
    }
}
