package week9;
class Student
{
	String name;
	float[]CIE= {0,0,0};
	float avg;
	byte rollno;
	void setStudent(String n,float ia[],byte rno)
	{
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollno=rno;
		for(byte i=0;i<3;i++)
		{
			CIE[i]=ia[i];
			sum=sum+CIE[i];
		}
		avg=sum/3.0f;
	}
	void setStudent(String n,float ia1,float ia2,byte rno)
	{
		name=n;
		rollno=rno;
		CIE[0]=ia1;
		CIE[1]=ia2;
		avg=(CIE[0]+CIE[1])/3.0f;
	}
	void setStudent(String n,float ia,byte rno)
	{
		name=n;
		rollno=rno;
		CIE[0]=ia;
		avg=(CIE[0])/3.0f;
	}
	void showStudent()
	{
		System.out.println(rollno+"\t\t"+name+"\t\t"+avg+"\t\t");
	}
}
public class Demomethod_overloading
{
	public static void main(String args[])
	{
		Student deeps=new Student();
		System.out.println("The internal Details of a Student.");
		System.out.println("Roll no.\t Name\t\t Average");
		deeps.setStudent("Deepika",19.4f,(byte)12);
		deeps.showStudent();
		deeps.setStudent("Jaya",19.4f,17.6f,(byte)10);
		deeps.showStudent();
		float[]cie= {17.0f,12.6f,19.2f};
		deeps.setStudent("Rekha",cie,(byte)8);
		deeps.showStudent();
	}
}

