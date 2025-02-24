# Ecosystemv3TestIntegrationResponse

Response from test of an integration configuration.  A translated response is provided to provide status of the test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | The result is \&quot;\&quot; if the operation is a success, otherwise a translated error is returned. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_test_integration_response import Ecosystemv3TestIntegrationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3TestIntegrationResponse from a JSON string
ecosystemv3_test_integration_response_instance = Ecosystemv3TestIntegrationResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3TestIntegrationResponse.to_json())

# convert the object into a dict
ecosystemv3_test_integration_response_dict = ecosystemv3_test_integration_response_instance.to_dict()
# create an instance of Ecosystemv3TestIntegrationResponse from a dict
ecosystemv3_test_integration_response_from_dict = Ecosystemv3TestIntegrationResponse.from_dict(ecosystemv3_test_integration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


