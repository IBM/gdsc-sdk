# Analyticseventsv3DeleteCacheKeyRequest

DeleteCacheKeyRequest message for delete /api/v3/eventscache/{cache_key}.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cache_key** | **str** | The cache key to delete. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.analyticseventsv3_delete_cache_key_request import Analyticseventsv3DeleteCacheKeyRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Analyticseventsv3DeleteCacheKeyRequest from a JSON string
analyticseventsv3_delete_cache_key_request_instance = Analyticseventsv3DeleteCacheKeyRequest.from_json(json)
# print the JSON string representation of the object
print(Analyticseventsv3DeleteCacheKeyRequest.to_json())

# convert the object into a dict
analyticseventsv3_delete_cache_key_request_dict = analyticseventsv3_delete_cache_key_request_instance.to_dict()
# create an instance of Analyticseventsv3DeleteCacheKeyRequest from a dict
analyticseventsv3_delete_cache_key_request_from_dict = Analyticseventsv3DeleteCacheKeyRequest.from_dict(analyticseventsv3_delete_cache_key_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


