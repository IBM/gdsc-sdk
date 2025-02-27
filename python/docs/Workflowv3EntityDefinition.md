# Workflowv3EntityDefinition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disabled** | **bool** |  | [optional] 
**entity_id** | **str** |  | [optional] 
**entity_label** | **str** |  | [optional] 
**feature_flag** | **str** |  | [optional] 
**prevent_delete** | **bool** | Optional: if true, the product-entity cannot be deleted. But it can be updated. | [optional] 
**privilege_id** | **str** |  | [optional] 
**privilege_type** | **str** |  | [optional] 
**product_id** | **str** |  | [optional] 
**product_label** | **str** |  | [optional] 
**template_origin** | **str** |  | [optional] 
**workflow** | [**Workflowv3ProductWorkflow**](Workflowv3ProductWorkflow.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_entity_definition import Workflowv3EntityDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3EntityDefinition from a JSON string
workflowv3_entity_definition_instance = Workflowv3EntityDefinition.from_json(json)
# print the JSON string representation of the object
print(Workflowv3EntityDefinition.to_json())

# convert the object into a dict
workflowv3_entity_definition_dict = workflowv3_entity_definition_instance.to_dict()
# create an instance of Workflowv3EntityDefinition from a dict
workflowv3_entity_definition_from_dict = Workflowv3EntityDefinition.from_dict(workflowv3_entity_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


