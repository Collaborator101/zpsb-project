package fgolewski.lab04;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main04 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmtISO = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

        if (args.length >= 2) {
            int offset = Integer.parseInt(args[1]);
            now = now.plusDays(offset);
        }

        String text = fmtISO.format(now) + "\r\n";
        String fileName = args.length < 1 ? "" : args[0];
        if (fileName.length() == 0 || fileName.equals(".")) {
            System.out.println(text);
            return;
        }
        File f = new File(fileName);
        FileWriter fw;
        try {
            fw = new FileWriter(f, true);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(fw);
            writer.append(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
