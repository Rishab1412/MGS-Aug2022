package com.mindgate.main;

import com.mindgate.pojo.*;
public class Assign 
{
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.settime(1, 20);
		
		Time t2 = new Time();
		t2.settime(1, 30);
		
		Time t3 = t2.sum(t1);
		
		t3.showtime();
	}

}

