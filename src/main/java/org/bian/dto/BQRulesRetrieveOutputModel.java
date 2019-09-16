package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesRetrieveOutputModelRulesInstanceAnalysis;
import org.bian.dto.BQRulesRetrieveOutputModelRulesInstanceReport;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRulesRetrieveOutputModel
 */
public class BQRulesRetrieveOutputModel   {
  private BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord = null;

  private String rulesRetrieveActionTaskReference = null;

  private Object rulesRetrieveActionTaskRecord = null;

  private String rulesRetrieveActionResponse = null;

  private BQRulesRetrieveOutputModelRulesInstanceReport rulesInstanceReport = null;

  private BQRulesRetrieveOutputModelRulesInstanceAnalysis rulesInstanceAnalysis = null;


  /**
   * Get rulesInstanceRecord
   * @return rulesInstanceRecord
  **/

  public BQRulesUpdateInputModelRulesInstanceRecord getRulesInstanceRecord() {
    return rulesInstanceRecord;
  }

  public void setRulesInstanceRecord(BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord) {
    this.rulesInstanceRecord = rulesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rules instance retrieve service call 
   * @return rulesRetrieveActionTaskReference
  **/

  public String getRulesRetrieveActionTaskReference() {
    return rulesRetrieveActionTaskReference;
  }

  public void setRulesRetrieveActionTaskReference(String rulesRetrieveActionTaskReference) {
    this.rulesRetrieveActionTaskReference = rulesRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return rulesRetrieveActionResponse
  **/

  public String getRulesRetrieveActionResponse() {
    return rulesRetrieveActionResponse;
  }

  public void setRulesRetrieveActionResponse(String rulesRetrieveActionResponse) {
    this.rulesRetrieveActionResponse = rulesRetrieveActionResponse;
  }


  /**
   * Get rulesInstanceReport
   * @return rulesInstanceReport
  **/

  public BQRulesRetrieveOutputModelRulesInstanceReport getRulesInstanceReport() {
    return rulesInstanceReport;
  }

  public void setRulesInstanceReport(BQRulesRetrieveOutputModelRulesInstanceReport rulesInstanceReport) {
    this.rulesInstanceReport = rulesInstanceReport;
  }


  /**
   * Get rulesInstanceAnalysis
   * @return rulesInstanceAnalysis
  **/

  public BQRulesRetrieveOutputModelRulesInstanceAnalysis getRulesInstanceAnalysis() {
    return rulesInstanceAnalysis;
  }

  public void setRulesInstanceAnalysis(BQRulesRetrieveOutputModelRulesInstanceAnalysis rulesInstanceAnalysis) {
    this.rulesInstanceAnalysis = rulesInstanceAnalysis;
  }


}

