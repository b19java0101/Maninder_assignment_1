package maninder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class employee {
	
String company_name="bebo";
String Department="btes";
String name;
static int id=1;
float salary;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
employee() throws IOException
{
	System.out.println("company_name=" + company_name);
	System.out.println("Department=" + Department);
	System.out.println("name");
	name=br.readLine();
	System.out.println("id=" + id);
	id++;
	System.out.println("enter salary");
	salary=Float.parseFloat(br.readLine());
	
}
void display()
{
	System.out.println("name=" + name + "salary" + salary);
}
	public static void main(String[] args) throws IOException
	{
		employee e1=new employee();
		employee e2=new employee();
		e1.display();
		e2.display();
	}

}
