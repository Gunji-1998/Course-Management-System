package project;

import java.util.Scanner;

	
class student
	{
		String name,qualification,emailid,specilization,rollno;
		
	void new_student()
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = input.nextLine();
        
        System.out.println("Enter Qualification:");
        qualification = input.nextLine();

        System.out.println("Enter Emailid:");
        emailid = input.nextLine();

        System.out.println("Enter Specilization:");
        specilization = input.nextLine();

        System.out.println("Enter Roll-No:");
        rollno = input.nextLine();

        
	}
	void student_info()
    {
		System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Qualification:"+qualification);
        System.out.println("Specilization:"+specilization);
        System.out.println("Emailid:"+emailid);    }
	}
class others
	{
		String name,qualification,emailid,specilization,rollno;

	void new_otherstudent()
		{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = input.nextLine();
        
        System.out.println("Enter Qualification:");
        qualification = input.nextLine();

        System.out.println("Enter Emailid:");
        emailid = input.nextLine();

        System.out.println("Enter Specilization:");
        specilization = input.nextLine();

        System.out.println("Enter Roll-No:");
        rollno = input.nextLine();

        
        }
	void otherstudent_info()
	{
		System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollno);
        System.out.println("Qualification:"+qualification);
        System.out.println("Specilization:"+specilization);
        System.out.println("Emailid:"+emailid);
	}
}
public class CourseManagementSystem {

		public static void main(String[] args)
		{
			Login login= new Login();
			login.main(args);
	        int count1 = 4, count2 = 4, count3 = 4,count4 = 4,count5 = 4;
	        int counta = 4, countb = 4, countc = 4;
	        System.out.println("select the type of courses given below");
        	System.out.println("------------------------------------------------------");
	        student[] a = new student[25];
	        others[] b = new others[25];
	        int i=0;
	        for(i=0;i<25;i++)
	       a[i] = new student();
	       for(i=0;i<25;i++)
	        b[i] = new others();
	        
	        Scanner input = new Scanner(System.in);
	        int choice1 = 0,c, status = 1, s1 = 1, s2 = 1, s3 =1 ;
	        int choice2 = 1,status1 = 2;
	        while (status == 1)
	        {
	        	System.out.println("1.Technical Courses 2.Non technical courses");
	        	System.out.println("------------------------------------------------------");
	            choice1 = input.nextInt();
	        	switch(choice1)
	        	{
	        	
	        	case 1:
	        	{
	        		switch(choice1)
	        		{
	        		case 1:
	        		{
	        			 System.out.println("-------------------------------------------------------------------");
	        	         System.out.println("1.Java \n 2.C++ \n 3.JavaScript \n 4.Python \n 5.C ");
	        	         choice1 = input.nextInt();

	        	         System.out.println("1.Enrollnow  2.Exit");
	        	         c = input.nextInt();
	            	switch(c)
	            	{
	            	case 1:
	            	{
	            		 a[count1].new_student();
	                     System.out.println(" You have enrolled successfully");
	                     System.out.println("......Details of the student......");
	                     a[count1].student_info();
	                     System.out.println("------------------------------------------------");
	                     System.out.println("Your course will be started soon...");
	                     System.out.println("---------------------------------------------------------");
	                     break;
	            	}
	            	}
	        		}
	        		case 2:
	                {
	                    System.out.println("\n Return Menu Press 1");
	                    s1 = input.nextInt();
	                    break;
	                }

	        }
	        System.out.println("\n Main Menu Press 0");
	        s1 = input.nextInt();

	    break;
	        }
	        	case 2:
	        	{
	        		switch(choice2)
	        		{
	        		case 1:
	        		{
	        			 System.out.println("-------------------------------------------------------------------");
	        	         System.out.println("1.Apptitude \n 2.communication skills \n 3.Abacus");
	        	         choice1 = input.nextInt();

	        	         System.out.println("1.Enrollnow  2.Exit");
	        	         c = input.nextInt();
	            	switch(c)
	            	{
	            	case 1:
	            	{
	            		 b[count1].new_otherstudent();
	                     System.out.println("You have enrolled successfully");
	                     System.out.println("......Details of the student......");
	                     b[count1].otherstudent_info();
	                     System.out.println("------------------------------------------------");
	                     System.out.println("Your course will be started soon...");
	                     System.out.println("---------------------------------------------------------");
	                     break;
	            	}
	            	}
	        		}
	        		case 2:
	                {
	                    System.out.println("\n Return Menu Press 1");
	                    s1 = input.nextInt();
	                    break;
	                }

	        }
	        System.out.println("\n Main Menu Press 0");
	        s1 = input.nextInt();

	    break;
	        }
	        }
	            }
		}
}
		

		
       