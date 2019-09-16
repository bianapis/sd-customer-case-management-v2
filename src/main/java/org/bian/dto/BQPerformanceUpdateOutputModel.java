package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateOutputModel
 */
public class BQPerformanceUpdateOutputModel   {
  private BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord = null;

  private String performanceUpdateActionTaskReference = null;

  private Object performanceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return performanceUpdateActionTaskReference
  **/

  public String getPerformanceUpdateActionTaskReference() {
    return performanceUpdateActionTaskReference;
  }

  public void setPerformanceUpdateActionTaskReference(String performanceUpdateActionTaskReference) {
    this.performanceUpdateActionTaskReference = performanceUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return performanceUpdateActionTaskRecord
  **/

  public Object getPerformanceUpdateActionTaskRecord() {
    return performanceUpdateActionTaskRecord;
  }

  public void setPerformanceUpdateActionTaskRecord(Object performanceUpdateActionTaskRecord) {
    this.performanceUpdateActionTaskRecord = performanceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

