import java.util.LinkedList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class TrainTimeTable {
public static void main(String args[]){
	//create a linked list
	LinkedList<Station> schedule = new LinkedList<Station>();
		Calendar calendar1 = new GregorianCalendar(0,0,1,20,30);
		Calendar calendar2 = new GregorianCalendar(0,0,2,6,0);
		Calendar calendar3 = new GregorianCalendar(0,0,2,6,35);
		Calendar calendar4 = new GregorianCalendar(0,0,2,16,0);
		Calendar calendar5 = new GregorianCalendar(0,0,2,17,30);
		Calendar calendar6 = new GregorianCalendar(0,0,2,23,0);
		Calendar calendar7 = new GregorianCalendar(0,0,2,23,59);
		Calendar calendar8 = new GregorianCalendar(0,0,3,8,0);
		Calendar calendar9 = new GregorianCalendar(0,0,3,8,25);
		Calendar calendar10 = new GregorianCalendar(0,0,3,20,45);
		Calendar calendar11 = new GregorianCalendar(0,0,3,22,30);
		Calendar calendar12 = new GregorianCalendar(0,0,4,5,02);
		Calendar calendar13 = new GregorianCalendar(0,0,4,5,42);
		Calendar calendar14 = new GregorianCalendar(0,0,4,15,35);
		Calendar calendar15 = new GregorianCalendar(0,0,4,16,10);
		Calendar calendar16 = new GregorianCalendar(0,0,5,0,18);
		Calendar calendar17 = new GregorianCalendar(0,0,5,0,48);
		Calendar calendar18 = new GregorianCalendar(0,0,5,9,30);
		Station Vancouver = new Station(calendar1,calendar1, 1, "Vancouver");
		schedule.add(Vancouver);
		Station Kamloops = new Station(calendar2,calendar3, 2, "Kamloops");
		schedule.add(Kamloops);
		Station Jasper = new Station(calendar4,calendar5, 2, "Jasper");
		schedule.add(Jasper);
		Station Edmonton = new Station(calendar6,calendar7, 2, "Edmonton");
		schedule.add(Edmonton);
		Station Saskatoon = new Station(calendar8,calendar9, 3, "Saskatoon");
		schedule.add(Saskatoon);
		Station Winnipeg = new Station(calendar10,calendar11, 3, "Winnipeg");
		schedule.add(Winnipeg);
		Station SiouxLookout = new Station(calendar12,calendar13, 4, "Sioux Lookout");
		schedule.add(SiouxLookout);
		Station Hornepayne = new Station(calendar14,calendar15, 4, "Hornepayne");
		schedule.add(Hornepayne);
		Station Capreol = new Station(calendar16,calendar17, 5, "Capreol");
		schedule.add(Capreol);
		Station Toronto = new Station(calendar18,calendar18, 5, "Toronto");
		schedule.add(Toronto);
	public void delay(Station station, int minute){
		if(station.getCity()== "Vancouver"){
			Calendar calendar = Vancouver.getArrivalDate();
			calendar.add(minute, minute);
			Vancouver.setArrivalDate(calendar);
			Vancouver.setDepartureDate(calendar);
			Vancouver.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(Kamloops,minute);
		if (station == Kamloops){
			calendar = Kamloops.getArrivalDate();
			calendar.add(minute, minute);
			Kamloops.setArrivalDate(calendar);
			calendar.add(minute, 35);
			Kamloops.setDepartureDate(calendar);
			Kamloops.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(Jasper,minute);	
		}if (station == Jasper){
			calendar = Jasper.getArrivalDate();
			calendar.add(minute, minute);
			Jasper.setArrivalDate(calendar);
			calendar.add(minute, 90);
			Jasper.setDepartureDate(calendar);
			Jasper.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(Edmonton,minute);
		}if (station == Edmonton){
			calendar = Edmonton.getArrivalDate();
			calendar.add(minute, minute);
			Edmonton.setArrivalDate(calendar);
			calendar.add(minute, 59);
			Edmonton.setDepartureDate(calendar);
			Edmonton.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(Saskatoon,minute);
		}if (station == Saskatoon){
			calendar =Saskatoon.getArrivalDate();
			calendar.add(minute, minute);
			Saskatoon.setArrivalDate(calendar);
			calendar.add(minute, 25);
			Saskatoon.setDepartureDate(calendar);
			Saskatoon.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(Winnipeg,minute);
		}if (station == Winnipeg){
			calendar = Winnipeg.getArrivalDate();
			calendar.add(minute, minute);
			Winnipeg.setArrivalDate(calendar);
			calendar.add(minute, 150);
			Winnipeg.setDepartureDate(calendar);
			Winnipeg.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(SiouxLookout,minute);
		}if (station == SiouxLookout){
			calendar = SiouxLookout.getArrivalDate();
			calendar.add(minute, minute);
			SiouxLookout.setArrivalDate(calendar);
			calendar.add(minute, 40);
			SiouxLookout.setDepartureDate(calendar);
			SiouxLookout.setDay(calendar.get(Calendar.DAY_OF_MONTH));				delay(Hornepayne,minute);
		}if (station == Hornepayne){
			calendar = Hornepayne.getArrivalDate();
			calendar.add(minute, minute);
			Hornepayne.setArrivalDate(calendar);
			calendar.add(minute, 35);
			Hornepayne.setDepartureDate(calendar);
			Hornepayne.setDay(calendar.get(Calendar.DAY_OF_MONTH));delay(Capreol,minute);
		}if (station == Capreol){
			calendar = Capreol.getArrivalDate();
			calendar.add(minute, minute);
			Capreol.setArrivalDate(calendar);
			calendar.set(minute, 40);
			Capreol.setDepartureDate(calendar);
			Capreol.setDay(calendar.get(Calendar.DAY_OF_MONTH));
			delay(Toronto,minute);
		}if (station == Toronto){
			calendar = Toronto.getArrivalDate();
			calendar.add(minute, minute);
			Toronto.setArrivalDate(calendar);
			Toronto.setDepartureDate(calendar);
			Toronto.setDay(calendar.get(Calendar.DAY_OF_MONTH));
		}
	}
		public void displaySchedule(){
			System.out.format("%14s%7s%9s%3s", "Station", "Arrival", "Departure", "Day");
			System.out.format("%14s%7s%9s%3s", Vancouver.getCity(), null , Vancouver.getDeparture(), Vancouver.getDay());
			System.out.format("%14s%7s%9s%3s", Kamloops.getCity(), Kamloops.getArrival(), Kamloops.getDeparture(), Kamloops.getDay());
			System.out.format("%14s%7s%9s%3s", Jasper.getCity(), Jasper.getArrival(), Jasper.getDeparture(), Jasper.getDay());
			System.out.format("%14s%7s%9s%3s", Edmonton.getCity(), Edmonton.getArrival(), Edmonton.getDeparture(), Edmonton.getDay());
			System.out.format("%14s%7s%9s%3s", Saskatoon.getCity(), Saskatoon.getArrival(), Saskatoon.getDeparture(), Saskatoon.getDay());
			System.out.format("%14s%7s%9s%3s", Winnipeg.getCity(), Winnipeg.getArrival(), Winnipeg.getDeparture(), Winnipeg.getDay());
			System.out.format("%14s%7s%9s%3s", SiouxLookout.getCity(), SiouxLookout.getArrival(), SiouxLookout.getDeparture(), SiouxLookout.getDay());
			System.out.format("%14s%7s%9s%3s", Hornepayne.getCity(), Hornepayne.getArrival(), Hornepayne.getDeparture(), Hornepayne.getDay());
			System.out.format("%14s%7s%9s%3s", Capreol.getCity(), Capreol.getArrival(), Capreol.getDeparture(), Capreol.getDay());
			System.out.format("%14s%7s%9s%3s", Toronto.getCity(), Toronto.getArrival(), null, Toronto.getDay());
}
}
}}
