package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;
import org.smart4j.framework.util.CollectionUtil;

import java.util.Map;

/**
 * 请求参数对象
 *
 * @author cj
 * @since 1.0.0
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }

    /**
     * 验证参数是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return CollectionUtil.isEmpty(paramMap);
    }
}