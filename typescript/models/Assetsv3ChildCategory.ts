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

import { HttpFile } from '../http/http';

/**
* ChildCategory - Child Category Data of Sub Category for Manage Asset Filter Panel.
*/
export class Assetsv3ChildCategory {
    'childId'?: string;
    'childName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "childId",
            "baseName": "child_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "childName",
            "baseName": "child_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3ChildCategory.attributeTypeMap;
    }

    public constructor() {
    }
}

