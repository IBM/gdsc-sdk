# Guardiumconnectorv3AddCMResponse

Returns the status when adding a Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_cm_response import Guardiumconnectorv3AddCMResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddCMResponse from a JSON string
guardiumconnectorv3_add_cm_response_instance = Guardiumconnectorv3AddCMResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddCMResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_add_cm_response_dict = guardiumconnectorv3_add_cm_response_instance.to_dict()
# create an instance of Guardiumconnectorv3AddCMResponse from a dict
guardiumconnectorv3_add_cm_response_from_dict = Guardiumconnectorv3AddCMResponse.from_dict(guardiumconnectorv3_add_cm_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


