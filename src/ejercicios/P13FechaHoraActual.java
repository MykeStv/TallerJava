package ejercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P13FechaHoraActual {

    private LocalDateTime fechaHora;
    private DateTimeFormatter dateTimeFormatter;

    public P13FechaHoraActual() {
        this.fechaHora = LocalDateTime.now();
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
    }

    public void formatearFechaHora() {
        System.out.println("La fecha actual es: " + fechaHora.format(dateTimeFormatter));
    }
}
