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

export class Qspmpolicymanagerv3FileName {
    'explorerFilesName'?: Array<string>;
    'nonExplorerFilesName'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "explorerFilesName",
            "baseName": "explorer_files_name",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "nonExplorerFilesName",
            "baseName": "non_explorer_files_name",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Qspmpolicymanagerv3FileName.attributeTypeMap;
    }

    public constructor() {
    }
}

