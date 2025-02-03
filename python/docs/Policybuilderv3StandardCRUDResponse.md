# Policybuilderv3StandardCRUDResponse

Response to the create/update policies request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.policybuilderv3_standard_crud_response import Policybuilderv3StandardCRUDResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3StandardCRUDResponse from a JSON string
policybuilderv3_standard_crud_response_instance = Policybuilderv3StandardCRUDResponse.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3StandardCRUDResponse.to_json())

# convert the object into a dict
policybuilderv3_standard_crud_response_dict = policybuilderv3_standard_crud_response_instance.to_dict()
# create an instance of Policybuilderv3StandardCRUDResponse from a dict
policybuilderv3_standard_crud_response_from_dict = Policybuilderv3StandardCRUDResponse.from_dict(policybuilderv3_standard_crud_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


