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

import { Policybuilderv3StatusResponseBase } from '../models/Policybuilderv3StatusResponseBase';
import { HttpFile } from '../http/http';

export class Policybuilderv3DeleteGdpPolicySyncResponse {
    'status'?: Policybuilderv3StatusResponseBase;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "Policybuilderv3StatusResponseBase",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Policybuilderv3DeleteGdpPolicySyncResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

