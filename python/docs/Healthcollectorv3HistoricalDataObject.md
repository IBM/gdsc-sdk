# Healthcollectorv3HistoricalDataObject

S-tap Historical data object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cm_id** | **str** | Cm Id. | [optional] 
**inspection_engine_counts** | [**List[Healthcollectorv3CountObject]**](Healthcollectorv3CountObject.md) | Inspection engine counts over a period of time. | [optional] 
**nodes** | [**List[Healthcollectorv3StapInformationObject]**](Healthcollectorv3StapInformationObject.md) | Detailed information about staps. | [optional] 
**stap_counts** | [**List[Healthcollectorv3CountObject]**](Healthcollectorv3CountObject.md) | Stap counts over a period of time. | [optional] 
**staps_added** | **int** | Count of staps added. | [optional] 
**staps_removed** | **int** | Count of staps removed. | [optional] 
**staps_with_ie_changes** | **int** | Count of staps that had ie changes. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_historical_data_object import Healthcollectorv3HistoricalDataObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3HistoricalDataObject from a JSON string
healthcollectorv3_historical_data_object_instance = Healthcollectorv3HistoricalDataObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3HistoricalDataObject.to_json())

# convert the object into a dict
healthcollectorv3_historical_data_object_dict = healthcollectorv3_historical_data_object_instance.to_dict()
# create an instance of Healthcollectorv3HistoricalDataObject from a dict
healthcollectorv3_historical_data_object_from_dict = Healthcollectorv3HistoricalDataObject.from_dict(healthcollectorv3_historical_data_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


