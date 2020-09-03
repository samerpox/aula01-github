package calendar;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class date {
public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date d = Date.from(Instant.parse("2020-09-03T11:02:00z"));
	System.out.println(sdf.format(d));
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	cal.add(Calendar.HOUR_OF_DAY, 8);
	int minutes = cal.get(Calendar.MINUTE);
	int month = 1 + cal.get(Calendar.MONTH);
	System.out.println("Month: " + month );
	System.out.println("Minutes: " + minutes);
}
}
