package org.openhbx.enterprise_vocabulary;

import org.openhbx.enterprise_vocabulary.xml.XmlValidator;

/**
 *
 * @author tevans
 */
public class ValidatorFactory {
  private static Validator getValidator() {
    return new XmlValidator();
  }  
}
