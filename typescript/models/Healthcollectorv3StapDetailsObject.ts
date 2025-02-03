/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Healthcollectorv3GeneralDetailsObject } from '../models/Healthcollectorv3GeneralDetailsObject';
import { Healthcollectorv3StapLiveInfoObject } from '../models/Healthcollectorv3StapLiveInfoObject';
import { HttpFile } from '../http/http';

/**
* StapDetailsObject gets additional information about S-TAPs.
*/
export class Healthcollectorv3StapDetailsObject {
    'connectivityDetails'?: Healthcollectorv3GeneralDetailsObject;
    /**
    * General error messages.
    */
    'generalErrMessages'?: Array<string>;
    'ktapDetails'?: Healthcollectorv3GeneralDetailsObject;
    'stapLivelinessInformation'?: Healthcollectorv3StapLiveInfoObject;
    'trafficDetails'?: Healthcollectorv3GeneralDetailsObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "connectivityDetails",
            "baseName": "connectivity_details",
            "type": "Healthcollectorv3GeneralDetailsObject",
            "format": ""
        },
        {
            "name": "generalErrMessages",
            "baseName": "general_err_messages",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "ktapDetails",
            "baseName": "ktap_details",
            "type": "Healthcollectorv3GeneralDetailsObject",
            "format": ""
        },
        {
            "name": "stapLivelinessInformation",
            "baseName": "stap_liveliness_information",
            "type": "Healthcollectorv3StapLiveInfoObject",
            "format": ""
        },
        {
            "name": "trafficDetails",
            "baseName": "traffic_details",
            "type": "Healthcollectorv3GeneralDetailsObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3StapDetailsObject.attributeTypeMap;
    }

    public constructor() {
    }
}

