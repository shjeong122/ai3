package p535;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(now));
		
		
	}

}
