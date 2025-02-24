# Guardiumconnectorv3AddDmExclusionResponse

Response of adding a datamart to exclusion list.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_dm_exclusion_response import Guardiumconnectorv3AddDmExclusionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddDmExclusionResponse from a JSON string
guardiumconnectorv3_add_dm_exclusion_response_instance = Guardiumconnectorv3AddDmExclusionResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddDmExclusionResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_add_dm_exclusion_response_dict = guardiumconnectorv3_add_dm_exclusion_response_instance.to_dict()
# create an instance of Guardiumconnectorv3AddDmExclusionResponse from a dict
guardiumconnectorv3_add_dm_exclusion_response_from_dict = Guardiumconnectorv3AddDmExclusionResponse.from_dict(guardiumconnectorv3_add_dm_exclusion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


