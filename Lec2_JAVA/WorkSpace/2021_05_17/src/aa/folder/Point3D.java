package aa.folder;


public class Point3D extends Point{
	public int z;
	public Point3D(){
		super();
		z = 0;
	}
	public Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	public String GetLocation() {
		return super.GetLocation() + ","+z;
	}
}


