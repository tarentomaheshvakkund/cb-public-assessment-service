package com.assessment.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface AssessmentUtilServiceV2 {
	public Map<String, Object> validateQumlAssessment(List<String> originalQuestionList,
													  List<Map<String, Object>> userQuestionList,Map<String,Object> questionMap);

	public String fetchQuestionIdentifierValue(List<String> identifierList, List<Object> questionList, String primaryCategory) throws Exception;

	Map<String, Object> filterQuestionMapDetail(Map<String, Object> questionMapResponse, String primaryCategory);

	List<Map<String, Object>> readQuestionDetails(List<String> identifiers);

	public Map<String, Object> getReadHierarchyApiResponse(String assessmentIdentifier);

	public Map<String, Object> readAssessmentHierarchyFromCache(String assessmentIdentifier,boolean editMode);

	public List<Map<String, Object>> readUserSubmittedAssessmentRecords(String email, String assessmentId, String contextId);

	public Map<String, Object> readQListfromCache(List<String> questionIds, String assessmentIdentifier,boolean editMode) throws IOException;

	public Map<String,Object> fetchHierarchyFromAssessServc(String qSetId);

	public Map<String, Object> fetchWheebox(String userId);

	/**
	 * Validates a Quml assessment by comparing the original list of questions with the user's provided list of questions.
	 *
	 * @param questionSetDetailsMap a map containing details about the question set.
	 * @param originalQuestionList  a list of original question identifiers.
	 * @param userQuestionList      a list of maps where each map represents a user's question with its details.
	 * @param questionMap           a map containing additional question-related information.
	 * @return a map with validation results and resultMap.
	 */
	public Map<String, Object> validateQumlAssessmentV2(Map<String, Object> questionSetDetailsMap, List<String> originalQuestionList,
													   List<Map<String, Object>> userQuestionList, Map<String,Object> questionMap);

	Map<String, Object> filterQuestionMapDetailV2(Map<String, Object> questionMapResponse, String primaryCategory);
}
