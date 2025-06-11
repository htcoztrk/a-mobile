package allianz.core.utils;

public class AllianzUtils {

    public static boolean isNullOrEmpty(String str) {

        return str == null || "".equals(str);
    }

    public static boolean isNotNull(String str) {

        return str != null && str.length() > 0;
    }

    public static boolean isTestRunningOnTestinium() {

        return isNotNull(System.getenv("key"));
    }
}
