import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{
	static Node head;
	static void create()  //using method
	{
		Node cur=null,ptr=null;
		Scanner sc=new Scanner(System.in);
		char ch='y';
		int c=0;
		while(ch=='y')
	    {
	       cur=new Node();
	       if(cur==null)
	       {
	           System.out.println("Some Problem");
	           break;
	       }
	       c++;
	       System.out.println("enter node"+c+"data");
	       cur.data=sc.nextInt();
	       cur.next=null;
	       if(head==null)
	       {
	          head=cur;
	       }
	       else
	       {
	          ptr.next=cur;
	       }
	       ptr=cur;
	       System.out.println("To create new node press y");
	       ch=sc.next().charAt(0);
	    }
	}
	static void disp()
	{
		if(head==null)
		{
			System.out.println("no element");
			return;
		}
		System.out.println("element are");
		Node ptr=head;
		while(ptr!=null)
	    {
	       System.out.println(ptr.data);
	       ptr=ptr.next;
	    }

	}
}
class Test
{
	public static void main(String args[])
	{
	    
	    SL.create();
	    SL.disp();
	    
	}
}