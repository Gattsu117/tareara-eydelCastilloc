package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Properties;

public class PropertyFile {
	private Properties properties;
	private   boolean isOpen;
	public PropertyFile() {
		super();
		properties = new Properties();
		isOpen = open();
	}
	
	public boolean open() {
		
		try {
			File file = new File("config-properties");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			properties.load(ois);
			ois.close();
			
			return true;
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		
		
		
		return false;
		
	}
	public String getProperty(String Key) {
		try {
			if(isOpen) {
				
			}
			return properties.getProperty(Key);
		}catch(Exception ee) {
			return"";
	
		}
	
	}
	
	public boolean setProperty(String key, String value) {
		try {
			
		}catch(Exception ee)
		return true;
	}
	
	
}
