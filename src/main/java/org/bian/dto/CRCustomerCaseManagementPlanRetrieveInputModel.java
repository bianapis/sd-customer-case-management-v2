package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceAnalysis;
import org.bian.dto.CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRetrieveInputModel
 */
public class CRCustomerCaseManagementPlanRetrieveInputModel   {
  private Object customerCaseManagementPlanRetrieveActionTaskRecord = null;

  private String customerCaseManagementPlanRetrieveActionRequest = null;

  private CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceReportRecord customerCaseManagementPlanInstanceReportRecord = null;

  private CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceAnalysis customerCaseManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCaseManagementPlanRetrieveActionTaskRecord
  **/

  public Object getCustomerCaseManagementPlanRetrieveActionTaskRecord() {
    return customerCaseManagementPlanRetrieveActionTaskRecord;
  }

  public void setCustomerCaseManagementPlanRetrieveActionTaskRecord(Object customerCaseManagementPlanRetrieveActionTaskRecord) {
    this.customerCaseManagementPlanRetrieveActionTaskRecord = customerCaseManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCaseManagementPlanRetrieveActionRequest
  **/

  public String getCustomerCaseManagementPlanRetrieveActionRequest() {
    return customerCaseManagementPlanRetrieveActionRequest;
  }

  public void setCustomerCaseManagementPlanRetrieveActionRequest(String customerCaseManagementPlanRetrieveActionRequest) {
    this.customerCaseManagementPlanRetrieveActionRequest = customerCaseManagementPlanRetrieveActionRequest;
  }


  /**
   * Get customerCaseManagementPlanInstanceReportRecord
   * @return customerCaseManagementPlanInstanceReportRecord
  **/

  public CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceReportRecord getCustomerCaseManagementPlanInstanceReportRecord() {
    return customerCaseManagementPlanInstanceReportRecord;
  }

  public void setCustomerCaseManagementPlanInstanceReportRecord(CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceReportRecord customerCaseManagementPlanInstanceReportRecord) {
    this.customerCaseManagementPlanInstanceReportRecord = customerCaseManagementPlanInstanceReportRecord;
  }


  /**
   * Get customerCaseManagementPlanInstanceAnalysis
   * @return customerCaseManagementPlanInstanceAnalysis
  **/

  public CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceAnalysis getCustomerCaseManagementPlanInstanceAnalysis() {
    return customerCaseManagementPlanInstanceAnalysis;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysis(CRCustomerCaseManagementPlanRetrieveInputModelCustomerCaseManagementPlanInstanceAnalysis customerCaseManagementPlanInstanceAnalysis) {
    this.customerCaseManagementPlanInstanceAnalysis = customerCaseManagementPlanInstanceAnalysis;
  }


}

