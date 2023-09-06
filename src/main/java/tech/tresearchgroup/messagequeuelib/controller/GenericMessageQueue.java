package tech.tresearchgroup.messagequeuelib.controller;

import tech.tresearchgroup.messagequeuelib.controller.types.MessageQueueTypeInterface;
import tech.tresearchgroup.messagequeuelib.model.BasicQueueItemInterface;
import tech.tresearchgroup.messagequeuelib.model.MessageQueueDataFormat;
import tech.tresearchgroup.messagequeuelib.model.MessageQueueTypeEnum;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class GenericMessageQueue implements MessageQueueTypeInterface {
    private MessageQueueTypeInterface genericMessageQueue;
    private MessageQueueDataFormat dataFormat;

    public GenericMessageQueue(String host,
                               int port,
                               String username,
                               String password,
                               MessageQueueTypeEnum messageQueueTypeEnum,
                               MessageQueueDataFormat dataFormat) throws IOException, TimeoutException {

    }

    @Override
    public boolean create(BasicQueueItemInterface object) {
        return genericMessageQueue.create(object);
    }

    @Override
    public boolean createQueue(String queueName) {
        return genericMessageQueue.createQueue(queueName);
    }

    @Override
    public Object read(String queue) {
        return genericMessageQueue.read(queue);
    }
}
