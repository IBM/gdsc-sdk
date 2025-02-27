# Outliersenginev3GetSourceStatisticsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_statistics** | [**List[Outliersenginev3SourceAttributesStatistics]**](Outliersenginev3SourceAttributesStatistics.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_get_source_statistics_response import Outliersenginev3GetSourceStatisticsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3GetSourceStatisticsResponse from a JSON string
outliersenginev3_get_source_statistics_response_instance = Outliersenginev3GetSourceStatisticsResponse.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3GetSourceStatisticsResponse.to_json())

# convert the object into a dict
outliersenginev3_get_source_statistics_response_dict = outliersenginev3_get_source_statistics_response_instance.to_dict()
# create an instance of Outliersenginev3GetSourceStatisticsResponse from a dict
outliersenginev3_get_source_statistics_response_from_dict = Outliersenginev3GetSourceStatisticsResponse.from_dict(outliersenginev3_get_source_statistics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


