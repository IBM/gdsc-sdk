# Auditv3FilterField

A filter field indicates what types are able to be filtered on. It contains the overall name of the filter as well as the sub categories that can be filtered on.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Auditv3Filter]**](Auditv3Filter.md) | The filters that are eligable to be filtered on. | [optional] 
**name** | **str** | The name of the filter field. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.auditv3_filter_field import Auditv3FilterField

# TODO update the JSON string below
json = "{}"
# create an instance of Auditv3FilterField from a JSON string
auditv3_filter_field_instance = Auditv3FilterField.from_json(json)
# print the JSON string representation of the object
print(Auditv3FilterField.to_json())

# convert the object into a dict
auditv3_filter_field_dict = auditv3_filter_field_instance.to_dict()
# create an instance of Auditv3FilterField from a dict
auditv3_filter_field_from_dict = Auditv3FilterField.from_dict(auditv3_filter_field_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


