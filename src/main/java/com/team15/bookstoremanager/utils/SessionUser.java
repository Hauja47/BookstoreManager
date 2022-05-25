package com.team15.bookstoremanager.utils;

import com.team15.bookstoremanager.entities.Employee;

public class SessionUser {
    private Employee employee;

    private static SessionUser instance;

    private static SessionUser getInstance() {
        if (instance == null) {
            instance = new SessionUser();
        }

        return instance;
    };

    public void cleanSession() {
        employee = null;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
