package by.belstu.it.vovna;

public class TextFunction {
    public int text;

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public TextFunction() {
    }

    public String getValue(){
        extracted();
        return "Hello from first project";
    }

    private void extracted() {
        System.out.println("123455555566666678");
    }

}
