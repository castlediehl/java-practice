
public class Date {

	private int month;
	private int date;
	private int year;
	
	public Date(int m, int d, int y) {
		month = m;
		date = d;
		year = y;
	}
	
	public void displayDate() {
		System.out.println(month + "/" + date + "/" + year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
