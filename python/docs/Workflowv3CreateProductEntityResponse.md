# Workflowv3CreateProductEntityResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | Result is unique id if an product entity is persisted. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_create_product_entity_response import Workflowv3CreateProductEntityResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3CreateProductEntityResponse from a JSON string
workflowv3_create_product_entity_response_instance = Workflowv3CreateProductEntityResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3CreateProductEntityResponse.to_json())

# convert the object into a dict
workflowv3_create_product_entity_response_dict = workflowv3_create_product_entity_response_instance.to_dict()
# create an instance of Workflowv3CreateProductEntityResponse from a dict
workflowv3_create_product_entity_response_from_dict = Workflowv3CreateProductEntityResponse.from_dict(workflowv3_create_product_entity_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


