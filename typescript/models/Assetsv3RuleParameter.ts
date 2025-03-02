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

export class Assetsv3RuleParameter {
    /**
    * Attribute type of the rule.
    */
    'assetAttribute'?: string;
    /**
    * Enum to indicate attribute type.
    */
    'attributeEnum'?: string;
    /**
    * Attribute condition.
    */
    'condition'?: string;
    /**
    * Category of the attribute.
    */
    'conditionCategory'?: string;
    /**
    * Value of the attribute.
    */
    'conditionValue'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "assetAttribute",
            "baseName": "asset_attribute",
            "type": "string",
            "format": ""
        },
        {
            "name": "attributeEnum",
            "baseName": "attribute_enum",
            "type": "string",
            "format": ""
        },
        {
            "name": "condition",
            "baseName": "condition",
            "type": "string",
            "format": ""
        },
        {
            "name": "conditionCategory",
            "baseName": "condition_category",
            "type": "string",
            "format": ""
        },
        {
            "name": "conditionValue",
            "baseName": "condition_value",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Assetsv3RuleParameter.attributeTypeMap;
    }

    public constructor() {
    }
}

