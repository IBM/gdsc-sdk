# Riskanalyticsenginev3AdditionalInfo

Additional info message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | Additional info key. | [optional] 
**type** | [**Riskanalyticsenginev3FieldType**](Riskanalyticsenginev3FieldType.md) |  | [optional] [default to Riskanalyticsenginev3FieldType.UNDEFINED_TYPE]
**value** | **str** | Additional info value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_additional_info import Riskanalyticsenginev3AdditionalInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3AdditionalInfo from a JSON string
riskanalyticsenginev3_additional_info_instance = Riskanalyticsenginev3AdditionalInfo.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3AdditionalInfo.to_json())

# convert the object into a dict
riskanalyticsenginev3_additional_info_dict = riskanalyticsenginev3_additional_info_instance.to_dict()
# create an instance of Riskanalyticsenginev3AdditionalInfo from a dict
riskanalyticsenginev3_additional_info_from_dict = Riskanalyticsenginev3AdditionalInfo.from_dict(riskanalyticsenginev3_additional_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


