package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceReportRecord
 */
public class CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceReportRecord   {
  private String customerCaseManagementPlanInstanceReportData = null;

  private String customerCaseManagementPlanInstanceReportType = null;

  private Object customerCaseManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerCaseManagementPlanInstanceReportData
  **/

  public String getCustomerCaseManagementPlanInstanceReportData() {
    return customerCaseManagementPlanInstanceReportData;
  }

  public void setCustomerCaseManagementPlanInstanceReportData(String customerCaseManagementPlanInstanceReportData) {
    this.customerCaseManagementPlanInstanceReportData = customerCaseManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerCaseManagementPlanInstanceReport
  **/

  public Object getCustomerCaseManagementPlanInstanceReport() {
    return customerCaseManagementPlanInstanceReport;
  }

  public void setCustomerCaseManagementPlanInstanceReport(Object customerCaseManagementPlanInstanceReport) {
    this.customerCaseManagementPlanInstanceReport = customerCaseManagementPlanInstanceReport;
  }


}

