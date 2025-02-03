# Qspmdatamanagerv3UpdateNetLocRequest

UpdateNetLocRequest is the request object for UpdateNetLocation API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netloc_city** | **str** |  | [optional] 
**netloc_country** | **str** |  | [optional] 
**netloc_data_center** | **str** |  | [optional] 
**netloc_region** | **str** |  | [optional] 
**netloc_state_prov** | **str** |  | [optional] 
**netloc_uuid** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_update_net_loc_request import Qspmdatamanagerv3UpdateNetLocRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3UpdateNetLocRequest from a JSON string
qspmdatamanagerv3_update_net_loc_request_instance = Qspmdatamanagerv3UpdateNetLocRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3UpdateNetLocRequest.to_json())

# convert the object into a dict
qspmdatamanagerv3_update_net_loc_request_dict = qspmdatamanagerv3_update_net_loc_request_instance.to_dict()
# create an instance of Qspmdatamanagerv3UpdateNetLocRequest from a dict
qspmdatamanagerv3_update_net_loc_request_from_dict = Qspmdatamanagerv3UpdateNetLocRequest.from_dict(qspmdatamanagerv3_update_net_loc_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


