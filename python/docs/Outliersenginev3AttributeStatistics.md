# Outliersenginev3AttributeStatistics


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute** | **str** | attribute - the actual verb/ source program/ working hours etc. | [optional] 
**hourly_average_activity** | **float** |  | [optional] 
**seen_since** | **datetime** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.outliersenginev3_attribute_statistics import Outliersenginev3AttributeStatistics

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3AttributeStatistics from a JSON string
outliersenginev3_attribute_statistics_instance = Outliersenginev3AttributeStatistics.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3AttributeStatistics.to_json())

# convert the object into a dict
outliersenginev3_attribute_statistics_dict = outliersenginev3_attribute_statistics_instance.to_dict()
# create an instance of Outliersenginev3AttributeStatistics from a dict
outliersenginev3_attribute_statistics_from_dict = Outliersenginev3AttributeStatistics.from_dict(outliersenginev3_attribute_statistics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


