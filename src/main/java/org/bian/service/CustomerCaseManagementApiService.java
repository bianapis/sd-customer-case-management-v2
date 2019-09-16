/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerCaseManagementApiService {

	SDCustomerCaseManagementActivateOutputModel activate(SDCustomerCaseManagementActivateInputModel request);
	
	SDCustomerCaseManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerCaseManagementConfigureInputModel request);
	
	CRCustomerCaseManagementPlanCreateOutputModel create(String sdReferenceId, CRCustomerCaseManagementPlanCreateInputModel request);
	
	CRCustomerCaseManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerCaseManagementPlanExchangeInputModel request);
	
	SDCustomerCaseManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerCaseManagementFeedbackInputModel request);
	
	BQPerformanceRequestOutputModel requestPerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceRequestInputModel request);
	
	BQRulesRequestOutputModel requestRules(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRulesRequestInputModel request);
	
	CRCustomerCaseManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerCaseManagementPlanRequestInputModel request);
	
	CRCustomerCaseManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQPerformanceRetrieveOutputModel retrievePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRulesRetrieveOutputModel retrieveRules(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerCaseManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerCaseManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerCaseManagementPlanUpdateInputModel request);
	
	BQPerformanceUpdateOutputModel updatePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceUpdateInputModel request);
	
	BQRulesUpdateOutputModel updateRules(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRulesUpdateInputModel request);
	
}
