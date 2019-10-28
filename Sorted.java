/*import java.util.Formatter;
class Pyramid{
public static void main(String[]args)
	
	{ 
	int size=36;

	 for(int i=0;i<size;i++)
	{
		for(int k=0;k<(size*2);k++)
		{System.out.print(" ");}
		for( int j=1;j<i;j++)
		{
		System.out.print(String.format("%2d",j));
		}
		System.out.println(" "); 
	 	}
		
	int d=size*2;
	for(int i=0;i<size;i++)
	{
		for(int k=d;k>=1;k--)
		{System.out.print(" ");}
		for(int j=i;j>-0;j--)
		{	 
		 System.out.print(String.format("%2d",j));
		}
		System.out.println(" ");
		d=d-2;
	}

	
	}
}*/

import java.util.*;
class Student implements Comparable<Student>{
	String name;
	int roll_no;
		public Student(String name,int roll_no){
		this.name=name;
		this.roll_no=roll_no;
		}
		public int compareTo(Student s){
		return this.roll_no-s.roll_no;
		}
		public String toString(){
		return String.format("Name:%s Roll:%d",name,roll_no);
		}
}

class Sorted{
public void Sorted1(String[] args){
Student[] Student=new Student[5];
Student[0]=new Student("aa",52);
Student[1]=new Student("bb",34);
Student[2]=new Student("cc",1);
Student[3]=new Student("dd",15);
Student[4]=new Student("ee",25);
System.out.println("USING COMPARABLE TO SORT BY ROLL NO.");
System.out.println("Before sorting: " + Arrays.toString(Student));
Arrays.sort(Student);
System.out.println("  ");
System.out.println("After sorting: " + Arrays.toString(Student));
}

public static void main(String[] args){
Sorted s=new Sorted();
s.Sorted1(args);
}
}
