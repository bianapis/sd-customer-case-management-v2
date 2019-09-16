package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceRetrieveInputModelPerformanceInstanceAnalysis;
import org.bian.dto.BQPerformanceRetrieveInputModelPerformanceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQPerformanceRetrieveInputModel
 */
public class BQPerformanceRetrieveInputModel   {
  private Object performanceRetrieveActionTaskRecord = null;

  private String performanceRetrieveActionRequest = null;

  private BQPerformanceRetrieveInputModelPerformanceInstanceReport performanceInstanceReport = null;

  private BQPerformanceRetrieveInputModelPerformanceInstanceAnalysis performanceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return performanceRetrieveActionTaskRecord
  **/

  public Object getPerformanceRetrieveActionTaskRecord() {
    return performanceRetrieveActionTaskRecord;
  }

  public void setPerformanceRetrieveActionTaskRecord(Object performanceRetrieveActionTaskRecord) {
    this.performanceRetrieveActionTaskRecord = performanceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return performanceRetrieveActionRequest
  **/

  public String getPerformanceRetrieveActionRequest() {
    return performanceRetrieveActionRequest;
  }

  public void setPerformanceRetrieveActionRequest(String performanceRetrieveActionRequest) {
    this.performanceRetrieveActionRequest = performanceRetrieveActionRequest;
  }


  /**
   * Get performanceInstanceReport
   * @return performanceInstanceReport
  **/

  public BQPerformanceRetrieveInputModelPerformanceInstanceReport getPerformanceInstanceReport() {
    return performanceInstanceReport;
  }

  public void setPerformanceInstanceReport(BQPerformanceRetrieveInputModelPerformanceInstanceReport performanceInstanceReport) {
    this.performanceInstanceReport = performanceInstanceReport;
  }


  /**
   * Get performanceInstanceAnalysis
   * @return performanceInstanceAnalysis
  **/

  public BQPerformanceRetrieveInputModelPerformanceInstanceAnalysis getPerformanceInstanceAnalysis() {
    return performanceInstanceAnalysis;
  }

  public void setPerformanceInstanceAnalysis(BQPerformanceRetrieveInputModelPerformanceInstanceAnalysis performanceInstanceAnalysis) {
    this.performanceInstanceAnalysis = performanceInstanceAnalysis;
  }


}

