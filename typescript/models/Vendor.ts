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

import { VendorAccount } from '../models/VendorAccount';
import { VendorCertificate } from '../models/VendorCertificate';
import { HttpFile } from '../http/http';

export class Vendor {
    /**
    * The 3rd party vendor unique ID
    */
    'vendorId': string;
    /**
    * The 3rd party vendor name (Company name)
    */
    'vendorName': string;
    /**
    * The 3rd party company website URL
    */
    'vendorUrl'?: string;
    /**
    * Short description of the 3rd party vendor
    */
    'description': string;
    'accounts'?: Array<VendorAccount>;
    'certificates'?: Array<VendorCertificate>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "vendorId",
            "baseName": "vendorId",
            "type": "string",
            "format": ""
        },
        {
            "name": "vendorName",
            "baseName": "vendorName",
            "type": "string",
            "format": ""
        },
        {
            "name": "vendorUrl",
            "baseName": "vendorUrl",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "accounts",
            "baseName": "accounts",
            "type": "Array<VendorAccount>",
            "format": ""
        },
        {
            "name": "certificates",
            "baseName": "certificates",
            "type": "Array<VendorCertificate>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Vendor.attributeTypeMap;
    }

    public constructor() {
    }
}

