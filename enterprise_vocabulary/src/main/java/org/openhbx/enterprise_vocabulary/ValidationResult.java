package org.openhbx.enterprise_vocabulary;

import java.util.List;

/**
 *
 * @author tevans
 */
public interface ValidationResult {
  public List<ValidationError> getErrors();
  public Boolean isValid();
}