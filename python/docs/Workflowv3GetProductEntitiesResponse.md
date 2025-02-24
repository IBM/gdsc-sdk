# Workflowv3GetProductEntitiesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entities** | [**List[Workflowv3EntityDefinition]**](Workflowv3EntityDefinition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_get_product_entities_response import Workflowv3GetProductEntitiesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3GetProductEntitiesResponse from a JSON string
workflowv3_get_product_entities_response_instance = Workflowv3GetProductEntitiesResponse.from_json(json)
# print the JSON string representation of the object
print(Workflowv3GetProductEntitiesResponse.to_json())

# convert the object into a dict
workflowv3_get_product_entities_response_dict = workflowv3_get_product_entities_response_instance.to_dict()
# create an instance of Workflowv3GetProductEntitiesResponse from a dict
workflowv3_get_product_entities_response_from_dict = Workflowv3GetProductEntitiesResponse.from_dict(workflowv3_get_product_entities_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


