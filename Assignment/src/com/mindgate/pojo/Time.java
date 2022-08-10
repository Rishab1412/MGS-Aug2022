package com.mindgate.pojo;

public class Time 
{
	private int hours;
	private int minutes;
	 

	public void settime(int hours,int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public  void showtime()
	{
		System.out.println("Hours ::" + hours + "Minutes ::" + minutes);
	}
	
	public  Time sum(Time time)
	{
		Time t =new Time();
		
		int totalHours = this.hours + time.hours;
		int totalminutes = this.minutes + time.minutes;
		
		t.settime(totalHours, totalminutes);
		return t;
	}
	
}
	