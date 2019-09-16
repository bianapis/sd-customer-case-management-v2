package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterion;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterionAnalysis;

import javax.validation.Valid;
  
/**
 * BQRulesUpdateInputModelRulesInstanceRecord
 */
public class BQRulesUpdateInputModelRulesInstanceRecord   {
  private BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterion customerCaseDecisionCriterion = null;

  private BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterionAnalysis customerCaseDecisionCriterionAnalysis = null;


  /**
   * Get customerCaseDecisionCriterion
   * @return customerCaseDecisionCriterion
  **/

  public BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterion getCustomerCaseDecisionCriterion() {
    return customerCaseDecisionCriterion;
  }

  public void setCustomerCaseDecisionCriterion(BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterion customerCaseDecisionCriterion) {
    this.customerCaseDecisionCriterion = customerCaseDecisionCriterion;
  }


  /**
   * Get customerCaseDecisionCriterionAnalysis
   * @return customerCaseDecisionCriterionAnalysis
  **/

  public BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterionAnalysis getCustomerCaseDecisionCriterionAnalysis() {
    return customerCaseDecisionCriterionAnalysis;
  }

  public void setCustomerCaseDecisionCriterionAnalysis(BQRulesUpdateInputModelRulesInstanceRecordCustomerCaseDecisionCriterionAnalysis customerCaseDecisionCriterionAnalysis) {
    this.customerCaseDecisionCriterionAnalysis = customerCaseDecisionCriterionAnalysis;
  }


}

