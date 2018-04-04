import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Node
{
    int data;
    Node start,next;
    Node(int data)
    {
        this.data=data;
    }
}
class SinglyLinkedList
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Node start,next;
    SinglyLinkedList()throws Exception
    {
        while(true)
        {
             System.out.println("\n1.Create Linked List\n2.Add element at beginning.\n3.Add element at end.\n4.Display.\n5.Search." +
			"\n6.Sort.\n7.Reverse.\n8. Delete Element.\n9.Exit");
            int option=Integer.parseInt(br.readLine());
            switch(option)
            {
              case 1:
                    createList();
                    break;
              case 2:
                    addAtBeginning();
                    break;
              case 3:
                    start=addAtTheEnd();
                    break;
              case 4:
                    display();
                    break;
              case 5:
                    search();
                    break;
              case 6:
                    sort();
                    break;
              case 7:
                    reverse();
                    break;
              case 8:
                    delete();
					break;
			  case 9:
					System.exit(0);
              default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
    void createList()
    {

    }
    void addAtBeginning() throws Exception
    {
        if(start==null)
        {
            System.out.println("Enter the value for node: ");
            int value=Integer.parseInt(br.readLine());
            Node tmp=new Node(value);
            tmp.data=value;
            tmp.next=start;
            start=tmp;
        }
        else
        {
            System.out.println("Enter the value of node: ");
            int value=Integer.parseInt(br.readLine());
            Node tmp=new Node(value);
            tmp.data=value;
            tmp.next=start;
            start=tmp;
        }
    }
    Node addAtTheEnd() throws IOException
    {
        //checking if linked list is null or not
        Node point=start;
        int tdata=Integer.parseInt(br.readLine());
        if(start==null)
        {
            System.out.println("List is empty , create first.");
            return start;
        }
        else
        {
            //If single node is present in list then
            if(start.next==null)
            {
              System.out.println("addAtTheEnd check 1 ");
              Node tmp=new Node(tdata);
              tmp.next=null;
              tmp.data=tdata;
              start.next=tmp;
              return start;
            }
            else
            {
              //If more than one element is present in linked list addAtTheEnd
              while(point.next!=null)
              {
                  point=point.next;
              }
              Node tmp=new Node(tdata);
              tmp.data=tdata;
              tmp.next=null;
              //below is the crucial step.
              point.next=tmp;
              return start;
            }
        }
    }
    Node reverse()
    {
        System.out.println("Before reversing the list: ");
        display();
        System.out.println("After reversing the list: ");
        if(start!=null)
        {
              Node prev=null;
              Node current=start;
              Node next=null;
              while(current!=null)
              {
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
              }
              start=prev;
              display();
              return start;
        }
        else
        {
          System.out.println("List is empty , no element to reverse.");
        }
        return start;
    }
    Node search()throws IOException
    {
        System.out.println("Enter element to search: ");
        int temp=Integer.parseInt(br.readLine());
        Node point=start;
        while(point!=null)
        {
            if(point.data==temp)
            {
                System.out.println("Element found.");
                return start;
            }
            point=point.next;
        }
        System.out.println("Element not found!!!!");
        return start;
    }
    void display()
    {
        //System.out.println("Node is="+start.data);
        //System.out.println("Second node is="+start.next.data);
        Node temp=start;
        while(temp!=null)
        {
            System.out.print("|"+" "+temp.data+" |");
            temp=temp.next;
        }
    }
    public void delete() throws Exception 
	{
		Node point = start ;
		int srchdata=0 ;
		int flag=0 ;
		System.out.println("Enter the data to remove: ");
		srchdata = Integer.parseInt(br.readLine()) ;
		for( Node i = point ; point != null ; point = point.next )
		{
			if(srchdata == point.data )
			{
				flag++ ;
				break ; 
			}
		}
		// Re-Initializing point variable.
		point = start ;
		if(flag!=0)
		{
			// Logic for  : if element is in the middle of two elements. 
			
			Node storePrev = null ; // variable for storing previous node address , previous to searched data.
			Node storeNext = null ; // variable for storing next node address , next to searched data.
			while( point.next.next != null )
			{
				if(point.next.data == srchdata )
				{
				//point.next in below line will give you the searched element.
				//point.next will give the element before the searched element
				storePrev = point ;
				storeNext = point .next .next ;
				//Performing deletion of the element.
				point.next = point.next.next ;
				start = point;
				break;
				
			//	System.out.println("Displaying data at point "+storePrev.data);
			//	System.out.println("Displaying data at point.next.next "+storeNext.data);
				}
				point = point.next ;
			}
		}
		else
		{
			System.out.println("Element doesn't exist.") ;
		}
		System.out.println("Element deleted successfully.");
		display();
		
	}
    
    Node sort()
    {
        System.out.println("Beginning the sort algorithmn.");
        Node point=start;
        if(point!=null)
        {
            for(Node i=point;i!=null;i=i.next)
            {
              //  System.out.print(" "+i.data+" ");
              for(Node j=point.next;j!=null;j=j.next)
              {
                  System.out.print("i pointing to ->  "+i.data +"\n"+ "j is pointing to ->"+j.data);
                  if(i.data > j.data)
                  {
                      int temp=j.data; // 5
                      j.data=i.data;//  19
                      i.data=temp;
                  }
              }
            }
            System.out.println("After sorting: ");
            display();
        }
        else
        {
            System.out.println("\nList is empty.");
        }
        return start;
    }
    public static void main(String...a)throws Exception
    {
        new SinglyLinkedList();
    }
}
