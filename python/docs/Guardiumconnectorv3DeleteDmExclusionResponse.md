# Guardiumconnectorv3DeleteDmExclusionResponse

Response deleteing a datamart from exclusion list.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_delete_dm_exclusion_response import Guardiumconnectorv3DeleteDmExclusionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3DeleteDmExclusionResponse from a JSON string
guardiumconnectorv3_delete_dm_exclusion_response_instance = Guardiumconnectorv3DeleteDmExclusionResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3DeleteDmExclusionResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_delete_dm_exclusion_response_dict = guardiumconnectorv3_delete_dm_exclusion_response_instance.to_dict()
# create an instance of Guardiumconnectorv3DeleteDmExclusionResponse from a dict
guardiumconnectorv3_delete_dm_exclusion_response_from_dict = Guardiumconnectorv3DeleteDmExclusionResponse.from_dict(guardiumconnectorv3_delete_dm_exclusion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


