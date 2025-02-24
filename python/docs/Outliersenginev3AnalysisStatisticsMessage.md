# Outliersenginev3AnalysisStatisticsMessage

statistics of analysis tasks, with higher resolution on number of data sources, errors, and performance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasources_1h** | **int** | Number of data sources analyzed, in the last hour. | [optional] 
**datasources_24h** | **int** | Number of data sources analyzed, in the last 24 hours. | [optional] 
**datasources_72h** | **int** | Number of data sources analyzed, in the last 3 days. | [optional] 
**errors_1h** | **int** | Number of errors in log, in the last hour. | [optional] 
**errors_24h** | **int** | Number of errors in log, in the last 24 hours. | [optional] 
**errors_72h** | **int** | Number of errors in log, in the last 3 days. | [optional] 
**performance_1h** | [**Outliersenginev3AnalysisPerformanceStats**](Outliersenginev3AnalysisPerformanceStats.md) |  | [optional] 
**performance_24h** | [**Outliersenginev3AnalysisPerformanceStats**](Outliersenginev3AnalysisPerformanceStats.md) |  | [optional] 
**performance_3h** | [**Outliersenginev3AnalysisPerformanceStats**](Outliersenginev3AnalysisPerformanceStats.md) |  | [optional] 
**performance_72h** | [**Outliersenginev3AnalysisPerformanceStats**](Outliersenginev3AnalysisPerformanceStats.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_analysis_statistics_message import Outliersenginev3AnalysisStatisticsMessage

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3AnalysisStatisticsMessage from a JSON string
outliersenginev3_analysis_statistics_message_instance = Outliersenginev3AnalysisStatisticsMessage.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3AnalysisStatisticsMessage.to_json())

# convert the object into a dict
outliersenginev3_analysis_statistics_message_dict = outliersenginev3_analysis_statistics_message_instance.to_dict()
# create an instance of Outliersenginev3AnalysisStatisticsMessage from a dict
outliersenginev3_analysis_statistics_message_from_dict = Outliersenginev3AnalysisStatisticsMessage.from_dict(outliersenginev3_analysis_statistics_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


