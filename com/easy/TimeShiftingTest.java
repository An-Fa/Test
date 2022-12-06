package com.easy;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TimeShiftingTest {

	private static final String DAY = "days";
	private static final String HOUR = "hours";
	private static final String MIN = "minutes";
	private static final String SEC = "seconds";
	
	@Test
	public void test() throws JsonParseException, JsonMappingException, ParseException, IOException {
		TimeShifting ts = new TimeShifting();
		assertEquals("2021/10/15 00:00:00", ts.getTime("(2021, 10, 5, 0, 0, 0) {\"days\": 10}"));
	}
	
	@Test
	public void test2() throws JsonParseException, JsonMappingException, ParseException, IOException {
		TimeShifting ts = new TimeShifting();
		assertEquals("2021/12/01 00:00:00", ts.getTime("(2021, 11, 30, 23, 59, 59) {\"seconds\": 1}"));
	}
	
	@Test
	public void test3() throws JsonParseException, JsonMappingException, ParseException, IOException {
		TimeShifting ts = new TimeShifting();
		assertEquals("2022/01/03 04:01:20", ts.getTime("(2021, 12, 30, 20, 0, 0) {\"hours\": 80, \"seconds\": 80}"));
	}
	
//	public void test() throws ParseException, JsonParseException, JsonMappingException, IOException {
//		Pattern sp = Pattern.compile("^([^\\.]+\\)) ([^\\.]+)$");
//		Matcher m = sp.matcher("(2021, 12, 30, 20, 0, 0) {\"hours\": 80, \"seconds\": 80}");
//		boolean isValid = m.matches();
//		System.out.println(isValid);
//		System.out.println(m.group(1));
//		System.out.println(m.group(2));
//		
//		final String regex1 = "([^\\(]+[^\\)])";
//        final String string = m.group(1);
//        
//        final Pattern pattern1 = Pattern.compile(regex1);
//        final Matcher matcher1 = pattern1.matcher(string);
//        
//        Map<String, Integer> bonusResult = new ObjectMapper().readValue(m.group(2), HashMap.class);
//        Map<String, Integer> bonus = initMap(bonusResult);
//        
//        if (matcher1.find()) {
//        	String dateStr = matcher1.group(0);
//        	String[] dateDatas = dateStr.split(",");
//        	
//        	Calendar cal = Calendar.getInstance();
//        	cal.set(Calendar.YEAR, Integer.parseInt(dateDatas[0].trim()));
//        	cal.set(Calendar.MONTH, Integer.parseInt(dateDatas[1].trim())-1);
//        	cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateDatas[2].trim()) + bonus.get(DAY));
//        	cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(dateDatas[3].trim()) + bonus.get(HOUR));
//        	cal.set(Calendar.MINUTE, Integer.parseInt(dateDatas[4].trim()) + bonus.get(MIN));
//        	cal.set(Calendar.SECOND, Integer.parseInt(dateDatas[5].trim()) + bonus.get(SEC));
//        	
//        	System.out.println(Integer.parseInt(dateDatas[0].trim()));
//        	System.out.println(Integer.parseInt(dateDatas[1].trim()));
//        	System.out.println(Integer.parseInt(dateDatas[2].trim()));
//        	System.out.println(Integer.parseInt(dateDatas[3].trim()));
//        	System.out.println(Integer.parseInt(dateDatas[4].trim()));
//        	System.out.println(Integer.parseInt(dateDatas[5].trim()));
//        	SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        	
//        	System.out.println(isoFormat.format(cal.getTime()));
//        }
//        
//        
//	}

	private Map<String, Integer> initMap(Map<String, Integer> bonus) {
		Map<String, Integer> result = new HashMap<>();
		if(bonus.get(DAY) != null) {
			result.put(DAY, bonus.get(DAY));
		} else {
			result.put(DAY, 0);
		}
		if(bonus.get(HOUR) != null) {
			result.put(HOUR, bonus.get(HOUR));
		} else {
			result.put(HOUR, 0);
		}
		if(bonus.get(MIN) != null) {
			result.put(MIN, bonus.get(MIN));
		} else {
			result.put(MIN, 0);
		}
		if(bonus.get(SEC) != null) {
			result.put(SEC, bonus.get(SEC));
		} else {
			result.put(SEC, 0);
		}
        return result;
	}
	
//	@Test
//	public void test2() {
//		final String regex = "([^\\(]+[^\\)])";
//        final String string = "(2021, 10, 5, 0, 0, 0)";
//        
//        final Pattern pattern = Pattern.compile(regex);
//        final Matcher matcher = pattern.matcher(string);
//        
//        if (matcher.find()) {
//            System.out.println("Full match: " + matcher.group(0));
//        }
//	}

}
