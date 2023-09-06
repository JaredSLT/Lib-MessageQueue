package tech.tresearchgroup.messagequeuelib.controller.types;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import tech.tresearchgroup.messagequeuelib.model.BasicQueueItemInterface;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQMessageQueueTypeInterface implements MessageQueueTypeInterface {
    private final Channel channel;

    public RabbitMQMessageQueueTypeInterface(String host, int port, String username, String password) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        Connection connection = connectionFactory.newConnection();
        this.channel = connection.createChannel();
    }

    public boolean create(BasicQueueItemInterface object) {
        return false;
    }

    @Override
    public boolean createQueue(String queueName) {
        return false;
    }

    public Object read(String queue) {
        return null;
    }
}
