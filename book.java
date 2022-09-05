import java.util.*;
class books{
	String title,author_name,pub_name,category;
	int isbn_no,edition,year,cost,no,total;
	books(){}
	void getInput(String t,String a,String p,String cat,int bn,int ed,int y,int c,int n)
	{
		title=t;
		author_name=a;
		pub_name=p;
		category=cat;
		isbn_no=bn;
		edition=ed;
		year=y;
		cost=c;
		no=n;
	}
	void total_calc(){
		total=0;
		total=cost*no;
		System.out.println("Total books purchased:"+no);
		System.out.println("Total cost:"+total);
	}
	void getOutput(){
		System.out.println("Name of the book:"+title);
		System.out.println("Author of the book:"+author_name);
		System.out.println("Edition:"+edition);
		System.out.println("Category:"+category);
		System.out.println("Publication:"+pub_name);
		System.out.println("Year of Publication:"+year);
		System.out.println("Cost of the book:"+cost);
		
		
	}
}
public class book{
	public static void main(String arg[]){
		int nt=0;
			Scanner ip=new Scanner(System.in);
			String n="Once upon a time there lived a Ghost";
			String ar="Lokesh Kanagaraj";
			String pub="Rajkamal Publications";
			String ca="Crime";
			int bno=657;
			int edi=7;
			int yr=2022;
			int cos=599;
			System.out.println("No.of.Books Purchased:");
			nt=ip.nextInt();
			books b1=new books();
			b1.getInput(n,ar,pub,ca,bno,edi,yr,cos,nt);
			b1.getOutput();
			b1.total_calc();
	}
}
		
		