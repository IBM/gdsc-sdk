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
import { Groupbuilderv3NestedGroupMember } from '../models/Groupbuilderv3NestedGroupMember';
import { HttpFile } from '../http/http';

/**
* Group imports groups from a Guradium Data Protection central manager to GDSC.
*/
export class Groupbuilderv3Group {
    /**
    * Group access level.
    */
    'accessLevel'?: number;
    /**
    * Group description.
    */
    'description'?: string;
    /**
    * Flattened member count for nested groups.
    */
    'flattenedMemberCount'?: number;
    /**
    * Group ID.
    */
    'groupId'?: number;
    /**
    * Group type ID.
    */
    'groupTypeId'?: number;
    /**
    * Last synchronization date.
    */
    'lastSyncDate'?: Date;
    'ldapConfig'?: Groupbuilderv3LdapConfig;
    /**
    * Group members count.
    */
    'memberCount'?: number;
    /**
    * Array of members.
    */
    'members'?: Array<Groupbuilderv3GroupMember>;
    /**
    * Group name.
    */
    'name'?: string;
    /**
    * Nested (hierarchical).
    */
    'nested'?: boolean;
    /**
    * Array of nested (hierarchical) members.
    */
    'nestedGroupMembers'?: Array<Groupbuilderv3NestedGroupMember>;
    /**
    * Next synchronization date.
    */
    'nextSyncDate'?: Date;
    /**
    * Synchronization inactive code.
    */
    'syncInactiveCode'?: number;
    /**
    * Name of Guardium Data Protection central manager synchronized to the group.
    */
    'syncSource'?: string;
    /**
    * Synchronized.
    */
    'synced'?: boolean;
    /**
    * Group tuples count.
    */
    'tupleCount'?: number;
    /**
    * Tuple parameters.
    */
    'tupleParams'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "accessLevel",
            "baseName": "access_level",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "flattenedMemberCount",
            "baseName": "flattened_member_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "groupId",
            "baseName": "group_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "groupTypeId",
            "baseName": "group_type_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "lastSyncDate",
            "baseName": "last_sync_date",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "ldapConfig",
            "baseName": "ldap_config",
            "type": "Groupbuilderv3LdapConfig",
            "format": ""
        },
        {
            "name": "memberCount",
            "baseName": "member_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "members",
            "baseName": "members",
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
            "name": "nested",
            "baseName": "nested",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "nestedGroupMembers",
            "baseName": "nested_group_members",
            "type": "Array<Groupbuilderv3NestedGroupMember>",
            "format": ""
        },
        {
            "name": "nextSyncDate",
            "baseName": "next_sync_date",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "syncInactiveCode",
            "baseName": "sync_inactive_code",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "syncSource",
            "baseName": "sync_source",
            "type": "string",
            "format": ""
        },
        {
            "name": "synced",
            "baseName": "synced",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "tupleCount",
            "baseName": "tuple_count",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "tupleParams",
            "baseName": "tuple_params",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Groupbuilderv3Group.attributeTypeMap;
    }

    public constructor() {
    }
}

