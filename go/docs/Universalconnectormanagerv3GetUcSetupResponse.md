# Universalconnectormanagerv3GetUcSetupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Binaries** | [**[]Universalconnectormanagerv3File**](universalconnectormanagerv3File.md) | Binaries files (zip,rpm,jar, base64 encoded). | [optional] [default to null]
**Certificates** | **map[string]string** | Map of certificates (key is the name, value is the value itself). | [optional] [default to null]
**Configurations** | [**[]Universalconnectormanagerv3File**](universalconnectormanagerv3File.md) | Configuration files for pipeline. | [optional] [default to null]
**Credentials** | **map[string]string** | Map of credentials (key is the name, value is the value itself). | [optional] [default to null]
**OfflinePackages** | [**[]Universalconnectormanagerv3File**](universalconnectormanagerv3File.md) |  | [optional] [default to null]
**PipelineType** | **string** | Type of the pipeline (pull or push). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

