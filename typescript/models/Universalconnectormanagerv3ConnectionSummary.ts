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

import { Universalconnectormanagerv3ConnectionRoute } from '../models/Universalconnectormanagerv3ConnectionRoute';
import { Universalconnectormanagerv3ConnectionStatus } from '../models/Universalconnectormanagerv3ConnectionStatus';
import { Universalconnectormanagerv3User } from '../models/Universalconnectormanagerv3User';
import { HttpFile } from '../http/http';

/**
* Structure for [Universal connector] Connection response.
*/
export class Universalconnectormanagerv3ConnectionSummary {
    /**
    * Connection configuration nickname, set by dev/user (optional).
    */
    'connectionAlias'?: string;
    /**
    * Date changed; used to defer tenant status queries immediately after creation.
    */
    'connectionChanged'?: Date;
    /**
    * Foreign key to the saved connection configuration by the user.
    */
    'connectionConfigId'?: string;
    /**
    * Datasource configuration note, by plugin developers, intended for user.
    */
    'connectionConfigurationNote'?: string;
    /**
    * Connector filter plugin alias (datasource, usually, like \"MongoDB\").
    */
    'connectionFilterAlias'?: string;
    /**
    * Connection configuration id.
    */
    'connectionId'?: string;
    /**
    * Connection input plugin alias, like \"Filebeat\".
    */
    'connectionInputAlias'?: string;
    'connectionRoute'?: Universalconnectormanagerv3ConnectionRoute;
    'connectionStatus'?: Universalconnectormanagerv3ConnectionStatus;
    'user'?: Universalconnectormanagerv3User;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "connectionAlias",
            "baseName": "connection_alias",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectionChanged",
            "baseName": "connection_changed",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "connectionConfigId",
            "baseName": "connection_config_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectionConfigurationNote",
            "baseName": "connection_configuration_note",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectionFilterAlias",
            "baseName": "connection_filter_alias",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectionId",
            "baseName": "connection_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectionInputAlias",
            "baseName": "connection_input_alias",
            "type": "string",
            "format": ""
        },
        {
            "name": "connectionRoute",
            "baseName": "connection_route",
            "type": "Universalconnectormanagerv3ConnectionRoute",
            "format": ""
        },
        {
            "name": "connectionStatus",
            "baseName": "connection_status",
            "type": "Universalconnectormanagerv3ConnectionStatus",
            "format": ""
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "Universalconnectormanagerv3User",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Universalconnectormanagerv3ConnectionSummary.attributeTypeMap;
    }

    public constructor() {
    }
}

