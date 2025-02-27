# Guardiumconnectorv3GetDmExclusionResponse

Returns List of datamarts in exclusion list.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamart_list** | **List[str]** | Datamart list. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_dm_exclusion_response import Guardiumconnectorv3GetDmExclusionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetDmExclusionResponse from a JSON string
guardiumconnectorv3_get_dm_exclusion_response_instance = Guardiumconnectorv3GetDmExclusionResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetDmExclusionResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_dm_exclusion_response_dict = guardiumconnectorv3_get_dm_exclusion_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetDmExclusionResponse from a dict
guardiumconnectorv3_get_dm_exclusion_response_from_dict = Guardiumconnectorv3GetDmExclusionResponse.from_dict(guardiumconnectorv3_get_dm_exclusion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


