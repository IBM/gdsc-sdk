/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Assetsv3Action } from '../models/Assetsv3Action';
import { Assetsv3RuleParameter } from '../models/Assetsv3RuleParameter';
import { Assetsv3RuleType } from '../models/Assetsv3RuleType';
import { HttpFile } from '../http/http';

/**
* Base Rule object which is used in create and list APIs.
*/
export class Assetsv3Rule {
    /**
    * Action object of the actions in the rules.
    */
    'actions'?: Array<Assetsv3Action>;
    /**
    * Rule isDelete.
    */
    'isDelete'?: number;
    /**
    * Parameter object which are used in the rule.
    */
    'parameters'?: Array<Assetsv3RuleParameter>;
    /**
    * Policy ID.
    */
    'policyId'?: string;
    /**
    * Rule ID.
    */
    'ruleId'?: string;
    /**
    * Rule Name.
    */
    'ruleName'?: string;
    'ruleType'?: Assetsv3RuleType;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "actions",
            "baseName": "actions",
            "type": "Array<Assetsv3Action>",
            "format": ""
        },
        {
            "name": "isDelete",
            "baseName": "is_delete",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<Assetsv3RuleParameter>",
            "format": ""
        },
        {
            "name": "policyId",
            "baseName": "policy_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "ruleId",
            "baseName": "rule_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "ruleName",
            "baseName": "rule_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "ruleType",
            "baseName": "rule_type",
            "type": "Assetsv3RuleType",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3Rule.attributeTypeMap;
    }

    public constructor() {
    }
}



