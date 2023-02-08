package common.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtils {
    public static boolean isBlank(String str) {
        return str==null || StringUtils.isBlank(str);
    }
}
