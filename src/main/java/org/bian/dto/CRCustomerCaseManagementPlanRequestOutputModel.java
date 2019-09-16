package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRequestOutputModel
 */
public class CRCustomerCaseManagementPlanRequestOutputModel   {
  private CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord customerCaseManagementPlanInstanceRecord = null;

  private String customerCaseManagementPlanRequestActionTaskReference = null;

  private Object customerCaseManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Management Plan instance request service call 
   * @return customerCaseManagementPlanRequestActionTaskReference
  **/

  public String getCustomerCaseManagementPlanRequestActionTaskReference() {
    return customerCaseManagementPlanRequestActionTaskReference;
  }

  public void setCustomerCaseManagementPlanRequestActionTaskReference(String customerCaseManagementPlanRequestActionTaskReference) {
    this.customerCaseManagementPlanRequestActionTaskReference = customerCaseManagementPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerCaseManagementPlanRequestActionTaskRecord
  **/

  public Object getCustomerCaseManagementPlanRequestActionTaskRecord() {
    return customerCaseManagementPlanRequestActionTaskRecord;
  }

  public void setCustomerCaseManagementPlanRequestActionTaskRecord(Object customerCaseManagementPlanRequestActionTaskRecord) {
    this.customerCaseManagementPlanRequestActionTaskRecord = customerCaseManagementPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

