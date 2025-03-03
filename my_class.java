class my_class{
//declaring variables
	static int count=0;
	double pi=3.1415;
//constructor
	my_class(){
		count++;
	}
	public void student(){
	System.out.print("Count value is "+count+"pi value is"+pi.);
	}
	//creating object
	public static void main(String[] args){
	my_class class1 = new my_class();
	class1.student();
	my_class class2 = new my_class();
	class2.student();
	my_class class3 = new my_class();
	class3.student();

}
}