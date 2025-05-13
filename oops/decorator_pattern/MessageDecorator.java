package decorator_pattern;

public abstract class MessageDecorator implements Message {
    protected Message message;

    public MessageDecorator(Message message){
        this.message = message;
    }
}
