package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceAnalysis
 */
public class CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceAnalysis   {
  private String customerCaseManagementPlanInstanceAnalysisData = null;

  private String customerCaseManagementPlanInstanceAnalysisReportType = null;

  private Object customerCaseManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerCaseManagementPlanInstanceAnalysisData
  **/

  public String getCustomerCaseManagementPlanInstanceAnalysisData() {
    return customerCaseManagementPlanInstanceAnalysisData;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysisData(String customerCaseManagementPlanInstanceAnalysisData) {
    this.customerCaseManagementPlanInstanceAnalysisData = customerCaseManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerCaseManagementPlanInstanceAnalysisReport
  **/

  public Object getCustomerCaseManagementPlanInstanceAnalysisReport() {
    return customerCaseManagementPlanInstanceAnalysisReport;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysisReport(Object customerCaseManagementPlanInstanceAnalysisReport) {
    this.customerCaseManagementPlanInstanceAnalysisReport = customerCaseManagementPlanInstanceAnalysisReport;
  }


}

