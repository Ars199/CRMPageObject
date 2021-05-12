import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /*String xmlFileName = "testng.xml";

        List<XmlSuite> suite;
        try
        {
            suite = (List <XmlSuite>)(new Parser(xmlFileName).parse());

            testng.setXmlSuites(suite);
            testng.run();
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/
    }
}
