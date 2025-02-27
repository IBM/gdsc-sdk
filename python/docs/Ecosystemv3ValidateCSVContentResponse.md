# Ecosystemv3ValidateCSVContentResponse

ValidateCSVContentResponse message as the response for the ValidateCSVContent api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_msgs** | **List[str]** | Error messages for the result. | [optional] 
**status** | [**GooglerpcStatus**](GooglerpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_validate_csv_content_response import Ecosystemv3ValidateCSVContentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3ValidateCSVContentResponse from a JSON string
ecosystemv3_validate_csv_content_response_instance = Ecosystemv3ValidateCSVContentResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3ValidateCSVContentResponse.to_json())

# convert the object into a dict
ecosystemv3_validate_csv_content_response_dict = ecosystemv3_validate_csv_content_response_instance.to_dict()
# create an instance of Ecosystemv3ValidateCSVContentResponse from a dict
ecosystemv3_validate_csv_content_response_from_dict = Ecosystemv3ValidateCSVContentResponse.from_dict(ecosystemv3_validate_csv_content_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


