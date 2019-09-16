package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesRetrieveInputModelRulesInstanceAnalysis;
import org.bian.dto.BQRulesRetrieveInputModelRulesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRulesRetrieveInputModel
 */
public class BQRulesRetrieveInputModel   {
  private Object rulesRetrieveActionTaskRecord = null;

  private String rulesRetrieveActionRequest = null;

  private BQRulesRetrieveInputModelRulesInstanceReport rulesInstanceReport = null;

  private BQRulesRetrieveInputModelRulesInstanceAnalysis rulesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return rulesRetrieveActionTaskRecord
  **/

  public Object getRulesRetrieveActionTaskRecord() {
    return rulesRetrieveActionTaskRecord;
  }

  public void setRulesRetrieveActionTaskRecord(Object rulesRetrieveActionTaskRecord) {
    this.rulesRetrieveActionTaskRecord = rulesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return rulesRetrieveActionRequest
  **/

  public String getRulesRetrieveActionRequest() {
    return rulesRetrieveActionRequest;
  }

  public void setRulesRetrieveActionRequest(String rulesRetrieveActionRequest) {
    this.rulesRetrieveActionRequest = rulesRetrieveActionRequest;
  }


  /**
   * Get rulesInstanceReport
   * @return rulesInstanceReport
  **/

  public BQRulesRetrieveInputModelRulesInstanceReport getRulesInstanceReport() {
    return rulesInstanceReport;
  }

  public void setRulesInstanceReport(BQRulesRetrieveInputModelRulesInstanceReport rulesInstanceReport) {
    this.rulesInstanceReport = rulesInstanceReport;
  }


  /**
   * Get rulesInstanceAnalysis
   * @return rulesInstanceAnalysis
  **/

  public BQRulesRetrieveInputModelRulesInstanceAnalysis getRulesInstanceAnalysis() {
    return rulesInstanceAnalysis;
  }

  public void setRulesInstanceAnalysis(BQRulesRetrieveInputModelRulesInstanceAnalysis rulesInstanceAnalysis) {
    this.rulesInstanceAnalysis = rulesInstanceAnalysis;
  }


}

