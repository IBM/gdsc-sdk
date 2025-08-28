

# Connectionsv3StreamConnection

Structure for AWS/Azure Connection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account id. |  [optional] |
|**accountName** | **String** | Account name. |  [optional] |
|**clusterResourceId** | **String** | Cluster resource ID. |  [optional] |
|**consumerGroupName** | **String** | Consumer group name. |  [optional] |
|**dbDnsEndpoint** | **String** | Database DNS endpoint OR Database host. |  [optional] |
|**dbName** | **String** | Database name. |  [optional] |
|**dbType** | **String** | Database type. |  [optional] |
|**name** | **String** | Event Hub name || Stream name. |  [optional] |
|**namespace** | **String** | Optional: Namespace provided if the connection type is Azure. |  [optional] |
|**password** | **String** | Database credential password. |  [optional] |
|**port** | **String** | Port. |  [optional] |
|**provider** | **String** | Optional: the provider provided if the connection type is Azure. |  [optional] |
|**region** | **String** | Optional: the region provided if the connection type is AWS. |  [optional] |
|**startMonitor** | **String** | Connection Monitoring. |  [optional] |
|**status** | **Connectionsv3Status** |  |  [optional] |
|**statusText** | **String** | If status is not OK, details what&#39;s wrong (non-localized). |  [optional] |
|**statusTimestamp** | **String** | The time stamp of status. |  [optional] |
|**storageConnectionString** | **String** | Optional: Storage connection string must be provided if the connection type is Azure. |  [optional] |
|**username** | **String** | Database credential username. |  [optional] |



