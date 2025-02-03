# Reportsv3CreateVariantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_id** | **str** |  | [optional] 
**rules** | [**List[Reportsv3VariantRule]**](Reportsv3VariantRule.md) |  | [optional] 
**variant_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_create_variant_request import Reportsv3CreateVariantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CreateVariantRequest from a JSON string
reportsv3_create_variant_request_instance = Reportsv3CreateVariantRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CreateVariantRequest.to_json())

# convert the object into a dict
reportsv3_create_variant_request_dict = reportsv3_create_variant_request_instance.to_dict()
# create an instance of Reportsv3CreateVariantRequest from a dict
reportsv3_create_variant_request_from_dict = Reportsv3CreateVariantRequest.from_dict(reportsv3_create_variant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


