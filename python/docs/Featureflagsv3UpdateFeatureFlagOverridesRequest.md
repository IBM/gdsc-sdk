# Featureflagsv3UpdateFeatureFlagOverridesRequest

UpdateFeatureFlagOverridesRequest request body of update featureflag API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feature_flag** | [**Featureflagsv3FeatureFlag**](Featureflagsv3FeatureFlag.md) |  | [optional] 
**tenant_id** | **str** | Optional tenant id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.featureflagsv3_update_feature_flag_overrides_request import Featureflagsv3UpdateFeatureFlagOverridesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3UpdateFeatureFlagOverridesRequest from a JSON string
featureflagsv3_update_feature_flag_overrides_request_instance = Featureflagsv3UpdateFeatureFlagOverridesRequest.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3UpdateFeatureFlagOverridesRequest.to_json())

# convert the object into a dict
featureflagsv3_update_feature_flag_overrides_request_dict = featureflagsv3_update_feature_flag_overrides_request_instance.to_dict()
# create an instance of Featureflagsv3UpdateFeatureFlagOverridesRequest from a dict
featureflagsv3_update_feature_flag_overrides_request_from_dict = Featureflagsv3UpdateFeatureFlagOverridesRequest.from_dict(featureflagsv3_update_feature_flag_overrides_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


