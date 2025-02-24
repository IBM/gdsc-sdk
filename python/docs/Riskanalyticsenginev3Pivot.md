# Riskanalyticsenginev3Pivot

Pivot is the subject of the lead / risk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**database** | **str** | Optional database - if pivot is db user / database. | [optional] 
**database_source_field** | [**Riskanalyticsenginev3DatabaseSourceField**](Riskanalyticsenginev3DatabaseSourceField.md) |  | [optional] 
**db_user** | **str** | Optional db_user - if pivot is db user. | [optional] 
**id** | **str** | Pivot id -  all pivot fields separated by semicolon. | [optional] 
**os_user** | **str** | Optional os_user - if pivot is os user. | [optional] 
**server_ip** | **str** | Optional server_ip - if pivot is db user / database. | [optional] 
**type** | [**Riskanalyticsenginev3PivotType**](Riskanalyticsenginev3PivotType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_pivot import Riskanalyticsenginev3Pivot

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3Pivot from a JSON string
riskanalyticsenginev3_pivot_instance = Riskanalyticsenginev3Pivot.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3Pivot.to_json())

# convert the object into a dict
riskanalyticsenginev3_pivot_dict = riskanalyticsenginev3_pivot_instance.to_dict()
# create an instance of Riskanalyticsenginev3Pivot from a dict
riskanalyticsenginev3_pivot_from_dict = Riskanalyticsenginev3Pivot.from_dict(riskanalyticsenginev3_pivot_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


