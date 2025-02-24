# Assetsv3TimelineDateRange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **str** |  | [optional] 
**end_number** | **int** |  | [optional] 
**end_unit** | **str** |  | [optional] 
**error** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**start** | **str** |  | [optional] 
**start_number** | **int** |  | [optional] 
**start_unit** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_timeline_date_range import Assetsv3TimelineDateRange

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3TimelineDateRange from a JSON string
assetsv3_timeline_date_range_instance = Assetsv3TimelineDateRange.from_json(json)
# print the JSON string representation of the object
print(Assetsv3TimelineDateRange.to_json())

# convert the object into a dict
assetsv3_timeline_date_range_dict = assetsv3_timeline_date_range_instance.to_dict()
# create an instance of Assetsv3TimelineDateRange from a dict
assetsv3_timeline_date_range_from_dict = Assetsv3TimelineDateRange.from_dict(assetsv3_timeline_date_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


