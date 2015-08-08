/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cup;
import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
public class xmlHandler {
    public static ArrayList handleChannelTag(Document doc) {
        ArrayList pointsHolder = new ArrayList();
        NodeList nl = doc.getElementsByTagName("gml:coordinates");
        double temp;
        for(int j=0; j< nl.getLength(); j++)
        {
            String[] ary = nl.item(j).getTextContent().split(" ");
            
            for (String ary1 : ary) {
                String[] ary2 = ary1.split(",");
                    for (String ary3 : ary2)
                    {
                            temp = Double.parseDouble(ary3);
                            pointsHolder.add(temp);
            }
                                                
        }
            pointsHolder.add(";");
                             
        }
        return pointsHolder;
        //Map.SwingDoc(pointsHolder);
    }
}