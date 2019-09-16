package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanExchangeOutputModel
 */
public class CRCustomerCaseManagementPlanExchangeOutputModel   {
  private String customerCaseManagementPlanExchangeActionTaskReference = null;

  private Object customerCaseManagementPlanExchangeActionTaskRecord = null;

  private String customerCaseManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Management Plan instance exchange service call 
   * @return customerCaseManagementPlanExchangeActionTaskReference
  **/

  public String getCustomerCaseManagementPlanExchangeActionTaskReference() {
    return customerCaseManagementPlanExchangeActionTaskReference;
  }

  public void setCustomerCaseManagementPlanExchangeActionTaskReference(String customerCaseManagementPlanExchangeActionTaskReference) {
    this.customerCaseManagementPlanExchangeActionTaskReference = customerCaseManagementPlanExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerCaseManagementPlanExchangeActionResponse
  **/

  public String getCustomerCaseManagementPlanExchangeActionResponse() {
    return customerCaseManagementPlanExchangeActionResponse;
  }

  public void setCustomerCaseManagementPlanExchangeActionResponse(String customerCaseManagementPlanExchangeActionResponse) {
    this.customerCaseManagementPlanExchangeActionResponse = customerCaseManagementPlanExchangeActionResponse;
  }


}

