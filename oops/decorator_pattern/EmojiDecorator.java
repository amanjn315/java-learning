package decorator_pattern;

public class EmojiDecorator extends MessageDecorator {
    public EmojiDecorator(Message message){
        super(message);
    }

    public String format(){
        return "😊 " + message.format() + " 😊";
    }
}
