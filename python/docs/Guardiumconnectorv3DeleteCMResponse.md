# Guardiumconnectorv3DeleteCMResponse

Returns the status when deleting a Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_delete_cm_response import Guardiumconnectorv3DeleteCMResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3DeleteCMResponse from a JSON string
guardiumconnectorv3_delete_cm_response_instance = Guardiumconnectorv3DeleteCMResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3DeleteCMResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_delete_cm_response_dict = guardiumconnectorv3_delete_cm_response_instance.to_dict()
# create an instance of Guardiumconnectorv3DeleteCMResponse from a dict
guardiumconnectorv3_delete_cm_response_from_dict = Guardiumconnectorv3DeleteCMResponse.from_dict(guardiumconnectorv3_delete_cm_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


