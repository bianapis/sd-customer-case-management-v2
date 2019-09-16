package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceAnalysis
 */
public class CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceAnalysis   {
  private String customerCaseManagementPlanInstanceAnalysisReference = null;

  private String customerCaseManagementPlanInstanceAnalysisReportType = null;

  private String customerCaseManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerCaseManagementPlanInstanceAnalysisReference
  **/

  public String getCustomerCaseManagementPlanInstanceAnalysisReference() {
    return customerCaseManagementPlanInstanceAnalysisReference;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysisReference(String customerCaseManagementPlanInstanceAnalysisReference) {
    this.customerCaseManagementPlanInstanceAnalysisReference = customerCaseManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerCaseManagementPlanInstanceAnalysisReportType
  **/

  public String getCustomerCaseManagementPlanInstanceAnalysisReportType() {
    return customerCaseManagementPlanInstanceAnalysisReportType;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysisReportType(String customerCaseManagementPlanInstanceAnalysisReportType) {
    this.customerCaseManagementPlanInstanceAnalysisReportType = customerCaseManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerCaseManagementPlanInstanceAnalysisParameters
  **/

  public String getCustomerCaseManagementPlanInstanceAnalysisParameters() {
    return customerCaseManagementPlanInstanceAnalysisParameters;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysisParameters(String customerCaseManagementPlanInstanceAnalysisParameters) {
    this.customerCaseManagementPlanInstanceAnalysisParameters = customerCaseManagementPlanInstanceAnalysisParameters;
  }


}

