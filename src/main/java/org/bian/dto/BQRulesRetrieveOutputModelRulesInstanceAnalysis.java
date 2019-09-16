package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRulesRetrieveOutputModelRulesInstanceAnalysis
 */
public class BQRulesRetrieveOutputModelRulesInstanceAnalysis   {
  private Object rulesInstanceAnalysisRecord = null;

  private String rulesInstanceAnalysisReportType = null;

  private String rulesInstanceAnalysisParameters = null;

  private Object rulesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return rulesInstanceAnalysisRecord
  **/

  public Object getRulesInstanceAnalysisRecord() {
    return rulesInstanceAnalysisRecord;
  }

  public void setRulesInstanceAnalysisRecord(Object rulesInstanceAnalysisRecord) {
    this.rulesInstanceAnalysisRecord = rulesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return rulesInstanceAnalysisReportType
  **/

  public String getRulesInstanceAnalysisReportType() {
    return rulesInstanceAnalysisReportType;
  }

  public void setRulesInstanceAnalysisReportType(String rulesInstanceAnalysisReportType) {
    this.rulesInstanceAnalysisReportType = rulesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return rulesInstanceAnalysisParameters
  **/

  public String getRulesInstanceAnalysisParameters() {
    return rulesInstanceAnalysisParameters;
  }

  public void setRulesInstanceAnalysisParameters(String rulesInstanceAnalysisParameters) {
    this.rulesInstanceAnalysisParameters = rulesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return rulesInstanceAnalysisReport
  **/

  public Object getRulesInstanceAnalysisReport() {
    return rulesInstanceAnalysisReport;
  }

  public void setRulesInstanceAnalysisReport(Object rulesInstanceAnalysisReport) {
    this.rulesInstanceAnalysisReport = rulesInstanceAnalysisReport;
  }


}

