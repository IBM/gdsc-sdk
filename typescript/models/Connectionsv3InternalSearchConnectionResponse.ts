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

import { Connectionsv3Connector } from '../models/Connectionsv3Connector';
import { HttpFile } from '../http/http';

export class Connectionsv3InternalSearchConnectionResponse {
    'status'?: number;
    'connectors'?: Array<Connectionsv3Connector>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "Status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "connectors",
            "baseName": "connectors",
            "type": "Array<Connectionsv3Connector>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Connectionsv3InternalSearchConnectionResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

