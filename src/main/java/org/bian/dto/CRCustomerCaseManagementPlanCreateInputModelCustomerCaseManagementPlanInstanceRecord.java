package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord
 */
public class CRCustomerCaseManagementPlanCreateInputModelCustomerCaseManagementPlanInstanceRecord   {
  private String customerCaseManagementPlanPeriod = null;

  private String customerCasePoliciesAndGuidelines = null;

  private String customerCaseServicePerformanceGoals = null;

  private String customerCaseServiceSchedule = null;

  private String customerCaseServiceOperatingConfiguration = null;

  private String customerCaseResourcePlan = null;

  private String customerCaseTrainingPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The time period addressed by the management plan. This may define required actions and target performance over a fixed period or can be a 'rolling' plan that is continually refined based on experience 
   * @return customerCaseManagementPlanPeriod
  **/

  public String getCustomerCaseManagementPlanPeriod() {
    return customerCaseManagementPlanPeriod;
  }

  public void setCustomerCaseManagementPlanPeriod(String customerCaseManagementPlanPeriod) {
    this.customerCaseManagementPlanPeriod = customerCaseManagementPlanPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The specific policies and guidelines for case resolution employees 
   * @return customerCasePoliciesAndGuidelines
  **/

  public String getCustomerCasePoliciesAndGuidelines() {
    return customerCasePoliciesAndGuidelines;
  }

  public void setCustomerCasePoliciesAndGuidelines(String customerCasePoliciesAndGuidelines) {
    this.customerCasePoliciesAndGuidelines = customerCasePoliciesAndGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual service performance goals that are tracked by customer case management 
   * @return customerCaseServicePerformanceGoals
  **/

  public String getCustomerCaseServicePerformanceGoals() {
    return customerCaseServicePerformanceGoals;
  }

  public void setCustomerCaseServicePerformanceGoals(String customerCaseServicePerformanceGoals) {
    this.customerCaseServicePerformanceGoals = customerCaseServicePerformanceGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual customer case service schedule - recording planned and actual service availability and expected throughput/productivity 
   * @return customerCaseServiceSchedule
  **/

  public String getCustomerCaseServiceSchedule() {
    return customerCaseServiceSchedule;
  }

  public void setCustomerCaseServiceSchedule(String customerCaseServiceSchedule) {
    this.customerCaseServiceSchedule = customerCaseServiceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The set-up/organization for the customer case business function (covers operational and management/oversight roles and responsibilities) 
   * @return customerCaseServiceOperatingConfiguration
  **/

  public String getCustomerCaseServiceOperatingConfiguration() {
    return customerCaseServiceOperatingConfiguration;
  }

  public void setCustomerCaseServiceOperatingConfiguration(String customerCaseServiceOperatingConfiguration) {
    this.customerCaseServiceOperatingConfiguration = customerCaseServiceOperatingConfiguration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the number and skill/qualification profile of the customer case handling staff (target and actual) 
   * @return customerCaseResourcePlan
  **/

  public String getCustomerCaseResourcePlan() {
    return customerCaseResourcePlan;
  }

  public void setCustomerCaseResourcePlan(String customerCaseResourcePlan) {
    this.customerCaseResourcePlan = customerCaseResourcePlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of staff training and certification activity (planned and actual) 
   * @return customerCaseTrainingPlan
  **/

  public String getCustomerCaseTrainingPlan() {
    return customerCaseTrainingPlan;
  }

  public void setCustomerCaseTrainingPlan(String customerCaseTrainingPlan) {
    this.customerCaseTrainingPlan = customerCaseTrainingPlan;
  }


}

