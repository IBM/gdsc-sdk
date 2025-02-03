/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger
// Complianceacceleratorv3TaskStatus : Enum indicating task status.
type Complianceacceleratorv3TaskStatus string

// List of complianceacceleratorv3TaskStatus
const (
	UNDEFINED_Complianceacceleratorv3TaskStatus Complianceacceleratorv3TaskStatus = "UNDEFINED"
	NOT_COMPLETED_Complianceacceleratorv3TaskStatus Complianceacceleratorv3TaskStatus = "NOT_COMPLETED"
	PARTIALLY_COMPLETED_Complianceacceleratorv3TaskStatus Complianceacceleratorv3TaskStatus = "PARTIALLY_COMPLETED"
	COMPLETE_Complianceacceleratorv3TaskStatus Complianceacceleratorv3TaskStatus = "COMPLETE"
)
