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

import { Riskanalyticscontrollerv3EmergingRiskDetails } from '../models/Riskanalyticscontrollerv3EmergingRiskDetails';
import { Riskanalyticscontrollerv3Observation } from '../models/Riskanalyticscontrollerv3Observation';
import { Riskanalyticscontrollerv3RiskEvent } from '../models/Riskanalyticscontrollerv3RiskEvent';
import { HttpFile } from '../http/http';

/**
* GetRiskEventDetailsResponse is the response object for GetRiskEventDetails API.
*/
export class Riskanalyticscontrollerv3GetRiskEventDetailsResponse {
    'emergingRiskDetails'?: Riskanalyticscontrollerv3EmergingRiskDetails;
    /**
    * Observations list.
    */
    'observations'?: Array<Riskanalyticscontrollerv3Observation>;
    'riskEvent'?: Riskanalyticscontrollerv3RiskEvent;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "emergingRiskDetails",
            "baseName": "emerging_risk_details",
            "type": "Riskanalyticscontrollerv3EmergingRiskDetails",
            "format": ""
        },
        {
            "name": "observations",
            "baseName": "observations",
            "type": "Array<Riskanalyticscontrollerv3Observation>",
            "format": ""
        },
        {
            "name": "riskEvent",
            "baseName": "risk_event",
            "type": "Riskanalyticscontrollerv3RiskEvent",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3GetRiskEventDetailsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

