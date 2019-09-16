package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecordCustomerCaseResolutionServiceStatistics;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModelPerformanceInstanceRecord
 */
public class BQPerformanceUpdateInputModelPerformanceInstanceRecord   {
  private String customerCaseResourceUtilization = null;

  private String customerCaseLoadingProjections = null;

  private BQPerformanceUpdateInputModelPerformanceInstanceRecordCustomerCaseResolutionServiceStatistics customerCaseResolutionServiceStatistics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the customer case resolution resource utilization (target and actual) 
   * @return customerCaseResourceUtilization
  **/

  public String getCustomerCaseResourceUtilization() {
    return customerCaseResourceUtilization;
  }

  public void setCustomerCaseResourceUtilization(String customerCaseResourceUtilization) {
    this.customerCaseResourceUtilization = customerCaseResourceUtilization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Estimated projected customer case resource requirements and utilization and loading based on historical patterns and anticipated activity 
   * @return customerCaseLoadingProjections
  **/

  public String getCustomerCaseLoadingProjections() {
    return customerCaseLoadingProjections;
  }

  public void setCustomerCaseLoadingProjections(String customerCaseLoadingProjections) {
    this.customerCaseLoadingProjections = customerCaseLoadingProjections;
  }


  /**
   * Get customerCaseResolutionServiceStatistics
   * @return customerCaseResolutionServiceStatistics
  **/

  public BQPerformanceUpdateInputModelPerformanceInstanceRecordCustomerCaseResolutionServiceStatistics getCustomerCaseResolutionServiceStatistics() {
    return customerCaseResolutionServiceStatistics;
  }

  public void setCustomerCaseResolutionServiceStatistics(BQPerformanceUpdateInputModelPerformanceInstanceRecordCustomerCaseResolutionServiceStatistics customerCaseResolutionServiceStatistics) {
    this.customerCaseResolutionServiceStatistics = customerCaseResolutionServiceStatistics;
  }


}

