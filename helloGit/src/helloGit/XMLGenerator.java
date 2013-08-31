package helloGit;

import java.io.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import static util.Printing.*;

public class XMLGenerator {
 
	public static void main(String argv[]) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String filename = ".xml";
		String overwrite = "Y";
		
		System.out.println("[[ XML Generator ]]"+pNL(1));
		
		System.out.print("Filename: ");
		filename = reader.readLine() + filename;
		
		System.out.println(pNL(0)+"System checking for "+filename+" in root directory.");
		
		File file = new File(filename);
 
		if (file.exists()){
			System.out.print("File already exists - overwrite? (Y/N): ");
			overwrite = reader.readLine();
		} else{
			System.out.print("File does not exist - new file to be created."+pNL(1));
		}
		
		if (overwrite.equals("Y")){
		    try {
	 
			// root elements
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Element rootElement = doc.createElement("company");
			doc.appendChild(rootElement);
	 
			// staff elements
			Element staff = doc.createElement("Staff");
			rootElement.appendChild(staff);
	 
			// set attribute to staff element
			staff.setAttribute("id", "1");
	 
			// firstname elements
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("yong"));
			staff.appendChild(firstname);
	 
			// lastname elements
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("mook kim"));
			staff.appendChild(lastname);
	 
			// nickname elements
			Element nickname = doc.createElement("nickname");
			nickname.appendChild(doc.createTextNode("mkyong"));
			staff.appendChild(nickname);
	 
			// salary elements
			Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode("100000"));
			staff.appendChild(salary);
	 
			// write the content into xml file
			Transformer xfm = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filename));
	 
			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);
	 
			xfm.transform(source, result);
	 
			System.out.println(pNL(1)+"File saved!");
	 
		    } catch (ParserConfigurationException pce) {
		    	pce.printStackTrace();
		    } catch (TransformerException tfe) {
		    	tfe.printStackTrace();
		    }
		}
			
		System.out.print(pNL(1)+"[[ / XML Generator ]]");
	}
}
