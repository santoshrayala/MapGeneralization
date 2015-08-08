package cup;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author Bheem
 */
public class CUP{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
          try {
 
	File fXmlFile = new File("C:\\Users\\Bheem\\Documents\\NetBeansProjects\\CUP\\src\\GML.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        //System.out.println("Root Element : "+ doc.getDocumentElement().getNodeName());
        al=xmlHandler.handleChannelTag(doc);
       Map m = new Map(10,20,40,50);
        Map.readPoints(al);
     }
         catch(ParserConfigurationException | SAXException | IOException e){
             e.printStackTrace();
         }   
        
    } 
}