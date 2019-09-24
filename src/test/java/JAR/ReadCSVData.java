package JAR;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

import cucumber.api.Scenario;
import net.serenitybdd.core.pages.PageObject;

public class ReadCSVData extends PageObject {

	public void printScenarioName() {
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String CSV_PATH="C:\\Users\\Tejaswi\\HANDSON\\SELENIUM\\sample-gradle-serenity\\100 Sales Records.csv";
		  CSVReader reader = new CSVReader(new FileReader(CSV_PATH));
		  String [] csvCell;
		  //while loop will be executed till the last line In CSV.
		  while ((csvCell = reader.readNext()) != null) {   
		   String Region = csvCell[0];
		   String Country = csvCell[1];
		     System.out.println(Region);
		 }

		
		
		

	}

}
