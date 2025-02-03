# Outliersenginev3StatisticsResponse

StatisticsResponse is the message for the result from getStatistics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysis_statistics** | [**Outliersenginev3AnalysisStatisticsMessage**](Outliersenginev3AnalysisStatisticsMessage.md) |  | [optional] 
**number_of_clusters** | **int** | Number of clusters. | [optional] 
**number_of_completed_periods** | **int** | Number of completed periods. | [optional] 
**number_of_outliers_details** | **int** | Number of outliers in details table. | [optional] 
**number_of_outliers_summary** | **int** | Number of outliers in summary table. | [optional] 
**number_of_sources** | **int** | Number of sources. | [optional] 
**number_of_uncompleted_periods** | **int** | Number of uncompleted periods. | [optional] 
**outliers_stats** | [**Outliersenginev3OutliersStats**](Outliersenginev3OutliersStats.md) |  | [optional] 
**queue_statistics** | [**Outliersenginev3QueueStatisticsMessage**](Outliersenginev3QueueStatisticsMessage.md) |  | [optional] 
**sources_stats** | [**Outliersenginev3SourcesStats**](Outliersenginev3SourcesStats.md) |  | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_statistics_response import Outliersenginev3StatisticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3StatisticsResponse from a JSON string
outliersenginev3_statistics_response_instance = Outliersenginev3StatisticsResponse.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3StatisticsResponse.to_json())

# convert the object into a dict
outliersenginev3_statistics_response_dict = outliersenginev3_statistics_response_instance.to_dict()
# create an instance of Outliersenginev3StatisticsResponse from a dict
outliersenginev3_statistics_response_from_dict = Outliersenginev3StatisticsResponse.from_dict(outliersenginev3_statistics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


