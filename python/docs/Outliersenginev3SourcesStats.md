# Outliersenginev3SourcesStats

Statistics about the different sources seen. Mainly related to the number of data source users.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_avg_users** | **int** | Average users per data source, in the past 72 hours. | [optional] 
**datasource_max_users** | **int** | Maximum users in a single data source, in the past 72 hours. | [optional] 
**datasource_min_users** | **int** | Minimum users in a single data source, in the past 72 hours. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_sources_stats import Outliersenginev3SourcesStats

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3SourcesStats from a JSON string
outliersenginev3_sources_stats_instance = Outliersenginev3SourcesStats.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3SourcesStats.to_json())

# convert the object into a dict
outliersenginev3_sources_stats_dict = outliersenginev3_sources_stats_instance.to_dict()
# create an instance of Outliersenginev3SourcesStats from a dict
outliersenginev3_sources_stats_from_dict = Outliersenginev3SourcesStats.from_dict(outliersenginev3_sources_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


