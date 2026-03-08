package SS1.bai6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Logger {

    public static void logError(String message, Exception e) {

        String time = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("[ERROR] " + time + " - " + message);

        if (e != null) {
            System.out.println("Chi tiết: " + e.getMessage());
        }
    }
}
