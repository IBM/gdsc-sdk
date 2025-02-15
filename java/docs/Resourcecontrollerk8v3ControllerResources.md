

# Resourcecontrollerk8v3ControllerResources

ControllerResources contains the information about a controller's resources.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allocatable** | **Map&lt;String, String&gt;** | The allocatable resources for the controller. |  [optional] |
|**node** | **String** | The node where the controller is. |  [optional] |
|**timestamp** | **String** | The date this controller resource was queried. |  [optional] |
|**usage** | **Map&lt;String, String&gt;** | The CPU and memory usage. |  [optional] |
|**window** | **String** | The duration this controller resource was collected (in seconds). |  [optional] |



