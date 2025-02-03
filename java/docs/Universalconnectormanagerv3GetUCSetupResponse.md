

# Universalconnectormanagerv3GetUCSetupResponse

GetUCSetupResponse is the response object for getting the UC parameters of a specific Universal Connector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaries** | [**List&lt;Universalconnectormanagerv3File&gt;**](Universalconnectormanagerv3File.md) | Binaries files (zip,rpm,jar, base64 encoded). |  [optional] |
|**certificates** | **Map&lt;String, String&gt;** | Map of certificates (key is the name, value is the value itself). |  [optional] |
|**configurations** | [**List&lt;Universalconnectormanagerv3File&gt;**](Universalconnectormanagerv3File.md) | Configuration files for pipeline. |  [optional] |
|**credentials** | **Map&lt;String, String&gt;** | Map of credentials (key is the name, value is the value itself). |  [optional] |
|**offlinePackages** | [**List&lt;Universalconnectormanagerv3File&gt;**](Universalconnectormanagerv3File.md) |  |  [optional] |
|**pipelineType** | **String** | Type of the pipeline (pull or push). |  [optional] |



