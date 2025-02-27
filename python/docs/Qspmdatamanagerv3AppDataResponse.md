# Qspmdatamanagerv3AppDataResponse

AppDataResponse is the response object for GetAppDataForProvisionId API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_data** | [**List[Qspmdatamanagerv3AppData]**](Qspmdatamanagerv3AppData.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_app_data_response import Qspmdatamanagerv3AppDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmdatamanagerv3AppDataResponse from a JSON string
qspmdatamanagerv3_app_data_response_instance = Qspmdatamanagerv3AppDataResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmdatamanagerv3AppDataResponse.to_json())

# convert the object into a dict
qspmdatamanagerv3_app_data_response_dict = qspmdatamanagerv3_app_data_response_instance.to_dict()
# create an instance of Qspmdatamanagerv3AppDataResponse from a dict
qspmdatamanagerv3_app_data_response_from_dict = Qspmdatamanagerv3AppDataResponse.from_dict(qspmdatamanagerv3_app_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


