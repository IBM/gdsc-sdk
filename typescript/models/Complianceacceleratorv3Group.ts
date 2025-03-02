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

import { Groupbuilderv3GroupMember } from '../models/Groupbuilderv3GroupMember';
import { Groupbuilderv3LdapConfig } from '../models/Groupbuilderv3LdapConfig';
import { HttpFile } from '../http/http';

/**
* Group info for compliance.
*/
export class Complianceacceleratorv3Group {
    'desc'?: string;
    /**
    * Group type ID.
    */
    'groupTypeId'?: number;
    /**
    * Id of group.
    */
    'id'?: number;
    'ldapConfig'?: Groupbuilderv3LdapConfig;
    /**
    * Group members.
    */
    'members'?: Array<Groupbuilderv3GroupMember>;
    /**
    * Members of the groups to be stored.
    */
    'membersToAdd'?: Array<string>;
    /**
    * Member ids to be deleted.
    */
    'membersToDelete'?: Array<Groupbuilderv3GroupMember>;
    /**
    * Name of group.
    */
    'name'?: string;
    'parent'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "desc",
            "baseName": "desc",
            "type": "string",
            "format": ""
        },
        {
            "name": "groupTypeId",
            "baseName": "group_type_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "ldapConfig",
            "baseName": "ldap_config",
            "type": "Groupbuilderv3LdapConfig",
            "format": ""
        },
        {
            "name": "members",
            "baseName": "members",
            "type": "Array<Groupbuilderv3GroupMember>",
            "format": ""
        },
        {
            "name": "membersToAdd",
            "baseName": "members_to_add",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "membersToDelete",
            "baseName": "members_to_delete",
            "type": "Array<Groupbuilderv3GroupMember>",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "parent",
            "baseName": "parent",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Complianceacceleratorv3Group.attributeTypeMap;
    }

    public constructor() {
    }
}

