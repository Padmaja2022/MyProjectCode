import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/*
 * Author      PadmajaLanka
 * Date        3/21/2022
 * Description  1. How to print current date and time.
                2.How to calculate duration between two times or date.
                3.How to change the format of time and date.
 * 
 */


public class DateandTimeexamples {



	//1. 	How to print current date and time.
	private static void dateTimes() {

		// dates , e.g. 2014-02-18

		//the current date

		LocalDate currentDate = LocalDate.now();

		//2014-02-10

		LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY,10);

		//months values start at 1(2014,8,1)

		LocalDate  firstAug2014 = LocalDate.of(02014, 8, 1);

		//times,eg 19:12:30.733

		LocalTime currentTime  = LocalTime.now();//current time
		LocalTime midday = LocalTime.of(12, 0); // 12:00
		LocalTime afterMidday = LocalTime.of(13, 30, 15); // 13:30:15

		//12345th second of day(3:25:45)
		LocalDateTime fromSecondsOfDay = LocalDateTime.now();

		//2014 -12-24 12:00

		LocalDateTime christmas2014 = LocalDateTime.of(2014, Month.DECEMBER, 24, 12, 0);


		System.out.println("date/time creation: currentDate: " +currentDate);
		System.out.println("date/time creation: currentTime: " + currentTime);

	}


	//2.2.How to calculate duration between two times or date.
	private static void periodsAndDurations() {

		//periods

		LocalDate firstDate = LocalDate.of(2010, 5, 17); // 2010-05-17
		LocalDate secondDate = LocalDate.of(2015, 3, 7); // 2015-03-07
		Period period = Period.between(firstDate, secondDate);

		int days = period.getDays(); // 18
		int months = period.getMonths(); // 9
		int years = period.getYears(); // 4
		boolean isNegative = period.isNegative(); // false

		Period twoMonthsAndFiveDays = Period.ofMonths(2).plusDays(5);
		LocalDate sixthOfJanuary = LocalDate.of(2014, 1, 6);

		//add two months and five days to 2014-01-06, result is 2014-03-11
		LocalDate eleventhOfMarch = sixthOfJanuary.plus(twoMonthsAndFiveDays);

		//durations 
		Instant firstInstant= Instant.ofEpochSecond( 1294881180 ); // 2011-01-13 01:13
		Instant secondInstant = Instant.ofEpochSecond(1294708260); // 2011-01-11 01:11

		Duration between = Duration.between(firstInstant, secondInstant);

		// negative because firstInstant is after secondInstant (-172920)
		long seconds = between.getSeconds();
		// get absolute result in minutes (2882)
		long absoluteResult = between.abs().toMinutes();
		// two hours in seconds (7200)
		long twoHoursInSeconds = Duration.ofHours(2).getSeconds();
		System.out.println("periodsAndDurations: days: " + days);
		System.out.println("periodsAndDurations: months: " + months);
		System.out.println("periodsAndDurations: seconds: " + seconds);
		System.out.println("periodsAndDurations: absoluteResult: " + absoluteResult);
		System.out.println("periodsAndDurations: twoHoursInSeconds: " + twoHoursInSeconds);





	}



	public static void main(String[] args) {

		dateTimes();

		periodsAndDurations();


	}



}
