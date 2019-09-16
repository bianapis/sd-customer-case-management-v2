package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceRequestOutputModel
 */
public class BQPerformanceRequestOutputModel   {
  private BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord = null;

  private String performanceRequestActionTaskReference = null;

  private Object performanceRequestActionTaskRecord = null;

  private String performanceRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Performance instance request service call 
   * @return performanceRequestActionTaskReference
  **/

  public String getPerformanceRequestActionTaskReference() {
    return performanceRequestActionTaskReference;
  }

  public void setPerformanceRequestActionTaskReference(String performanceRequestActionTaskReference) {
    this.performanceRequestActionTaskReference = performanceRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return performanceRequestActionTaskRecord
  **/

  public Object getPerformanceRequestActionTaskRecord() {
    return performanceRequestActionTaskRecord;
  }

  public void setPerformanceRequestActionTaskRecord(Object performanceRequestActionTaskRecord) {
    this.performanceRequestActionTaskRecord = performanceRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance service request record 
   * @return performanceRequestRecordReference
  **/

  public String getPerformanceRequestRecordReference() {
    return performanceRequestRecordReference;
  }

  public void setPerformanceRequestRecordReference(String performanceRequestRecordReference) {
    this.performanceRequestRecordReference = performanceRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

