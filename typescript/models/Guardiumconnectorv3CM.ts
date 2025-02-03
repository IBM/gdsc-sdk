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

import { Guardiumconnectorv3Attribute } from '../models/Guardiumconnectorv3Attribute';
import { HttpFile } from '../http/http';

/**
* Central Manager definition.
*/
export class Guardiumconnectorv3CM {
    /**
    * Central Manager attributes.
    */
    'attributes'?: Array<Guardiumconnectorv3Attribute>;
    /**
    * Central Manager hostname or ip.
    */
    'centralManagerId'?: string;
    /**
    * Flag check if CM can handle setting start end date for aggregator dm export.
    */
    'cmDateParamAvailable'?: string;
    /**
    * Initial start date for streaming historical datamart from GDP aggregator.
    */
    'datamartEndDateAggregator'?: string;
    /**
    * Initial start date for streaming historical datamart from GDP aggregator.
    */
    'datamartStartDateAggregator'?: string;
    /**
    * Initial start date for streaming historical datamart from GDP.
    */
    'datamartStartDateCollector'?: string;
    'maxSupportedDmVersion'?: string;
    /**
    * Flag to determine if GI supports push or pull mode.
    */
    'mode'?: string;
    /**
    * Central Manager name.
    */
    'name'?: string;
    /**
    * Port used to communicate with the Central Manager.
    */
    'port'?: string;
    /**
    * Central Manager status.
    */
    'status'?: string;
    'supportCustomDmTypeSetup'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "Array<Guardiumconnectorv3Attribute>",
            "format": ""
        },
        {
            "name": "centralManagerId",
            "baseName": "central_manager_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "cmDateParamAvailable",
            "baseName": "cm_date_param_available",
            "type": "string",
            "format": ""
        },
        {
            "name": "datamartEndDateAggregator",
            "baseName": "datamart_end_date_aggregator",
            "type": "string",
            "format": ""
        },
        {
            "name": "datamartStartDateAggregator",
            "baseName": "datamart_start_date_aggregator",
            "type": "string",
            "format": ""
        },
        {
            "name": "datamartStartDateCollector",
            "baseName": "datamart_start_date_collector",
            "type": "string",
            "format": ""
        },
        {
            "name": "maxSupportedDmVersion",
            "baseName": "max_supported_dm_version",
            "type": "string",
            "format": ""
        },
        {
            "name": "mode",
            "baseName": "mode",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "port",
            "baseName": "port",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "string",
            "format": ""
        },
        {
            "name": "supportCustomDmTypeSetup",
            "baseName": "support_custom_dm_type_setup",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3CM.attributeTypeMap;
    }

    public constructor() {
    }
}

