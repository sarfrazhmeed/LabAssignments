public class Date(){

	int day;
	int month;
	int year;
	
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	
	}

	Public Date(Date other){
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}

	

	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Date other = (Date) obj;
		return this.day == other.day && this.month == other.month && this.year == other.year;  }

	public void showDate() {
        System.out.println(day + "/" + month + "/" + year);
    }	

	public getDay(){
	     return day;
	}
	public setDay(int day){
	     this.day=day;
	}
	
	public getMonth(){
	     return month;
	}
	public setMonth(int month){
	     this.month=month;
	}
	public getYear(){
	     return year;
	}
	public setYear(int year){
	     this.year=year;
	}
	
	
	}