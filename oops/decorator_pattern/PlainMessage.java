package decorator_pattern;

public class PlainMessage implements Message {
    private String text;

    public PlainMessage(String text){
        this.text = text;
    }

    public String format(){
        return text;
    }
}
