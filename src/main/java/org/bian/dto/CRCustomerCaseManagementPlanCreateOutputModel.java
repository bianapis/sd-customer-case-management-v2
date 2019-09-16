package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanCreateOutputModel
 */
public class CRCustomerCaseManagementPlanCreateOutputModel   {
  private String customerCaseManagementPlanInstanceReference = null;

  private String customerCaseManagementPlanCreateActionReference = null;

  private Object customerCaseManagementPlanCreateActionRecord = null;

  private String customerCaseManagementPlanInstanceStatus = null;

  private CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord customerCaseManagementPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Case Management Plan instance 
   * @return customerCaseManagementPlanInstanceReference
  **/

  public String getCustomerCaseManagementPlanInstanceReference() {
    return customerCaseManagementPlanInstanceReference;
  }

  public void setCustomerCaseManagementPlanInstanceReference(String customerCaseManagementPlanInstanceReference) {
    this.customerCaseManagementPlanInstanceReference = customerCaseManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return customerCaseManagementPlanCreateActionReference
  **/

  public String getCustomerCaseManagementPlanCreateActionReference() {
    return customerCaseManagementPlanCreateActionReference;
  }

  public void setCustomerCaseManagementPlanCreateActionReference(String customerCaseManagementPlanCreateActionReference) {
    this.customerCaseManagementPlanCreateActionReference = customerCaseManagementPlanCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return customerCaseManagementPlanCreateActionRecord
  **/

  public Object getCustomerCaseManagementPlanCreateActionRecord() {
    return customerCaseManagementPlanCreateActionRecord;
  }

  public void setCustomerCaseManagementPlanCreateActionRecord(Object customerCaseManagementPlanCreateActionRecord) {
    this.customerCaseManagementPlanCreateActionRecord = customerCaseManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Case Management Plan instance (e.g. initialised, pending, active) 
   * @return customerCaseManagementPlanInstanceStatus
  **/

  public String getCustomerCaseManagementPlanInstanceStatus() {
    return customerCaseManagementPlanInstanceStatus;
  }

  public void setCustomerCaseManagementPlanInstanceStatus(String customerCaseManagementPlanInstanceStatus) {
    this.customerCaseManagementPlanInstanceStatus = customerCaseManagementPlanInstanceStatus;
  }


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


}

