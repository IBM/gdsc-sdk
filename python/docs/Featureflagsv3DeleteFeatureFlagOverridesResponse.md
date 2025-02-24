# Featureflagsv3DeleteFeatureFlagOverridesResponse

DeleteFeatureFlagOverridesResponse response body of delete featureflag API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.featureflagsv3_delete_feature_flag_overrides_response import Featureflagsv3DeleteFeatureFlagOverridesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3DeleteFeatureFlagOverridesResponse from a JSON string
featureflagsv3_delete_feature_flag_overrides_response_instance = Featureflagsv3DeleteFeatureFlagOverridesResponse.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3DeleteFeatureFlagOverridesResponse.to_json())

# convert the object into a dict
featureflagsv3_delete_feature_flag_overrides_response_dict = featureflagsv3_delete_feature_flag_overrides_response_instance.to_dict()
# create an instance of Featureflagsv3DeleteFeatureFlagOverridesResponse from a dict
featureflagsv3_delete_feature_flag_overrides_response_from_dict = Featureflagsv3DeleteFeatureFlagOverridesResponse.from_dict(featureflagsv3_delete_feature_flag_overrides_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


