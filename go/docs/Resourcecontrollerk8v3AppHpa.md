# Resourcecontrollerk8v3AppHpa

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxReplicas** | **string** | The upper limit for the number of pods that can be set by the autoscaler. It cannot be smaller than min_replicas. | [optional] [default to null]
**MinReplicas** | **string** | Optional: The lower limit for the number of pods that can be set by the autoscaler, default 1. | [optional] [default to null]
**TargetCpuUtilizationPercentage** | **string** | Optional: The target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

