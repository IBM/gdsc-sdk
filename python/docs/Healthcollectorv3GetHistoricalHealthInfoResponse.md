# Healthcollectorv3GetHistoricalHealthInfoResponse

Response object of the historical api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**historical_data_nodes** | [**List[Healthcollectorv3HistoricalDataObject]**](Healthcollectorv3HistoricalDataObject.md) | List of managed units and monitoring agents associated with the central manager. | [optional] 
**status** | [**Healthcollectorv3StatusResponseBase**](Healthcollectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_get_historical_health_info_response import Healthcollectorv3GetHistoricalHealthInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3GetHistoricalHealthInfoResponse from a JSON string
healthcollectorv3_get_historical_health_info_response_instance = Healthcollectorv3GetHistoricalHealthInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3GetHistoricalHealthInfoResponse.to_json())

# convert the object into a dict
healthcollectorv3_get_historical_health_info_response_dict = healthcollectorv3_get_historical_health_info_response_instance.to_dict()
# create an instance of Healthcollectorv3GetHistoricalHealthInfoResponse from a dict
healthcollectorv3_get_historical_health_info_response_from_dict = Healthcollectorv3GetHistoricalHealthInfoResponse.from_dict(healthcollectorv3_get_historical_health_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


