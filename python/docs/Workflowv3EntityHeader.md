# Workflowv3EntityHeader


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**choices** | [**List[Workflowv3EntityValueChoice]**](Workflowv3EntityValueChoice.md) |  | [optional] 
**group_type_id** | **int** |  | [optional] 
**hide_from_view** | **bool** |  | [optional] 
**key** | **str** |  | [optional] 
**type** | [**Workflowv3EntityHeaderType**](Workflowv3EntityHeaderType.md) |  | [optional] [default to Workflowv3EntityHeaderType.STRING]
**value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_entity_header import Workflowv3EntityHeader

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3EntityHeader from a JSON string
workflowv3_entity_header_instance = Workflowv3EntityHeader.from_json(json)
# print the JSON string representation of the object
print(Workflowv3EntityHeader.to_json())

# convert the object into a dict
workflowv3_entity_header_dict = workflowv3_entity_header_instance.to_dict()
# create an instance of Workflowv3EntityHeader from a dict
workflowv3_entity_header_from_dict = Workflowv3EntityHeader.from_dict(workflowv3_entity_header_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


