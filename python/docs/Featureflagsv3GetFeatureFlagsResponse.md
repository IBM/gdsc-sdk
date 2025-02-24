# Featureflagsv3GetFeatureFlagsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feature_flags** | [**Dict[str, Featureflagsv3FeatureFlagValue]**](Featureflagsv3FeatureFlagValue.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.featureflagsv3_get_feature_flags_response import Featureflagsv3GetFeatureFlagsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3GetFeatureFlagsResponse from a JSON string
featureflagsv3_get_feature_flags_response_instance = Featureflagsv3GetFeatureFlagsResponse.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3GetFeatureFlagsResponse.to_json())

# convert the object into a dict
featureflagsv3_get_feature_flags_response_dict = featureflagsv3_get_feature_flags_response_instance.to_dict()
# create an instance of Featureflagsv3GetFeatureFlagsResponse from a dict
featureflagsv3_get_feature_flags_response_from_dict = Featureflagsv3GetFeatureFlagsResponse.from_dict(featureflagsv3_get_feature_flags_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


