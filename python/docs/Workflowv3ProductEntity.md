# Workflowv3ProductEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity** | [**Workflowv3EntityDefinition**](Workflowv3EntityDefinition.md) |  | [optional] 
**headers** | [**List[Workflowv3EntityHeader]**](Workflowv3EntityHeader.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_product_entity import Workflowv3ProductEntity

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ProductEntity from a JSON string
workflowv3_product_entity_instance = Workflowv3ProductEntity.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ProductEntity.to_json())

# convert the object into a dict
workflowv3_product_entity_dict = workflowv3_product_entity_instance.to_dict()
# create an instance of Workflowv3ProductEntity from a dict
workflowv3_product_entity_from_dict = Workflowv3ProductEntity.from_dict(workflowv3_product_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


