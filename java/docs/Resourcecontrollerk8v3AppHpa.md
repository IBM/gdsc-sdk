

# Resourcecontrollerk8v3AppHpa

AppHpa contains the information required for horizontal pod autoscaler.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxReplicas** | **String** | The upper limit for the number of pods that can be set by the autoscaler. It cannot be smaller than min_replicas. |  [optional] |
|**minReplicas** | **String** | Optional: The lower limit for the number of pods that can be set by the autoscaler, default 1. |  [optional] |
|**targetCpuUtilizationPercentage** | **String** | Optional: The target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified it defaults to the target CPU utilization at 80% of the requested resources. |  [optional] |



