# Guardiumconnectorv3GetSyncDMsResponse

GetSyncDMsResponse returns the array of param name/value pairs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**params** | [**List[Guardiumconnectorv3Params]**](Guardiumconnectorv3Params.md) | Array of key value pair parameters. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_sync_dms_response import Guardiumconnectorv3GetSyncDMsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetSyncDMsResponse from a JSON string
guardiumconnectorv3_get_sync_dms_response_instance = Guardiumconnectorv3GetSyncDMsResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetSyncDMsResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_sync_dms_response_dict = guardiumconnectorv3_get_sync_dms_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetSyncDMsResponse from a dict
guardiumconnectorv3_get_sync_dms_response_from_dict = Guardiumconnectorv3GetSyncDMsResponse.from_dict(guardiumconnectorv3_get_sync_dms_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


