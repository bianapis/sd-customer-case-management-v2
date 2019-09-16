package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord;
import org.bian.dto.CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceAnalysis;
import org.bian.dto.CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanRetrieveOutputModel
 */
public class CRCustomerCaseManagementPlanRetrieveOutputModel   {
  private CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord customerCaseManagementPlanInstanceRecord = null;

  private String customerCaseManagementPlanRetrieveActionTaskReference = null;

  private Object customerCaseManagementPlanRetrieveActionTaskRecord = null;

  private String customerCaseManagementPlanRetrieveActionResponse = null;

  private CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceReportRecord customerCaseManagementPlanInstanceReportRecord = null;

  private CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceAnalysis customerCaseManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Case Management Plan instance retrieve service call 
   * @return customerCaseManagementPlanRetrieveActionTaskReference
  **/

  public String getCustomerCaseManagementPlanRetrieveActionTaskReference() {
    return customerCaseManagementPlanRetrieveActionTaskReference;
  }

  public void setCustomerCaseManagementPlanRetrieveActionTaskReference(String customerCaseManagementPlanRetrieveActionTaskReference) {
    this.customerCaseManagementPlanRetrieveActionTaskReference = customerCaseManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCaseManagementPlanRetrieveActionResponse
  **/

  public String getCustomerCaseManagementPlanRetrieveActionResponse() {
    return customerCaseManagementPlanRetrieveActionResponse;
  }

  public void setCustomerCaseManagementPlanRetrieveActionResponse(String customerCaseManagementPlanRetrieveActionResponse) {
    this.customerCaseManagementPlanRetrieveActionResponse = customerCaseManagementPlanRetrieveActionResponse;
  }


  /**
   * Get customerCaseManagementPlanInstanceReportRecord
   * @return customerCaseManagementPlanInstanceReportRecord
  **/

  public CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceReportRecord getCustomerCaseManagementPlanInstanceReportRecord() {
    return customerCaseManagementPlanInstanceReportRecord;
  }

  public void setCustomerCaseManagementPlanInstanceReportRecord(CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceReportRecord customerCaseManagementPlanInstanceReportRecord) {
    this.customerCaseManagementPlanInstanceReportRecord = customerCaseManagementPlanInstanceReportRecord;
  }


  /**
   * Get customerCaseManagementPlanInstanceAnalysis
   * @return customerCaseManagementPlanInstanceAnalysis
  **/

  public CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceAnalysis getCustomerCaseManagementPlanInstanceAnalysis() {
    return customerCaseManagementPlanInstanceAnalysis;
  }

  public void setCustomerCaseManagementPlanInstanceAnalysis(CRCustomerCaseManagementPlanRetrieveOutputModelCustomerCaseManagementPlanInstanceAnalysis customerCaseManagementPlanInstanceAnalysis) {
    this.customerCaseManagementPlanInstanceAnalysis = customerCaseManagementPlanInstanceAnalysis;
  }


}

