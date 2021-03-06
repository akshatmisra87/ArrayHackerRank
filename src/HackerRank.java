import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank {
	private Pattern pattern;

	private Matcher matcher;

	private String IPADDRESS_PATTERN =

			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +

					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +

					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +

					"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public HackerRank() {

		pattern = Pattern.compile(IPADDRESS_PATTERN);

	}

	public boolean validate(final String ipAddress) {

		matcher = pattern.matcher(ipAddress);

		return matcher.matches();

	}
	
	public static void main(String[] args)
	{
		HackerRank hr = new HackerRank();
		System.out.println(hr.validate("255.168.000.0"));
	}

}
