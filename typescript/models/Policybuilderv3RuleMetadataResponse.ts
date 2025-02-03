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

import { Policybuilderv3ActionMetadata } from '../models/Policybuilderv3ActionMetadata';
import { Policybuilderv3RuleParameterMetadata } from '../models/Policybuilderv3RuleParameterMetadata';
import { Policybuilderv3StatusResponseBase } from '../models/Policybuilderv3StatusResponseBase';
import { HttpFile } from '../http/http';

/**
* Rule Metadata Response message.
*/
export class Policybuilderv3RuleMetadataResponse {
    /**
    * Actions metadata object.
    */
    'actionMetadata'?: Array<Policybuilderv3ActionMetadata>;
    /**
    * Rule Parameters Metadata object.
    */
    'parameterMetadata'?: Array<Policybuilderv3RuleParameterMetadata>;
    'status'?: Policybuilderv3StatusResponseBase;
    /**
    * List of existing tags.
    */
    'tags'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "actionMetadata",
            "baseName": "action_metadata",
            "type": "Array<Policybuilderv3ActionMetadata>",
            "format": ""
        },
        {
            "name": "parameterMetadata",
            "baseName": "parameter_metadata",
            "type": "Array<Policybuilderv3RuleParameterMetadata>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "Policybuilderv3StatusResponseBase",
            "format": ""
        },
        {
            "name": "tags",
            "baseName": "tags",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Policybuilderv3RuleMetadataResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

