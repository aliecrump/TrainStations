import java.util.Calendar;

public class Station {
	private Calendar arrival;
	private Calendar departure;
	private int day;
	private String city;

	public Calendar getArrivalDate() {
		return arrival;
	}
	public Calendar getDepartureDate() {
        return departure;
    }
	public int getDay(){
		return day;
	}
	public Station(Calendar StartArrival, Calendar StartDeparture, int StartDay, String StartCity) {
        arrival = StartArrival;
        departure = StartDeparture;
        day = StartDay;
        city = StartCity;
	}
	public String getArrival(){
		return arrival.get(Calendar.HOUR_OF_DAY) + ":" + arrival.get(Calendar.MINUTE);
	}
	public String getCity(){
		return city;
	}
	public String getDeparture(){
		return departure.get(Calendar.HOUR_OF_DAY) + ":" + departure.get(Calendar.MINUTE);
	}
	public void setArrivalDate(Calendar arrival){
		this.arrival = arrival;
	}
	public void setCity(String city){
		this.city = city;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setDepartureDate(Calendar departure){
		this.departure = departure;
	}
}
