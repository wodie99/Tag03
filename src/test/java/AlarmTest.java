import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void zuVielePersone_when30PersonGelb_OK() {
        assertEquals("Maximale Personenanzahl nicht überschritten",Alarm.zuVielePersone(30,"gelb"));
    }

    @Test
    void zuVielePersone_when31Gelb_Stop() {
        assertEquals("Zu viele Personen",Alarm.zuVielePersone(31,"gelb"));
    }

    @Test
    void zuVielePersone_when60Grün_OK() {
        assertEquals("Maximale Personenanzahl nicht überschritten",Alarm.zuVielePersone(60, "grün"));
    }

    @Test
    void zuVielePersone_when61Grün_Stop() {
        assertEquals("Zu viele Personen",Alarm.zuVielePersone(61,"grüm"));
    }

    @Test
    void zuVielePersone_when1_0000_000Rot_Stop() {
        assertEquals("Zu viele Personen",Alarm.zuVielePersone(1000000,"grün"));
    }

    @Test
    void zuVielePersone_when29Gelb_OK() {
        assertEquals("Maximale Personenanzahl nicht überschritten",Alarm.zuVielePersone(29,"gelb"));
    }

    @Test
    void zuVielePersone_when0Rot_OK() {
        assertEquals("Maximale Personenanzahl nicht überschritten",Alarm.zuVielePersone(0,"rot"));
    }

    @Test
    void zuVielePersone_whenPersonNegativRot_OK() {
        assertEquals("Maximale Personenanzahl nicht überschritten",Alarm.zuVielePersone(-1,"rot"));
    }

    @Test
    void zuVielePersone_when1Rot_Stop() {
        assertEquals("Zu viele Personen",Alarm.zuVielePersone(1,"rot"));
    }


}