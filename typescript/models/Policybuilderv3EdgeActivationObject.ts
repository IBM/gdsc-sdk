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

import { Policybuilderv3ActivationStatus } from '../models/Policybuilderv3ActivationStatus';
import { HttpFile } from '../http/http';

export class Policybuilderv3EdgeActivationObject {
    'activationOrder'?: number;
    'activationStatus'?: Policybuilderv3ActivationStatus;
    'activationTimestamp'?: Date;
    'edgeId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "activationOrder",
            "baseName": "activation_order",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "activationStatus",
            "baseName": "activation_status",
            "type": "Policybuilderv3ActivationStatus",
            "format": ""
        },
        {
            "name": "activationTimestamp",
            "baseName": "activation_timestamp",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "edgeId",
            "baseName": "edge_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Policybuilderv3EdgeActivationObject.attributeTypeMap;
    }

    public constructor() {
    }
}



