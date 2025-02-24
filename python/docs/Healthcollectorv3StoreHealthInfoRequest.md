# Healthcollectorv3StoreHealthInfoRequest

Request from Gdp containing health info.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**data** | [**List[Healthcollectorv3HealthInfoObject]**](Healthcollectorv3HealthInfoObject.md) | Health data from GDP. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_store_health_info_request import Healthcollectorv3StoreHealthInfoRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3StoreHealthInfoRequest from a JSON string
healthcollectorv3_store_health_info_request_instance = Healthcollectorv3StoreHealthInfoRequest.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3StoreHealthInfoRequest.to_json())

# convert the object into a dict
healthcollectorv3_store_health_info_request_dict = healthcollectorv3_store_health_info_request_instance.to_dict()
# create an instance of Healthcollectorv3StoreHealthInfoRequest from a dict
healthcollectorv3_store_health_info_request_from_dict = Healthcollectorv3StoreHealthInfoRequest.from_dict(healthcollectorv3_store_health_info_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


