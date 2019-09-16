package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRulesRetrieveOutputModelRulesInstanceReport
 */
public class BQRulesRetrieveOutputModelRulesInstanceReport   {
  private Object rulesInstanceReportRecord = null;

  private String rulesInstanceReportType = null;

  private String rulesInstanceReportParameters = null;

  private Object rulesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return rulesInstanceReportRecord
  **/

  public Object getRulesInstanceReportRecord() {
    return rulesInstanceReportRecord;
  }

  public void setRulesInstanceReportRecord(Object rulesInstanceReportRecord) {
    this.rulesInstanceReportRecord = rulesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return rulesInstanceReportType
  **/

  public String getRulesInstanceReportType() {
    return rulesInstanceReportType;
  }

  public void setRulesInstanceReportType(String rulesInstanceReportType) {
    this.rulesInstanceReportType = rulesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return rulesInstanceReportParameters
  **/

  public String getRulesInstanceReportParameters() {
    return rulesInstanceReportParameters;
  }

  public void setRulesInstanceReportParameters(String rulesInstanceReportParameters) {
    this.rulesInstanceReportParameters = rulesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return rulesInstanceReport
  **/

  public Object getRulesInstanceReport() {
    return rulesInstanceReport;
  }

  public void setRulesInstanceReport(Object rulesInstanceReport) {
    this.rulesInstanceReport = rulesInstanceReport;
  }


}

