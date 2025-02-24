/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Assetsv3AssetOverviewResponse struct {
	AssetClassification *Assetsv3AssetClassification `json:"asset_classification,omitempty"`
	AssetControl *Assetsv3AssetControl `json:"asset_control,omitempty"`
	AssetEndpoints []Assetsv3AssetEndpoint `json:"asset_endpoints,omitempty"`
	AssetInformation *Assetsv3AssetInformation `json:"asset_information,omitempty"`
	AssetResource *Assetsv3AssetResourcesInfo `json:"asset_resource,omitempty"`
	AssetRiskEvents *Assetsv3AssetRiskEvents `json:"asset_risk_events,omitempty"`
	AssetSubscriptions []Assetsv3AssetSubscription `json:"asset_subscriptions,omitempty"`
	AssetTags []Assetsv3AssetTags `json:"asset_tags,omitempty"`
	AssetVa *Assetsv3AssetVa `json:"asset_va,omitempty"`
	DropdownFlag int32 `json:"dropdown_flag,omitempty"`
	EntityType string `json:"entity_type,omitempty"`
	ExtendedProperties []Assetsv3ExtendedProp `json:"extended_properties,omitempty"`
	ModelApplication []Assetsv3ModelApplication `json:"model_application,omitempty"`
	ModelData []Assetsv3ModelData `json:"model_data,omitempty"`
	OverviewParameters []Assetsv3OverviewParameter `json:"overview_parameters,omitempty"`
}
