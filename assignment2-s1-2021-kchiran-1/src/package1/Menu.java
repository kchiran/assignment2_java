package package1;
import java.util.Scanner; 

public class Menu {
	int choice;  
	 String menu;  
	 void show() {  
	  Scanner s = new Scanner(System.in);  
	  System.out.println("Enter your choice");  
//	  System.out.println("Enter 1 to Create a Quote");  
	  System.out.println("Enter 2 to see the current status of any quote");  
//	  System.out.println("Enter 3 for Cold Drink");
	  System.out.println("Enter 0 to Exit");
	  choice = s.nextInt();  
	  /*if (choice == 1) {  
	   System.out.println("you have chosen to create a quote");  
	   System.out.println("Enter 4 to quote for radio and spotify advertising");
	   System.out.println("Enter 5 to quote for television advertising");
	   System.out.println("Enter 6 to quote for newspaper advertising");
	   System.out.println("Enter 7 to quote for Web and App advertising");
	   menu = s.nextLine();  
	  }  */
	  /*if (choice == 2) {  
	   System.out.println("you have selected to see the status of any quote");  
	   System.out.println("menu");  
	   menu = s.nextLine();  
	  }  */
//	  if (choice == 3) {  
//	   System.out.println("you have select Cold drink");  
//	   System.out.println("menu");  
//	   menu = s.nextLine();  
//	  }  
	  /*if (choice == 0) {
		  System.out.println("you have selected to exit");
		  System.out.println("menu");  
		  menu = s.nextLine();
	  }*/
	  switch(choice) {
	  case 1:
		   System.out.println("you have chosen to create a quote");  
		   System.out.println("Enter 4 to quote for radio and spotify advertising");
		   System.out.println("Enter 5 to quote for television advertising");
		   System.out.println("Enter 6 to quote for newspaper advertising");
		   System.out.println("Enter 7 to quote for Web and App advertising");
		   menu = s.nextLine();  
		   int input_val = s.nextInt();
		   if (input_val==4) {
			   System.out.println("Plese type the number of ads you want to run");
			   int mynum = s.nextInt();
			   Audio myad = new Audio(mynum);
			   System.out.println("The cost of your advert is "+myad.GetCost());
		   }
		   if (input_val==5) {
			   System.out.println("Plese type the number of ads you want to run");
			   int mynum = s.nextInt();
			   Television myad = new Television(mynum);
			   System.out.println("The cost of your advert is "+myad.GetCost());
		   }
		   if (input_val==6) {
			   System.out.println("Plese type the number of ads you want to run");
			   int mynum = s.nextInt();
			   Newspaper myad = new Newspaper(mynum);
			   System.out.println("The cost of your advert is "+myad.GetCost());
		   }
		   if (input_val==7) {
			   System.out.println("Plese type the number of ads you want to run");
			   int mynum = s.nextInt();
			   WebApp myad = new WebApp(mynum);
			   System.out.println("The cost of your advert is "+myad.GetCost());
		   }
		   break;
	  case 2:
		  System.out.println("you have selected to see the status of any quote");  
		  System.out.println("menu");  
		  menu = s.nextLine(); 
		  break;
	  case 0:
		  System.out.println("you have selected to exit");
		  System.out.println("menu");  
		  menu = s.nextLine();
	  }
	 }  
//	 public static void main(String[] args) {  
//	  Menu h = new Menu();  
//	  h.show();  
//	 }  
}
