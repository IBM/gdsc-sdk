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

import { AccessType } from '../models/AccessType';
import { FlowNode } from '../models/FlowNode';
import { HttpFile } from '../http/http';

export class ActualFlow {
    'id': string;
    'source': FlowNode;
    'destination': FlowNode;
    'accessTypes': Array<AccessType>;
    /**
    * Epoch timestamp of the last time this flow was seen
    */
    'lastSeen': number;
    /**
    * Epoch timestamp of the first time this flow was seen
    */
    'firstSeen'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "FlowNode",
            "format": ""
        },
        {
            "name": "destination",
            "baseName": "destination",
            "type": "FlowNode",
            "format": ""
        },
        {
            "name": "accessTypes",
            "baseName": "accessTypes",
            "type": "Array<AccessType>",
            "format": ""
        },
        {
            "name": "lastSeen",
            "baseName": "lastSeen",
            "type": "number",
            "format": ""
        },
        {
            "name": "firstSeen",
            "baseName": "firstSeen",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ActualFlow.attributeTypeMap;
    }

    public constructor() {
    }
}

