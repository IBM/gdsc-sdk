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

import { Riskanalyticscontrollerv3Action } from '../models/Riskanalyticscontrollerv3Action';
import { HttpFile } from '../http/http';

/**
* EnableDisableRiskEventProcessRequest is the request object for EnableDisableRiskEventProcess API.
*/
export class Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest {
    'action'?: Riskanalyticscontrollerv3Action;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "action",
            "baseName": "action",
            "type": "Riskanalyticscontrollerv3Action",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.attributeTypeMap;
    }

    public constructor() {
    }
}



