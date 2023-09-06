package tech.tresearchgroup.messagequeuelib.model;

public interface BasicQueueItemInterface {
    String getCreated();
    String getUpdated();
    String getQueueName();
    MessageQueueDataFormat getDataFormat();
}
