package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 *
 * @author cj
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     *
     * @return
     */
    Class<? extends Annotation> value();
}