import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		// Time
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate));
		
		// Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));
		
		// Day of week
		SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
		System.out.println(dayOfWeekFormat.format(currentDate));

		// Clock format
		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
		System.out.println(clockFormat.format(currentDate));
	}	

}
