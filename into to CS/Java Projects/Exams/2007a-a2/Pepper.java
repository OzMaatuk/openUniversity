public class Pepper
{
private int _weight;
public Pepper(int w)
{
_weight = w;
}
public int getWeight()
{
return _weight;
}
public boolean equals (Object other)
{
return ((other!=null) && (other instanceof Pepper) &&
(_weight == ((Pepper) other)._weight));
}
}