package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRulesUpdateOutputModel
 */
public class BQRulesUpdateOutputModel   {
  private BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord = null;

  private String rulesUpdateActionTaskReference = null;

  private Object rulesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get rulesInstanceRecord
   * @return rulesInstanceRecord
  **/

  public BQRulesUpdateInputModelRulesInstanceRecord getRulesInstanceRecord() {
    return rulesInstanceRecord;
  }

  public void setRulesInstanceRecord(BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord) {
    this.rulesInstanceRecord = rulesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return rulesUpdateActionTaskReference
  **/

  public String getRulesUpdateActionTaskReference() {
    return rulesUpdateActionTaskReference;
  }

  public void setRulesUpdateActionTaskReference(String rulesUpdateActionTaskReference) {
    this.rulesUpdateActionTaskReference = rulesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return rulesUpdateActionTaskRecord
  **/

  public Object getRulesUpdateActionTaskRecord() {
    return rulesUpdateActionTaskRecord;
  }

  public void setRulesUpdateActionTaskRecord(Object rulesUpdateActionTaskRecord) {
    this.rulesUpdateActionTaskRecord = rulesUpdateActionTaskRecord;
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

