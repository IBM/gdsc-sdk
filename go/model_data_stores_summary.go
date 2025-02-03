/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type DataStoresSummary struct {
	TotalStores float64 `json:"totalStores"`
	StoreTypes []DataStoresSummaryStoreTypesInner `json:"storeTypes"`
	CloudLocations []DataStoresSummaryCloudLocationsInner `json:"cloudLocations"`
	ServiceProviders []DataStoresSummaryServiceProvidersInner `json:"serviceProviders"`
	TotalSensitivities float64 `json:"totalSensitivities"`
	Sensitivities *[]SensitivitiesItemsInner `json:"sensitivities"`
	TotalPotentialFlows float64 `json:"totalPotentialFlows"`
	TotalActualFlows float64 `json:"totalActualFlows"`
	TotalSensitiveStores float64 `json:"totalSensitiveStores"`
	AccountsIds []string `json:"accountsIds"`
}
