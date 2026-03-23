public class Program {
	public static void main(String args[]) {
		Date d = new Date();
		Date d1 = new Date();
		int choice;
		
		do{
			System.out.println("Enter Choice : \n1. Set Date\n2. Add Days\n3. Add Months\n4. Add Years\n5. Compare Date\n6. Exit");
			choice = ConsoleInput.getInt();
			switch(choice) {
				case 1: {
					System.out.print("Enter Day : ");
					int day = ConsoleInput.getInt();
					System.out.print("Enter Month : ");
					int month = ConsoleInput.getInt();
					System.out.print("Enter Year : ");
					int year = ConsoleInput.getInt();
					
					d.setDate(day, month, year);
					break;
				}
				
				case 2:{
					System.out.println("Enter days to Add : ");
					int days = ConsoleInput.getInt();
					d.addDays(days);
					d.displayDate();
					break;
					}
				
				case 3:{
					System.out.println("Enter Months to Add : ");
					int month = ConsoleInput.getInt();
					d.addMonths(month);
					d.displayDate();
					break;
				}
				
				case 4:{
					System.out.println("Enter Years to Add : ");
					int years = ConsoleInput.getInt();
					d.addYears(years);
					d.displayDate();
					break;
				}
				case 5:{
					System.out.println("Enter date to Compare : ");
					System.out.print("Enter Day : ");
					int day = ConsoleInput.getInt();
					System.out.print("Enter Month : ");
					int month = ConsoleInput.getInt();
					System.out.print("Enter Year : ");
					int year = ConsoleInput.getInt();
					
					d1.setDate(day, month, year);
					if(d.compareDate(d1)==true) {
						System.out.println("Both the Dates are Equal!!");
					}else {
						System.out.println("Dates are not equal");
					}
					
					break;
			
				}
				
				case 6:
					System.out.println("Program Terminated");
					break;
				
				default: System.out.println("Enter Valid Choice");
			
			}
		}while(choice != 6);
	
	}
}



