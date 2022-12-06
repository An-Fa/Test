package com.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SymboToNumberTest {

	@Test
	public void test() {
		String input = "A=1,B=5:AABA";
		SymboToNumber sn = new SymboToNumber();
		assertEquals(6, sn.summary(input));
	}
	
	@Test
	public void test2() {
		String input = "A=1,B=5:4AB AB3 B2B";
		SymboToNumber sn = new SymboToNumber();
		assertEquals(448, sn.summary(input));
	}
//	public void test() {
//		String input = "A=1,B=5:4AB AB3 B2B";
//		String[] inputArr = input.split(":");
//		
//		
//		System.out.println(inputArr.length);
//		System.out.println(inputArr[0]);
//		
//		String[] inputTable = inputArr[0].split(",");
//		Map<String, Integer> inputMap = new HashMap<>();
//		parseAttribute(inputTable, inputMap);
//		
//		System.out.println(inputTable.length);
//		System.out.println(inputTable[0]);
//		
//		String[] inputDatas = inputArr[1].split(" ");
//		
//		System.out.println(inputDatas.length);
//		System.out.println(inputDatas[1]);
//		
//		int summary = 0;
//		for(int i = 0; i < inputDatas.length; i++) {
//			String data = inputDatas[i];
//			char[] chars = data.toCharArray();
//			int maxSize = chars.length;
//			boolean isOdd = chars.length%2==1? true: false; 
//			if(isOdd) {
//				maxSize = maxSize - 1;
//			}
//			
//			int tempResult = 0;
//			for(int j = 0; j < maxSize; ) {
//				String v1 = Character.toString(chars[j]);
//				String v2 = Character.toString(chars[j+1]);
//				
//				Integer result = parseValue(inputMap, v1);
//				Integer result2 = parseValue(inputMap, v2);
//				
//				int temp = 0;
//				if(result.intValue() < result2.intValue()) {
//					temp = result2.intValue() - result.intValue();
//				} else {
//					temp = result2.intValue() + result.intValue();
//				}
//				
//				tempResult = tempResult + temp;
//				j = j + 2;
//			}
//			
//			if(isOdd) {
//				String v = Character.toString(chars[chars.length - 1]);
//				Integer result = parseValue(inputMap, v);
//				tempResult = tempResult + result.intValue();
//			}
//			
//			if(i == 0)
//				summary = tempResult;
//			else 
//				summary = summary * tempResult;
//		}
//		return summary;
//	}

//	private Integer parseValue(Map<String, Integer> inputMap, String v1) {
//		Integer result = inputMap.get(v1);
//		if(result == null) {
//			result = Integer.parseInt(v1);
//		}
//		return result;
//	}
//
//	private void parseAttribute(String[] inputRule, Map<String, Integer> inputMap) {
//		for(int i = 0; i < inputRule.length; i++) {
//			String[] attr = inputRule[i].split("=");
//			inputMap.put(attr[0], Integer.parseInt(attr[1]));
//		}
//	}
	
	

}
