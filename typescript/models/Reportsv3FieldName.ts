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
* FieldName represents a field name\'s translation key and its translated value.
*/
export class Reportsv3FieldName {
    /**
    * User-defined field name.
    */
    'customizedValue'?: string;
    /**
    * Identifies the field\'s name NLS translated string.
    */
    'nlsKey'?: string;
    /**
    * The field\'s name NLS translated string.
    */
    'nlsValue'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "customizedValue",
            "baseName": "customized_value",
            "type": "string",
            "format": ""
        },
        {
            "name": "nlsKey",
            "baseName": "nls_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "nlsValue",
            "baseName": "nls_value",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3FieldName.attributeTypeMap;
    }

    public constructor() {
    }
}

