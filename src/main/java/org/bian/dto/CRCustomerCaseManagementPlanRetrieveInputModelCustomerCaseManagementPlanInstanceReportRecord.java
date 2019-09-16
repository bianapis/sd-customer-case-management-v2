package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceReportRecord
 */
public class CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceReportRecord   {
  private String customerCaseManagementPlanInstanceReportReference = null;

  private String customerCaseManagementPlanInstanceReportType = null;

  private String customerCaseManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerCaseManagementPlanInstanceReportReference
  **/

  public String getCustomerCaseManagementPlanInstanceReportReference() {
    return customerCaseManagementPlanInstanceReportReference;
  }

  public void setCustomerCaseManagementPlanInstanceReportReference(String customerCaseManagementPlanInstanceReportReference) {
    this.customerCaseManagementPlanInstanceReportReference = customerCaseManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerCaseManagementPlanInstanceReportType
  **/

  public String getCustomerCaseManagementPlanInstanceReportType() {
    return customerCaseManagementPlanInstanceReportType;
  }

  public void setCustomerCaseManagementPlanInstanceReportType(String customerCaseManagementPlanInstanceReportType) {
    this.customerCaseManagementPlanInstanceReportType = customerCaseManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerCaseManagementPlanInstanceReportParameters
  **/

  public String getCustomerCaseManagementPlanInstanceReportParameters() {
    return customerCaseManagementPlanInstanceReportParameters;
  }

  public void setCustomerCaseManagementPlanInstanceReportParameters(String customerCaseManagementPlanInstanceReportParameters) {
    this.customerCaseManagementPlanInstanceReportParameters = customerCaseManagementPlanInstanceReportParameters;
  }


}

