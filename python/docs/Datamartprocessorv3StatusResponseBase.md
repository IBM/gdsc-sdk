# Datamartprocessorv3StatusResponseBase

StatusResponseBase is the message that stores status code and message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message for status response. | [optional] 
**status** | **str** | Status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.datamartprocessorv3_status_response_base import Datamartprocessorv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3StatusResponseBase from a JSON string
datamartprocessorv3_status_response_base_instance = Datamartprocessorv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3StatusResponseBase.to_json())

# convert the object into a dict
datamartprocessorv3_status_response_base_dict = datamartprocessorv3_status_response_base_instance.to_dict()
# create an instance of Datamartprocessorv3StatusResponseBase from a dict
datamartprocessorv3_status_response_base_from_dict = Datamartprocessorv3StatusResponseBase.from_dict(datamartprocessorv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


