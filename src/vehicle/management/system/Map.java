package vehicle.management.system;


import java.net.URL;
import javax.swing.JOptionPane;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class Map {

    private static Document loadXMLDoc(String url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        return factory.newDocumentBuilder().parse(new URL(url).openStream());
    }

	public static String GetDistance(String origin, String destination) throws Exception
        {
            String url = "http://maps.googleapis.com/maps/api/distancematrix/xml?origins=" +
              origin + "Srilanka&destinations=" + destination +
              "Srilanka&mode=driving&sensor=false&language=en-EN&units=metric";

                Document xmldoc = loadXMLDoc(url);
                xmldoc.getDocumentElement().normalize();
                String rootNode =  xmldoc.getDocumentElement().getNodeName();
                String statusVal = (String)xmldoc.getElementsByTagName("status").item(1).getChildNodes().item(0).getNodeValue();
                
            	if(statusVal.equals("OK"))
            	{
            		String nodeDistance = (String)xmldoc.getElementsByTagName("text").item(1).getChildNodes().item(0).getNodeValue();
            		System.out.println(nodeDistance);
                        
                        //int x=3;
                        String nd = nodeDistance;
                        String[] parts = nd.split(" ");
                        int jjj= Integer.parseInt(parts[0]);
                        int time = jjj*3;
                        JOptionPane.showMessageDialog(null,"The distance is "+nodeDistance +"\n  Time taken to reach the destination is "+time+" minutes");
                        
                        
                      
            	}
            	else
            	{
            		return "There has been an error";
            	}
                return "error";
        }
	

}
