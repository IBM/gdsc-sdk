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
* List the group members in nested (heirarchical) groups.
*/
export class Guardiumconnectorv3NestedGroupMember {
    /**
    * Group member name.
    */
    'description'?: string;
    /**
    * Group ID.
    */
    'groupId'?: number;
    /**
    * Group member ID.
    */
    'memberId'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "groupId",
            "baseName": "group_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "memberId",
            "baseName": "member_id",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3NestedGroupMember.attributeTypeMap;
    }

    public constructor() {
    }
}

