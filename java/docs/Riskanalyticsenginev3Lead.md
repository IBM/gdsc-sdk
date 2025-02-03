

# Riskanalyticsenginev3Lead

A lead for each pivot which triggers the whole process - to find a risk for this pivot.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | Count of events. |  [optional] |
|**creationTime** | **OffsetDateTime** | The lead creation time in format YYYY-MM-DDTHH:mm:ss.sssZ. |  [optional] |
|**info** | [**List&lt;Riskanalyticsenginev3AdditionalInfo&gt;**](Riskanalyticsenginev3AdditionalInfo.md) | Additional info. |  [optional] |
|**isObservation** | **Boolean** | Is observation flag for the lead to set true based on lead information. |  [optional] |
|**leadKey** | **String** | The Lead Key name. |  [optional] |
|**pivot** | [**Riskanalyticsenginev3Pivot**](Riskanalyticsenginev3Pivot.md) |  |  [optional] |
|**score** | **Float** | The lead score (normalized score between 0 and 1). |  [optional] |
|**severity** | **Integer** | Lead severity. |  [optional] |
|**type** | **Riskanalyticsenginev3LeadType** |  |  [optional] |



