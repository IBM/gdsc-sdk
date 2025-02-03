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

import { Policybuilderv3ParameterOperator } from '../models/Policybuilderv3ParameterOperator';
import { HttpFile } from '../http/http';

/**
* Message format for rule parameters.
*/
export class Policybuilderv3RuleParameter {
    /**
    * Parameter Name.
    */
    'parameterName'?: string;
    'parameterOperator'?: Policybuilderv3ParameterOperator;
    /**
    * Type of the parameter.
    */
    'parameterType'?: string;
    /**
    * The operator of the parameter.
    */
    'parameterValue'?: string;
    /**
    * Label of the value if the original value is some id referencing to external entity.
    */
    'parameterValueLabel'?: string;
    /**
    * Display label for UI for this parameter.
    */
    'uiLabel'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "parameterName",
            "baseName": "parameter_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "parameterOperator",
            "baseName": "parameter_operator",
            "type": "Policybuilderv3ParameterOperator",
            "format": ""
        },
        {
            "name": "parameterType",
            "baseName": "parameter_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "parameterValue",
            "baseName": "parameter_value",
            "type": "string",
            "format": ""
        },
        {
            "name": "parameterValueLabel",
            "baseName": "parameter_value_label",
            "type": "string",
            "format": ""
        },
        {
            "name": "uiLabel",
            "baseName": "ui_label",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Policybuilderv3RuleParameter.attributeTypeMap;
    }

    public constructor() {
    }
}



