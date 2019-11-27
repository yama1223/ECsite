package com.internousdev.hukusyuu2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public String getDate(){
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd H:mm:ss");
		
		return simpleDateFormat.format(date);
	}

}
