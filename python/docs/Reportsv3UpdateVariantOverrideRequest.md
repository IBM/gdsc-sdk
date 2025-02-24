# Reportsv3UpdateVariantOverrideRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** |  | [optional] 
**values** | **Dict[str, str]** |  | [optional] 
**variant_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_update_variant_override_request import Reportsv3UpdateVariantOverrideRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3UpdateVariantOverrideRequest from a JSON string
reportsv3_update_variant_override_request_instance = Reportsv3UpdateVariantOverrideRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3UpdateVariantOverrideRequest.to_json())

# convert the object into a dict
reportsv3_update_variant_override_request_dict = reportsv3_update_variant_override_request_instance.to_dict()
# create an instance of Reportsv3UpdateVariantOverrideRequest from a dict
reportsv3_update_variant_override_request_from_dict = Reportsv3UpdateVariantOverrideRequest.from_dict(reportsv3_update_variant_override_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


