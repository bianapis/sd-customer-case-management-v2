package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceRetrieveOutputModelPerformanceInstanceAnalysis;
import org.bian.dto.BQPerformanceRetrieveOutputModelPerformanceInstanceReport;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceRetrieveOutputModel
 */
public class BQPerformanceRetrieveOutputModel   {
  private BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord = null;

  private String performanceRetrieveActionTaskReference = null;

  private Object performanceRetrieveActionTaskRecord = null;

  private String performanceRetrieveActionResponse = null;

  private BQPerformanceRetrieveOutputModelPerformanceInstanceReport performanceInstanceReport = null;

  private BQPerformanceRetrieveOutputModelPerformanceInstanceAnalysis performanceInstanceAnalysis = null;


  /**
   * Get performanceInstanceRecord
   * @return performanceInstanceRecord
  **/

  public BQPerformanceUpdateInputModelPerformanceInstanceRecord getPerformanceInstanceRecord() {
    return performanceInstanceRecord;
  }

  public void setPerformanceInstanceRecord(BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord) {
    this.performanceInstanceRecord = performanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance instance retrieve service call 
   * @return performanceRetrieveActionTaskReference
  **/

  public String getPerformanceRetrieveActionTaskReference() {
    return performanceRetrieveActionTaskReference;
  }

  public void setPerformanceRetrieveActionTaskReference(String performanceRetrieveActionTaskReference) {
    this.performanceRetrieveActionTaskReference = performanceRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return performanceRetrieveActionResponse
  **/

  public String getPerformanceRetrieveActionResponse() {
    return performanceRetrieveActionResponse;
  }

  public void setPerformanceRetrieveActionResponse(String performanceRetrieveActionResponse) {
    this.performanceRetrieveActionResponse = performanceRetrieveActionResponse;
  }


  /**
   * Get performanceInstanceReport
   * @return performanceInstanceReport
  **/

  public BQPerformanceRetrieveOutputModelPerformanceInstanceReport getPerformanceInstanceReport() {
    return performanceInstanceReport;
  }

  public void setPerformanceInstanceReport(BQPerformanceRetrieveOutputModelPerformanceInstanceReport performanceInstanceReport) {
    this.performanceInstanceReport = performanceInstanceReport;
  }


  /**
   * Get performanceInstanceAnalysis
   * @return performanceInstanceAnalysis
  **/

  public BQPerformanceRetrieveOutputModelPerformanceInstanceAnalysis getPerformanceInstanceAnalysis() {
    return performanceInstanceAnalysis;
  }

  public void setPerformanceInstanceAnalysis(BQPerformanceRetrieveOutputModelPerformanceInstanceAnalysis performanceInstanceAnalysis) {
    this.performanceInstanceAnalysis = performanceInstanceAnalysis;
  }


}

