package decorator_pattern;

import java.time.LocalDateTime;

public class TimestampDecorator extends MessageDecorator {
    public TimestampDecorator(Message message){
        super(message);
    }

    public String format(){
        return "[" + LocalDateTime.now() + "] " + message.format();
    }
}
