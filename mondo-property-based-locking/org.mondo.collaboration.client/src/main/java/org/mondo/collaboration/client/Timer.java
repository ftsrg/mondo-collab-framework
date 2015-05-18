package org.mondo.collaboration.client;

import java.util.concurrent.TimeUnit;

public class Timer {

	private static long startInitTime;
	private static long stopInitTime;
	
	private static long startDeleteTime;
	private static long stopDeleteTime;
	
	public static void startInitTimer()
	{
			startInitTime=System.currentTimeMillis();
	}
	
	public static void stopInitTimer()
	{
		stopInitTime=System.currentTimeMillis();
	}
	
	
	private static boolean deleteTimeStarted=false;
	public static void startDeleteTimer()
	{
		if(deleteTimeStarted==false)
		{
			startDeleteTime=System.currentTimeMillis();
			deleteTimeStarted=true;
		}
	}
	
	public static void stopDeleteTimer()
	{
		stopDeleteTime=System.currentTimeMillis();
		deleteTimeStarted=false;
	}
	
	public static void printDeleteElaspedTime()
	{
		long millis=stopDeleteTime-startDeleteTime;
		
		
		String output=String.format("%d min, %d sec", 
			    TimeUnit.MILLISECONDS.toMinutes(millis),
			    TimeUnit.MILLISECONDS.toSeconds(millis) - 
			    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
			);
		System.out.println("DeleteTime:");
		System.out.println(millis+"ms");
		System.out.println(output);
		
	}
	
	
	public static void printInitElaspedTime()
	{
		
		long millis=stopInitTime-startInitTime;
		
		
		String output=String.format("%d min, %d sec", 
			    TimeUnit.MILLISECONDS.toMinutes(millis),
			    TimeUnit.MILLISECONDS.toSeconds(millis) - 
			    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
			);
		System.out.println("InitTime:");
		System.out.println(millis+"ms");
		System.out.println(output);
	}
}
