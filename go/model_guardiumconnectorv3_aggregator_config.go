/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Return the Aggregator configuration information from tenant database.
type Guardiumconnectorv3AggregatorConfig struct {
	// End date for Datamart export.
	DatamartEndDateAggregator string `json:"datamart_end_date_aggregator,omitempty"`
	// Start date for Datamart export.
	DatamartStartDateAggregator string `json:"datamart_start_date_aggregator,omitempty"`
	// Hostname of Aggregator.
	Host string `json:"host,omitempty"`
	// Unit type.
	UnitType string `json:"unit_type,omitempty"`
}
