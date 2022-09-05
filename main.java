class student
{
	String name;
	int rollno;
	int total;
	int sub_marks[]=new int[5];
	student(){
	}
	void getInput(String n,int r,int sm[]){
		name=n;
		rollno=r;
		sub_marks=sm;
	}
	void total_calc(){
		total=0;
		for(int i=0;i<5;i++)
		{
			total=total+sub_marks[i];
		}
	}
	void grade_calc(){
		if(total<=500 && total>480)
			System.out.println("O Grade");
		else if(total<=480 && total>450)
			System.out.println("A+ Grade");
		else if(total<=450 && total>400)
			System.out.println("A Grade");
		else if(total<=400 && total>350)
			System.out.println("B Grade");
		else if(total<=350 && total>300)
			System.out.println("C Grade");
		else if(total<=300 && total>250)
			System.out.println("D Grade");
		else if(total<=250 && total>200)
			System.out.println("E Grade");
		else
			System.out.println("U Grade");
	}
	void getOutput(){
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+rollno);
		for(int i=0;i<5;i++)
		{
			System.out.println("Marks of Subject"+(i+1)+"="+sub_marks[i]);
		}
		System.out.println("Total marks="+total);
	}
}
public class main
{
	public static void main(String s[]){
		int arr1[]={100,98,87,90,96};
		int arr2[]={89,78,57,98,87};
		int arr3[]={34,23,67,53,68};
		int arr4[]={60,73,87,57,91};
		int arr5[]={55,78,69,45,59};
		String nm1="Geetha";
		String nm2="Seetha";
		String nm3="Vineetha";
		String nm4="Puneetha";
		String nm5="Reetha";
		int rn1=1001;
		int rn2=1002;
		int rn3=1003;
		int rn4=1004;
		int rn5=1005;
		student s1=new student();
		student s2=new student();
		student s3=new student();
		student s4=new student();
		student s5=new student();
		s1.getInput(nm1,rn1,arr1);
		s1.total_calc();
		s1.getOutput();
		s1.grade_calc();
		System.out.println("----------------------------------------");
		s2.getInput(nm2,rn2,arr2);
		s2.total_calc();
		s2.getOutput();
		s2.grade_calc();
		System.out.println("----------------------------------------");
		s3.getInput(nm3,rn3,arr3);
		s3.total_calc();
		s3.getOutput();
		s3.grade_calc();
		System.out.println("----------------------------------------");
		s4.getInput(nm4,rn4,arr4);
		s4.total_calc();
		s4.getOutput();
		s4.grade_calc();
		System.out.println("----------------------------------------");
		s5.getInput(nm5,rn5,arr5);
		s5.total_calc();
		s5.getOutput();
		s5.grade_calc();
		System.out.println("----------------------------------------");

		
	}
}
	

	