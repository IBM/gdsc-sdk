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

import { Universalconnectormanagerv3DatasourceType } from '../models/Universalconnectormanagerv3DatasourceType';
import { HttpFile } from '../http/http';

/**
* Plugin definition based on UCPluginDefinition.
*/
export class Universalconnectormanagerv3PluginDefinition {
    'pluginJDBCDriverRequired'?: boolean;
    /**
    * mongoDB.
    */
    'pluginAlias'?: string;
    /**
    * Config noted.
    */
    'pluginConfigurationNotes'?: string;
    /**
    * Description.
    */
    'pluginDescription'?: string;
    /**
    * Developer.
    */
    'pluginDeveloper'?: string;
    /**
    * Documentation path.
    */
    'pluginDocumentationPath'?: string;
    /**
    * License.
    */
    'pluginLicense'?: string;
    /**
    * Name.
    */
    'pluginName'?: string;
    /**
    * Pipeline type.
    */
    'pluginPipelineType'?: string;
    /**
    * Filter/input.
    */
    'pluginType'?: string;
    /**
    * Plugin version.
    */
    'pluginVersion'?: string;
    /**
    * Collection of supported input plugins.
    */
    'supportedInputPlugins'?: Array<string>;
    /**
    * Collection of DatasourceType.
    */
    'supportedDatasources'?: Array<Universalconnectormanagerv3DatasourceType>;
    /**
    * Datetime of plugin upload.
    */
    'uploadDate'?: Date;
    /**
    * Plugin user upload.
    */
    'uploadUser'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "pluginJDBCDriverRequired",
            "baseName": "plugin_JDBC_driver_required",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "pluginAlias",
            "baseName": "plugin_alias",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginConfigurationNotes",
            "baseName": "plugin_configuration_notes",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginDescription",
            "baseName": "plugin_description",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginDeveloper",
            "baseName": "plugin_developer",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginDocumentationPath",
            "baseName": "plugin_documentation_path",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginLicense",
            "baseName": "plugin_license",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginName",
            "baseName": "plugin_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginPipelineType",
            "baseName": "plugin_pipeline_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginType",
            "baseName": "plugin_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "pluginVersion",
            "baseName": "plugin_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "supportedInputPlugins",
            "baseName": "supportedInputPlugins",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "supportedDatasources",
            "baseName": "supported_datasources",
            "type": "Array<Universalconnectormanagerv3DatasourceType>",
            "format": ""
        },
        {
            "name": "uploadDate",
            "baseName": "upload_date",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "uploadUser",
            "baseName": "upload_user",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Universalconnectormanagerv3PluginDefinition.attributeTypeMap;
    }

    public constructor() {
    }
}

