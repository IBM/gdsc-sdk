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

import { Healthcollectorv3AggregationDetailsObjectGdp } from '../models/Healthcollectorv3AggregationDetailsObjectGdp';
import { Healthcollectorv3GeneralDetailsObject } from '../models/Healthcollectorv3GeneralDetailsObject';
import { Healthcollectorv3UtilizationParameterObjectGdp } from '../models/Healthcollectorv3UtilizationParameterObjectGdp';
import { HttpFile } from '../http/http';

/**
* MUDetailObj gets additional information about managed units.
*/
export class Healthcollectorv3MUDetailsObjGdp {
    /**
    * Aggregation details.
    */
    'aggHealthViewList'?: Array<Healthcollectorv3AggregationDetailsObjectGdp>;
    'connectivityDetails'?: Healthcollectorv3GeneralDetailsObject;
    /**
    * Additional messages and details about managed units.
    */
    'generalErrMessages'?: Array<string>;
    'utilizationScheme'?: Healthcollectorv3UtilizationParameterObjectGdp;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aggHealthViewList",
            "baseName": "agg_health_view_list",
            "type": "Array<Healthcollectorv3AggregationDetailsObjectGdp>",
            "format": ""
        },
        {
            "name": "connectivityDetails",
            "baseName": "connectivity_details",
            "type": "Healthcollectorv3GeneralDetailsObject",
            "format": ""
        },
        {
            "name": "generalErrMessages",
            "baseName": "general_err_messages",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "utilizationScheme",
            "baseName": "utilization_scheme",
            "type": "Healthcollectorv3UtilizationParameterObjectGdp",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3MUDetailsObjGdp.attributeTypeMap;
    }

    public constructor() {
    }
}

