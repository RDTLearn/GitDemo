package JAR;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadXMLData {
	
	    private Document doc;
	    private String fileName;

	    public ReadXMLData(String fileName) {
	              this.fileName = fileName;
	    }

	    public String getData(String locator) {
	              SAXReader reader = new SAXReader();
	               try {
	                      doc = reader.read(fileName);
	              } catch (DocumentException e) {
	                      // e.printStackTrace();
	             }
	            String data = doc.selectSingleNode("//" + locator.replace('.', '/')).getText();                                
	            return data;
	    }

	    public static void main(String[] str) {
	            ReadXMLData readXml = new ReadXMLData("sample.xml");
	            String locator1 = readXml.getData("letter.signature");
	            System.out.println("signature:" +locator1);
	            String locator2 = readXml.getData("letter.salutation");
	            System.out.println("salutation:" +locator2);
	            

	}
}
