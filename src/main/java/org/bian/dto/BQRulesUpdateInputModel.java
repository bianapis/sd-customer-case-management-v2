package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRulesUpdateInputModel
 */
public class BQRulesUpdateInputModel   {
  private String customerCaseManagementPlanInstanceReference = null;

  private String rulesInstanceReference = null;

  private BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord = null;

  private Object rulesUpdateActionTaskRecord = null;

  private String rulesUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return rulesUpdateActionTaskRecord
  **/

  public Object getRulesUpdateActionTaskRecord() {
    return rulesUpdateActionTaskRecord;
  }

  public void setRulesUpdateActionTaskRecord(Object rulesUpdateActionTaskRecord) {
    this.rulesUpdateActionTaskRecord = rulesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return rulesUpdateActionRequest
  **/

  public String getRulesUpdateActionRequest() {
    return rulesUpdateActionRequest;
  }

  public void setRulesUpdateActionRequest(String rulesUpdateActionRequest) {
    this.rulesUpdateActionRequest = rulesUpdateActionRequest;
  }


}

