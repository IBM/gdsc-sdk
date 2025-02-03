# Datamartprocessorv3GetDatamartResponse

GetDatamartResponse is the response message which will have all the datamarts for a time period.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamarts** | [**List[Datamartprocessorv3DatamartInfo]**](Datamartprocessorv3DatamartInfo.md) | List of datamarts returned by GetDatamarts(). | [optional] 
**status** | [**Datamartprocessorv3StatusResponseBase**](Datamartprocessorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.datamartprocessorv3_get_datamart_response import Datamartprocessorv3GetDatamartResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Datamartprocessorv3GetDatamartResponse from a JSON string
datamartprocessorv3_get_datamart_response_instance = Datamartprocessorv3GetDatamartResponse.from_json(json)
# print the JSON string representation of the object
print(Datamartprocessorv3GetDatamartResponse.to_json())

# convert the object into a dict
datamartprocessorv3_get_datamart_response_dict = datamartprocessorv3_get_datamart_response_instance.to_dict()
# create an instance of Datamartprocessorv3GetDatamartResponse from a dict
datamartprocessorv3_get_datamart_response_from_dict = Datamartprocessorv3GetDatamartResponse.from_dict(datamartprocessorv3_get_datamart_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


