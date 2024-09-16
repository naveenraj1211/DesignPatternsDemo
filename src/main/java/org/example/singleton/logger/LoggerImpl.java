package org.example.singleton.logger;

import org.springframework.boot.logging.LogLevel;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {

    private PrintWriter writer;
    private String logFilePath;

    private LoggerImpl() {
        //private constructor
    }

    private static class SingletonHelper {
        private static LoggerImpl INSTANCE = new LoggerImpl();
    }

    public static LoggerImpl getInstance() {
        return SingletonHelper.INSTANCE;
    }


    public static void resetInstance() {
        SingletonHelper.INSTANCE = new LoggerImpl();
    }


    @Override
    public void log(LogLevel level, String message) {
        if (writer == null) {
            throw new IllegalStateException("Logger not initialized. Call setLogFile method to do so");
        }
        String logMessage = "TimeStamp: " + LocalDateTime.now() + "\nLog Level: " + level.name() + "\n Message: " + message;
        writer.println(logMessage);
    }

    @Override
    public void setLogFile(String filePath) {
        try {
            if (writer != null) writer.flush();
            writer = new PrintWriter(new FileWriter(filePath, true), true);
            logFilePath = filePath;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getLogFile() {
        return logFilePath;
    }

    @Override
    public void flush() {
        if (writer != null)
            writer.flush();
    }

    @Override
    public void close() {
        if (writer != null)
            writer = null;
    }
}
