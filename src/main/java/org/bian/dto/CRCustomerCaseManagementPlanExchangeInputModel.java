package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanExchangeInputModelCustomerCaseManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanExchangeInputModel
 */
public class CRCustomerCaseManagementPlanExchangeInputModel   {
  private String customerCaseManagementServicingSessionReference = null;

  private String customerCaseManagementPlanInstanceReference = null;

  private Object customerCaseManagementPlanExchangeActionTaskRecord = null;

  private CRCustomerCaseManagementPlanExchangeInputModelCustomerCaseManagementPlanExchangeActionRequest customerCaseManagementPlanExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerCaseManagementPlanExchangeActionTaskRecord
  **/

  public Object getCustomerCaseManagementPlanExchangeActionTaskRecord() {
    return customerCaseManagementPlanExchangeActionTaskRecord;
  }

  public void setCustomerCaseManagementPlanExchangeActionTaskRecord(Object customerCaseManagementPlanExchangeActionTaskRecord) {
    this.customerCaseManagementPlanExchangeActionTaskRecord = customerCaseManagementPlanExchangeActionTaskRecord;
  }


  /**
   * Get customerCaseManagementPlanExchangeActionRequest
   * @return customerCaseManagementPlanExchangeActionRequest
  **/

  public CRCustomerCaseManagementPlanExchangeInputModelCustomerCaseManagementPlanExchangeActionRequest getCustomerCaseManagementPlanExchangeActionRequest() {
    return customerCaseManagementPlanExchangeActionRequest;
  }

  public void setCustomerCaseManagementPlanExchangeActionRequest(CRCustomerCaseManagementPlanExchangeInputModelCustomerCaseManagementPlanExchangeActionRequest customerCaseManagementPlanExchangeActionRequest) {
    this.customerCaseManagementPlanExchangeActionRequest = customerCaseManagementPlanExchangeActionRequest;
  }


}

