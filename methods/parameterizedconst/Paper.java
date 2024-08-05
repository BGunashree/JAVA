class Paper{
	double thickness=0.001;
	char size;
	String quality;
	String color;
	Paper(String quality)
	{
		this.quality=quality;
	}
	public void setsize(char size)
	{
		this.size=size;
	}
	public void display()
	{
		
		System.out.println("thickness: "+this.thickness);
		System.out.println("size: "+this.size);
		System.out.println("quality: "+this.quality);
		System.out.println("color: "+this.color);
	}
	
	
	
	
}