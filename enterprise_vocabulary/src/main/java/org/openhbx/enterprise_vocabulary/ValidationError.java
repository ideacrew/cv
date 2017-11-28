package org.openhbx.enterprise_vocabulary;

/**
 *
 * @author tevans
 */
public interface ValidationError {
  public Integer getLineNumber();
  public Integer getColumnNumber();
  public String getMessage();
  public String getFullErrorMessage();
}
