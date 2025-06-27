package CDS;

class Emp
{	
	public void displayEmp()
	{
System.out.println("Base class");
	}
}
class Manager extends Emp
{
	@Override // This annotation give information to the compile like base class should same signature method
	public void displayEmp()
	{
System.out.println("Sub class");
	}	
}
public class override {
	public static void main(String[] args) {
Manager M=new Manager();
M.displayEmp();
	}
}
