

# VulnerabilitiesByDataStoreFilterOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vulnerabilityTypes** | **List&lt;VulnerabilityType&gt;** |  |  [optional] |
|**criticalities** | **List&lt;VulnerabilityCriticality&gt;** |  |  [optional] |
|**threats** | [**List&lt;ThreatsEnum&gt;**](#List&lt;ThreatsEnum&gt;) |  |  [optional] |
|**compliance** | **List&lt;Compliance&gt;** |  |  [optional] |
|**threatCategories** | **List&lt;VulnerabilityThreatCategory&gt;** |  |  [optional] |
|**affectedDataStore** | [**VulnerabilityAffectedDataStoreFilterOptions**](VulnerabilityAffectedDataStoreFilterOptions.md) |  |  [optional] |
|**statusTypes** | **List&lt;VulnerabilityStatusType&gt;** |  |  [optional] |
|**statusTypeFamilies** | **List&lt;VulnerabilityStatusTypeFamily&gt;** |  |  [optional] |
|**discoveredSince** | **BigDecimal** | as epoch timestamp |  [optional] |
|**sensitiveTags** | **List&lt;String&gt;** |  |  [optional] |
|**compliances** | **List&lt;Compliance&gt;** |  |  [optional] |



## Enum: List&lt;ThreatsEnum&gt;

| Name | Value |
|---- | -----|
| DATA_LEAKAGE | &quot;Data Leakage&quot; |
| RANSOMWARE | &quot;Ransomware&quot; |
| COMPLIANCE_VIOLATION | &quot;Compliance Violation&quot; |
| MALWARE | &quot;Malware&quot; |
| EXTERNAL_SHARING | &quot;External Sharing&quot; |



