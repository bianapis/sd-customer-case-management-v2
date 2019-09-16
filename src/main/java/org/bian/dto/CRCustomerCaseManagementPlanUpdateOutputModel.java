package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanUpdateOutputModel
 */
public class CRCustomerCaseManagementPlanUpdateOutputModel   {
  private CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord customerCaseManagementPlanInstanceRecord = null;

  private String customerCaseManagementPlanUpdateActionTaskReference = null;

  private Object customerCaseManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerCaseManagementPlanInstanceRecord
   * @return customerCaseManagementPlanInstanceRecord
  **/

  public CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord getCustomerCaseManagementPlanInstanceRecord() {
    return customerCaseManagementPlanInstanceRecord;
  }

  public void setCustomerCaseManagementPlanInstanceRecord(CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord customerCaseManagementPlanInstanceRecord) {
    this.customerCaseManagementPlanInstanceRecord = customerCaseManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerCaseManagementPlanUpdateActionTaskReference
  **/

  public String getCustomerCaseManagementPlanUpdateActionTaskReference() {
    return customerCaseManagementPlanUpdateActionTaskReference;
  }

  public void setCustomerCaseManagementPlanUpdateActionTaskReference(String customerCaseManagementPlanUpdateActionTaskReference) {
    this.customerCaseManagementPlanUpdateActionTaskReference = customerCaseManagementPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerCaseManagementPlanUpdateActionTaskRecord
  **/

  public Object getCustomerCaseManagementPlanUpdateActionTaskRecord() {
    return customerCaseManagementPlanUpdateActionTaskRecord;
  }

  public void setCustomerCaseManagementPlanUpdateActionTaskRecord(Object customerCaseManagementPlanUpdateActionTaskRecord) {
    this.customerCaseManagementPlanUpdateActionTaskRecord = customerCaseManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

