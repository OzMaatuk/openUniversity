public class CharNode
{
    private char _data;
    private CharNode _next;
    public CharNode(char c, CharNode next) {
        _data = c;
        _next = next;
    }

    public CharNode getNext() {
        return _next;
    }

    public char getData() {
        return _data;
    }

    public void setNext(CharNode next) {
        _next = next;
    }

    public void setData(char data) {
        _data = data;
}
}