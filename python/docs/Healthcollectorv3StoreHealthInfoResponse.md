# Healthcollectorv3StoreHealthInfoResponse

Response returned to GDP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message for GDP. | [optional] 
**response_code** | **str** | Translatable response code or empty string if there is no response. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_store_health_info_response import Healthcollectorv3StoreHealthInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StoreHealthInfoResponse from a JSON string
healthcollectorv3_store_health_info_response_instance = Healthcollectorv3StoreHealthInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StoreHealthInfoResponse.to_json())

# convert the object into a dict
healthcollectorv3_store_health_info_response_dict = healthcollectorv3_store_health_info_response_instance.to_dict()
# create an instance of Healthcollectorv3StoreHealthInfoResponse from a dict
healthcollectorv3_store_health_info_response_from_dict = Healthcollectorv3StoreHealthInfoResponse.from_dict(healthcollectorv3_store_health_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


