# Reportsv3RunVariantOperationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **str** |  | [optional] 
**rules** | [**List[Reportsv3VariantRule]**](Reportsv3VariantRule.md) |  | [optional] 
**variant_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_run_variant_operation_request import Reportsv3RunVariantOperationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3RunVariantOperationRequest from a JSON string
reportsv3_run_variant_operation_request_instance = Reportsv3RunVariantOperationRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3RunVariantOperationRequest.to_json())

# convert the object into a dict
reportsv3_run_variant_operation_request_dict = reportsv3_run_variant_operation_request_instance.to_dict()
# create an instance of Reportsv3RunVariantOperationRequest from a dict
reportsv3_run_variant_operation_request_from_dict = Reportsv3RunVariantOperationRequest.from_dict(reportsv3_run_variant_operation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


