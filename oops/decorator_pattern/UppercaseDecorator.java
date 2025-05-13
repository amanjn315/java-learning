package decorator_pattern;

public class UppercaseDecorator extends MessageDecorator{
    public UppercaseDecorator(Message message){
        super(message);
    }

    public String format(){
        return message.format().toUpperCase();
    }
}
