

# Resourcecontrollerk8v3Container

Container contains the information about a container image.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**image** | **String** | The container image. |  [optional] |
|**imageFullyQualified** | **Boolean** | Optional: Is the container image fully qualified? i.e. it contains the registry in the path. If this value is false, then the image will be assumed to come from the configured registry on the app controller. If unspecified, the value will remain unchanged. |  [optional] |
|**resources** | [**Resourcecontrollerk8v3ContainerResources**](Resourcecontrollerk8v3ContainerResources.md) |  |  [optional] |



