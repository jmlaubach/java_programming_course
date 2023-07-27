package Part_6.MessageService;

import java.util.ArrayList;

public class MessageService {
    private ArrayList<Message> messages;

    public MessageService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        this.messages.add(message);
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
