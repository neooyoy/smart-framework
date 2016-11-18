package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
        // TODO: 2016/11/17  初始化数据库
    }

    @Test
    public void getCustmerListTest() throws Exception {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(4, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        int id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "john");
        fieldMap.put("telephone", "13510000000");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        int id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "john111");
        boolean result = customerService.updateCustome(id, fieldMap);
        Assert.assertTrue(result);
    }


    @Test
    public void deleteCustomerTest() throws Exception {
        int id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }


}