

# Riskanalyticscontrollerv3RiskFeedback

RiskFeedback represent feedback object in status NEW that should be sent to UI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comments** | **String** | Feedback comments. |  [optional] |
|**creationTime** | **OffsetDateTime** | Feedback creation time. |  [optional] |
|**features** | [**List&lt;Riskanalyticsenginev3Feature&gt;**](Riskanalyticsenginev3Feature.md) | List of features for the risk that related to this feedback. |  [optional] |
|**newClassification** | **String** | Feedback classification. |  [optional] |
|**newSeverity** | **Riskanalyticsenginev3SeverityLevel** |  |  [optional] |
|**oldClassification** | **String** | Original classification. |  [optional] |
|**oldSeverity** | **Riskanalyticsenginev3SeverityLevel** |  |  [optional] |



