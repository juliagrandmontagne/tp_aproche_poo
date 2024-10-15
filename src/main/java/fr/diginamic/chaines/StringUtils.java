package fr.diginamic.chaines;

public class StringUtils {
    public static String append(Object... objects){
        StringBuilder builder = new StringBuilder();
        for (Object o : objects)
        {    builder.append(o);}
        return builder.toString();

    }
}
