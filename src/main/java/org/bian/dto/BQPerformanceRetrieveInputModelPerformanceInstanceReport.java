package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceRetrieveInputModelPerformanceInstanceReport
 */
public class BQPerformanceRetrieveInputModelPerformanceInstanceReport   {
  private String performanceInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return performanceInstanceReportReference
  **/

  public String getPerformanceInstanceReportReference() {
    return performanceInstanceReportReference;
  }

  public void setPerformanceInstanceReportReference(String performanceInstanceReportReference) {
    this.performanceInstanceReportReference = performanceInstanceReportReference;
  }


}

