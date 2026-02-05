package utils;

public class StringUtils {

    public static String normalizeText(String text){
        if (text == null) return "";;
        text = text.replaceAll("[^\\p{L}\\p{N} ]", "");
        text = text.replaceAll("\\s+", " ").trim();
        return text;
    }

}
