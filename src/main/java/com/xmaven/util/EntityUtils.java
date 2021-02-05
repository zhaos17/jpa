package com.xmaven.util;

import java.util.Optional;

/**
 * @author: zhaos
 * @date: 2021/1/5
 */
public class EntityUtils<T> {

    /**
     * 获取对象
     * @param obj
     * @return
     */
    public static <T> T toData(Optional<T> obj) {
        return obj.orElseGet(null);
    }

}
