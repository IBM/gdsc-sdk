# Workflowv3Entity

Case or task assignment entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label** | **str** | Label of entity,  i.e. test@ibm.com. | [optional] 
**template_id** | **str** | Template for sending e-mail. | [optional] 
**type** | [**Workflowv3EntityType**](Workflowv3EntityType.md) |  | [optional] 
**value** | **str** | Value of entity, i.e. an e-mail address. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_entity import Workflowv3Entity

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3Entity from a JSON string
workflowv3_entity_instance = Workflowv3Entity.from_json(json)
# print the JSON string representation of the object
print(Workflowv3Entity.to_json())

# convert the object into a dict
workflowv3_entity_dict = workflowv3_entity_instance.to_dict()
# create an instance of Workflowv3Entity from a dict
workflowv3_entity_from_dict = Workflowv3Entity.from_dict(workflowv3_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


