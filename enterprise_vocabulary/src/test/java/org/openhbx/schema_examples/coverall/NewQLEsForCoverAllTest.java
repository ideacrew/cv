package org.openhbx.schema_examples.coverall;

import org.junit.Test;
import org.junit.Assert;
import org.openhbx.enterprise_vocabulary.ValidationResult;
import org.openhbx.schema_examples.test_utilities.SchemaExampleUtil;

/**
 *
 * @author tevans
 */
public class NewQLEsForCoverAllTest {
  @Test
  public void eligibility_failed_or_documents_not_received_by_due_date_Test() {
    SchemaExampleUtil.assertExampleValid("coverall/new_qles/eligibility_failed_or_documents_not_received_by_due_date.xml");
  }
  
  @Test
  public void eligibility_documents_provided_Test() {
    SchemaExampleUtil.assertExampleValid("coverall/new_qles/eligibility_documents_provided.xml");
  }
}