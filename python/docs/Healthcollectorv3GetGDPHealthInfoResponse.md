# Healthcollectorv3GetGDPHealthInfoResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**all_nodes** | [**List[Healthcollectorv3CMNodeObject]**](Healthcollectorv3CMNodeObject.md) | List of managed units and monitoring agents associated with the central manager. | [optional] 
**status** | [**Healthcollectorv3StatusResponseBase**](Healthcollectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_gdp_health_info_response import Healthcollectorv3GetGDPHealthInfoResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3GetGDPHealthInfoResponse from a JSON string
healthcollectorv3_get_gdp_health_info_response_instance = Healthcollectorv3GetGDPHealthInfoResponse.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3GetGDPHealthInfoResponse.to_json())

# convert the object into a dict
healthcollectorv3_get_gdp_health_info_response_dict = healthcollectorv3_get_gdp_health_info_response_instance.to_dict()
# create an instance of Healthcollectorv3GetGDPHealthInfoResponse from a dict
healthcollectorv3_get_gdp_health_info_response_from_dict = Healthcollectorv3GetGDPHealthInfoResponse.from_dict(healthcollectorv3_get_gdp_health_info_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


