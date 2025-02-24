# Templatesv3GetOriginFieldsResponse

The fields associated with the specified origin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | **Dict[str, str]** | Map of fields associated with the origin and the appropriate insertion sequence. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**translated_keys** | **List[str]** | List of available translation keys that can be used in the template. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_get_origin_fields_response import Templatesv3GetOriginFieldsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3GetOriginFieldsResponse from a JSON string
templatesv3_get_origin_fields_response_instance = Templatesv3GetOriginFieldsResponse.from_json(json)
# print the JSON string representation of the object
print(Templatesv3GetOriginFieldsResponse.to_json())

# convert the object into a dict
templatesv3_get_origin_fields_response_dict = templatesv3_get_origin_fields_response_instance.to_dict()
# create an instance of Templatesv3GetOriginFieldsResponse from a dict
templatesv3_get_origin_fields_response_from_dict = Templatesv3GetOriginFieldsResponse.from_dict(templatesv3_get_origin_fields_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


