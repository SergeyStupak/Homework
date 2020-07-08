import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Time {
    public static void main (String[] args) {

        int x = 4500;

        int sec = x % 60;
        int min = (x-sec) / 60;
            System.out.println("A)"+min+"минут"+sec+"секунд");
        int h = min % 60;
        int hour = (min-h)/60;
            System.out.println("B)"+hour+"часов"+h+"минут"+sec+"секунд");
        int day = hour / 24;
            System.out.println("C)"+day+"дней"+hour+"часов"+h+"минут"+sec+"секунд");
        int week = day / 7;
            System.out.println("D)"+week+"недель"+day+"дней"+hour+"часов"+h+"минут"+sec+"секунд");

    }
}
