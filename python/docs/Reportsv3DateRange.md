# Reportsv3DateRange

DateRange represents a date range type - from an enum and if its custom / relative - the start and the end date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date** | **str** | If custom holds the date string. | [optional] 
**end_number** | **int** | If custom-relative -  holds the end number. | [optional] 
**end_unit** | [**Reportsv3DateRangeUnit**](Reportsv3DateRangeUnit.md) |  | [optional] [default to Reportsv3DateRangeUnit.UNDEFINED_UINT_TYPE]
**start_date** | **str** | If custom holds the date string. | [optional] 
**start_number** | **int** | If custom-relative -  holds the start number. | [optional] 
**start_unit** | [**Reportsv3DateRangeUnit**](Reportsv3DateRangeUnit.md) |  | [optional] [default to Reportsv3DateRangeUnit.UNDEFINED_UINT_TYPE]
**type** | [**Reportsv3DateRangeType**](Reportsv3DateRangeType.md) |  | [optional] [default to Reportsv3DateRangeType.UNDEFINED_DATE_RANGE_TYPE]

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_date_range import Reportsv3DateRange

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3DateRange from a JSON string
reportsv3_date_range_instance = Reportsv3DateRange.from_json(json)
# print the JSON string representation of the object
print(Reportsv3DateRange.to_json())

# convert the object into a dict
reportsv3_date_range_dict = reportsv3_date_range_instance.to_dict()
# create an instance of Reportsv3DateRange from a dict
reportsv3_date_range_from_dict = Reportsv3DateRange.from_dict(reportsv3_date_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


