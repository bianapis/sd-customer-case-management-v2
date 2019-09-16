package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModel
 */
public class BQPerformanceUpdateInputModel   {
  private String customerCaseManagementPlanInstanceReference = null;

  private String performanceInstanceReference = null;

  private BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord = null;

  private Object performanceUpdateActionTaskRecord = null;

  private String performanceUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Case Management Plan instance 
   * @return customerCaseManagementPlanInstanceReference
  **/

  public String getCustomerCaseManagementPlanInstanceReference() {
    return customerCaseManagementPlanInstanceReference;
  }

  public void setCustomerCaseManagementPlanInstanceReference(String customerCaseManagementPlanInstanceReference) {
    this.customerCaseManagementPlanInstanceReference = customerCaseManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance instance 
   * @return performanceInstanceReference
  **/

  public String getPerformanceInstanceReference() {
    return performanceInstanceReference;
  }

  public void setPerformanceInstanceReference(String performanceInstanceReference) {
    this.performanceInstanceReference = performanceInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return performanceUpdateActionRequest
  **/

  public String getPerformanceUpdateActionRequest() {
    return performanceUpdateActionRequest;
  }

  public void setPerformanceUpdateActionRequest(String performanceUpdateActionRequest) {
    this.performanceUpdateActionRequest = performanceUpdateActionRequest;
  }


}

