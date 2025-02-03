

# Ecosystemv3DatasetsFilter

DatasetsFilter includes all fields used to filter the set of desired datasets list returned by a GET request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**datasetNames** | **List&lt;String&gt;** | The state filter groups commonly paired states. Only returns records that include the specified names. |  [optional] |
|**endTime** | **OffsetDateTime** | Return datasets created before this time (&lt;). |  [optional] |
|**startTime** | **OffsetDateTime** | Return datasets created at this time or later (&gt;&#x3D;). |  [optional] |



