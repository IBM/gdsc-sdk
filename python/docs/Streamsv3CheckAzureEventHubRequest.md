# Streamsv3CheckAzureEventHubRequest

CheckAzureEventHubRequest defines a request to check Azure event hub.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_key_id** | **str** | AWS access key ID. | [optional] 
**id** | **str** | Indetifier. | [optional] 
**namespace** | **str** | Azure namespace. | [optional] 
**secret_key_id** | **str** | AWS secret key ID. | [optional] 
**stream_name** | **str** | Name of stream. | [optional] 
**stream_type** | [**Streamsv3StreamType**](Streamsv3StreamType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.streamsv3_check_azure_event_hub_request import Streamsv3CheckAzureEventHubRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Streamsv3CheckAzureEventHubRequest from a JSON string
streamsv3_check_azure_event_hub_request_instance = Streamsv3CheckAzureEventHubRequest.from_json(json)
# print the JSON string representation of the object
print(Streamsv3CheckAzureEventHubRequest.to_json())

# convert the object into a dict
streamsv3_check_azure_event_hub_request_dict = streamsv3_check_azure_event_hub_request_instance.to_dict()
# create an instance of Streamsv3CheckAzureEventHubRequest from a dict
streamsv3_check_azure_event_hub_request_from_dict = Streamsv3CheckAzureEventHubRequest.from_dict(streamsv3_check_azure_event_hub_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


