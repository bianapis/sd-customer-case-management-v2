package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRulesUpdateInputModelRulesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRulesRequestOutputModel
 */
public class BQRulesRequestOutputModel   {
  private BQRulesUpdateInputModelRulesInstanceRecord rulesInstanceRecord = null;

  private String rulesRequestActionTaskReference = null;

  private Object rulesRequestActionTaskRecord = null;

  private String rulesRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Rules instance request service call 
   * @return rulesRequestActionTaskReference
  **/

  public String getRulesRequestActionTaskReference() {
    return rulesRequestActionTaskReference;
  }

  public void setRulesRequestActionTaskReference(String rulesRequestActionTaskReference) {
    this.rulesRequestActionTaskReference = rulesRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return rulesRequestActionTaskRecord
  **/

  public Object getRulesRequestActionTaskRecord() {
    return rulesRequestActionTaskRecord;
  }

  public void setRulesRequestActionTaskRecord(Object rulesRequestActionTaskRecord) {
    this.rulesRequestActionTaskRecord = rulesRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Rules service request record 
   * @return rulesRequestRecordReference
  **/

  public String getRulesRequestRecordReference() {
    return rulesRequestRecordReference;
  }

  public void setRulesRequestRecordReference(String rulesRequestRecordReference) {
    this.rulesRequestRecordReference = rulesRequestRecordReference;
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

