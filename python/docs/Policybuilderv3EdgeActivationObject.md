# Policybuilderv3EdgeActivationObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activation_order** | **int** |  | [optional] 
**activation_status** | [**Policybuilderv3ActivationStatus**](Policybuilderv3ActivationStatus.md) |  | [optional] 
**activation_timestamp** | **datetime** |  | [optional] 
**edge_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_edge_activation_object import Policybuilderv3EdgeActivationObject

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3EdgeActivationObject from a JSON string
policybuilderv3_edge_activation_object_instance = Policybuilderv3EdgeActivationObject.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3EdgeActivationObject.to_json())

# convert the object into a dict
policybuilderv3_edge_activation_object_dict = policybuilderv3_edge_activation_object_instance.to_dict()
# create an instance of Policybuilderv3EdgeActivationObject from a dict
policybuilderv3_edge_activation_object_from_dict = Policybuilderv3EdgeActivationObject.from_dict(policybuilderv3_edge_activation_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


