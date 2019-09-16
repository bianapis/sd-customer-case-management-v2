/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerCaseManagementApiServiceImpl implements CustomerCaseManagementApiService {

	public SDCustomerCaseManagementActivateOutputModel activate(SDCustomerCaseManagementActivateInputModel request){
		return JsonReader.read("activate-SDCustomerCaseManagementActivateOutputModel.json",new TypeReference<SDCustomerCaseManagementActivateOutputModel>(){});
	}
	
	public SDCustomerCaseManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerCaseManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerCaseManagementConfigureOutputModel.json",new TypeReference<SDCustomerCaseManagementConfigureOutputModel>(){});
	}
	
	public CRCustomerCaseManagementPlanCreateOutputModel create(String sdReferenceId, CRCustomerCaseManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRCustomerCaseManagementPlanCreateOutputModel.json",new TypeReference<CRCustomerCaseManagementPlanCreateOutputModel>(){});
	}
	
	public CRCustomerCaseManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCaseManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerCaseManagementPlanExchangeOutputModel.json",new TypeReference<CRCustomerCaseManagementPlanExchangeOutputModel>(){});
	}
	
	public SDCustomerCaseManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCaseManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerCaseManagementFeedbackOutputModel.json",new TypeReference<SDCustomerCaseManagementFeedbackOutputModel>(){});
	}
	
	public BQPerformanceRequestOutputModel requestPerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceRequestInputModel request){
		return JsonReader.read("request-BQPerformanceRequestOutputModel.json",new TypeReference<BQPerformanceRequestOutputModel>(){});
	}
	
	public BQRulesRequestOutputModel requestRules(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRulesRequestInputModel request){
		return JsonReader.read("request-BQRulesRequestOutputModel.json",new TypeReference<BQRulesRequestOutputModel>(){});
	}
	
	public CRCustomerCaseManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCaseManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRCustomerCaseManagementPlanRequestOutputModel.json",new TypeReference<CRCustomerCaseManagementPlanRequestOutputModel>(){});
	}
	
	public CRCustomerCaseManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerCaseManagementPlanRetrieveOutputModel.json",new TypeReference<CRCustomerCaseManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPerformanceRetrieveOutputModel retrievePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceRetrieveOutputModel.json",new TypeReference<BQPerformanceRetrieveOutputModel>(){});
	}
	
	public BQRulesRetrieveOutputModel retrieveRules(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRulesRetrieveOutputModel.json",new TypeReference<BQRulesRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerCaseManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerCaseManagementRetrieveOutputModel.json",new TypeReference<SDCustomerCaseManagementRetrieveOutputModel>(){});
	}
	
	public CRCustomerCaseManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCaseManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRCustomerCaseManagementPlanUpdateOutputModel.json",new TypeReference<CRCustomerCaseManagementPlanUpdateOutputModel>(){});
	}
	
	public BQPerformanceUpdateOutputModel updatePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceUpdateOutputModel.json",new TypeReference<BQPerformanceUpdateOutputModel>(){});
	}
	
	public BQRulesUpdateOutputModel updateRules(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRulesUpdateInputModel request){
		return JsonReader.read("update-BQRulesUpdateOutputModel.json",new TypeReference<BQRulesUpdateOutputModel>(){});
	}
	
}
