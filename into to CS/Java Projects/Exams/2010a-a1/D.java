public class D extends C {
public D(int n)
{
super(n);
for (int i=0; i<n; i++)
new D(i);
}
}