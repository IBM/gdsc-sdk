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
* Base Policy object which is used in create and list APIs.
*/
export class Assetsv3Policy {
    /**
    * Policy Activation Status.
    */
    'activationStatus'?: number;
    /**
    * Flag to indicate whether policy is installed or not.
    */
    'installedFlag'?: boolean;
    'installedTimestamp'?: string;
    /**
    * Policy isDelete.
    */
    'isDelete'?: number;
    'lastEditedTimestamp'?: string;
    /**
    * No. of rules associated with policy.
    */
    'noOfRules'?: number;
    /**
    * Policy ID.
    */
    'policyId'?: string;
    /**
    * Policy Name.
    */
    'policyName'?: string;
    'policySequence'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "activationStatus",
            "baseName": "activation_status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "installedFlag",
            "baseName": "installed_flag",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "installedTimestamp",
            "baseName": "installed_timestamp",
            "type": "string",
            "format": ""
        },
        {
            "name": "isDelete",
            "baseName": "is_delete",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "lastEditedTimestamp",
            "baseName": "last_edited_timestamp",
            "type": "string",
            "format": ""
        },
        {
            "name": "noOfRules",
            "baseName": "no_of_rules",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "policyId",
            "baseName": "policy_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "policyName",
            "baseName": "policy_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "policySequence",
            "baseName": "policy_sequence",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3Policy.attributeTypeMap;
    }

    public constructor() {
    }
}

