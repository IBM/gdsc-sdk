# Streamsv3CheckAzureEventHubResponse

CheckAzureEventHubResponse defines response of CheckAzureEventHubRequest call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Streamsv3AzureCheckStatus**](Streamsv3AzureCheckStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.streamsv3_check_azure_event_hub_response import Streamsv3CheckAzureEventHubResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3CheckAzureEventHubResponse from a JSON string
streamsv3_check_azure_event_hub_response_instance = Streamsv3CheckAzureEventHubResponse.from_json(json)
# print the JSON string representation of the object
print(Streamsv3CheckAzureEventHubResponse.to_json())

# convert the object into a dict
streamsv3_check_azure_event_hub_response_dict = streamsv3_check_azure_event_hub_response_instance.to_dict()
# create an instance of Streamsv3CheckAzureEventHubResponse from a dict
streamsv3_check_azure_event_hub_response_from_dict = Streamsv3CheckAzureEventHubResponse.from_dict(streamsv3_check_azure_event_hub_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


