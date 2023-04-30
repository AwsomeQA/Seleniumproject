package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadProp {
	static Properties pro=null;
	static FileInputStream fis=null;
	static Map<String,String> map=new HashMap<>();
	static {
		try {
			fis=new FileInputStream(new File("C:\\eclipse-workspace\\VwoProject\\config.properties"));
			pro=new Properties();
			pro.load(fis);
			for(Object key:pro.keySet()) {
				map.put(String.valueOf(key),pro.getProperty(String.valueOf(key)));
			}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(Objects.nonNull(fis))
			{
				try {
					fis.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	
	}

	public static String readconfig(String key) throws Exception {
		if(key==null && pro.getProperty(key)==null)
		{
			throw new Exception (pro.getProperty(key)+" not found");
		}
		else {
		return map.get(key);
		}
	}
}
