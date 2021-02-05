package com.xmaven.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
public class ListsUtils {

    /**
     * Object转List
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> castList(Object obj, Class<T> clazz) {
        List<T> result = new ArrayList<>();
        if(obj instanceof List<?>) {
            for (Object o : (List<?>) obj) {
                result.add(clazz.cast(o));
            }
            return result;
        }
        return null;
    }
}
