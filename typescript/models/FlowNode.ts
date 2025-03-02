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

import { CloudServiceProvider } from '../models/CloudServiceProvider';
import { FlowNodeResource } from '../models/FlowNodeResource';
import { HttpFile } from '../http/http';

export class FlowNode {
    'id': string;
    'name'?: string;
    'type': string;
    'cloudAccountId': string;
    'cloudRegion'?: string;
    'cloudProvider': CloudServiceProvider;
    'resource'?: FlowNodeResource;
    'vendorId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "cloudAccountId",
            "baseName": "cloudAccountId",
            "type": "string",
            "format": ""
        },
        {
            "name": "cloudRegion",
            "baseName": "cloudRegion",
            "type": "string",
            "format": ""
        },
        {
            "name": "cloudProvider",
            "baseName": "cloudProvider",
            "type": "CloudServiceProvider",
            "format": ""
        },
        {
            "name": "resource",
            "baseName": "resource",
            "type": "FlowNodeResource",
            "format": ""
        },
        {
            "name": "vendorId",
            "baseName": "vendorId",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FlowNode.attributeTypeMap;
    }

    public constructor() {
    }
}



