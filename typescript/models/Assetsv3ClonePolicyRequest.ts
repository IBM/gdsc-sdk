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

import { Assetsv3Rule } from '../models/Assetsv3Rule';
import { HttpFile } from '../http/http';

export class Assetsv3ClonePolicyRequest {
    /**
    * Policy id that needs to be cloned.
    */
    'policyId'?: string;
    /**
    * New policy name of the cloned policy.
    */
    'policyName'?: string;
    'rules'?: Array<Assetsv3Rule>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
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
            "name": "rules",
            "baseName": "rules",
            "type": "Array<Assetsv3Rule>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3ClonePolicyRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

