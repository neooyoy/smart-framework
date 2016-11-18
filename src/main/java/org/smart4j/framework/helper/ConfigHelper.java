package org.smart4j.framework.helper;

import org.smart4j.framework.Configconstant;
import org.smart4j.framework.util.PropsUtil;

import java.util.Properties;

/**
 * 属性文件助手类
 * @author cj 20161118
 * @since 1.0.0
 */
public final class ConfigHelper {

    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(Configconstant.CONFIG_FILE);

    public static String getJdbcDriver() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.JDBC_DRIVER);
    }

    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.JDBC_URL);
    }

    public static String getJdbcUsername() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.JDBC_USERNAME);
    }

    public static String getJdbcPasswork() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.JDBC_PASSWORD);
    }

    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.APP_BASE_PACKAGE);
    }

    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPS, Configconstant.APP_ASSET_PATH, "/asset/");
    }

}