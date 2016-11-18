package org.smart4j.framework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.helper.DatabaseHelper;
import org.smart4j.framework.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(int id) {
        String sql = "select * from customer where id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    public boolean createCustomer(Map<String, Object> filedMap) {
        return DatabaseHelper.insertEntity(Customer.class, filedMap);
    }

    public boolean updateCustome(int id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    public boolean deleteCustomer(int id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}