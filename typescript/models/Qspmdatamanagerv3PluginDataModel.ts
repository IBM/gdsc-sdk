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

export class Qspmdatamanagerv3PluginDataModel {
    'pluginDesc'?: string;
    'pluginId'?: string;
    'pluginName'?: string;
    'pluginStatus'?: string;
    'pluginType'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "pluginDesc",
            "baseName": "plugin_desc",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginId",
            "baseName": "plugin_id",
            "type": "string",
            "format": "int64"
        },
        {
            "name": "pluginName",
            "baseName": "plugin_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginStatus",
            "baseName": "plugin_status",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginType",
            "baseName": "plugin_type",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Qspmdatamanagerv3PluginDataModel.attributeTypeMap;
    }

    public constructor() {
    }
}

