import java.util.Scanner;
class ACTIVITY4B_NW2D_DELEON {
  public static void main(String[] args) {
    String userenter,typeArrays;

    // switch statement to check size
    switch (userenter) {

      case insert :
      int num;
      Scanner lc=new Scanner(System.in);
      System.out.println("Enter insert");
      num=ls.nextlnt();
      int a[]=new int[num];
      System.out.print(Enter+num+"Element to store in Array");
        for(int i=0;i<num;i++)
        {
        	a[i]=lc.nextInt();
        	}
        	System.out.print("Element in Array are:\n");
        	for(int i=0;i<len;i++)
        	{
        		System.out.print(a[i]+"");
        		}
        break;

      case delete:
      int pop;  
{   
    if(top == -1)   
    {  
        printf("Underflow");  
        return 0;  
    }  
    else  
    {  
        return stack;   
    }    
}   
        typeArrays = "You are using Delete";
        break;

      // match the value of week
      case traverse:
      int myArray[] = new int[7];
      myArray[0] = 1254;
      myArray[1] = 1458;
      myArray[2] = 5687;
      myArray[3] = 1457;
      myArray[4] = 4554;
      myArray[5] = 5445;
      myArray[6] = 7524;
      //Printing Contents using for each loop
      System.out.println("Contents of the array: ");
      for (int element: myArray) {
         System.out.println(element);
        typeArrays = "You are using tranverse ";
        break;
         default:
        typeArrays = "Unknown";
        break;

    }
    System.out.println(" " + typeArrays);
  }
}