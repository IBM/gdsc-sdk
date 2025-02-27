# Guardiumconnectorv3DatabaseResultResponse

Result of database connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_status** | **bool** | Connection status. | [optional] 
**err** | **str** | Error status message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_database_result_response import Guardiumconnectorv3DatabaseResultResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3DatabaseResultResponse from a JSON string
guardiumconnectorv3_database_result_response_instance = Guardiumconnectorv3DatabaseResultResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3DatabaseResultResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_database_result_response_dict = guardiumconnectorv3_database_result_response_instance.to_dict()
# create an instance of Guardiumconnectorv3DatabaseResultResponse from a dict
guardiumconnectorv3_database_result_response_from_dict = Guardiumconnectorv3DatabaseResultResponse.from_dict(guardiumconnectorv3_database_result_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


