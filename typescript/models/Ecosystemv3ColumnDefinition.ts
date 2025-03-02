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

import { Ecosystemv3DataType } from '../models/Ecosystemv3DataType';
import { HttpFile } from '../http/http';

/**
* ColumnDefinition defines a column in database.
*/
export class Ecosystemv3ColumnDefinition {
    /**
    * If null is allowed.
    */
    'allowNull'?: boolean;
    /**
    * The id of the column.
    */
    'columnId'?: number;
    /**
    * The name of the column.
    */
    'columnName'?: string;
    /**
    * Data size of the column.
    */
    'columnSize'?: string;
    'columnType'?: Ecosystemv3DataType;
    /**
    * If the column is unique.
    */
    'unique'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "allowNull",
            "baseName": "allow_null",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "columnId",
            "baseName": "column_id",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "columnName",
            "baseName": "column_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "columnSize",
            "baseName": "column_size",
            "type": "string",
            "format": ""
        },
        {
            "name": "columnType",
            "baseName": "column_type",
            "type": "Ecosystemv3DataType",
            "format": ""
        },
        {
            "name": "unique",
            "baseName": "unique",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Ecosystemv3ColumnDefinition.attributeTypeMap;
    }

    public constructor() {
    }
}



