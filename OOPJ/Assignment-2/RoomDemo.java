class Room{
	double height;
	double length;
	double width;
	
	Box()
	{
		height=0;
		length=0;
		width =0;
	}
	Box(double h,double l,double w)
	{
		height=h;
		length=l;
		width =w;
	}
	
	double volume()
	{
		return(height*length*weight);
	}
	
}
class RoomDemo{	
	public static void main(String [] args)
	{
		Room r1=new Room(15,20,30);
		Room r2=new Room();
	}
}