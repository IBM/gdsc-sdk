# Outliersenginev3QueueStatisticsMessage

StatisticsResponse is the message for the result from getStatistics.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage_1h** | [**Outliersenginev3DatasourcesCoverageStats**](Outliersenginev3DatasourcesCoverageStats.md) |  | [optional] 
**coverage_24h** | [**Outliersenginev3DatasourcesCoverageStats**](Outliersenginev3DatasourcesCoverageStats.md) |  | [optional] 
**coverage_72h** | [**Outliersenginev3DatasourcesCoverageStats**](Outliersenginev3DatasourcesCoverageStats.md) |  | [optional] 
**tasks** | **int** | Number of tasks in queue, in total. | [optional] 
**tasks_done** | **int** | Number of tasks done. | [optional] 
**tasks_in_progress** | **int** | Number of tasks in progress. | [optional] 
**tasks_in_progress_2h** | **int** | Number of tasks in progress, for over 2 hours. | [optional] 
**tasks_new** | **int** | Number of new tasks in queue. | [optional] 
**tasks_new_2h** | **int** | Number of new tasks in queue, for over 2 hours. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_queue_statistics_message import Outliersenginev3QueueStatisticsMessage

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3QueueStatisticsMessage from a JSON string
outliersenginev3_queue_statistics_message_instance = Outliersenginev3QueueStatisticsMessage.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3QueueStatisticsMessage.to_json())

# convert the object into a dict
outliersenginev3_queue_statistics_message_dict = outliersenginev3_queue_statistics_message_instance.to_dict()
# create an instance of Outliersenginev3QueueStatisticsMessage from a dict
outliersenginev3_queue_statistics_message_from_dict = Outliersenginev3QueueStatisticsMessage.from_dict(outliersenginev3_queue_statistics_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


