package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 *
 * @author cj
 * @since 1.0.0
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return !ArrayUtils.isNotEmpty(array);
    }
}