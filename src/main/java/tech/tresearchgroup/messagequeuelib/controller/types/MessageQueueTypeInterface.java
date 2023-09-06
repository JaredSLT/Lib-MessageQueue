package tech.tresearchgroup.messagequeuelib.controller.types;

import tech.tresearchgroup.messagequeuelib.model.BasicQueueItemInterface;

public interface MessageQueueTypeInterface {
    boolean create(BasicQueueItemInterface object);
    boolean createQueue(String queueName);
    Object read(String queue);
}
