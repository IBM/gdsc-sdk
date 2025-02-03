# Datamartprocessorv3GetDatamartInfoResponse

GetDatamartInfoResponse is the response message which will have all file info in datamart.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamart** | [**Datamartprocessorv3DatamartInfo**](Datamartprocessorv3DatamartInfo.md) |  | [optional] 
**status** | [**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.datamartprocessorv3_get_datamart_info_response import Datamartprocessorv3GetDatamartInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3GetDatamartInfoResponse from a JSON string
datamartprocessorv3_get_datamart_info_response_instance = Datamartprocessorv3GetDatamartInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3GetDatamartInfoResponse.to_json())

# convert the object into a dict
datamartprocessorv3_get_datamart_info_response_dict = datamartprocessorv3_get_datamart_info_response_instance.to_dict()
# create an instance of Datamartprocessorv3GetDatamartInfoResponse from a dict
datamartprocessorv3_get_datamart_info_response_from_dict = Datamartprocessorv3GetDatamartInfoResponse.from_dict(datamartprocessorv3_get_datamart_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


