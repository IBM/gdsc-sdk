# Guardiumconnectorv3GetCollectorsConfigResponse

Retrieves Collector configurations.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collectors_config** | [**List[Guardiumconnectorv3CollectorConfig]**](Guardiumconnectorv3CollectorConfig.md) | list of collectors. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_collectors_config_response import Guardiumconnectorv3GetCollectorsConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetCollectorsConfigResponse from a JSON string
guardiumconnectorv3_get_collectors_config_response_instance = Guardiumconnectorv3GetCollectorsConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetCollectorsConfigResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_collectors_config_response_dict = guardiumconnectorv3_get_collectors_config_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetCollectorsConfigResponse from a dict
guardiumconnectorv3_get_collectors_config_response_from_dict = Guardiumconnectorv3GetCollectorsConfigResponse.from_dict(guardiumconnectorv3_get_collectors_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


