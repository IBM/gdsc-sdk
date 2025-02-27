# Analyticseventsv3DeleteCacheKeyResponse

DeleteCacheKeyResponse message for delete /api/v3/eventscache/{cache_key}.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.analyticseventsv3_delete_cache_key_response import Analyticseventsv3DeleteCacheKeyResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Analyticseventsv3DeleteCacheKeyResponse from a JSON string
analyticseventsv3_delete_cache_key_response_instance = Analyticseventsv3DeleteCacheKeyResponse.from_json(json)
# print the JSON string representation of the object
print(Analyticseventsv3DeleteCacheKeyResponse.to_json())

# convert the object into a dict
analyticseventsv3_delete_cache_key_response_dict = analyticseventsv3_delete_cache_key_response_instance.to_dict()
# create an instance of Analyticseventsv3DeleteCacheKeyResponse from a dict
analyticseventsv3_delete_cache_key_response_from_dict = Analyticseventsv3DeleteCacheKeyResponse.from_dict(analyticseventsv3_delete_cache_key_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


