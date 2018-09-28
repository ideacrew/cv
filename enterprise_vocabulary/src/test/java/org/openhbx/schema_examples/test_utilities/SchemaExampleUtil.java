package org.openhbx.schema_examples.test_utilities;

import java.io.InputStream;
import java.nio.file.Paths;
import junit.framework.Assert;
import org.openhbx.enterprise_vocabulary.ValidationResult;
import org.openhbx.enterprise_vocabulary.xml.XmlValidator;

/**
 *
 * @author tevans
 */
public class SchemaExampleUtil {
  private static String BASE_PATH = "schema_examples";
  
  public static void assertExampleValid(String examplePath) {
    InputStream example = getXMLExample(examplePath);
    XmlValidator validator = new XmlValidator();
    ValidationResult vResult = validator.validateXML(example);
    Assert.assertTrue(vResult.isValid());
  }
  
  public static ValidationResult getExampleValidationResult(String examplePath) {
    InputStream example = getXMLExample(examplePath);
    XmlValidator validator = new XmlValidator();
    return validator.validateXML(example);
  }
  
  public static InputStream getXMLExample(String examplePath) {
    return SchemaExampleUtil.class.getClassLoader().getResourceAsStream(Paths.get(BASE_PATH, examplePath).toString());
  }
}
