package com.jcven.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取AccountDao实例
        AccountDao accountDao =
                (AccountDao) applicationContext.getBean("accountDao");
        // 调用实例中的转账方法
        accountDao.transfer("lisi", "zhangsan", 100.0);
        // 输出提示信息
        System.out.println("转账成功！");
    }
}