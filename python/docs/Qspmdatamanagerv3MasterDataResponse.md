# Qspmdatamanagerv3MasterDataResponse

MasterDataResponse is the response object for GetMasterData API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**masterdata** | [**List[Qspmdatamanagerv3MasterDataModel]**](Qspmdatamanagerv3MasterDataModel.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_master_data_response import Qspmdatamanagerv3MasterDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3MasterDataResponse from a JSON string
qspmdatamanagerv3_master_data_response_instance = Qspmdatamanagerv3MasterDataResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3MasterDataResponse.to_json())

# convert the object into a dict
qspmdatamanagerv3_master_data_response_dict = qspmdatamanagerv3_master_data_response_instance.to_dict()
# create an instance of Qspmdatamanagerv3MasterDataResponse from a dict
qspmdatamanagerv3_master_data_response_from_dict = Qspmdatamanagerv3MasterDataResponse.from_dict(qspmdatamanagerv3_master_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


