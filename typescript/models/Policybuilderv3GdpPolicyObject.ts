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

export class Policybuilderv3GdpPolicyObject {
    'id'?: number;
    /**
    * Policy name.
    */
    'policyDescription'?: string;
    /**
    * Number of rules.
    */
    'policyRulesCount'?: string;
    'policySubType'?: string;
    'policyType'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "policyDescription",
            "baseName": "policy_description",
            "type": "string",
            "format": ""
        },
        {
            "name": "policyRulesCount",
            "baseName": "policy_rules_count",
            "type": "string",
            "format": ""
        },
        {
            "name": "policySubType",
            "baseName": "policy_sub_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "policyType",
            "baseName": "policy_type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Policybuilderv3GdpPolicyObject.attributeTypeMap;
    }

    public constructor() {
    }
}

