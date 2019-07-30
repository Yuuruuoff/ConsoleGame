package Engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class PropertiesReader {

    private static Map<String, String> properties = new HashMap<>();

    public PropertiesReader(String path) throws IOException {
        File file = new File(path);
        checkFileIsCorrect(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            readingLogic(br);
        }

    }

    public PropertiesReader(Path path) throws IOException {
        File file = path.toFile();
        checkFileIsCorrect(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            readingLogic(br);
        }
    }

    public PropertiesReader(File file) throws IOException {
        checkFileIsCorrect(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            readingLogic(br);
        }
    }

    public PropertiesReader(FileReader reader) throws IOException {
        try (BufferedReader br = new BufferedReader(reader)) {
            readingLogic(br);
        }
    }

    private void checkFileIsCorrect(File file) throws IOException {
        if (!file.isFile() || !file.canRead()) {
            throw new IOException("Cannot read file");
        }
    }

    private void readingLogic(BufferedReader bufferedReader) throws IOException {
        String readingLine;
        while ((readingLine = bufferedReader.readLine()) != null) {
            readingLine = readingLine.replaceAll(" ", "");
            String[] sa = null;
            if (readingLine.contains("=")) {
                sa = readingLine.split("=");
            } else if (readingLine.contains(":")) {
                sa = readingLine.split("=");
            }
            if (sa != null && sa.length > 1) {
                properties.put(sa[0].toLowerCase(), sa[1].toLowerCase());
            }
        }
    }

    public static String getPropertyAsString(String key) {
        return properties.get(key.toLowerCase());
    }

    public static Integer getPropertyAsInteger(String key) throws NumberFormatException {
        return Integer.valueOf(properties.get(key.toLowerCase()));
    }

    public static void setProperty(String key, String value) {
        properties.put(key.toLowerCase(), value.toLowerCase());
    }

    public static void removeProperty(String key) {
        properties.remove(key.toLowerCase());
    }

    public static void editProperty(String key, String value) {
        setProperty(key, value);
    }

    public static int getPropertiesCount() {
        return properties.size();
    }

    public static Set<String> getAllPropertiesKeys() {
        return properties.keySet();
    }
}
