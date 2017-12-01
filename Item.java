package pkg1;
public class Item
{
	private int x;
	private double d;
	public void setData(int x,double d)
	{
		this.x=x;
		this.d=d;
	}
	public void getData()
	{
		System.out.println("x= "+x);
		System.out.println("D= "+d);
	}
}