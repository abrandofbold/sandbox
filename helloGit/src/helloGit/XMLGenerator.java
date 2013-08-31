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
		int employees = 0;
		
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
			Element root = doc.createElement("Company");
			doc.appendChild(root);
	 
			// add employees (a formed nodeset by function employee)
			employee(doc,root,"1","Robert","Ritter","23","Integration Engineer");
			employee(doc,root,"2","Tom","River","26","Solution Architect");
			
			System.out.print(pNL(1)+"Employees to add: ");
			employees = Integer.parseInt(reader.readLine());
			
			for(int i=0;i<employees;i++){
				System.out.print(pNL(1)+"New Employee:");
				employeeInput(doc,root);
			}
	 
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
	
	public static void textNode(Document doc,Element node,String name,String value){
		Element element = doc.createElement(name);
		element.appendChild(doc.createTextNode(value));
		node.appendChild(element);
	}
	
	public static void employee(Document doc,Element root,String eid,String firstname,String lastname,String age,String title){
		Element employee = doc.createElement("Employee");
		root.appendChild(employee);
		
		employee.setAttribute("EID", eid);
		textNode(doc,employee,"First_Name", firstname);
		textNode(doc,employee,"Last_Name", lastname);
		textNode(doc,employee,"Age", age);
		textNode(doc,employee,"Title", title);
	}
	
	public static void employeeInput(Document doc,Element root) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Element employee = doc.createElement("Employee");
		root.appendChild(employee);
		
		System.out.print("Employee ID: ");
		employee.setAttribute("EID", reader.readLine());
		System.out.print("First Name: ");
		textNode(doc,employee,"First_Name", reader.readLine());
		System.out.print("Last Name: ");
		textNode(doc,employee,"Last_Name", reader.readLine());
		System.out.print("Age: ");
		textNode(doc,employee,"Age", reader.readLine());
		System.out.print("Title: ");
		textNode(doc,employee,"Title", reader.readLine());
	}
}
