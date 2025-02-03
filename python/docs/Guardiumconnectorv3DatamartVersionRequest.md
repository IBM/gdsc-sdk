# Guardiumconnectorv3DatamartVersionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** |  | [optional] 
**data** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_datamart_version_request import Guardiumconnectorv3DatamartVersionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3DatamartVersionRequest from a JSON string
guardiumconnectorv3_datamart_version_request_instance = Guardiumconnectorv3DatamartVersionRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3DatamartVersionRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_datamart_version_request_dict = guardiumconnectorv3_datamart_version_request_instance.to_dict()
# create an instance of Guardiumconnectorv3DatamartVersionRequest from a dict
guardiumconnectorv3_datamart_version_request_from_dict = Guardiumconnectorv3DatamartVersionRequest.from_dict(guardiumconnectorv3_datamart_version_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


