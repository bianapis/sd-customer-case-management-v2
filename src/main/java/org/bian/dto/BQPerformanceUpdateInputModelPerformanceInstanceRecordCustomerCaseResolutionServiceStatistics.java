package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModelPerformanceInstanceRecordCustomerCaseResolutionServiceStatistics
 */
public class BQPerformanceUpdateInputModelPerformanceInstanceRecordCustomerCaseResolutionServiceStatistics   {
  private String customerCaseServiceStatisticType = null;

  private String customerCaseServiceStatisticValue = null;

  private String customerCaseServiceStatisticInterpretation = null;

  private String customerCaseServiceStatisticRecommendation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of activity that is tracked and analyzed (e.g. case resolution throughput, time/effort per case, customer acceptance/appeal rate, merchant acceptance/appeal rate, customer/merchant retention, case resolution profit/loss) 
   * @return customerCaseServiceStatisticType
  **/

  public String getCustomerCaseServiceStatisticType() {
    return customerCaseServiceStatisticType;
  }

  public void setCustomerCaseServiceStatisticType(String customerCaseServiceStatisticType) {
    this.customerCaseServiceStatisticType = customerCaseServiceStatisticType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The statistical analysis that can include historical and trended views of the activity 
   * @return customerCaseServiceStatisticValue
  **/

  public String getCustomerCaseServiceStatisticValue() {
    return customerCaseServiceStatisticValue;
  }

  public void setCustomerCaseServiceStatisticValue(String customerCaseServiceStatisticValue) {
    this.customerCaseServiceStatisticValue = customerCaseServiceStatisticValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The evaluation of the root cause or comparative assessments of the analysis 
   * @return customerCaseServiceStatisticInterpretation
  **/

  public String getCustomerCaseServiceStatisticInterpretation() {
    return customerCaseServiceStatisticInterpretation;
  }

  public void setCustomerCaseServiceStatisticInterpretation(String customerCaseServiceStatisticInterpretation) {
    this.customerCaseServiceStatisticInterpretation = customerCaseServiceStatisticInterpretation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Service/configuration amendment recommendations arising from the statistical analysis 
   * @return customerCaseServiceStatisticRecommendation
  **/

  public String getCustomerCaseServiceStatisticRecommendation() {
    return customerCaseServiceStatisticRecommendation;
  }

  public void setCustomerCaseServiceStatisticRecommendation(String customerCaseServiceStatisticRecommendation) {
    this.customerCaseServiceStatisticRecommendation = customerCaseServiceStatisticRecommendation;
  }


}

