public class Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
    	if (year >= 1000 && year <= 3000 && month >= 1 && month <= 12) {
            this.year = year;
            this.month = month;
            if (day > 0 && day <= getDaysInMonth()) {
                this.day = day;
                displayDate();
            } else {
                System.out.println("Invalid Day");
            }
        } else {
            System.out.println("Invalid Year or Month.");
        } 
    }
    
    public boolean isLeapYear(){
    	if((this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0) {
    		return true;
    	}return false;
    }
    
    public int getDaysInMonth(){
    	 int [] noOfDays = {29,31,28,31,30,31,30,31,31,30,31,30,31};
    	 if(this.month==2 && isLeapYear()) {
    		 return noOfDays[0];
    	 }
    	 return noOfDays[this.month];
    }
    
    public void addDays(int days){
    	this.day = this.day + days;
    	while(this.day > getDaysInMonth()) {
    		this.day = this.day - getDaysInMonth();
    		month++;
    		if(this.month>12){
    			this.month = 1;
    			year++;
    		}
    	}
    } 
 
    public void addMonths(int month) {
    	while(month > 0){
    		int daysInCurrentMonth = getDaysInMonth();
    		addDays(daysInCurrentMonth);
    		month--;
    	}
    }
    
    public void addYears(int year) {
    	while(year > 0) {
    		int currentMonth = 12;
    		addMonths(currentMonth);
    		year--;
    	}
    }
    
    public boolean compareDate(Date d1) {
    	if(this.year == d1.year && this.month == d1.month && this.day == d1.day) {
    		return true;
    	}
    	else 
    		return false;
    }
    
    public void displayDate() {
        System.out.println("Date is: " + this.day + "/" + this.month + "/" + this.year);
    }
    
}