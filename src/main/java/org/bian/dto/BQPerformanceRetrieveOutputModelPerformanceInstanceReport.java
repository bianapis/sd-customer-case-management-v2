package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceRetrieveOutputModelPerformanceInstanceReport
 */
public class BQPerformanceRetrieveOutputModelPerformanceInstanceReport   {
  private Object performanceInstanceReportRecord = null;

  private String performanceInstanceReportType = null;

  private String performanceInstanceReportParameters = null;

  private Object performanceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return performanceInstanceReportRecord
  **/

  public Object getPerformanceInstanceReportRecord() {
    return performanceInstanceReportRecord;
  }

  public void setPerformanceInstanceReportRecord(Object performanceInstanceReportRecord) {
    this.performanceInstanceReportRecord = performanceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return performanceInstanceReportType
  **/

  public String getPerformanceInstanceReportType() {
    return performanceInstanceReportType;
  }

  public void setPerformanceInstanceReportType(String performanceInstanceReportType) {
    this.performanceInstanceReportType = performanceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return performanceInstanceReportParameters
  **/

  public String getPerformanceInstanceReportParameters() {
    return performanceInstanceReportParameters;
  }

  public void setPerformanceInstanceReportParameters(String performanceInstanceReportParameters) {
    this.performanceInstanceReportParameters = performanceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return performanceInstanceReport
  **/

  public Object getPerformanceInstanceReport() {
    return performanceInstanceReport;
  }

  public void setPerformanceInstanceReport(Object performanceInstanceReport) {
    this.performanceInstanceReport = performanceInstanceReport;
  }


}

