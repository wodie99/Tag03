public class Alarm {
    public static void main(String[] args) {
        int anzahlPersonen = 10;
        String alarmstufe = "gelb";
        System.out.println(zuVielePersonen(anzahlPersonen,alarmstufe));

    }

    public static String zuVielePersonen(int Personen, String alarmStufe) {
        int max = 0;
        if (alarmStufe == "grün") {
            max = 60;
        }
        if (alarmStufe == "gelb") {
            max = 30;
        }

        if (Personen > max ) {
            return "Zu viele Personen";
        } else {
            return "Maximale Personenanzahl nicht überschritten";
        }

    }
}
