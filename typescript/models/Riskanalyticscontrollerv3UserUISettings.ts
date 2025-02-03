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

import { Riskanalyticscontrollerv3CardSettings } from '../models/Riskanalyticscontrollerv3CardSettings';
import { HttpFile } from '../http/http';

/**
* UserUISettings an object contains settings per user to display in the UI.
*/
export class Riskanalyticscontrollerv3UserUISettings {
    /**
    * A list of card settings for each view(box) of risks.
    */
    'cardSettings'?: Array<Riskanalyticscontrollerv3CardSettings>;
    /**
    * Show_banner a flag to show additional info in the top of screen or to hide it.
    */
    'showBanner'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "cardSettings",
            "baseName": "card_settings",
            "type": "Array<Riskanalyticscontrollerv3CardSettings>",
            "format": ""
        },
        {
            "name": "showBanner",
            "baseName": "show_banner",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3UserUISettings.attributeTypeMap;
    }

    public constructor() {
    }
}

