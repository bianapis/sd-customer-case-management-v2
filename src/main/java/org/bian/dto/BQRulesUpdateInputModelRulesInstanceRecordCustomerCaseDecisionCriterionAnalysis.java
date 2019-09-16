package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterionAnalysis
 */
public class BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterionAnalysis   {
  private String customerCaseDecisionCriterionHistory = null;

  private String customerCaseDecisionCriterionAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Sample case examples that apply the criterion that are used to evaluate the impact and re-calibrate the associated rules as appropriate 
   * @return customerCaseDecisionCriterionHistory
  **/

  public String getCustomerCaseDecisionCriterionHistory() {
    return customerCaseDecisionCriterionHistory;
  }

  public void setCustomerCaseDecisionCriterionHistory(String customerCaseDecisionCriterionHistory) {
    this.customerCaseDecisionCriterionHistory = customerCaseDecisionCriterionHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the sensitivity/tuning evaluations and adjustments made to the rule settings for the criterion 
   * @return customerCaseDecisionCriterionAnalysis
  **/

  public String getCustomerCaseDecisionCriterionAnalysis() {
    return customerCaseDecisionCriterionAnalysis;
  }

  public void setCustomerCaseDecisionCriterionAnalysis(String customerCaseDecisionCriterionAnalysis) {
    this.customerCaseDecisionCriterionAnalysis = customerCaseDecisionCriterionAnalysis;
  }


}

