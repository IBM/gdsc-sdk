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
* Refreshes a tenants imported groups.
*/
export class Groupbuilderv3RefreshGroupsRequest {
    /**
    * List of group IDs.
    */
    'groupIds'?: Array<number>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "groupIds",
            "baseName": "group_ids",
            "type": "Array<number>",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Groupbuilderv3RefreshGroupsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

