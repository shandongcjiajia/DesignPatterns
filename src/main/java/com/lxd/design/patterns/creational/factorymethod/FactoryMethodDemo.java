package com.lxd.design.patterns.creational.factorymethod;

import com.lxd.design.patterns.MessageSender;

/**
 * 定义一个创建对象的接口，让子类决定实例化那个类
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        MessageSenderFactory messageSenderFactory = null;
        MessageSender messageSender = null;

        messageSenderFactory = new SmsMessageSenderFactory();
        //messageSenderFactory = new MailMessageSenderFactory();
        //messageSenderFactory = new QQMessageSenderFactory();

        messageSender = messageSenderFactory.getMessageSender();
        messageSender.SendMessage();

    }
}
