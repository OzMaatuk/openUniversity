public class Cell
{
    private int _x, _y;
    public Cell(int x, int y)
    {
        _x = x;
        _y = y;
    }

    public void setX(int x) {_x = x;}

    public void setY(int y) {_y = y;}

    public int getX () {return _x;}

    public int getY() {return _y;}

    public Cell nextCell(int rows, int columns) {return this;}

    public Cell prevCell(int rows, int columns) {return this;}
}