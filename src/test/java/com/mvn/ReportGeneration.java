package com.mvn;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportGeneration {
	
	 public static void generateJVMReport(String json) {
		 
		 File file=new File("C:\\Users\\user\\eclipse-workspace\\ProjectMaven\\ReportGen");
		 
		 Configuration configuration=new Configuration(file, "projJan");
		 
		 configuration.addClassifications("platform","win-10");
		 configuration.addClassifications("brower","chrome");
		 configuration.addClassifications("Browerversion","9.8");
		 configuration.addClassifications("sprintNo","22");

		 
		 List<String> li=new ArrayList<String>();
		 li.add(json);

		 ReportBuilder builder=new ReportBuilder(li, configuration);
		 builder.generateReports();

	} 

}
