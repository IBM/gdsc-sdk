# Healthcollectorv3GetTopGDPCollectorsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**top_gdp_collectors** | [**List[Healthcollectorv3Usage]**](Healthcollectorv3Usage.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_top_gdp_collectors_response import Healthcollectorv3GetTopGDPCollectorsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3GetTopGDPCollectorsResponse from a JSON string
healthcollectorv3_get_top_gdp_collectors_response_instance = Healthcollectorv3GetTopGDPCollectorsResponse.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3GetTopGDPCollectorsResponse.to_json())

# convert the object into a dict
healthcollectorv3_get_top_gdp_collectors_response_dict = healthcollectorv3_get_top_gdp_collectors_response_instance.to_dict()
# create an instance of Healthcollectorv3GetTopGDPCollectorsResponse from a dict
healthcollectorv3_get_top_gdp_collectors_response_from_dict = Healthcollectorv3GetTopGDPCollectorsResponse.from_dict(healthcollectorv3_get_top_gdp_collectors_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


