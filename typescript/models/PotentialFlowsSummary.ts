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

import { CloudAccountCountInner } from '../models/CloudAccountCountInner';
import { CloudRegionCountInner } from '../models/CloudRegionCountInner';
import { TypesCountInner } from '../models/TypesCountInner';
import { HttpFile } from '../http/http';

export class PotentialFlowsSummary {
    'count': number;
    'typesCount': Array<TypesCountInner>;
    'cloudAccountCount': Array<CloudAccountCountInner>;
    'cloudRegionCount': Array<CloudRegionCountInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "count",
            "baseName": "count",
            "type": "number",
            "format": ""
        },
        {
            "name": "typesCount",
            "baseName": "typesCount",
            "type": "Array<TypesCountInner>",
            "format": ""
        },
        {
            "name": "cloudAccountCount",
            "baseName": "cloudAccountCount",
            "type": "Array<CloudAccountCountInner>",
            "format": ""
        },
        {
            "name": "cloudRegionCount",
            "baseName": "cloudRegionCount",
            "type": "Array<CloudRegionCountInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PotentialFlowsSummary.attributeTypeMap;
    }

    public constructor() {
    }
}

