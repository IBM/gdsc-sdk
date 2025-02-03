/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// StapDetailsObject gets additional information about S-TAPs.
type Healthcollectorv3StapDetailsObjectGdp struct {
	ConnectivityDetails *Healthcollectorv3GeneralDetailsObject `json:"connectivity_details,omitempty"`
	// General error messages of the S-TAP.
	GeneralErrMessages []string `json:"general_err_messages,omitempty"`
	KtapDetails *Healthcollectorv3GeneralDetailsObject `json:"ktap_details,omitempty"`
	StapLivelinessInfo *Healthcollectorv3StapLiveInfoObject `json:"stap_liveliness_info,omitempty"`
	// Inspection engine details of the S-TAP.
	StapVerInfoList []Healthcollectorv3InspectionEngineDetailsGdp `json:"stap_ver_info_list,omitempty"`
	TrafficDetails *Healthcollectorv3GeneralDetailsObject `json:"traffic_details,omitempty"`
}
