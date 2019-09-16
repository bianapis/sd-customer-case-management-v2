package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterion
 */
public class BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterion   {
  private String customerCaseDecisionCriterionDefinition = null;

  private String customerCaseDecisionCriterionRules = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the applicable subject/criterion to be considered in case evaluation (e.g. documentary evidence, customer/merchant history, projected relationship impact, financial cost/projected revenue impact, reputational impact) 
   * @return customerCaseDecisionCriterionDefinition
  **/

  public String getCustomerCaseDecisionCriterionDefinition() {
    return customerCaseDecisionCriterionDefinition;
  }

  public void setCustomerCaseDecisionCriterionDefinition(String customerCaseDecisionCriterionDefinition) {
    this.customerCaseDecisionCriterionDefinition = customerCaseDecisionCriterionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Specific rules, thresholds and parameter values to be applied in case evaluation for the criterion 
   * @return customerCaseDecisionCriterionRules
  **/

  public String getCustomerCaseDecisionCriterionRules() {
    return customerCaseDecisionCriterionRules;
  }

  public void setCustomerCaseDecisionCriterionRules(String customerCaseDecisionCriterionRules) {
    this.customerCaseDecisionCriterionRules = customerCaseDecisionCriterionRules;
  }


}

