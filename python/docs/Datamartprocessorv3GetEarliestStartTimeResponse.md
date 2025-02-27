# Datamartprocessorv3GetEarliestStartTimeResponse

GetEarliestStartTimeResponse response object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md) |  | [optional] 
**timestamp** | **datetime** | Earliest time stamp of data available. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.datamartprocessorv3_get_earliest_start_time_response import Datamartprocessorv3GetEarliestStartTimeResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3GetEarliestStartTimeResponse from a JSON string
datamartprocessorv3_get_earliest_start_time_response_instance = Datamartprocessorv3GetEarliestStartTimeResponse.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3GetEarliestStartTimeResponse.to_json())

# convert the object into a dict
datamartprocessorv3_get_earliest_start_time_response_dict = datamartprocessorv3_get_earliest_start_time_response_instance.to_dict()
# create an instance of Datamartprocessorv3GetEarliestStartTimeResponse from a dict
datamartprocessorv3_get_earliest_start_time_response_from_dict = Datamartprocessorv3GetEarliestStartTimeResponse.from_dict(datamartprocessorv3_get_earliest_start_time_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


