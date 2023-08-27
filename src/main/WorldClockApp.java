package main;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorldClockApp {

	

	private final static ZoneId BRISBANE = ZoneId.of("Australia/Brisbane");
	private final static ZoneId DUBLIN = ZoneId.of("Europe/Dublin");
	private final static ZoneId SACRAMENTO = ZoneId.of("America/Los_Angeles");

	public static void main(String[] args) {
		

		// first we need to capture what the time is at this exact moment...
		ZonedDateTime zonedDateTimeBrisbane = ZonedDateTime.now(BRISBANE);
		ZonedDateTime zonedDateTimeDublin = ZonedDateTime.now(DUBLIN);
		ZonedDateTime zonedDateTimeSacramento = ZonedDateTime.now(SACRAMENTO);

		// from here you will need to create three system outs to print out the times and dates
		System.out.println("The Time in Brisbane is: " +zonedDateTimeBrisbane);
		System.out.println("The Time in Dublin is: " +zonedDateTimeDublin);
		System.out.println("The Time in Sacramento is: " +zonedDateTimeSacramento);
		
		
		/*ZonedDateTime brisbaneTimeInDublin = zonedDateTimeBrisbane.withZoneSameLocal(DUBLIN);
		ZonedDateTime brisbaneTimeInSacramento = zonedDateTimeBrisbane.withZoneSameLocal(SACRAMENTO);
		*/
		
		// after we grabbed the time in our coutnry, we need to format the output using our DateTimeFormatter...
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		// we need to format it in a way that is easily readable, for this assignment, use FormatStyle.MEDIUM
		System.out.println("Formatted Brisbane time: " + zonedDateTimeBrisbane.format(formatter));
		System.out.println("Formatted Dublin time: " + zonedDateTimeDublin.format(formatter));
		System.out.println("Formatted Sacramento time: " + zonedDateTimeSacramento.format(formatter));
		

	}

}