import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");

        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12
                && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern(
            "EEEE, MMMM d, yyyy, 'at' h:mm a"
        );

        return "You have an appointment on "
        + formatter.format(appointmentDate)
        + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(
                LocalDate.now().getYear(),
                9,
                15
        );
    }
}
