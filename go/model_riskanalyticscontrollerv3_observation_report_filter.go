/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// ObservationReportFilter header id and value to apply as a report filter.
type Riskanalyticscontrollerv3ObservationReportFilter struct {
	// The header id to filter.
	HeaderId string `json:"header_id,omitempty"`
	// The value to filter this header by.
	HeaderValue string `json:"header_value,omitempty"`
	OperatorType *Reportsv3OperatorType `json:"operator_type,omitempty"`
}
