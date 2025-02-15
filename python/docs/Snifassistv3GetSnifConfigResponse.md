# Snifassistv3GetSnifConfigResponse

GetSnifConfigResponse is the response message to get latest snif configuration parameters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config_id** | **str** | Specify config_id provided by configuration service. | [optional] 
**edge_id** | **str** | Specify edge_id if known. | [optional] 
**parameters** | **bytearray** | Specify latest configuration parameters. | [optional] 
**tenant_id** | **str** | Specify tenant_id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.snifassistv3_get_snif_config_response import Snifassistv3GetSnifConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3GetSnifConfigResponse from a JSON string
snifassistv3_get_snif_config_response_instance = Snifassistv3GetSnifConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3GetSnifConfigResponse.to_json())

# convert the object into a dict
snifassistv3_get_snif_config_response_dict = snifassistv3_get_snif_config_response_instance.to_dict()
# create an instance of Snifassistv3GetSnifConfigResponse from a dict
snifassistv3_get_snif_config_response_from_dict = Snifassistv3GetSnifConfigResponse.from_dict(snifassistv3_get_snif_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


