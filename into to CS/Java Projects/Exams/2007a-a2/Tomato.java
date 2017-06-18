public class Tomato
{
private int _weight;
public Tomato(int w)
{
_weight = w;
}
public int getWeight()
{
return _weight;
}
public boolean equals (Tomato other)
{
return ((other!=null) && (_weight == other._weight));
}
}