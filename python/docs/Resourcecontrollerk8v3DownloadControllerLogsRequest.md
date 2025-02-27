# Resourcecontrollerk8v3DownloadControllerLogsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controller_id** | **str** | The ID of the controller to download logs for. | [optional] 
**end_date** | **str** | The end date (ms since epoch) to limit logs to. | [optional] 
**identifier** | **str** | An optional identifier to use for the request. This will set a cookie named download-logs-&lt;identifier&gt; with a value containing the result of the download request. Valid values are failed, timeout, success. | [optional] 
**previous** | **bool** | True if the logs for the previous container instance should be retrieved, false otherwise. | [optional] 
**start_date** | **str** | The start date (ms since epoch) to limit logs to. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.resourcecontrollerk8v3_download_controller_logs_request import Resourcecontrollerk8v3DownloadControllerLogsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3DownloadControllerLogsRequest from a JSON string
resourcecontrollerk8v3_download_controller_logs_request_instance = Resourcecontrollerk8v3DownloadControllerLogsRequest.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3DownloadControllerLogsRequest.to_json())

# convert the object into a dict
resourcecontrollerk8v3_download_controller_logs_request_dict = resourcecontrollerk8v3_download_controller_logs_request_instance.to_dict()
# create an instance of Resourcecontrollerk8v3DownloadControllerLogsRequest from a dict
resourcecontrollerk8v3_download_controller_logs_request_from_dict = Resourcecontrollerk8v3DownloadControllerLogsRequest.from_dict(resourcecontrollerk8v3_download_controller_logs_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


