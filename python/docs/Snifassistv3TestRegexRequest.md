# Snifassistv3TestRegexRequest

TestRegexRequest defines the message structure for regex test request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regex** | **str** | Provide a regex pattern. | [optional] 
**tenant_id** | **str** | Provide tenant_id. | [optional] 
**text** | **str** | Provide a text string for matching the regex pattern. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.snifassistv3_test_regex_request import Snifassistv3TestRegexRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3TestRegexRequest from a JSON string
snifassistv3_test_regex_request_instance = Snifassistv3TestRegexRequest.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3TestRegexRequest.to_json())

# convert the object into a dict
snifassistv3_test_regex_request_dict = snifassistv3_test_regex_request_instance.to_dict()
# create an instance of Snifassistv3TestRegexRequest from a dict
snifassistv3_test_regex_request_from_dict = Snifassistv3TestRegexRequest.from_dict(snifassistv3_test_regex_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


