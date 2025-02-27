# Workflowv3UpdateProductEntityRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str** | Unique Entity id, required for update. | [optional] 
**product_entity** | [**Workflowv3ProductEntity**](Workflowv3ProductEntity.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_update_product_entity_request import Workflowv3UpdateProductEntityRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3UpdateProductEntityRequest from a JSON string
workflowv3_update_product_entity_request_instance = Workflowv3UpdateProductEntityRequest.from_json(json)
# print the JSON string representation of the object
print(Workflowv3UpdateProductEntityRequest.to_json())

# convert the object into a dict
workflowv3_update_product_entity_request_dict = workflowv3_update_product_entity_request_instance.to_dict()
# create an instance of Workflowv3UpdateProductEntityRequest from a dict
workflowv3_update_product_entity_request_from_dict = Workflowv3UpdateProductEntityRequest.from_dict(workflowv3_update_product_entity_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


