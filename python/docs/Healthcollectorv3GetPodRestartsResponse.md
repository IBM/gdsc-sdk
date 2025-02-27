# Healthcollectorv3GetPodRestartsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pod_restarts** | [**List[Healthcollectorv3Usage]**](Healthcollectorv3Usage.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_get_pod_restarts_response import Healthcollectorv3GetPodRestartsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3GetPodRestartsResponse from a JSON string
healthcollectorv3_get_pod_restarts_response_instance = Healthcollectorv3GetPodRestartsResponse.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3GetPodRestartsResponse.to_json())

# convert the object into a dict
healthcollectorv3_get_pod_restarts_response_dict = healthcollectorv3_get_pod_restarts_response_instance.to_dict()
# create an instance of Healthcollectorv3GetPodRestartsResponse from a dict
healthcollectorv3_get_pod_restarts_response_from_dict = Healthcollectorv3GetPodRestartsResponse.from_dict(healthcollectorv3_get_pod_restarts_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


