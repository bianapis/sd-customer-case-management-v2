package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord;
import org.bian.dto.CRCustomerCaseManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRequestInputModel
 */
public class CRCustomerCaseManagementPlanRequestInputModel   {
  private String customerCaseManagementServicingSessionReference = null;

  private String customerCaseManagementPlanInstanceReference = null;

  private CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord customerCaseManagementPlanInstanceRecord = null;

  private Object customerCaseManagementPlanRequestActionTaskRecord = null;

  private CRCustomerCaseManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerCaseManagementServicingSessionReference
  **/

  public String getCustomerCaseManagementServicingSessionReference() {
    return customerCaseManagementServicingSessionReference;
  }

  public void setCustomerCaseManagementServicingSessionReference(String customerCaseManagementServicingSessionReference) {
    this.customerCaseManagementServicingSessionReference = customerCaseManagementServicingSessionReference;
  }


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

