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
import { HttpFile } from '../http/http';

export class PotentialFlowsPathsFilterOptions {
    'ids'?: Array<string>;
    'potentialFlowsIds'?: Array<string>;
    'types'?: Array<string>;
    'sourceTypes'?: Array<string>;
    'cloudAccounts'?: Array<string>;
    'cloudRegions'?: Array<string>;
    'sourceIds'?: Array<string>;
    'destinationIds'?: Array<string>;
    'accessTypes'?: Array<AccessType>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "ids",
            "baseName": "ids",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "potentialFlowsIds",
            "baseName": "potentialFlowsIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "types",
            "baseName": "types",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sourceTypes",
            "baseName": "sourceTypes",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "cloudAccounts",
            "baseName": "cloudAccounts",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "cloudRegions",
            "baseName": "cloudRegions",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "sourceIds",
            "baseName": "sourceIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "destinationIds",
            "baseName": "destinationIds",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "accessTypes",
            "baseName": "accessTypes",
            "type": "Array<AccessType>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PotentialFlowsPathsFilterOptions.attributeTypeMap;
    }

    public constructor() {
    }
}

