# StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**RuntimeStreamError**](RuntimeStreamError.md) |  | [optional] 
**result** | [**Complianceacceleratorv3CreateWorkspaceResponse**](Complianceacceleratorv3CreateWorkspaceResponse.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.stream_result_of_complianceacceleratorv3_create_workspace_response import StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse

# TODO update the JSON string below
json = "{}"
# create an instance of StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse from a JSON string
stream_result_of_complianceacceleratorv3_create_workspace_response_instance = StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.from_json(json)
# print the JSON string representation of the object
print(StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.to_json())

# convert the object into a dict
stream_result_of_complianceacceleratorv3_create_workspace_response_dict = stream_result_of_complianceacceleratorv3_create_workspace_response_instance.to_dict()
# create an instance of StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse from a dict
stream_result_of_complianceacceleratorv3_create_workspace_response_from_dict = StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse.from_dict(stream_result_of_complianceacceleratorv3_create_workspace_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


