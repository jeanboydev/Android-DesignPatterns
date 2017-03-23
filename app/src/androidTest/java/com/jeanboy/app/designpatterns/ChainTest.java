package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.chain.CEO;
import com.jeanboy.app.designpatterns.chain.Employee;
import com.jeanboy.app.designpatterns.chain.Leader;
import com.jeanboy.app.designpatterns.chain.Manager;
import com.jeanboy.app.designpatterns.chain.Order;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class ChainTest {

    @Test
    public void testChain() {

        CEO ceo = new CEO();//老板
        Manager manager = new Manager();//经理
        Leader leader = new Leader();//小组长
        Employee employee = new Employee();//员工

        //设置上级
        employee.setSuperior(leader);
        leader.setSuperior(manager);
        manager.setSuperior(ceo);

        Order order1 = new Order(5, "进货");
        Order order2 = new Order(10, "进货");
        Order order3 = new Order(100, "控股");
        Order order4 = new Order(200, "收购");
        Order order5 = new Order(50, "开一条生产线");
        employee.setOrder(order1);
        employee.handle();
        employee.setOrder(order2);
        employee.handle();
        employee.setOrder(order3);
        employee.handle();
        employee.setOrder(order4);
        employee.handle();
        employee.setOrder(order5);
        employee.handle();
    }
}