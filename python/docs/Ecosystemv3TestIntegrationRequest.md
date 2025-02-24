# Ecosystemv3TestIntegrationRequest

Test the specified integrations confiuguration.  The configuration properties vary by integration and must match the required content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration_type** | **str** |  | [optional] 
**options** | **Dict[str, str]** | The integration properties; they must match those required by the integration. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_test_integration_request import Ecosystemv3TestIntegrationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3TestIntegrationRequest from a JSON string
ecosystemv3_test_integration_request_instance = Ecosystemv3TestIntegrationRequest.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3TestIntegrationRequest.to_json())

# convert the object into a dict
ecosystemv3_test_integration_request_dict = ecosystemv3_test_integration_request_instance.to_dict()
# create an instance of Ecosystemv3TestIntegrationRequest from a dict
ecosystemv3_test_integration_request_from_dict = Ecosystemv3TestIntegrationRequest.from_dict(ecosystemv3_test_integration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


