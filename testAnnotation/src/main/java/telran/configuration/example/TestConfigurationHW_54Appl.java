package telran.configuration.example;

import java.util.Properties;
import java.io.FileInputStream;

import telran.configuration.Configuration;

public class TestConfigurationHW_54Appl {

	private static final String DEFAULT_FILE_NAME = "app.properties";

	public static void main(String[] args) throws Exception {
		String fileName = args.length > 0 ? args[0]: DEFAULT_FILE_NAME;
		TestConfigurationHW_55 testObj = new TestConfigurationHW_55();
		Properties properties = new Properties();
		properties.load(new FileInputStream(fileName));	
	
		
		Configuration config = new Configuration(testObj, properties);
		config.configInjection();
		System.out.println(testObj);

	}

}
