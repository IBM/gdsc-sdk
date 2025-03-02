/**
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Riskanalyticscontrollerv3RiskEvent } from '../models/Riskanalyticscontrollerv3RiskEvent';
import { Riskanalyticscontrollerv3RiskEventFormerHours } from '../models/Riskanalyticscontrollerv3RiskEventFormerHours';
import { Riskanalyticscontrollerv3RiskEventHourlyFindings } from '../models/Riskanalyticscontrollerv3RiskEventHourlyFindings';
import { HttpFile } from '../http/http';

/**
* RiskEventSummarizationDataResponse message for the GetRiskEventDataForSummarization api.
*/
export class Riskanalyticscontrollerv3RiskEventSummarizationDataResponse {
    'formerHours'?: Riskanalyticscontrollerv3RiskEventFormerHours;
    'hourlyFindings'?: Array<Riskanalyticscontrollerv3RiskEventHourlyFindings>;
    'riskEvent'?: Riskanalyticscontrollerv3RiskEvent;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "formerHours",
            "baseName": "former_hours",
            "type": "Riskanalyticscontrollerv3RiskEventFormerHours",
            "format": ""
        },
        {
            "name": "hourlyFindings",
            "baseName": "hourly_findings",
            "type": "Array<Riskanalyticscontrollerv3RiskEventHourlyFindings>",
            "format": ""
        },
        {
            "name": "riskEvent",
            "baseName": "risk_event",
            "type": "Riskanalyticscontrollerv3RiskEvent",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

