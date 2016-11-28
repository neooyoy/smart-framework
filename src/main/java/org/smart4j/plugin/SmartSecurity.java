package org.smart4j.plugin;

import java.util.Set;

/**
 * smart security 接口
 * <p/>
 * <br/>
 * 可在应用中实现该接口， 或者在 smart.properties 文件中提供一下基于sql的配置项
 * <ul>
 * <li>
 * smart.plugin.security.jdbc.authc_query;根据用户名获取密码
 * </li>
 * <li>
 * smart.plugin.security.jdbc.roles_query;根据用户名获取角色名集合
 * </li>
 * <li>
 * smart.plugin.security.jdbc.permissions_query;根据角色名获取权限名集合
 * </li>
 * </ul>
 *
 * @author cj
 * @since 1.0.0
 */

public interface SmartSecurity {

    /**
     * 根据用户名获取密码
     *
     * @param username
     * @return
     */
    String getPassword(String username);

    /**
     * 根据用户名获取角色名集合
     *
     * @param username
     * @return
     */
    Set<String> getRoleNameSet(String username);

    /**
     * 根据角色名获取权限名集合
     *
     * @param roleName
     * @return
     */
    Set<String> getPermissionNameSet(String roleName);
}