# Featureflagsv3GetFeatureFlagOverridesResponse

GetFeatureFlagOverridesResponse response body of get featureflag API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feature_flags** | [**List[Featureflagsv3FeatureFlagOverrides]**](Featureflagsv3FeatureFlagOverrides.md) | Overrides Feature Flag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.featureflagsv3_get_feature_flag_overrides_response import Featureflagsv3GetFeatureFlagOverridesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3GetFeatureFlagOverridesResponse from a JSON string
featureflagsv3_get_feature_flag_overrides_response_instance = Featureflagsv3GetFeatureFlagOverridesResponse.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3GetFeatureFlagOverridesResponse.to_json())

# convert the object into a dict
featureflagsv3_get_feature_flag_overrides_response_dict = featureflagsv3_get_feature_flag_overrides_response_instance.to_dict()
# create an instance of Featureflagsv3GetFeatureFlagOverridesResponse from a dict
featureflagsv3_get_feature_flag_overrides_response_from_dict = Featureflagsv3GetFeatureFlagOverridesResponse.from_dict(featureflagsv3_get_feature_flag_overrides_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


