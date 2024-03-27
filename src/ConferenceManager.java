import java.util.ArrayList;
import java.util.List;

public class ConferenceManager {
    public static void main(String[] args) {
        // Crear charlas
        Talk talk1 = new Talk("Redacción de pruebas rápidas contra Enterprise Rails", 60);
        Talk talk2 = new Talk("Exagerando en Python", 45);
        // Crear más charlas según la entrada de prueba

        // Crear sesiones
        Session morningSession = new Session(new ArrayList<>(), 540); // 9:00 AM en minutos
        Session afternoonSession = new Session(new ArrayList<>(), 780); // 1:00 PM en minutos

        // Crear pistas
        Track track1 = new Track(morningSession, afternoonSession);
        // Crear más pistas según la entrada de prueba
        Session morningSession2 = new Session(new ArrayList<>(), 600); // 10:00 AM en minutos
        Session afternoonSession2 = new Session(new ArrayList<>(), 840); // 2:00 PM en minutos
        Track track2 = new Track(morningSession2, afternoonSession2);

        // Asignar charlas a las sesiones según la duración y horarios
        morningSession.getTalks().add(talk1);
        morningSession.getTalks().add(talk2);
        // Asignar más charlas a las sesiones según la duración y horarios
        Talk talk3 = new Talk("Optimización de consultas SQL", 30);
        Talk talk4 = new Talk("Introducción a la inteligencia artificial", 60);
        morningSession2.getTalks().add(talk3);
        morningSession2.getTalks().add(talk4);

        // Imprimir la programación de las pistas en la consola
        System.out.println("Programación de la conferencia:");
        System.out.println("Pista 1:");
        System.out.println("Mañana:");
        for (Talk talk : morningSession.getTalks()) {
            System.out.println("09:00 AM " + talk.getTitle() + " " + talk.getDuration() + " min");
        }
        System.out.println("12:00 PM Almuerzo");
        System.out.println("Tarde:");
        for (Talk talk : afternoonSession.getTalks()) {
            System.out.println("01:00 PM " + talk.getTitle() + " " + talk.getDuration() + " min");
        }
        System.out.println("05:00 PM Evento de networking");

        System.out.println("Pista 2:");
        System.out.println("Mañana:");
        for (Talk talk : morningSession2.getTalks()) {
            System.out.println("10:00 AM " + talk.getTitle() + " " + talk.getDuration() + " min");
        }
        System.out.println("02:00 PM Almuerzo");
        System.out.println("Tarde:");
        for (Talk talk : afternoonSession2.getTalks()) {
            System.out.println("03:00 PM " + talk.getTitle() + " " + talk.getDuration() + " min");
        }
        System.out.println("06:00 PM Evento de networking");
    }
}