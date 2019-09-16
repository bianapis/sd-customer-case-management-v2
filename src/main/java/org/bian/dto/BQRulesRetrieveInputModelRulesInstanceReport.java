package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRulesRetrieveInputModelRulesInstanceReport
 */
public class BQRulesRetrieveInputModelRulesInstanceReport   {
  private String rulesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return rulesInstanceReportReference
  **/

  public String getRulesInstanceReportReference() {
    return rulesInstanceReportReference;
  }

  public void setRulesInstanceReportReference(String rulesInstanceReportReference) {
    this.rulesInstanceReportReference = rulesInstanceReportReference;
  }


}

