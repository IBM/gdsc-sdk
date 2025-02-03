/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Statistics of the types of outliers found during various time periods.
type Outliersenginev3OutliersStats struct {
	// Types of outliers found in the last hour.
	OutlierTypeStats1h []Outliersenginev3OutlierTypeStats `json:"outlier_type_stats_1h,omitempty"`
	// Types of outliers found in the past 24 hours.
	OutlierTypeStats24h []Outliersenginev3OutlierTypeStats `json:"outlier_type_stats_24h,omitempty"`
}
