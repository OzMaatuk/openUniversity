public class Element{
    private int _number;
    private Element _next;
    public Element(int number) {
        _number = number;
        _next = null;
    }

    public int getNumber() {return _number;}

    public Element getNextElement() {return _next;}
    
    public void setNextElement(Element other) {_next = other;}
}