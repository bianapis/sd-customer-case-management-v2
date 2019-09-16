package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecord;
import org.bian.dto.CRCustomerCaseManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQRulesRequestInputModel
 */
public class BQRulesRequestInputModel   {
  private String customerCaseManagementPlanInstanceReference = null;

  private String rulesInstanceReference = null;

  private BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord = null;

  private Object rulesRequestActionTaskRecord = null;

  private CRCustomerCaseManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Case Management Plan instance 
   * @return customerCaseManagementPlanInstanceReference
  **/

  public String getCustomerCaseManagementPlanInstanceReference() {
    return customerCaseManagementPlanInstanceReference;
  }

  public void setCustomerCaseManagementPlanInstanceReference(String customerCaseManagementPlanInstanceReference) {
    this.customerCaseManagementPlanInstanceReference = customerCaseManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Rules instance 
   * @return rulesInstanceReference
  **/

  public String getRulesInstanceReference() {
    return rulesInstanceReference;
  }

  public void setRulesInstanceReference(String rulesInstanceReference) {
    this.rulesInstanceReference = rulesInstanceReference;
  }


  /**
   * Get rulesInstanceRecord
   * @return rulesInstanceRecord
  **/

  public BQRulesUpdateInputModelRulesInstanceRecord getRulesInstanceRecord() {
    return rulesInstanceRecord;
  }

  public void setRulesInstanceRecord(BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord) {
    this.rulesInstanceRecord = rulesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return rulesRequestActionTaskRecord
  **/

  public Object getRulesRequestActionTaskRecord() {
    return rulesRequestActionTaskRecord;
  }

  public void setRulesRequestActionTaskRecord(Object rulesRequestActionTaskRecord) {
    this.rulesRequestActionTaskRecord = rulesRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerCaseManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerCaseManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

