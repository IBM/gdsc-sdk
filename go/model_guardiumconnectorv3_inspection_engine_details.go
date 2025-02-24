/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Additional information for an inspection engine.
type Guardiumconnectorv3InspectionEngineDetails struct {
	// Inspection engine.
	Ie string `json:"ie,omitempty"`
	// Port.
	Port string `json:"port,omitempty"`
	// Protocol.
	Protocol string `json:"protocol,omitempty"`
	// S -TAP name.
	Stap string `json:"stap,omitempty"`
	// Verfication health.
	VerificationHealth int32 `json:"verification_health,omitempty"`
	// Verfication results.
	VerificationResult string `json:"verification_result,omitempty"`
	// Verfication state.
	VerificationState string `json:"verification_state,omitempty"`
	// Version.
	Version string `json:"version,omitempty"`
}
