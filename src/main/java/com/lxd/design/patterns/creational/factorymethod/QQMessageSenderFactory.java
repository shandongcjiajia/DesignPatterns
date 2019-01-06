package com.lxd.design.patterns.creational.factorymethod;

import com.lxd.design.patterns.MessageSender;
import com.lxd.design.patterns.QQMessageSender;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class QQMessageSenderFactory implements MessageSenderFactory{

    public MessageSender getMessageSender() {
        return new QQMessageSender();
    }
}
