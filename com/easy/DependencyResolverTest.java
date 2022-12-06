package com.easy;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class DependencyResolverTest {

	@Test
	public void test() {
		DependencyResolver dr = new DependencyResolver();
		assertEquals("==1.0.0", dr.getResolve("==1.0.0"));
	}
	
	@Test
	public void test2() {
		DependencyResolver dr = new DependencyResolver();
		assertEquals(">1.0.0", dr.getResolve(">=1.0.0, >1.0.0"));
	}
	
	@Test
	public void test3() {
		DependencyResolver dr = new DependencyResolver();
		assertEquals(">1.20.0, <2.0.0", dr.getResolve("<2, >=1.2.5, >=1.3, >1.20.0"));
	}
//	public void test() {
//		final String regex = "^([\\=><]*)([0-9]+).([0-9]+).([0-9]+)$";
//        final String input = ">=1.0.0, >1.0.0";
//        
//        String[] datas = input.split(",");
//        String Result = "No solution";
//        if(datas.length == 1) {
////        	return input;
//        	Result = input;
//        	System.out.println("Full match: " + Result);
//        }
//        
//        String minR = null;
//        String maxR = null;
//        
//        boolean hasMin = false;
//        String minOp = null;
//        int minMajor = 0;
//        int minMinor = 0;
//        int minMicro = 0;
//        
//        boolean hasMax = false;
//        String maxOp = null;
//        int maxMajor = 0;
//        int maxMinor = 0;
//        int maxMicro = 0;
//        
//        boolean hasEqu = false;
//        int eqMajor = 0;
//        int eqMinor = 0;
//        int eqMicro = 0;
//        
//        for(int i = 0; i < datas.length; i++) {
//	        final Pattern pattern = Pattern.compile(regex);
//	        final Matcher matcher = pattern.matcher(datas[i]);
//	        
//	        if (matcher.find()) {
//	        	System.out.println("Full match: " + matcher.group(0));
//	        	String operation = matcher.group(1);
//	        	System.out.println("operation: " + operation);
//	        	int major = Integer.parseInt(matcher.group(2));
//	        	int minor = Integer.parseInt(matcher.group(3));
//	        	int micro = Integer.parseInt(matcher.group(4));
//	            System.out.println("major: " + major);
//	            System.out.println("minor: " + minor);
//	            System.out.println("micro: " + micro);
//	            
//	            if(operation.equals(">=") || operation.equals(">")) {
//	            	if(hasMin == false) {
//	            		minMajor = major;
//	            		minMinor = minor;
//	            		minMicro = micro;
//	            		minOp = operation;
//	            		hasMin = true;
//	            	} else {
//	            		if(major > minMajor) {
//	            			minMajor = major;
//		            		minMinor = minor;
//		            		minMicro = micro;
//		            		minOp = operation;
//	            		} else if(major == minMajor && minor > minMinor) {
//	            			minMajor = major;
//		            		minMinor = minor;
//		            		minMicro = micro;
//		            		minOp = operation;
//	            		} else if(major == minMajor && minor == minMinor && micro > minMicro) {
//	            			minMajor = major;
//		            		minMinor = minor;
//		            		minMicro = micro;
//		            		minOp = operation;
//	            		} else if(major == minMajor && minor == minMinor && micro == minMicro 
//	            				&& operation.equals(">")) {
//	            			minOp = operation;
//	            		}
//	            	}
//	            } else if (operation.equals("<=") || operation.equals("<")) {
//	            	if(hasMax == false) {
//	            		maxMajor = major;
//	            		maxMinor = minor;
//	            		maxMicro = micro;
//	            		maxOp = operation;
//	            		hasMax = true;
//	            	} else {
//	            		if(maxMajor > major) {
//	            			maxMajor = major;
//	            			maxMinor = minor;
//	            			maxMicro = micro;
//	            			maxOp = operation;
//	            		} else if(major == maxMajor && maxMinor > minor) {
//	            			maxMajor = major;
//	            			maxMinor = minor;
//	            			maxMicro = micro;
//	            			maxOp = operation;
//	            		} else if(major == maxMajor && minor == maxMinor && maxMicro > micro) {
//	            			maxMajor = major;
//	            			maxMinor = minor;
//	            			maxMicro = micro;
//	            			maxOp = operation;
//	            		} else if(major == maxMajor && minor == maxMinor && micro == maxMicro 
//	            				&& operation.equals("<")) {
//	            			maxOp = operation;
//	            		}
//	            	}
//	            } else if(operation.equals("==")){
//	            	if(hasEqu == false) {
//	            		eqMajor = major;
//	                    eqMinor = minor;
//	                    eqMicro = micro;
//	                    hasEqu = true;
//	            	} else {
//	            		if(eqMajor != major||
//		                    eqMinor != minor||
//		                    eqMicro != micro) {
//	            			Result = "No solution";
//	            			break;
//	            		}
//	            	}
//	            }
//	            
//	        }
//        }
//        if(hasEqu == true && Result == "No solution") {
//        	System.out.println("Result: " + Result);
////        	return Result;
//        } 
//        if(hasEqu == true && hasMin==false && hasMax == false) {
//        	Result = "=="+eqMajor+"."+eqMinor+"."+eqMicro;
//        }
//        if((hasEqu && hasMin) &&
//           (eqMajor < minMajor || 
//    	   (eqMajor == minMajor && eqMinor < minMinor) ||
//    	   (eqMajor == minMajor && eqMinor == minMinor && eqMicro < minMicro))) {
//        		Result = "No solution";
//        		System.out.println("Result: " + Result);
////        	return Result;
//        }
//        if((hasEqu && hasMax) &&
//           (eqMajor > maxMajor || 
//    	   (eqMajor == maxMajor && eqMinor > maxMinor) ||
//    	   (eqMajor == maxMajor && eqMinor == maxMinor && eqMicro > maxMicro))) {
//        		Result = "No solution";
//        		System.out.println("Result: " + Result);
////        	return Result;
//        } 
//        if(hasMin && hasEqu==false && hasMax==false) {
//        	Result = minOp+minMajor+"."+minMinor+"."+minMicro;
//        }
//        if(hasMax && hasEqu==false && hasMin==false) {
//        	Result = maxOp+maxMajor+"."+maxMinor+"."+maxMicro;
//        }
//        
//        if((hasMax && hasMin) &&
//        	((maxMajor < minMajor) ||
//        	(maxMajor == minMajor && maxMinor < minMinor) ||
//        	(maxMajor == minMajor && maxMinor == minMinor && maxMicro == minMicro))){
//        	Result = "No solution";
//    		System.out.println("Result: " + Result);
////    	return Result;
//        }
//        
//        if(hasMax && hasMin && hasEqu) {
//        	Result = "=="+eqMajor+"."+eqMinor+"."+eqMicro;
//        	System.out.println("Result: " + Result);
////        	return Result;
//        }
//        Result = minOp+minMajor+"."+minMinor+"."+minMicro + ", "+ 
//        			maxOp+maxMajor+"."+maxMinor+"."+maxMicro;
//        System.out.println("Result: " + Result);
////		return input;
//	}

}
