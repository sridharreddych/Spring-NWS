import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.springframework.util.StringUtils;

/**
 * Simple Java program to demonstrate How to convert List or Set into String in Java. 
 * Spring framework's StringUtils class provide methods like 
 * collectionToCommaDelimitedString and collectionToDelimitedString
 * which can convert any Java collection class like ArrayList or HashSet 
 * into comma delimited String.
 *
 * @author Javin
 */
public class CollectionToString{
  
  
    public static void main(String args[]) {
      
        //List with multiple Strings for testing
        List<String> frameworks = Arrays.asList("Spring MVC", "Struts 2.0", "Velocity", "Wicket");
      
        //let's convert this list into comma separated String
        String commaDelimitedString = StringUtils.collectionToCommaDelimitedString(frameworks);
        System.out.println("commaDelimitedString"+commaDelimitedString);
      
        //list to colon delimited String
        String colonDelimitedString = StringUtils.collectionToDelimitedString(frameworks, ":");
        System.out.println("colonDelimitedString"+colonDelimitedString);
      
        //List to pipe delimited String
        String pipeDelimitedString = StringUtils.collectionToDelimitedString(frameworks, "|");
        System.out.println("pipeDelimitedString"+pipeDelimitedString);
      
        //Now let's convert Set into String in Java
        HashSet<String> frameworkSet = new HashSet(frameworks);
      
        //HashSet to comma separated String
        commaDelimitedString = StringUtils.collectionToCommaDelimitedString(frameworkSet);
        System.out.println("commaDelimitedString"+commaDelimitedString);
      
        //Set to delimiter separated String using Spring
        colonDelimitedString = StringUtils.collectionToDelimitedString(frameworkSet, ":");
        System.out.println("colonDelimitedString"+colonDelimitedString);
      
        //Set to pipe delimited String using Spring framework StringUtils
        pipeDelimitedString = StringUtils.collectionToDelimitedString(frameworkSet, "|");
        System.out.println("pipeDelimitedString"+pipeDelimitedString);
      
    }
}

