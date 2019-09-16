package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceRetrieveOutputModelPerformanceInstanceAnalysis
 */
public class BQPerformanceRetrieveOutputModelPerformanceInstanceAnalysis   {
  private Object performanceInstanceAnalysisRecord = null;

  private String performanceInstanceAnalysisReportType = null;

  private String performanceInstanceAnalysisParameters = null;

  private Object performanceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return performanceInstanceAnalysisRecord
  **/

  public Object getPerformanceInstanceAnalysisRecord() {
    return performanceInstanceAnalysisRecord;
  }

  public void setPerformanceInstanceAnalysisRecord(Object performanceInstanceAnalysisRecord) {
    this.performanceInstanceAnalysisRecord = performanceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return performanceInstanceAnalysisReportType
  **/

  public String getPerformanceInstanceAnalysisReportType() {
    return performanceInstanceAnalysisReportType;
  }

  public void setPerformanceInstanceAnalysisReportType(String performanceInstanceAnalysisReportType) {
    this.performanceInstanceAnalysisReportType = performanceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return performanceInstanceAnalysisParameters
  **/

  public String getPerformanceInstanceAnalysisParameters() {
    return performanceInstanceAnalysisParameters;
  }

  public void setPerformanceInstanceAnalysisParameters(String performanceInstanceAnalysisParameters) {
    this.performanceInstanceAnalysisParameters = performanceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return performanceInstanceAnalysisReport
  **/

  public Object getPerformanceInstanceAnalysisReport() {
    return performanceInstanceAnalysisReport;
  }

  public void setPerformanceInstanceAnalysisReport(Object performanceInstanceAnalysisReport) {
    this.performanceInstanceAnalysisReport = performanceInstanceAnalysisReport;
  }


}

