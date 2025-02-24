#compdef 

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Based on: https://github.com/Valodim/zsh-curl-completion/blob/master/_curl
# !
# ! Generator version: 7.6.0
# !
# !
# ! Installation:
# !
# ! Copy the _ file to any directory under FPATH
# ! environment variable (echo $FPATH)
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


local curcontext="$curcontext" state line ret=1
typeset -A opt_args

typeset -A mime_type_abbreviations
# text/*
mime_type_abbreviations[text]="text/plain"
mime_type_abbreviations[html]="text/html"
mime_type_abbreviations[md]="text/x-markdown"
mime_type_abbreviations[csv]="text/csv"
mime_type_abbreviations[css]="text/css"
mime_type_abbreviations[rtf]="text/rtf"
# application/*
mime_type_abbreviations[json]="application/json"
mime_type_abbreviations[xml]="application/xml"
mime_type_abbreviations[yaml]="application/yaml"
mime_type_abbreviations[js]="application/javascript"
mime_type_abbreviations[bin]="application/octet-stream"
mime_type_abbreviations[rdf]="application/rdf+xml"
# image/*
mime_type_abbreviations[jpg]="image/jpeg"
mime_type_abbreviations[png]="image/png"
mime_type_abbreviations[gif]="image/gif"
mime_type_abbreviations[bmp]="image/bmp"
mime_type_abbreviations[tiff]="image/tiff"

#
# Generate zsh completion string list for abbreviated mime types
#
get_mime_type_completions() {
    typeset -a result
    result=()
    for k in "${(@k)mime_type_abbreviations}"; do
        value=$mime_type_abbreviations[${k}]
        #echo $value
        result+=( "${k}[${value}]" )
        #echo $result
    done
    echo "$result"
}

#
# cURL crypto engines completion function
#
_curl_crypto_engine() {
    local vals
    vals=( ${${(f)"$(curl --engine list)":gs/ /}[2,$]} )
    _describe -t outputs 'engines' vals && return 0
}

#
# cURL post data completion functions=
#
_curl_post_data() {

    # don't do anything further if this is raw content
    compset -P '=' && _message 'raw content' && return 0

    # complete filename or stdin for @ syntax
    compset -P '*@' && {
        local expl
        _description files expl stdin
        compadd "$expl[@]" - "-"
        _files
        return 0
    }

    # got a name already? expecting data.
    compset -P '*=' && _message 'data value' && return 0

    # otherwise, name (or @ or =) should be specified
    _message 'data name' && return 0

}


local arg_http arg_ftp arg_other arg_proxy arg_crypto arg_connection arg_auth arg_input arg_output

# HTTP Arguments
arg_http=(''\
  {-0,--http1.0}'[force use of use http 1.0 instead of 1.1]' \
  {-b,--cookie}'[pass data to http server as cookie]:data or file' \
  {-c,--cookie-jar}'[specify cookie file]:file name:_files' \
  {-d,--data}'[send specified data as HTTP POST data]:data:{_curl_post_data}' \
  '--data-binary[post HTTP POST data without any processing]:data:{_curl_post_data}' \
  '--data-urlencode[post HTTP POST data, with url encoding]:data:{_curl_post_data}' \
  {-f,--fail}'[enable failfast behavior for server errors]' \
  '*'{-F,--form}'[add POST form data]:name=content' \
  {-G,--get}'[use HTTP GET even with data (-d, --data, --data-binary)]' \
  '*'{-H,--header}'[specify an extra header]:header' \
  '--ignore-content-length[ignore Content-Length header]' \
  {-i,--include}'[include HTTP header in the output]' \
  {-j,--junk-session-cookies}'[discard all session cookies]' \
  {-e,--referer}'[send url as referer]:referer url:_urls' \
  {-L,--location}'[follow Location headers on http 3XX response]' \
  '--location-trusted[like --location, but allows sending of auth data to redirected hosts]' \
  '--max-redirs[set maximum number of redirection followings allowed]:number' \
  {-J,--remote-header-name}'[use Content-Disposition for output file name]' \
  {-O,--remote-name}'[write to filename parsed from url instead of stdout]' \
  '--post301[do not convert POST to GET after following 301 Location response (follow RFC 2616/10.3.2)]' \
  '--post302[do not convert POST to GET after following 302 Location response (follow RFC 2616/10.3.2)]' \
  )

# FTP arguments
arg_ftp=(\
  {-a,--append}'[append to target file instead of overwriting (FTP/SFTP)]' \
  '--crlf[convert LF to CRLF in upload]' \
  '--disable-eprt[disable use of EPRT and LPRT for active FTP transfers]' \
  '--disable-epsv[disable use of EPSV for passive FTP transfers]' \
  '--ftp-account[account data (FTP)]:data' \
  '--ftp-alternative-to-user[command to send when USER and PASS commands fail (FTP)]:command' \
  '--ftp-create-dirs[create paths remotely if it does not exist]' \
  '--ftp-method[ftp method to use to reach a file (FTP)]:method:(multicwd ocwd singlecwd)' \
  '--ftp-pasv[use passive mode for the data connection (FTP)]' \
  '--ftp-skip-pasv-ip[do not use the ip the server suggests for PASV]' \
  '--form-string[like --form, but do not parse content]:name=string' \
  '--ftp-pret[send PRET before PASV]' \
  '--ftp-ssl-ccc[use clear command channel (CCC) after authentication (FTP)]' \
  '--ftp-ssl-ccc-mode[sets the CCC mode (FTP)]:mode:(active passive)' \
  '--ftp-ssl-control[require SSL/TLS for FTP login, clear for transfer]' \
  {-l,--list-only}'[list names only when listing directories (FTP)]' \
  {-P,--ftp-port}'[use active mode, tell server to connect to specified address or interface (FTP]:address' \
  '*'{-Q,--quote}'[send arbitrary command to the remote server before transfer (FTP/SFTP)]:command' \
  )

# Other Protocol arguments
arg_other=(\
  '--mail-from[specify From: address]:address' \
  '--mail-rcpt[specify email recipient for SMTP, may be given multiple times]:address' \
  {-t,--telnet-option}'[pass options to telnet protocol]:opt=val' \
  '--tftp-blksize[set tftp BLKSIZE option]:value' \
  )

# Proxy arguments
arg_proxy=(\
  '--noproxy[list of hosts to connect directly to instead of through proxy]:no-proxy-list' \
  {-p,--proxytunnel}'[tunnel non-http protocols through http proxy]' \
  {-U,--proxy-user}'[specify the user name and password to use for proxy authentication]:user:password' \
  '--proxy-anyauth[use any authentication method for proxy, default to most secure]' \
  '--proxy-basic[use HTTP Basic authentication for proxy]' \
  '--proxy-digest[use http digest authentication for proxy]' \
  '--proxy-negotiate[enable GSS-Negotiate authentication for proxy]' \
  '--proxy-ntlm[enable ntlm authentication for proxy]' \
  '--proxy1.0[use http 1.0 proxy]:proxy url' \
  {-x,--proxy}'[use specified proxy]:proxy url' \
  '--socks5-gssapi-service[change service name for socks server]:servicename' \
  '--socks5-gssapi-nec[allow unprotected exchange of protection mode negotiation]' \
  )

# Crypto arguments
arg_crypto=(\
  {-1,--tlsv1}'[Forces curl to use TLS version 1 when negotiating with a remote TLS server.]' \
  {-2,--sslv2}'[Forces curl to use SSL version 2 when negotiating with a remote SSL server.]' \
  {-3,--sslv3}'[Forces curl to use SSL version 3 when negotiating with a remote SSL server.]' \
  '--ciphers[specifies which cipher to use for the ssl connection]:list of ciphers' \
  '--crlfile[specify file with revoked certificates]:file' \
  '--delegation[set delegation policy to use with GSS/kerberos]:delegation policy:(none policy always)' \
  {-E,--cert}'[use specified client certificate]:certificate file:_files' \
  '--engine[use selected OpenSSL crypto engine]:ssl crypto engine:{_curl_crypto_engine}' \
  '--egd-file[set ssl entropy gathering daemon socket]:entropy socket:_files' \
  '--cert-type[specify certificate type (PEM, DER, ENG)]:certificate type:(PEM DER ENG)' \
  '--cacert[specify certificate file to verify the peer with]:CA certificate:_files' \
  '--capath[specify a search path for certificate files]:CA certificate directory:_directories' \
  '--hostpubmd5[check remote hosts public key]:md5 hash' \
  {-k,--insecure}'[allow ssl to perform insecure ssl connections (ie, ignore certificate)]' \
  '--key[ssl/ssh private key file name]:key file:_files' \
  '--key-type[ssl/ssh private key file type]:file type:(PEM DER ENG)' \
  '--pubkey[ssh public key file]:pubkey file:_files' \
  '--random-file[set source of random data for ssl]:random source:_files' \
  '--no-sessionid[disable caching of ssl session ids]' \
  '--pass:phrase[passphrase for ssl/ssh private key]' \
  '--ssl[try to use ssl/tls for connection, if available]' \
  '--ssl-reqd[try to use ssl/tls for connection, fail if unavailable]' \
  '--tlsauthtype[set TLS authentication type (only SRP supported!)]:authtype' \
  '--tlsuser[set username for TLS authentication]:user' \
  '--tlspassword[set password for TLS authentication]:password' \
  )

# Connection arguments
arg_connection=(\
  {-4,--ipv4}'[prefer ipv4]' \
  {-6,--ipv6}'[prefer ipv6, if available]' \
  {-B,--use-ascii}'[use ascii mode]' \
  '--compressed[request a compressed transfer]' \
  '--connect-timeout[timeout for connection phase]:seconds' \
  {-I,--head}'[fetch http HEAD only (HTTP/FTP/FILE]' \
  '--interface[work on a specific interface]:name' \
  '--keepalive-time[set time to wait before sending keepalive probes]:seconds' \
  '--limit-rate[specify maximum transfer rate]:speed' \
  '--local-port[set preferred number or range of local ports to use]:num' \
  {-N,--no-buffer}'[disable buffering of the output stream]' \
  '--no-keepalive[disable use of keepalive messages in TCP connections]' \
  '--raw[disable all http decoding and pass raw data]' \
  '--resolve[provide a custom address for a specific host and port pair]:host\:port\:address' \
  '--retry[specify maximum number of retries for transient errors]:num' \
  '--retry-delay[specify delay between retries]:seconds' \
  '--retry-max-time[maximum time to spend on retries]:seconds' \
  '--tcp-nodelay[turn on TCP_NODELAY option]' \
  {-y,--speed-time}'[specify time to abort after if download is slower than speed-limit]:time' \
  {-Y,--speed-limit}'[specify minimum speed for --speed-time]:speed' \
  )

# Authentication arguments
arg_auth=(\
  '--anyauth[use any authentication method, default to most secure]' \
  '--basic[use HTTP Basic authentication]' \
  '--ntlm[enable ntlm authentication]' \
  '--digest[use http digest authentication]' \
  '--krb[use kerberos authentication]:auth:(clear safe confidential private)' \
  '--negotiate[enable GSS-Negotiate authentication]' \
  {-n,--netrc}'[scan ~/.netrc for login data]' \
  '--netrc-optional[like --netrc, but does not make .netrc usage mandatory]' \
  '--netrc-file[like --netrc, but specify file to use]:netrc file:_files' \
  '--tr-encoding[request compressed transfer-encoding]' \
  {-u,--user}'[specify user name and password for server authentication]:user\:password' \
  )

# Input arguments
arg_input=(\
  {-C,--continue-at}'[resume at offset ]:offset' \
  {-g,--globoff}'[do not glob {}\[\] letters]' \
  '--max-filesize[maximum filesize to download, fail for bigger files]:bytes' \
  '--proto[specify allowed protocols for transfer]:protocols' \
  '--proto-redir[specify allowed protocols for transfer after a redirect]:protocols' \
  {-r,--range}'[set range of bytes to request (HTTP/FTP/SFTP/FILE)]:range' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  {-T,--upload-file}'[transfer file to remote url (using PUT for HTTP)]:file to upload:_files' \
  '--url[specify a URL to fetch (multi)]:url:_urls' \
  {-z,--time-cond}'[request downloaded file to be newer than date or given reference file]:date expression' \
  )

# Output arguments
arg_output=(\
  '--create-dirs[create local directory hierarchy as needed]' \
  {-D,--dump-header}'[write protocol headers to file]:dump file:_files' \
  {-o,--output}'[write to specified file instead of stdout]:output file:_files' \
  {--progress-bar,-\#}'[display progress as a simple progress bar]' \
  {-\#,--progress-bar}'[Make curl display progress as a simple progress bar instead of the standard, more informational, meter.]' \
  {-R,--remote-time}'[use timestamp of remote file for local file]' \
  '--raw[disable all http decoding and pass raw data]' \
  {-s,--silent}'[silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[show errors in silent mode]' \
  '--stderr[redirect stderr to specified file]:output file:_files' \
  '--trace[enable full trace dump of all incoming and outgoing data]:trace file:_files' \
  '--trace-ascii[enable full trace dump of all incoming and outgoing data, without hex data]:trace file:_files' \
  '--trace-time[prepends a time stamp to each trace or verbose line that curl displays]' \
  {-v,--verbose}'[output debug info]' \
  {-w,--write-out}'[specify message to output on successful operation]:format string' \
  '--xattr[store some file metadata in extended file attributes]' \
  {-X,--request}'[specifies request method for HTTP server]:method:(GET POST PUT DELETE HEAD OPTIONS TRACE CONNECT PATCH LINK UNLINK)' \
  )

_arguments -C -s $arg_http $arg_ftp $arg_other $arg_crypto $arg_connection $arg_auth $arg_input $arg_output \
  {-M,--manual}'[Print manual]' \
  '*'{-K,--config}'[Use other config file to read arguments from]:config file:_files' \
  '--libcurl[output libcurl code for the operation to file]:output file:_files' \
  {-m,--max-time}'[Limit total time of operation]:seconds' \
  {-s,--silent}'[Silent mode, do not show progress meter or error messages]' \
  {-S,--show-error}'[Show errors in silent mode]' \
  '--stderr[Redirect stderr to specified file]:output file:_files' \
  '-q[Do not read settings from .curlrc (must be first option)]' \
  {-h,--help}'[Print help and list of operations]' \
  {-V,--version}'[Print service API version]' \
  '--about[Print the information about service]' \
  '--host[Specify the host URL]':URL:_urls \
  '--dry-run[Print out the cURL command without executing it]' \
  {-ac,--accept}'[Set the Accept header in the request]: :{_values "Accept mime type" $(get_mime_type_completions)}' \
  {-ct,--content-type}'[Set the Content-type header in request]: :{_values "Content mime type" $(get_mime_type_completions)}' \
  '1: :->ops' \
  '*:: :->args' \
  && ret=0


case $state in
  ops)
    # Operations
    _values "Operations" \
            "assetsServiceAssetIngestion[AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.]" \
            "assetsServiceAssetIngestionManualTrigger[AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.]" \
            "assetsServiceClonePolicy[ClonePolicy - Clone a policy.]" \
            "assetsServiceCreateUpdatePolicy[CreateUpdatePolicy - Create/update new Policy.]" \
            "assetsServiceDeleteFilterTemplateForAssets[DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.]" \
            "assetsServiceDeletePolicies[DeletePolicies - Delete Policy returns response code and message.]" \
            "assetsServiceFetchAssetChangeLog[FetchAssetChangeLog - Fetch the logs for any actions performed on assets.]" \
            "assetsServiceFetchAssetDashboard[FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.]" \
            "assetsServiceFetchAssetList[FetchAssetList - Asset Fetch Api .]" \
            "assetsServiceFetchAssetsForMergeSplit[FetchAssetsForMergeSplit : Fetch assets for Merge and Split.]" \
            "assetsServiceFindAssetName[FindAssetName - Checks if the given Asset Name has already been assigned to an asset.]" \
            "assetsServiceGetAssetOverview[GetAssetOverview - Get asset overview widgets data for a particular asset.]" \
            "assetsServiceGetAssetTopology[GetAssetTopology- Get list of topology for a parent asset.]" \
            "assetsServiceGetFilterTemplateForAssets[GetFilterTemplateForAssets - Get list of filters query templates for manage assets.]" \
            "assetsServiceGetFiltersForAssets[GetFiltersForAssets - Get a list of filters category and sub category with all data.]" \
            "assetsServiceListPolicy[ListPolicy - List all policies.]" \
            "assetsServiceListRule[ListRule - List all rules for a policy.]" \
            "assetsServiceListTagDomains[ListTagDomains - Get Tag categories by request parameters .]" \
            "assetsServiceListTags[ListTags - Get Tags for Manage Tags listing screen .]" \
            "assetsServiceMergeOrSplitAssets[MergeOrSplitAssets - Merge or split the selected assets.]" \
            "assetsServiceSaveAssignedTags[SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.]" \
            "assetsServiceSaveTagConceptData[SaveTagConceptData - creates a custom tag]" \
            "assetsServiceSaveTagDomainData[SaveTagDomainData - creates a custom category to be assigned to a tag]" \
            "assetsServiceSaveUpdateFilterTemplateForAssets[SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.]" \
            "assetsServiceSetBannerState[SetBannerState - Set banner state for asset inventory page.]" \
            "assetsServiceUpdateAssetName[UpdateAssetName - Udates the name of the asset as given by the user.]" \
            "assetsServiceUpdatePolicy[UpdatePolicy - Update existing Policy status.]"             "auditServiceGetActivityRecords[Summary: Get activity records
Description: Return activity records that match the arguments passed in the request. 
Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a 
comma-separated list to the corresponding fields in the request.  For instance to check for 
multiple Contexts set the field to \"op1, op2, op3\".]" \
            "auditServicePutDownloadActivityRecord[Summary: Put download activity record
Description: Create an activity log record with the arguments passed in the request.]"             "authServerServiceCreateOauthClient[Summary: Create Oauth client
Description: Create/register new Oauth client.]" \
            "authServerServiceDeleteOauthClient[Summary: Delete Oauth client
Description: Delete registered Oauth client by clientId.]" \
            "authServerServiceGetAccessToken[Summary: Get access token
Description: Get access token from passed clientId and secret.]" \
            "authServerServiceGetOauthClient[Summary: Get Oauth client
Description: Get registered Oauth client by clientId.]" \
            "authServerServiceGetUser[Summary: Get user
Description: Get user.]" \
            "authServerServiceListOauthClient[Summary: List Oauth client
Description: List all registered Oauth client.]"             "addAnalyzedRegion[Add a new region for data classification]" \
            "addCloudAccounts[Add cloud account connections to DSPM]" \
            "generateAtlassianConfluenceAuthUrl[Generate a Confluence authentication URL]" \
            "generateAtlassianJiraAuthUrl[Generate a JIRA authentication URL]" \
            "generateAzureAuthUrl[Generate azure authorization url]" \
            "generateOffice365AuthUrl[Generate a Microsoft 365 consent URL]" \
            "generateSlackAuthUrl[Generate a Slack authentication URL]" \
            "generateSnowflakeAuthUrl[Validate and Generate a Snowflake OAuth URL]" \
            "getAnalyzedRegionStatus[Get the status of analyzer installation for a region]" \
            "getAzureAdminConsentStatus[Get Azure admin consent status]" \
            "getCloudAccountInstallationStatus[Get the installation status of a cloud account]" \
            "getRefreshTokenExpiry[Get Snowflake Refresh Token Expiry date]" \
            "listLinkedAccounts[List cloud accounts connected to DSPM]" \
            "removeAccounts[Post cloud account ID connections to be removed]" \
            "removeAccountsInstructions[Post cloud account IDs and get instructions to remove the accounts]" \
            "retrieveServiceAccountId[Get Google Workspace authentication]" \
            "snowflakeIntegrationScript[Generate Snowflake Integration Script]" \
            "submitGoogleWorkspaceAdminEmail[Submit email for service account authorization]" \
            "submitOffice365TenantInfo[Submit Microsoft 365 customer information]" \
            "submitSlackAuthCode[Submit a Slack authentication code]" \
            "submitSnowflakeAuthCode[Submit Snowflake oAuth code]"             "complianceAcceleratorCreateWorkspace[Summary: Create workspace
Description: Create a workspace.]" \
            "complianceAcceleratorDeleteComplianceWorkspaces[Summary: Delete compliance workspaces
Description: Delete workspaces.]" \
            "complianceAcceleratorGetComplianceInfo[Summary: Get compliance info
Description: Return stored compliance data.]" \
            "complianceAcceleratorHydrateWorkspace[HydrateWorkspace - Hydrates specified objects within a workspace]" \
            "complianceAcceleratorStoreComplianceInfo[Summary: Store compliance info
Description: Store compliance data.]"             "connectionsServiceCreateConnectionsAccounts[Summary: Create Connections accounts
Description: Create Connections acccounts.]" \
            "connectionsServiceCreateConnectionsConfigs[Summary: Create connections configs
Description: Create Connection config by connection type.]" \
            "connectionsServiceCreatePlugin[Summary: Create plugin
Description: Create UC generic plugin]" \
            "connectionsServiceCreateSettings[Summary: Create settings
Description: Create Settings.]" \
            "connectionsServiceDeleteConnectionsAccounts[Summary: Delete Connections accounts
Description: Delete Connections acccounts.]" \
            "connectionsServiceDeleteConnectionsConfigs[Summary: Delete connections configs
Description: Delete Connection config by connection id.]" \
            "connectionsServiceDeleteConnector[Summary: Delete connector
Description: Delete a Connection.]" \
            "connectionsServiceDeletePlugin[Summary: Delete plugin.
Description: Delete plugin.]" \
            "connectionsServiceGeneratePackage[Summary: Generate package.
Description: Generate package.]" \
            "connectionsServiceGetBannerState[Summary: Get banner state for object verb page. 
Description: Get banner state for object verb page.]" \
            "connectionsServiceGetConnectionsAccounts[Summary: Get Connections accounts
Description: Get Connections acccounts.]" \
            "connectionsServiceGetConnectionsConfigs[Summary: Get connections configs
Description: Get Connection config by connection type.]" \
            "connectionsServiceGetConnectionsWithFilters[Summary: Get connections with filters
Description: Get connections with filters.]" \
            "connectionsServiceGetConnectorsSummary[Summary: Get connectors summary
Description: Get a summary of Connectors.]" \
            "connectionsServiceGetDataSources[Summary: Get data sources
Description: Get a list of data sources.]" \
            "connectionsServiceGetGuardRecordFields[Summary: Get list of guard record fields. 
Description: Get list of guard record fields.]" \
            "connectionsServiceGetHeaders[Summary: Get headers
Description: Get a list of Headers.]" \
            "connectionsServiceGetPlugins[Summary: Get plugins 
Description: Get custom universal connector plugins]" \
            "connectionsServiceGetSettings[Summary: Get settings
Description: Get a list of Settings.]" \
            "connectionsServicePartialUpdateConnectors[Summary: Partial update connectors
Description: Partial update of Connectors.]" \
            "connectionsServicePostStapCommand[Summary: Post stap command
Description: Send a STAP command down to kafka for snif-assist.]" \
            "connectionsServiceUpdateBannerState[Summary: Update banner state for object verb page. 
Description: Update banner state for object verb page.]" \
            "connectionsServiceUpdateConnectionsAccounts[Summary: Update Connections accounts
Description: Update Connections acccounts.]" \
            "connectionsServiceUpdateConnectionsConfigs[Summary: Update connections configs
Description: Update Connection config by connection id.]" \
            "connectionsServiceUpdateConnectors[Summary: Update connectors
Description: Update a list of Connectors.]" \
            "connectionsServiceUpdatePlugin[Summary: Update plugin.
Description: Update plugin.]" \
            "connectionsServiceUpdateSettings[Summary: Update settings
Description: Update Settings.]" \
            "connectionsServiceValidateAwsConnection[Summary: Validate an AWS connection.
Description: Validate an AWS connection.]"             "dashboardsServiceCreateDashboard[Summary: Create dashboard
Description: Create a unique dashboard.]" \
            "dashboardsServiceDeleteDashboard[Summary: Delete dashboard
Description: Delete a unique dashboard.]" \
            "dashboardsServiceGetDashboards[Summary: Get dashboards
Description: Get a list of dashboards with all data.]" \
            "dashboardsServiceUpdateDashboard[Summary: Update dashboard
Description: Update a dashboard.]"             "getActualFlow[Get actual flow by providing its ID]" \
            "getActualFlowsSummary[Get summary of actual flows]" \
            "getPotentialFlow[Get potential flow by providing its ID]" \
            "getPotentialFlowPath[Get potential flow path by providing its ID]" \
            "getPotentialFlowsSummary[Get summary of potential flows according to the filter applied]" \
            "listActualFlowPaths[Get summary of actual flows according to the filter applied]" \
            "listActualFlows[List actual flows]" \
            "listPotentialFlows[List potential flows]" \
            "listPotentialFlowsPaths[List potential flow paths]"             "getDataResource[Get a specific data resource by its ID]" \
            "getDataResourcesSummary[Data resources summary]" \
            "listDataResources[List data resources that match a given filter]" \
            "listDataResourcesNames[List names of data resources]" \
            "removeResource[Remove resource from DSPM]" \
            "updateResourceReviewStatus[Set review status of a data resource]"             "getSensitivitiesSummary[Get the summary of sensitivities]" \
            "getSensitivity[Get sensitivity details by providing its ID]" \
            "listSensitivities[List sensitivities]"             "getDataStore[Get a data store by its ID]" \
            "getDataStoresSummary[Get summary of data stores]" \
            "listAllDataStoresLabels[List labels of data stores.]" \
            "listDataStores[List data stores]" \
            "listDataStoresCloudTagsKeys[List the cloud tag keys of data stores that can be filtered on the basis of prefixes.]" \
            "listDataStoresCloudTagsValues[List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.]" \
            "listDataStoresNames[List name of filterable data stores]" \
            "rescanDataStore[Post data store rescan request]" \
            "setDataStoreLabel[Label a data store with an existing or new label]" \
            "updateDatastoreCustodian[Update the name of a Data store custodian]"             "addVulnerabilityStatusComment[Add vulnerability status comment]" \
            "getVulnerabilitiesSummary[Get vulnerabilities summary]" \
            "getVulnerability[Get vulnerability details by ID]" \
            "listVulnerabilities[List vulnerabilities based on an applied filter]" \
            "listVulnerabilitiesByDataStore[List vulnerabilities of data stores]" \
            "removeVulnerabilityStatusComment[Delete vulnerability status comment]" \
            "setVulnerabilityStatus[Set status of a vulnerability]" \
            "updateVulnerabilityStatusComment[Set vulnerability status]"             "databootstrapperServiceLoadData[Summary: Load data
Description: Load data for a tenant.]"             "datamartProcessorServiceGetDatamartInfo[Summary: Get datamarts
Description: Return a list of files inside a datamart to the caller.]" \
            "datamartProcessorServiceGetDatamarts[Summary: Get datamarts
Description: Return a list of datamarts for a time interval to the caller.]" \
            "datamartProcessorServiceGetEarliestStartTime[Summary: Get rarliest start time
Description: Return the earliest time period of data available in database.]" \
            "datamartProcessorServiceSendAllCompleteFilesToQueue[]" \
            "datamartProcessorServiceStoreExtractionLogs[Summary: Store extraction logs
Description: Store the datamart extraction logs inside GI.]" \
            "uploadDatamart[Summary: Upload datamart
Description: Upload datamart file for ingestion.]"             "ecosystemServiceCreateDataset[Summary: Create dataset
Description: Save a definition in the database.]" \
            "ecosystemServiceDataInsert[Summary: Data insert
Description: Process Data received from webhook API and insert.]" \
            "ecosystemServiceDeleteDatasets[Summary: Delete datasets
Description: Delete an array of datasets.]" \
            "ecosystemServiceGetDatasetData[Summary: Get dataset data
Description: Return data report for a given dataset.]" \
            "ecosystemServiceGetDatasetDetail[Summary: Get dataset detail
Description: Return detail on a dataset definition.]" \
            "ecosystemServiceGetDatasets[Summary: Get datasets
Description: Return dataset list that matches the specified filter.]" \
            "ecosystemServiceGetPurgableRows[Summary: Get purgable rows
Description: Check the number of rows that can be purged.]" \
            "ecosystemServicePurgeData[Summary: Purge data
Description: Purge data.]" \
            "ecosystemServiceTestIntegration[Summary: Test integration
Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible
a test message is sent to the integration to ensure it is functional.
Currently this API only supports API_IMPORT type integrations]"             "edgeSchedulerServiceGetEdgeQueryStatus[Summary: Get edge query status
Description: Get the status of a queued edge query]" \
            "edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery[Summary: Monitor for a pending edge query request
Description: monitor edge query pending request]" \
            "edgeSchedulerServiceScheduleEdgeQuery[Summary: Schedule an edge query 
Description: Schedule an edge query via data warehouse queue]"             "featureFlagsServiceDeleteFeatureFlagOverrides[Summary: Delete feature Flag overrides
Description: Delete feature Flag overrides from database.]" \
            "featureFlagsServiceGetFeatureFlagOverrides[Summary: Get feature Flag overrides
Description: Get feature Flag overrides by Feature Flag Name.]" \
            "featureFlagsServiceGetFeatureFlags[Summary: Get feature flags
Description: Get feature flags by Feature Flag Name.]" \
            "featureFlagsServiceUpdateFeatureFlagOverrides[Summary: Update feature Flag overrides
Description: Update feature Flag overrides in the database.]"             "groupBuilderCancelImportGroup[Summary: Cancel import group
Description: Cancel import refresh for selected groups.]" \
            "groupBuilderCreateGroup[Summary: Create group
Description: Create new groups.]" \
            "groupBuilderDeleteGroup[Summary: Delete group
Description: Delete specified groups if the group ID is not used for reports.]" \
            "groupBuilderEditGroup[Summary: Edit group
Description: Add or delete group members.]" \
            "groupBuilderExportGroup[Summary: Export group
Description: Export group content to a file based on a group ID.]" \
            "groupBuilderGetGroupDetails[Summary: Get group details
Description: Get details of group specified by group ID.]" \
            "groupBuilderGetGroupMembers[Summary: Get group members
Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.]" \
            "groupBuilderGetGroupSyncMapping[Summary: Get GDP to gi group mapping
Description: Get GDSC to GDP group sync mapping.]" \
            "groupBuilderGetGroupTypeMapping[Summary: Get group type mapping
Description: Get GDSC to GDP group types mapping.]" \
            "groupBuilderGetGroupTypes[Summary: Get group types
Description: Get a list of available group types.]" \
            "groupBuilderGetGroups[Summary: Get groups
Description: Get a list of imported group members.]" \
            "groupBuilderGetImportGroups[Summary: Get import groups
Description: Get unsynchronized groups from a central manager.]" \
            "groupBuilderImportGroup[Summary: Import group
Description: Import selected groups from a central manager. (This API is called from GDP only)]" \
            "groupBuilderRefreshGroups[Summary: Refresh groups
Description: Refresh tenants selected imported groups.]" \
            "groupBuilderResetGroups[Summary: Reset groups
Description: Resets tenants selected predefined groups.]" \
            "groupBuilderStoreGroupMembersGdp[Summary: Store group members Gdp
Description: Store GDP groups. (This API is called from GDP only)]" \
            "groupBuilderStoreGroupsGdp[Summary: Store groups Gdp
Description: Store GDP groups. (This API is called from GDP only)]"             "guardiumConnectorAddCM[Summary: Add CM
Description: Add a Central Manager to the tenant database.]" \
            "guardiumConnectorAddDatamarts[Description: stores datamarts details from GDP. (This API is called from GDP only)]" \
            "guardiumConnectorAddDmExclusion[Summary: Add DM exclusion
Description: Add datamart to exclusion list.]" \
            "guardiumConnectorAddTask[Summary: Add task
Description: Add a task to be executed on GDP. (This API is called from GDP only)]" \
            "guardiumConnectorBlockUser[Summary: Block user
Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.]" \
            "guardiumConnectorConfigureAggregatorExport[Summary: Configure aggregator export
Description: Configure datamart export from the Aggregators to GI.]" \
            "guardiumConnectorConfigureCollectorExport[Summary: Configure collector export
Description: Schedule export historical data for collectors.]" \
            "guardiumConnectorConfigureStreaming[Summary: Configure streaming
Description: Enable or disable streaming.]" \
            "guardiumConnectorDatamartVersionCheck[Description: validates if central manager has v5 datamart support. (This API is called from GDP only)]" \
            "guardiumConnectorDeleteCM[Summary: Delete CM
Description: Delete a Central Manager by ID (Name, Hostname or IP).]" \
            "guardiumConnectorDeleteDmExclusion[Summary: Delete DM exclusion
Description: Delete a datamart from exclusion list.]" \
            "guardiumConnectorDeleteTask[Summary: Delete task
Description: Delete a task by central manager id and task id. (This API is called from GDP only)]" \
            "guardiumConnectorDeleteTasks[Summary: Delete tasks
Description: Delete a central manager's tasks by central manager id. (This API is called from GDP only)]" \
            "guardiumConnectorGetAggregatorsConfig[Summary: Get aggregators config
Description: Return a list of managed units from the config collection in tenant database.]" \
            "guardiumConnectorGetCMs[Summary: Get CMs
Description: Return a list of Central Managers from the tenant database with additional processing.]" \
            "guardiumConnectorGetCMsConfig[Summary: Get CMs config
Description: Return a list of Central Managers from the tenant database.]" \
            "guardiumConnectorGetCollectorsConfig[Summary: Get collectors config
Description: Return the list of collectors configuration from the tenant database.]" \
            "guardiumConnectorGetDatamarts[Description: returns full list of supported datamarts including type (historical or non-historical)]" \
            "guardiumConnectorGetDmExclusion[Summary: Get DM exclusion
Description: Return datamarts in the exclusion list.]" \
            "guardiumConnectorGetGdpPolicyInfo[Summary: Get guardium policy definition
Description: returns the policy definition on the cm]" \
            "guardiumConnectorGetGdpPolicySummaries[Summary: Get guardium policy summary
Description: returns the summaries of all policies on that central manager]" \
            "guardiumConnectorGetHealthInfo[Summary: Get health info
Description: Get health information from Guardium Data Protection central mamangers. (This API is for CMs registered in legacy pull mode. Supported on-premises only)]" \
            "guardiumConnectorGetLatestDMExtractionProfile[Summary: Get latest DM extraction profile
Description: Return the Datamart Extraction Profile for GDSC.]" \
            "guardiumConnectorGetStreamingStatus[Summary: Get streaming status
Description: Return the streaming configuration.]" \
            "guardiumConnectorGetSyncDMs[Summary: Get sync DMs
Description: Return the list of tasks from a central manager. (This API is called from GDP only)]" \
            "guardiumConnectorGetTaskTypes[Summary: Get task types
Description: Return the list of supported task types.]" \
            "guardiumConnectorGetTasks[Summary: Get tasks
Description: Return the list of tasks from a central manager. (This API is called from GDP only)]" \
            "guardiumConnectorRunGDPReport[Summary: Run GDP report
Description: Run GDP report. (This API is for CMs registered in legacy pull mode. Supported on-premises only)]" \
            "guardiumConnectorSetupCM[Summary: Setup CM
Description: Set up the registration between a GDP Central manager and GDSC. (This API is called from GDP only)]" \
            "guardiumConnectorSetupDatamarts[Description: setup custom datamart execution mode]" \
            "guardiumConnectorTaskError[Summary: Task error
Description: Log error messages from GDP task execution. (This API is called from GDP only)]" \
            "guardiumConnectorTestDatabaseConnection[Summary: Test database connection
Description: Return database connection results.]" \
            "guardiumConnectorUpdateDmExclusion[Summary: Update DM exclusion
Description: Update the atamart exclusion list.]" \
            "guardiumConnectorUpdateStreaming[Summary: Update streaming
Description: Update streaming status into GI. (This API is called from GDP only)]" \
            "guardiumConnectorUpdateTask[Summary: Update task
Description: Update a task that gets executed on GDP. (This API is called from GDP only)]"             "healthCollectorGetDataWarehouseUsage[Summary: Get data warehouse usage info
Description: Get information from data warehouse related to usage]" \
            "healthCollectorGetGDPHealthInfo[Summary: Get GDP health info
Description: Get information from MongoDB for Guardium central managers using health-connector service.]" \
            "healthCollectorGetHistoricalHealthInfo[Summary: Get historical health info
Description: Retrieve historical s-tap related statistics from health-collector service.]" \
            "healthCollectorGetObjectStorageUsage[Summary: Get object storage usage info
Description: Get information from object storage about tenant bucket usage]" \
            "healthCollectorGetPVCUsage[Summary: Get the PVC usage information
Description: Get information about the PVC usage in the OCP cluster]" \
            "healthCollectorGetPodRestarts[Summary: Get the pod restart information
Description: Get information about the number of restarts by pod in OCP]" \
            "healthCollectorGetStreamsIngestion[Summary: Get streams ingestion volume over a given time
Description: Get information about streams ingestion volume]" \
            "healthCollectorGetTopGDPCollectors[Summary: Get the top GDP collectors which send data to GI
Description: Get information about the top GDP collectors]" \
            "healthCollectorStoreHealthInfo[Summary: Store health info
Description: Store health info from GDP into GI. (This API is called from GDP only)]"             "jumpboxServiceAuthorize[Summary: Authorize
Description: Authenticate a user and return a JWT.]" \
            "jumpboxServiceDeleteTenant[Summary: Delete tenant
Description: Delete a tenant.]" \
            "jumpboxServiceDeleteUser[Summary: Delete user
Description: Delete the user.]" \
            "jumpboxServiceGetTenant[Summary: Get tenant
Description: Get a tenant.]" \
            "jumpboxServiceGetTenants[Summary: Get tenants
Description: Get all tenant base on UID.]" \
            "jumpboxServiceGetUsers[Summary: Get users
Description: Get all users base on a tenantID.]" \
            "jumpboxServicePostTenants[Summary: Post tenants
Description: Create a tenant.]" \
            "jumpboxServicePostUsers[Summary: Post users
Description: Create users.]" \
            "jumpboxServiceSearchUsers[Summary: Search users
Description: Search for all users matching the provided string.]" \
            "jumpboxServiceTestUser[Summary: Test user
Description: Test a user lookup to a given LDAP.]" \
            "jumpboxServiceUpdateTenant[Summary: Update tenant
Description: Update a tenant.]" \
            "jumpboxServiceUpdateUsers[Summary: Update users
Description: Update an array of users.]"             "notificationsServiceCreateTicket[Summary: Create ticket
Description: Create ticket based on information passed in.]" \
            "notificationsServiceGetFolders[Summary: Get folders
Description: Get folder for the integration connection provided.]" \
            "notificationsServiceGetNotificationFilename[Summary: Get notification filename
Description: Return filename associated with the notifications record referenced in the associated context record.
The notification id is required but may be set in the associated authentication token or explicitly in the request.]" \
            "notificationsServiceGetNotificationRecord[Summary: Get notification record
Description: Return notifications record with the specified ID.]" \
            "notificationsServiceGetNotificationRecords[Summary: Get notification records
Description: Return notifications records that match the specified filter.]" \
            "notificationsServiceGetTicketStatus[Summary: Get ticket status
Description: Get the status of the given ticket]" \
            "notificationsServicePostNotificationRecord[Summary: For PostNotificationRecord notification only
Description: Sends notification with recipients and returns a status]" \
            "notificationsServiceSearchNotificationRecords[Summary: Search notification records
Description: Return notification records using pipeline of filters]" \
            "notificationsServiceTestIntegration[Summary: Test integration
Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible
a test message is sent to the integration to ensure it is functional.]" \
            "notificationsServiceUpdateNotificationRecord[Summary: Update notification record
Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification.
All fields other than the ID are optional.
Creation timestamp, user and other administrative fields can not updated.]"             "outliersEngineGetSourceStatistics[Summary: Get source statistics
Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.]" \
            "outliersEngineGetStatistics[Summary: Get statistics
Description: Return statistics regarding number of outliers, clusters and un/completed periods.]" \
            "outliersEngineGetWorkingHoursPeriods[Summary: Get working hours periods
Description: Get a list of the working hours periods.]" \
            "outliersEngineRunSimulator[Summary: Run simulator
Description: Run outlier simulator.]" \
            "outliersEngineUpdateWorkingHoursPeriods[Summary: Update working hours periods
Description: Update the working hours periods values.]" \
            "outliersEngineUploadAndAnalyzePeriod[Summary: Upload and analyze period
Description: Run outliers detection on ready periods.]" \
            "outliersEngineUserClustering[Summary: User clustering
Description: Run user-clustering on current sources.]"             "pipelineconfigServiceDeleteTenantResources[Summary: Delete a tenant resource
Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.]"             "policyBuilderClonePolicy[Summary: Clone policy
Description: Clone a policy.]" \
            "policyBuilderCreatePolicy[Summary: Create policy
Description: Create Policy returns response code and message.]" \
            "policyBuilderDeleteGdpSyncEntry[Summary: Delete GDP policy sync entry
Description: Deletes GDP policy from sync collection]" \
            "policyBuilderDeletePolicies[Summary: Delete policies
Description: Delete Policy returns response code and message.]" \
            "policyBuilderGetGdpPolicyMetaData[Summary: Get GDP policy summary information
Description: Get GDP's CM's policy summary from mogodb]" \
            "policyBuilderGetPolicies[Summary: Get policies
Description: Return a list of policies to the caller.]" \
            "policyBuilderGetPolicyDetails[Summary: Get policy details
Description: Return a list of rules inside the policy.]" \
            "policyBuilderGetPolicyNamesFromRuleIDs[Summary: GetPolicy names from rule IDs
Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.]" \
            "policyBuilderGetPolicySyncList[Summary: Get list of synced polices
Description: Returns the list and status of sync entries]" \
            "policyBuilderGetReceivers[Summary: Get receivers
Description: Get all the receivers associated with actions.]" \
            "policyBuilderGetRuleMetadata[Summary: Get rule metadata
Description: Return a list of rule parameters and actions to the caller.]" \
            "policyBuilderInsertGdpPolicy[Summary: Insert GDP policy sync entry
Description: Inserts GDP policy's name into sync collection]" \
            "policyBuilderInsertGdpPolicyMetaData[Summary: Insert GDP policy summaries
Description: Inserts GDP's CM's policy summary information into mogodb. (This API is called from GDP only)]" \
            "policyBuilderInstallPolicies[Summary: Install policies
Description: Activate Policies request performs activations.]" \
            "policyBuilderIntegrationCheck[Summary: Integration check
Description: Check if integration id is being used in policies.]" \
            "policyBuilderPoliciesGroups[Summary: Policies groups
Description: Get policy groups.]" \
            "policyBuilderRuleValidation[Summary: Rule validation
Description: Validate a rule parameters and actions.]" \
            "policyBuilderStorePoliciesGdp[Summary: Store policies Gdp
Description: Store policies.  (This API is called from GDP only)]"             "qSDataLoaderQSfileValidator[QSfileValidator - validate the files before insert happend .]" \
            "qSDataLoaderUploadSyntheticDataLoader[UploadSyntheticDataLoader - Insert data into Db after read from .sql file .]"             "qSDataManagerGetMasterData[Summary: master data for all entities
Description: Retrieves All Dimension and Fact tables data.]" \
            "qSDataManagerGetPluginData[Summary: Plugins Details
Description: Retrieves All plugins information.]" \
            "qSDataManagerRegisterScan[Summary: Insert ScanDetails
Description: Register new data into scan dimension table.]" \
            "qSDataManagerRetrieveScan[Summary: Fetch ScanDetails
Description: Fetch details from scan dimension table.]"             "qSPluginManagerInvokeAppProv[Summary: Invoke only application provisioning data plugin
Description:Parses app input file and triggers dataload]" \
            "qSPluginManagerInvokeExplorerV1[Summary: Invoke only explorer inventory data plugin
Description:Parses explorer input file and triggers dataload]" \
            "qSPluginManagerInvokeExplorerV2[Summary: Invoke only explorer analytics data plugin
Description:Parses explorer input file and triggers dataload]" \
            "qSPluginManagerInvokePlugin[Summary: Invoke consolidated or only network data plugin
Description:Parses input files and triggers dataload]" \
            "qSPluginManagerInvokePolicy[Summary: Invoke only policy data plugin
Description:Parses policy input file and triggers dataload]"             "qSPolicyManagerBatchStatusUpdate[BatchStatusUpdate - trigger the batch to update the status of the Ticket .]" \
            "qSPolicyManagerConfigUpdate[ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.]" \
            "qSPolicyManagerCreateTicket[CreateTicket - Create a new Incident .]" \
            "qSPolicyManagerFetchFilesfromBuckets[FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage]" \
            "qSPolicyManagerProcessPolicyDimentionRecords[ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table]" \
            "qSPolicyManagerUpdateTicketStatus[UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .]"             "reportsRunnerGetActiveQueries[Summary: Get running queries
Description: Get queries that are running more than certain time]" \
            "reportsRunnerGetAuditDataCount[Summary: Get audit data count
Description: Get audit data.]" \
            "reportsRunnerGetChartData[Summary: Get chart data
Description: Get Chart data by chart ID or by specifying report definition and chart settings.]" \
            "reportsRunnerGetChartDatav2[]" \
            "reportsRunnerGetReportColumnFacet[Summary: Get report column facet
Description: Get counts that is group by values for the selected column.]" \
            "reportsRunnerGetReportDataCount[Summary: Get report data count
Description: Get report data.]" \
            "reportsRunnerRunAuditReport[Summary: Run audit report
Description: Run task report by SQL based ob report ID and filter definition.]" \
            "reportsRunnerRunReport[Summary: Run report
Description: Run report by report ID or by specifying report definition.]" \
            "reportsRunnerStopQuery[Summary: Stop query
Description: Stop a query based on the id]"             "reportsServiceCreateCategory[Summary: Create a category
Description: Create a report category]" \
            "reportsServiceCreateChart[Summary: Create chart
Description: Create custom chart based on provided properties.]" \
            "reportsServiceCreateChartTemplatev2[Summary: Create chart template v2
Description: Create custom VEGA chart template.]" \
            "reportsServiceCreateChartv2[Summary: Create chart v2
Description: Create custom VEGA chart based on provided properties.]" \
            "reportsServiceCreateFieldsByCategory[Summary - Create fields by category
Description: Cteate category fields based on provided properties.]" \
            "reportsServiceCreateJoin[Summary: Create a join
Description: Create a custom report join]" \
            "reportsServiceCreateReport[Summary: Create report
Description: Create custom report based on provided properties.]" \
            "reportsServiceCreateVariant[Summary: Create a variant
Description: Create a variant for reports]" \
            "reportsServiceDeleteCategory[Summary: Delete a category
Description: Delete a report category]" \
            "reportsServiceDeleteChart[Summary: Delete chart
Description: Delete a custom chart.]" \
            "reportsServiceDeleteChartTemplatev2[Summary: Delete chart template v2
Description: Delete a custom VEGA chart template.]" \
            "reportsServiceDeleteChartv2[Summary: Delete chart v2
Description: Delete a custom VEGA chart.]" \
            "reportsServiceDeleteFieldsByCategory[Summary - Delete fields by category
Description: Delete category fields based on provided properties.]" \
            "reportsServiceDeleteJoin[Summary: Delete a join
Description: Delete a custom join]" \
            "reportsServiceDeleteReport[Summary: Delete report
Description: Delete a custom report.]" \
            "reportsServiceDeleteVariant[Summary: Delete a variant
Description: Delete a variant]" \
            "reportsServiceGetCategories[Summary:  Get all available report categories.
Description: Get all category related fields or all possible fields.]" \
            "reportsServiceGetChartSettings[Summary: Get chart settings
Description: Get a custom chart based on provided report id.]" \
            "reportsServiceGetChartSettingsv2[Summary: Get chart settings v2
Description: Get a custom VEGA chart based on provided report id.]" \
            "reportsServiceGetChartTemplatesv2[Summary: Get chart template v2
Description: Get all custom VEGA chart templates.]" \
            "reportsServiceGetFieldsByCategories[Summary: Get fields by categories
Description: Get all category related fields or all possible fields based on a list of categories.]" \
            "reportsServiceGetFieldsByCategory[Summary: Get fields by category
Description: Get all category related fields or all possible fields.]" \
            "reportsServiceGetJoins[Summary: Get all joins
Description: Get all custom joins.]" \
            "reportsServiceGetQueryByReportDefinition[Summary: Get query by report definition
Description: Get query by report definition.]" \
            "reportsServiceGetQueryByReportID[Summary: Get query by report ID
Description: Get query by report ID.]" \
            "reportsServiceGetReportDefinition[Summary: Get report definition
Description: Get report definition.]" \
            "reportsServiceGetReportGroups[Summary: Get report groups
Description: Get reports used by the provided groups.]" \
            "reportsServiceGetReportSynopsis[Summary: Get report synopsis
Description: Return BriefReport.]" \
            "reportsServiceGetReportTimestampHeader[Summary: Get report timestamp header
Description: Get where to take a report timestamp given an entity.]" \
            "reportsServiceGetReports[Summary: Get reports
Description: Get reports list.]" \
            "reportsServiceGetReportsForJoin[Summary: Get the reports that use a join
Description: Get the reports that use a join and the headers that are imported by the reports using the join]" \
            "reportsServiceGetReportsTags[Summary: Get reports tags
Description: Get all report distinct tags.]" \
            "reportsServiceGetVariant[Summary: Get a variant
Description: Get a given variant]" \
            "reportsServiceGetVariants[Summary: Get all variants
Description: Get all variants in reports]" \
            "reportsServicePartialChartUpdate[Summary: Partial chart update
Description: Update a custom chart with partial information.]" \
            "reportsServicePartialReportUpdate[Summary: Partial report update
Description: Update a custom report with partial information.]" \
            "reportsServiceRunVariantOperation[Summary: Run a variant
Description: Run the operations in a variant]" \
            "reportsServiceTranspose[Summary: Transpose
Description: Return the corresponding full sql data.]" \
            "reportsServiceUpdateChart[Summary: Update chart
Description: Update a custom chart.]" \
            "reportsServiceUpdateChartv2[Summary: Update chart v2
Description: Update a custom VEGA chart.]" \
            "reportsServiceUpdateJoin[Summary: Update a join
Description: Update a custom join]" \
            "reportsServiceUpdateReport[Summary: Update report
Description: Update a custom report.]" \
            "reportsServiceUpdateVariantOverride[Summary: Update a variant
Description: Update a variant with a custom override]"             "resourceControllerK8ServiceCreateController[CreateController - Add a new controller.]" \
            "resourceControllerK8ServiceCreateHeartBeat[CreateHeartBeat - Create a heartbeat for the controller.]" \
            "resourceControllerK8ServiceCreateHeartBeatEx[CreateHeartBeatEx - Create a heartbeat for the controller with extended information.]" \
            "resourceControllerK8ServiceCreateJob[////////////////////////////////////////////////////////////////
Interface to the controllers and apps api in the App-Manager microservice
CreateJob - Create a job definition. Files and secrets contained within will also be created.]" \
            "resourceControllerK8ServiceCreateJobExecution[CreateJobExecution - Create a job execution.]" \
            "resourceControllerK8ServiceCreateKeypair[CreateKeypair - Create a new keypair for the controller.]" \
            "resourceControllerK8ServiceDeleteController[DeleteController - Delete a controller.]" \
            "resourceControllerK8ServiceDeleteEdgeTenant[DeleteEdgeTenant - deletes an edge tenant providing edge tenant id]" \
            "resourceControllerK8ServiceDeleteEdgeTenantRequest[DeleteEdgeTenantRequest to deletes gi and tnt CR on edge]" \
            "resourceControllerK8ServiceDeleteJob[DeleteJob - Delete a job.]" \
            "resourceControllerK8ServiceDownloadControllerLogs[DownloadControllerLogs - Download the controller logs for a running controller.]" \
            "resourceControllerK8ServiceGetControllerApps[GetControllerApps - Get the apps for the given controller.]" \
            "resourceControllerK8ServiceGetControllerCommands[GetControllerCommands - Get the commands for the controller to execute.]" \
            "resourceControllerK8ServiceGetControllerJobs[GetControllerJobs - Get the jobs for the controller to execute.]" \
            "resourceControllerK8ServiceGetControllerStatus[GetControllerStatus - Get the status for the given controller.]" \
            "resourceControllerK8ServiceGetControllers[GetControllers - Get the controllers for the given tenant.]" \
            "resourceControllerK8ServiceGetControllersWithStatus[GetControllersWithStatus - Get the controllers for the given tenant with computed status.]" \
            "resourceControllerK8ServiceGetJob[GetJob - Get the job.]" \
            "resourceControllerK8ServiceGetJobExecution[GetJobExecution - Get a job execution.]" \
            "resourceControllerK8ServiceGetJobExecutions[GetJobExecutions - Get the job executions.]" \
            "resourceControllerK8ServiceGetJobStatus[GetJobStatus - Get the job's status.]" \
            "resourceControllerK8ServiceGetTenantApp[GetTenantApp - Get a specific app for the given tenant.]" \
            "resourceControllerK8ServiceGetTenantApps[GetTenantApps - Get the apps for the given tenant.]" \
            "resourceControllerK8ServiceGetTenantJobs[GetTenantJobs - Get jobs for the given tenant.]" \
            "resourceControllerK8ServiceGetVersion[GetVersion - Get the system version information for the service.]" \
            "resourceControllerK8ServiceInstallEdgeTenantRequest[InstallEdgeTenantRequest to Create gi and tnt CRs on edge]" \
            "resourceControllerK8ServiceQueryControllerLogs[QueryControllerLogs - Query for the controller logs for a running controller.]" \
            "resourceControllerK8ServiceUpdateCommand[UpdateCommand - Update the command.]" \
            "resourceControllerK8ServiceUpdateController[UpdateController - Update an existing controller.]" \
            "resourceControllerK8ServiceUpdateControllerStatus[UpdateControllerStatus - Updates the status for the given controller.]" \
            "resourceControllerK8ServiceUpdateEdgeTenantRequest[UpdateEdgeTenantRequest to update gi and tnt CRs on edge]" \
            "resourceControllerK8ServiceUpdateJob[UpdateJob - Update a job.]" \
            "resourceControllerK8ServiceUpdateJobExecution[UpdateJobExecution - Update a job execution.]" \
            "resourceControllerK8ServiceUpdateJobStatus[UpdateJobStatus - Updates the status for the given Job.]"             "riskAnalyticsControllerEnableDisableRiskEventFeedback[Summary: Enable disable risk rvent feedback
Description: Enable or disable the collect feedback process.]" \
            "riskAnalyticsControllerEnableDisableRiskEventProcess[Summary: Enable disable risk event process
Description: Enable or disable the risk event process.]" \
            "riskAnalyticsControllerGetAllClassificationsList[Summary: Get all classifications
Description: Get all possible classifications for a risk event.]" \
            "riskAnalyticsControllerGetRiskEventClassificationsList[Summary: Get risk event classifications list
Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0.]" \
            "riskAnalyticsControllerGetRiskEventDataForSummarization[Summary: Get risk event data needed for summarization task
Description: Retrieve the full information about this risk event including all findings data]" \
            "riskAnalyticsControllerGetRiskEventDetails[Summary: Get risk event details
Description: Return the details of a risk event, including risk general info and a list of observations.]" \
            "riskAnalyticsControllerGetRiskEventProcessStatus[Summary: Get risk event process status
Description: Get the risk event process status.]" \
            "riskAnalyticsControllerGetRiskEventRow[Summary: Get risk event row
Description: Return a list of risk events.]" \
            "riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails[Summary: Get vulnerability assessment details for a given risk event
Description: Retrieve the information about failed VA tests for assets database and db user]" \
            "riskAnalyticsControllerGetRiskFeedback[Summary: Get risk feedback
Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.]" \
            "riskAnalyticsControllerGetRiskObservationDetails[Summary: Get risk observation details
Description: Return details of a single risk observation.]" \
            "riskAnalyticsControllerGetUserUISettings[Summary: Get user UI settings
Description: Get the user settings by user id to display the risk in the UI.]" \
            "riskAnalyticsControllerRiskEventTuning[Summary: Risk event tuning
Description: Perform tuning risk event actions.]" \
            "riskAnalyticsControllerSetRiskEventStatus[Summary: Set risk event status
Description: Update the risk status and justification.]" \
            "riskAnalyticsControllerSetUserUISettings[Summary: Set user UI settings
Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC.]" \
            "riskAnalyticsControllerUpdateRiskFeedback[Summary: Update risk feedback
Description: Provide feedback for one or more risk events]"             "riskAnalyticsDataProcessorGetRiskContext[Summary: Get Risk Event Context
Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.]" \
            "riskAnalyticsDataProcessorGetRiskPredefinedQuestions[Summary: Get Risk Event Predefined Questions
Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.]"             "riskAnalyticsEngineGetLeadGeneratorConfig[Summary: Get lead generator config
Description: Retrieve the configuration of a lead generator.]" \
            "riskAnalyticsEngineUpdateLeadGeneratorConfig[Summary: Update lead generator config
Description: Update the configuration of a leads generator.]"             "riskAnalyticsMlClassificationResetModelToDefaults[Summary: Reset the model to its default weights.
Description: Load the initial model instead of the existing model - this action is irreversible.]"             "schedulerServiceCreateScheduledJob[Summary: Create scheduled job
Description: Create a new scheduled job with tasks.]" \
            "schedulerServiceDeleteScheduledJob[Summary: Delete scheduled job
Description: Delete a single scheduled job.]" \
            "schedulerServiceGetDependencies[Summary: Get dependencies
Description: returns IDs of distribution rules, response templates, or processing rules that are in use]" \
            "schedulerServiceGetDistributionRules[Summary: Get distribution rules
Description: Return a list of distribution rule IDs that are used by the scheduler
Distribution rules can't be edited if it is used by a scheduled job.]" \
            "schedulerServiceGetScheduledJobDetails[Summary: Get scheduled job
Description: Return a single ScheduledJob in detail.]" \
            "schedulerServiceGetScheduledJobs[Summary: Get scheduled jobs
Description: Return a list of scheduled jobs and the linked tasks.]" \
            "schedulerServiceGetSchedulesByReport[Summary: Get schedules by report
Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.]" \
            "schedulerServiceGetTags[Summary: Get tags
Description: Return an array of all the unique tags from scheduled jobs.]" \
            "schedulerServiceSearchScheduledJobs[Summary: Search scheduled jobs
Description: Return a filtered list of scheduled jobs and the linked tasks.]" \
            "schedulerServiceSearchScheduledTaskRuns[Summary: Search scheduled task runs
Description: Return a list of scheduled task run, start date, end date, status]" \
            "schedulerServiceUpdateScheduledJob[Summary: Update scheduled job
Description: Update a single schedule job.]"             "snifAssistServiceGetSnifConfig[Summary: Get sniffer configuration parameters
Description: Get edge sniffer configuration parameters from GI-mothership.]" \
            "snifAssistServiceGetSnifPolicy[Summary: Get sniffer policy
Description: Get edge sniffer policy from GI-mothership.]" \
            "snifAssistServicePostSnifFeedback[Summary: Post sniffer feedback
Description: Post policy installation feedback to policy-builder service.]" \
            "snifAssistServiceTestRegex[Summary: Test regex
Description: Match a text string with a regular expression using the same sniffer 
code used in production to match a regex.]"             "streamsServiceCheckAWSCredentials[Summary: Check AWS credentials
Description: Service to verify AWS credentials.]" \
            "streamsServiceCheckAzureEventHub[Summary: Check Azure event hub
Description: Service to check Azure event hub.]" \
            "streamsServiceCheckAzureStorageString[Summary: Check Azure storage string
Description: Service to verify Azure storage connection.]" \
            "streamsServiceGetAWSRegions[Summary: Get AWS regions
Description: Service to get AWS regions.]" \
            "streamsServiceListAWSStreams[Summary: List AWS streams
Description: Service to list AWS Kinesis streams.]"             "templatesServiceCreateIntegration[Summary: Create integration
Description: Create a set of new templates for a new integration.]" \
            "templatesServiceCreateTemplate[Summary: Create template
Description: Create a new template.]" \
            "templatesServiceDeleteIntegration[Summary: Delete integration
Description: Delete all templates associated with an integration.]" \
            "templatesServiceDeleteTemplate[Summary: Delete template
Description: Delete a specific template.]" \
            "templatesServiceGetOriginDefaultContent[Summary: Get origin default content
Description: Return the default content for a template with a specified origin and MIME type.]" \
            "templatesServiceGetOriginFields[Summary: Get origin fields
Description: Return the fields available with a specific origin.]" \
            "templatesServiceGetTemplate[Summary: Get template
Description: Return a specific template by id.]" \
            "templatesServiceGetTemplates[Summary: Get templates
Description: Return all templates based on supplied filters.]" \
            "templatesServiceGetTemplatesForEdge[Summary: Get templates for edge
Description: Return all templates based on supplied filters.]" \
            "templatesServiceTestTemplate[Summary: Test template
Description: Analyze a specified template to ensure will function correctly when utilized.]" \
            "templatesServiceTransformTemplate[Summary: Transform template
Description: Process the specified template and returns the Title and Content based on supplied data.]" \
            "templatesServiceTransformTemplateJSON[Summary: Transform template JSON
Description: Process the specified template and returns the Title and Content based on supplied json data string.]" \
            "templatesServiceUpdateTemplate[Summary: Update template
Description: Update a single template.]"             "tenantuserCreateAPIKey[Summary: Create API key
Description: Create API Key.]" \
            "tenantuserDeleteAPIKey[Summary: Delete API key
Description: Delete APIKey Document based on the document id.]" \
            "tenantuserDeleteRole[Summary: Delete role
Description: Delete a role.]" \
            "tenantuserGetAPIKeys[Summary: Get API keys
Description: Get all APIKeys base on a tenant ID.]" \
            "tenantuserGetCurrentUser[Summary: Get current user
Description: Return the currently authenticated user.]" \
            "tenantuserGetPrivilege[Summary: Get privilege
Description: Return privilege.]" \
            "tenantuserGetPrivileges[Summary: Get privileges
Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified
If roles are specified, returns cumulative privileges for the list of roles.]" \
            "tenantuserGetRole[Summary: Get role
Description: Return single role.]" \
            "tenantuserGetRoles[Summary: Get roles
Description: Return all roles without privileges.]" \
            "tenantuserGetUser[Summary: Get user
Description: Return full user for specified user_id.]" \
            "tenantuserGetUserNames[Summary: Get user names
Description: Get user names.]" \
            "tenantuserGetUserTenant[Summary: Get user tenant
Description: Return the user plus tenant information.]" \
            "tenantuserPostPrivilegesBulk[Summary: Post privileges bulk
Description: Perform bulk user add preivilege.]" \
            "tenantuserPostRole[Summary: Post role
Description: Create a new role.]" \
            "tenantuserUpdatePrivilege[Summary: Update privilege
Description: Update privilege.]" \
            "tenantuserUpdatePrivilegesRoleBulk[Summary: Update privileges role bulk
Description: Perform bulk user update role.]" \
            "tenantuserUpdateRole[Summary: Update role
Description: Update single role.]" \
            "tenantuserUpdateUserRoleBulk[Summary: Update user role bulk
Description: Perform bulk user add or remove role.]"             "getLinkedVendor[Get additional details of a specific third party vendor]" \
            "getSingleLinkedVendor[Get the third party vendors list]" \
            "listLinkedVendorDataStores[Get the data stores associated with a third party vendor]" \
            "listLinkedVendors[Get the summary of a third party vendor]" \
            "listTrustedAssets[Get a list of all the actual trusted assets]"             "universalConnectorManagerGetCertificate[Summary: Get certificate
Description: Get the certificate that allows secure communication between data sources and universal connections in GDSC.]" \
            "universalConnectorManagerGetConnectors[Summary: Get connectors
Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.]" \
            "universalConnectorManagerGetUCSetup[Gets information to setup the new Universal connection.]" \
            "universalConnectorManagerListConnectionsSummary[Summary: List connections summary
Description: List a summary of Universal Connector configured connections (AKA datasources).]" \
            "universalConnectorManagerPluginsList[Summary: Plugins list
Description: List of all universal connector plugins.]" \
            "universalConnectorManagerUploadPlugin[Summary: Upload plugin
Description: Upload a plugin-package for Universal Connector.]"             "workflowCreateCase[Summary: Create case
Description: Create single case.]" \
            "workflowCreateProductEntity[Summary: Create product entity
Description: Create single product entity.]" \
            "workflowCreateTask[Summary: Create task
Description: Create single task within a parent case.]" \
            "workflowCreateWorkflowEvent[Summary: Post event for processing by workflow rules
Description: Find matching workflow rule and run it]" \
            "workflowDeleteProductEntity[Summary: Delete a product entity
Description: Delete a single product entity.]" \
            "workflowGetCases[Summary: Get cases
Description: Return all cases requested.]" \
            "workflowGetCasesCount[Summary: Get cases count
Description: Get case count.]" \
            "workflowGetFilename[Summary: Get filename
Description: Return filename associated with the task referenced in the associated context record.]" \
            "workflowGetJobsCount[Summary: Get jobs count
Description: Get jobs count.]" \
            "workflowGetProductEntities[Summary: Get products and their associated event entities
Description: Return a list of integrated products and their associated event entities]" \
            "workflowGetProductEntity[Summary: Get event entity field names, field labels, and field data types
Description: Return a list of fields similar to report headers]" \
            "workflowGetReportResult[Summary: Get report result
Description: Return a page of results.]" \
            "workflowGetTasks[Summary: Get tasks
Description: Return all tasks requested.]" \
            "workflowGetTasksCount[Summary: Get cases count
Description: Get case count.]" \
            "workflowSearchCases[Summary: Search cases
Description: Return a subset of cases.]" \
            "workflowSearchReports[Summary: Get a list of report IDs
Description: Returns a list of report IDs referenced in all cases and tasks]" \
            "workflowSearchTasks[Summary: Search cases
Description: Return a subset of cases.]" \
            "workflowUpdateCases[Summary: Update cases
Description: Update multiple cases in one request.]" \
            "workflowUpdateProductEntity[Summary: Update a product entity
Description: Update a single product entity.]" \
            "workflowUpdateTasks[Summary: Update tasks
Description: Update multiple tasks for the same parent in one request.]" \

    _arguments "(--help)--help[Print information about operation]"

    ret=0
    ;;
  args)
    case $line[1] in
      assetsServiceAssetIngestion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceAssetIngestionManualTrigger)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceClonePolicy)
        local -a _op_arguments
        _op_arguments=(
          "policy_id=:[PATH] Policy id that needs to be cloned."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceCreateUpdatePolicy)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceDeleteFilterTemplateForAssets)
        local -a _op_arguments
        _op_arguments=(
          "template_id=:[PATH] template id to be deleted"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceDeletePolicies)
        local -a _op_arguments
        _op_arguments=(
                    "policy_ids=:[QUERY] Policy ids."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceFetchAssetChangeLog)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceFetchAssetDashboard)
        local -a _op_arguments
        _op_arguments=(
          "widget_type=:[PATH] ID of the Dashboard Widget"
          "date_range.start=:[QUERY] start of date range for ui widget."
"date_range.end=:[QUERY] end of date range for ui widget."
"date_range.type=:[QUERY] type of date range for ui widget."
"date_range.key=:[QUERY] key for ui widget."
"date_range.error=:[QUERY] error for ui widget."
"date_range.start_number=:[QUERY] start_number for ui widget."
"date_range.start_unit=:[QUERY] start of date range for ui widget."
"date_range.end_number=:[QUERY] start of date range for ui widget."
"date_range.end_unit=:[QUERY] start of date range for ui widget."
"timeline_value_selected=:[QUERY] Name of the timeline value selected from drop down."
"tag_id=:[QUERY] Tag ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceFetchAssetList)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceFetchAssetsForMergeSplit)
        local -a _op_arguments
        _op_arguments=(
                    "asset_id=:[QUERY] Asset grouper Id."
"page_number=:[QUERY] Page number."
"page_size=:[QUERY] Page size."
"action=:[QUERY] Action : merge or split."
"search_key=:[QUERY] Search from the list based on asset name, database name, ip or host."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceFindAssetName)
        local -a _op_arguments
        _op_arguments=(
                    "asset_name=:[QUERY] Name of asset."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceGetAssetOverview)
        local -a _op_arguments
        _op_arguments=(
                    "asset_id=:[QUERY] Asset grouper Id."
"page_number=:[QUERY] Page number."
"size=:[QUERY] Page size."
"widget=:[QUERY] Widget type.

 - ALL: All Asset Overview Widgets.
 - CLASSIFICATION: Classification Asset Overview Widgets.
 - TAG: Tag Asset Overview Widgets.
 - RESOURCE: Resource Asset Overview Widgets."
"ip=:[QUERY] Asset IP."
"host=:[QUERY] Asset Host."
"database=:[QUERY] Database Name."
"asset_entity_type=:[QUERY] asset ntity type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceGetAssetTopology)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceGetFilterTemplateForAssets)
        local -a _op_arguments
        _op_arguments=(
                    "template_id=:[QUERY] template id to be deleted."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceGetFiltersForAssets)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceListPolicy)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceListRule)
        local -a _op_arguments
        _op_arguments=(
          "policy_id=:[PATH] Policy ID"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceListTagDomains)
        local -a _op_arguments
        _op_arguments=(
                    "dom_grouper=:[QUERY] Optional: dom_grouper required if we want to fetch domains based on the group."
"purpose=:[QUERY] Optional: purpose required if we want to fetch domains based on the purpose."
"need_tag=true:[QUERY] Optional: If we need Tag  based on the Domains."
          "need_tag=false:[QUERY] Optional: If we need Tag  based on the Domains."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceListTags)
        local -a _op_arguments
        _op_arguments=(
                    "asset_id=:[QUERY] asset id - Asset ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceMergeOrSplitAssets)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceSaveAssignedTags)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceSaveTagConceptData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceSaveTagDomainData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceSaveUpdateFilterTemplateForAssets)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceSetBannerState)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceUpdateAssetName)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      assetsServiceUpdatePolicy)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      auditServiceGetActivityRecords)
        local -a _op_arguments
        _op_arguments=(
                    "start_time=:[QUERY] Return records starting at this time (&gt;&#x3D;)."
"end_time=:[QUERY] Return records ending before this time (&lt;)."
"uid=:[QUERY] Return records with this service/collection id."
"action_taken=:[QUERY] Return records matching this operation (CRUD or other action)."
"context=:[QUERY] Return records for this service/collection."
"changes_made=:[QUERY] Return records created only for this reason."
"performed_by=:[QUERY] Return records originating with the specified user id."
"context_description=:[QUERY] Return records with this label."
"query=:[QUERY] Return records based on the query."
"offset=:[QUERY] The amount to offset the rows by for pagination."
"limit=:[QUERY] The max amount of rows to return for pagination."
"filter=true:[QUERY] Return eligable filters if this is true."
          "filter=false:[QUERY] Return eligable filters if this is true."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      auditServicePutDownloadActivityRecord)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authServerServiceCreateOauthClient)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authServerServiceDeleteOauthClient)
        local -a _op_arguments
        _op_arguments=(
          "client_id=:[PATH] ClientID of registered OAuth."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authServerServiceGetAccessToken)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authServerServiceGetOauthClient)
        local -a _op_arguments
        _op_arguments=(
          "client_id=:[PATH] ClientID of registered OAuth."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authServerServiceGetUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      authServerServiceListOauthClient)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addAnalyzedRegion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addCloudAccounts)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateAtlassianConfluenceAuthUrl)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateAtlassianJiraAuthUrl)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateAzureAuthUrl)
        local -a _op_arguments
        _op_arguments=(
                    "tenantId=:[QUERY] Tenant Id of the new Azure account, GUID format."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateOffice365AuthUrl)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateSlackAuthUrl)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      generateSnowflakeAuthUrl)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAnalyzedRegionStatus)
        local -a _op_arguments
        _op_arguments=(
                    "cloudProvider=:[QUERY] The cloud provider for the cloud account"
"region=:[QUERY] The region code"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getAzureAdminConsentStatus)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getCloudAccountInstallationStatus)
        local -a _op_arguments
        _op_arguments=(
          "cloudProvider=:[PATH] The cloud provider of the cloud account"
"cloudAccountId=:[PATH] The cloud account identifier"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getRefreshTokenExpiry)
        local -a _op_arguments
        _op_arguments=(
          "providerId=:[PATH] The ID of the provider"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listLinkedAccounts)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeAccounts)
        local -a _op_arguments
        _op_arguments=(
                    "accountIds=:[QUERY] "
"serviceProvider=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeAccountsInstructions)
        local -a _op_arguments
        _op_arguments=(
                    "accountIds=:[QUERY] "
"serviceProvider=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      retrieveServiceAccountId)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      snowflakeIntegrationScript)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitGoogleWorkspaceAdminEmail)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitOffice365TenantInfo)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitSlackAuthCode)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      submitSnowflakeAuthCode)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      complianceAcceleratorCreateWorkspace)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      complianceAcceleratorDeleteComplianceWorkspaces)
        local -a _op_arguments
        _op_arguments=(
                    "regulations=:[QUERY] Id to be deleted."
"deleteAll=true:[QUERY] if you want to delete a whole configuration."
          "deleteAll=false:[QUERY] if you want to delete a whole configuration."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      complianceAcceleratorGetComplianceInfo)
        local -a _op_arguments
        _op_arguments=(
                    "is_brief=true:[QUERY] gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards."
          "is_brief=false:[QUERY] gives compliance workspace data without reaching out to other services - meant to be quicker for dashboards."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      complianceAcceleratorHydrateWorkspace)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      complianceAcceleratorStoreComplianceInfo)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceCreateConnectionsAccounts)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceCreateConnectionsConfigs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceCreatePlugin)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceCreateSettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceDeleteConnectionsAccounts)
        local -a _op_arguments
        _op_arguments=(
          "account_id=:[PATH] Account id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceDeleteConnectionsConfigs)
        local -a _op_arguments
        _op_arguments=(
          "connection_id=:[PATH] Connection id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceDeleteConnector)
        local -a _op_arguments
        _op_arguments=(
          "connection_id=:[PATH] The connection id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceDeletePlugin)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] plugin id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGeneratePackage)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetBannerState)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetConnectionsAccounts)
        local -a _op_arguments
        _op_arguments=(
                    "account_id=:[QUERY] Optional: account id."
"access_key=:[QUERY] Optional: acccount access key."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetConnectionsConfigs)
        local -a _op_arguments
        _op_arguments=(
                    "type=:[QUERY] The type of connector."
"connection_id=:[QUERY] Optional: if connection id did not provide then return all connections."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetConnectionsWithFilters)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetConnectorsSummary)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetDataSources)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetGuardRecordFields)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetHeaders)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetPlugins)
        local -a _op_arguments
        _op_arguments=(
                    "id=:[QUERY] Optional: if no plug-in id is provided, returns list of all plug-ins."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceGetSettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServicePartialUpdateConnectors)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServicePostStapCommand)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceUpdateBannerState)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceUpdateConnectionsAccounts)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceUpdateConnectionsConfigs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceUpdateConnectors)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceUpdatePlugin)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceUpdateSettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      connectionsServiceValidateAwsConnection)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      dashboardsServiceCreateDashboard)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      dashboardsServiceDeleteDashboard)
        local -a _op_arguments
        _op_arguments=(
          "dashboard_id=:[PATH] The id of the dashboard to be deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      dashboardsServiceGetDashboards)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      dashboardsServiceUpdateDashboard)
        local -a _op_arguments
        _op_arguments=(
          "dashboard_id=:[PATH] The id of the dashboard that was updated."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getActualFlow)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getActualFlowsSummary)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPotentialFlow)
        local -a _op_arguments
        _op_arguments=(
          "flowId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPotentialFlowPath)
        local -a _op_arguments
        _op_arguments=(
          "flowPathId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getPotentialFlowsSummary)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listActualFlowPaths)
        local -a _op_arguments
        _op_arguments=(
                    "sort=:[QUERY] "
"filter=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listActualFlows)
        local -a _op_arguments
        _op_arguments=(
                    "sort=:[QUERY] "
"filter=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listPotentialFlows)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listPotentialFlowsPaths)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDataResource)
        local -a _op_arguments
        _op_arguments=(
          "dataResourceId=:[PATH] Data resource ID"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDataResourcesSummary)
        local -a _op_arguments
        _op_arguments=(
                    "dataStoreId=:[QUERY] Data store id"
"filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listDataResources)
        local -a _op_arguments
        _op_arguments=(
                    "dataStoreId=:[QUERY] "
"filter=:[QUERY] "
"sort=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listDataResourcesNames)
        local -a _op_arguments
        _op_arguments=(
                    "prefix=:[QUERY] Prefix of data resource name"
"dataStoreId=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeResource)
        local -a _op_arguments
        _op_arguments=(
          "dataResourceId=:[PATH] Data resource ID"
          "dataStoreId=:[QUERY] Data store ID"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateResourceReviewStatus)
        local -a _op_arguments
        _op_arguments=(
          "dataResourceId=:[PATH] Data resource id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensitivitiesSummary)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSensitivity)
        local -a _op_arguments
        _op_arguments=(
          "sensitivityId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listSensitivities)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
"sort=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDataStore)
        local -a _op_arguments
        _op_arguments=(
          "dataStoreId=:[PATH] ID of the data store"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getDataStoresSummary)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listAllDataStoresLabels)
        local -a _op_arguments
        _op_arguments=(
                    "prefix=:[QUERY] Prefix of data store label"
"maxResults=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listDataStores)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
"sort=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listDataStoresCloudTagsKeys)
        local -a _op_arguments
        _op_arguments=(
                    "prefix=:[QUERY] Prefix of cloud tag key"
"maxResults=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listDataStoresCloudTagsValues)
        local -a _op_arguments
        _op_arguments=(
                    "prefix=:[QUERY] Prefix of cloud tag value"
"tagKey=:[QUERY] "
"maxResults=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listDataStoresNames)
        local -a _op_arguments
        _op_arguments=(
                    "prefix=:[QUERY] Prefix of data store name"
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      rescanDataStore)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setDataStoreLabel)
        local -a _op_arguments
        _op_arguments=(
          "dataStoreId=:[PATH] Data store ID"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateDatastoreCustodian)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      addVulnerabilityStatusComment)
        local -a _op_arguments
        _op_arguments=(
          "vulnerabilityId=:[PATH] "
"statusId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVulnerabilitiesSummary)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getVulnerability)
        local -a _op_arguments
        _op_arguments=(
          "vulnerabilityId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listVulnerabilities)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
"sort=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listVulnerabilitiesByDataStore)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
"sort=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      removeVulnerabilityStatusComment)
        local -a _op_arguments
        _op_arguments=(
          "vulnerabilityId=:[PATH] "
"statusId=:[PATH] "
"commentId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      setVulnerabilityStatus)
        local -a _op_arguments
        _op_arguments=(
          "vulnerabilityId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      updateVulnerabilityStatusComment)
        local -a _op_arguments
        _op_arguments=(
          "vulnerabilityId=:[PATH] "
"statusId=:[PATH] "
"commentId=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      databootstrapperServiceLoadData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      datamartProcessorServiceGetDatamartInfo)
        local -a _op_arguments
        _op_arguments=(
                    "ingestion_id=:[QUERY] Ingestion id."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      datamartProcessorServiceGetDatamarts)
        local -a _op_arguments
        _op_arguments=(
                    "period_start=:[QUERY] Data starting time period in UTC."
"period_end=:[QUERY] Data ending time period in UTC."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      datamartProcessorServiceGetEarliestStartTime)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      datamartProcessorServiceSendAllCompleteFilesToQueue)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      datamartProcessorServiceStoreExtractionLogs)
        local -a _op_arguments
        _op_arguments=(
          "request_id=:[PATH] Request id which co-relates to request."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      uploadDatamart)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceCreateDataset)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceDataInsert)
        local -a _op_arguments
        _op_arguments=(
          "dataset_name=:[PATH] Data set target name."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceDeleteDatasets)
        local -a _op_arguments
        _op_arguments=(
                    "dataset_names=:[QUERY] Name of the dataset, required field."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceGetDatasetData)
        local -a _op_arguments
        _op_arguments=(
          "dataset_name=:[PATH] Name of the dataset."
          "offset=:[QUERY] The amount to offset the rows by for pagination."
"limit=:[QUERY] The max amount of rows to return for pagination."
"return_header=true:[QUERY] If needs to return header information. It is for pagination. The first page needs header, the rest doesn&#39;t need."
          "return_header=false:[QUERY] If needs to return header information. It is for pagination. The first page needs header, the rest doesn&#39;t need."
"field=:[QUERY] Search field."
"value=:[QUERY] Search value."
"sort_field=:[QUERY] Field to sort."
"sort_order=:[QUERY] Sort order."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceGetDatasetDetail)
        local -a _op_arguments
        _op_arguments=(
          "dataset_name=:[PATH] Name of the dataset."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceGetDatasets)
        local -a _op_arguments
        _op_arguments=(
                    "filter.start_time=:[QUERY] Return datasets created at this time or later (&gt;&#x3D;)."
"filter.end_time=:[QUERY] Return datasets created before this time (&lt;)."
"filter.dataset_names=:[QUERY] The state filter groups commonly paired states.
Only returns records that include the specified names."
"offset=:[QUERY] The amount to offset the rows by for pagination."
"limit=:[QUERY] The max amount of rows to return for pagination."
"include_filter_counts=true:[QUERY] Computing the filter counts is relatively expensive, only compute when needed."
          "include_filter_counts=false:[QUERY] Computing the filter counts is relatively expensive, only compute when needed."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceGetPurgableRows)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServicePurgeData)
        local -a _op_arguments
        _op_arguments=(
                    "dataset_names=:[QUERY] Name of the datasets, required field."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      ecosystemServiceTestIntegration)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      edgeSchedulerServiceGetEdgeQueryStatus)
        local -a _op_arguments
        _op_arguments=(
          "edge_id=:[PATH] the id of the edge"
          "edge_result_report_id=:[QUERY] the id of the UC report being queried for."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery)
        local -a _op_arguments
        _op_arguments=(
                    "client_id=:[QUERY] edge client id to monitor edge query requests for."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      edgeSchedulerServiceScheduleEdgeQuery)
        local -a _op_arguments
        _op_arguments=(
          "edge_id=:[PATH] the id of the edge"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      featureFlagsServiceDeleteFeatureFlagOverrides)
        local -a _op_arguments
        _op_arguments=(
                    "flag_name=:[QUERY] Flag name."
"tenant_id=:[QUERY] Optional tenant id."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      featureFlagsServiceGetFeatureFlagOverrides)
        local -a _op_arguments
        _op_arguments=(
                    "tenant_id=:[QUERY] Optional tenant id."
"flag_names=:[QUERY] Optional flag names; if empty then return all flag."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      featureFlagsServiceGetFeatureFlags)
        local -a _op_arguments
        _op_arguments=(
                    "tenant_id=:[QUERY] Tenant id."
"flag_names=:[QUERY] Optional flag names; if empty then return all flag."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      featureFlagsServiceUpdateFeatureFlagOverrides)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderCancelImportGroup)
        local -a _op_arguments
        _op_arguments=(
                    "group_ids=:[QUERY] Group IDs to delete."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderCreateGroup)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderDeleteGroup)
        local -a _op_arguments
        _op_arguments=(
                    "group_ids=:[QUERY] Group IDs to delete."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderEditGroup)
        local -a _op_arguments
        _op_arguments=(
          "group_id=:[PATH] Group ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderExportGroup)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetGroupDetails)
        local -a _op_arguments
        _op_arguments=(
          "group_id=:[PATH] Group ID."
          "filter=:[QUERY] Filter by group member name."
"order=:[QUERY] Order by ascending (ASC) or descending (DESC)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetGroupMembers)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetGroupSyncMapping)
        local -a _op_arguments
        _op_arguments=(
                    "central_manager_id=:[QUERY] Central manager."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetGroupTypeMapping)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetGroupTypes)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetGroups)
        local -a _op_arguments
        _op_arguments=(
                    "do_not_include_member_count=true:[QUERY] Return group names, ID&#39;s, type ID&#39;s, nested bool, and tuple count only if the flag is true."
          "do_not_include_member_count=false:[QUERY] Return group names, ID&#39;s, type ID&#39;s, nested bool, and tuple count only if the flag is true."
"only_full_access=true:[QUERY] Only return groups that user has full-access to."
          "only_full_access=false:[QUERY] Only return groups that user has full-access to."
"non_nested=true:[QUERY] Only return non-nested groups."
          "non_nested=false:[QUERY] Only return non-nested groups."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderGetImportGroups)
        local -a _op_arguments
        _op_arguments=(
                    "central_manager_id=:[QUERY] Central manager host name."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderImportGroup)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderRefreshGroups)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderResetGroups)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderStoreGroupMembersGdp)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      groupBuilderStoreGroupsGdp)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorAddCM)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorAddDatamarts)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] central manager"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorAddDmExclusion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorAddTask)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorBlockUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorConfigureAggregatorExport)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorConfigureCollectorExport)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorConfigureStreaming)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorDatamartVersionCheck)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central manager"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorDeleteCM)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
          "force=:[QUERY] Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorDeleteDmExclusion)
        local -a _op_arguments
        _op_arguments=(
                    "datamart=:[QUERY] Datamart name."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorDeleteTask)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
"task_id=:[PATH] ID of task being deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorDeleteTasks)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetAggregatorsConfig)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetCMs)
        local -a _op_arguments
        _op_arguments=(
                    "run_additional_checks=true:[QUERY] Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager."
          "run_additional_checks=false:[QUERY] Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetCMsConfig)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetCollectorsConfig)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetDatamarts)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] central manager hostname"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetDmExclusion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetGdpPolicyInfo)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central manager hostname"
          "policy_name=:[QUERY] Policy name."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetGdpPolicySummaries)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central manager hostname"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetHealthInfo)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
          "use_fallback=true:[QUERY] Flag indicating if the older GDP api is to be called in case it doesn&#39;t support new api."
          "use_fallback=false:[QUERY] Flag indicating if the older GDP api is to be called in case it doesn&#39;t support new api."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetLatestDMExtractionProfile)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetStreamingStatus)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetSyncDMs)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetTaskTypes)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorGetTasks)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
          "task_id=:[QUERY] ID of task."
"task_type=:[QUERY] Type of task."
"key_object=:[QUERY] Key object."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorRunGDPReport)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] Central Manager ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorSetupCM)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorSetupDatamarts)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] central manager"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorTaskError)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorTestDatabaseConnection)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorUpdateDmExclusion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorUpdateStreaming)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      guardiumConnectorUpdateTask)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
"task_id=:[PATH] ID of task being updated."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetDataWarehouseUsage)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The type of metric to retrieve"
          "start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetGDPHealthInfo)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetHistoricalHealthInfo)
        local -a _op_arguments
        _op_arguments=(
                    "unit=:[QUERY] Type of unit for which data needs to be retrieved."
"cm_id=:[QUERY] Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved."
"start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetObjectStorageUsage)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The type of metric to retrieve"
          "start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetPVCUsage)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The type of metric to retrieve"
          "start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetPodRestarts)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The type of metric to retrieve"
          "start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetStreamsIngestion)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The type of metric to retrieve"
          "start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorGetTopGDPCollectors)
        local -a _op_arguments
        _op_arguments=(
          "type=:[PATH] The type of metric to retrieve"
          "start_time=:[QUERY] The start time from which the data needs to be calculated."
"end_time=:[QUERY] The end time from which the data needs to be calculated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      healthCollectorStoreHealthInfo)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceAuthorize)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceDeleteTenant)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] Tenant id."
          "is_permanent_delete=true:[QUERY] Delete tenant permanently if true."
          "is_permanent_delete=false:[QUERY] Delete tenant permanently if true."
"async=true:[QUERY] Async."
          "async=false:[QUERY] Async."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceDeleteUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] The user id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceGetTenant)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] Tenant id."
          "include_inactive=true:[QUERY] Include inactive."
          "include_inactive=false:[QUERY] Include inactive."
"include_not_ready=true:[QUERY] Include tenants that are not ready(are in state of being created or deleted)."
          "include_not_ready=false:[QUERY] Include tenants that are not ready(are in state of being created or deleted)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceGetTenants)
        local -a _op_arguments
        _op_arguments=(
                    "uid=:[QUERY] Email."
"external_id=:[QUERY] External id."
"include_inactive=true:[QUERY] Include inactive."
          "include_inactive=false:[QUERY] Include inactive."
"include_not_ready=true:[QUERY] Include tenants that are not ready(are in state of being created or deleted)."
          "include_not_ready=false:[QUERY] Include tenants that are not ready(are in state of being created or deleted)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceGetUsers)
        local -a _op_arguments
        _op_arguments=(
                    "uid=:[QUERY] Email."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServicePostTenants)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServicePostUsers)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceSearchUsers)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceTestUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceUpdateTenant)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] Tenant id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      jumpboxServiceUpdateUsers)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceCreateTicket)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceGetFolders)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceGetNotificationFilename)
        local -a _op_arguments
        _op_arguments=(
                    "notification_id=:[QUERY] Params are located in the requests context (tenant id, user email, notification id)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceGetNotificationRecord)
        local -a _op_arguments
        _op_arguments=(
          "notification_id=:[PATH] ID for the record to return."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceGetNotificationRecords)
        local -a _op_arguments
        _op_arguments=(
                    "filter.start_time=:[QUERY] Return records created at this time or later (&gt;&#x3D;)."
"filter.end_time=:[QUERY] Return records created before this time (&lt;)."
"filter.state=:[QUERY] Only return record that include the specified state."
"filter.origins=:[QUERY] Only return record that includes the specified origins."
"filter.origin_data=:[QUERY] Only return record that with the specified origin_data."
"filter.limit=:[QUERY] The max amount of rows to return for this single query."
"offset=:[QUERY] The amount to offset the rows by for pagination."
"limit=:[QUERY] The max amount of rows to return for pagination."
"include_filter_counts=true:[QUERY] Computing the filter counts is relatively expensive, only compute when needed."
          "include_filter_counts=false:[QUERY] Computing the filter counts is relatively expensive, only compute when needed."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceGetTicketStatus)
        local -a _op_arguments
        _op_arguments=(
                    "ticket_id=:[QUERY] The ID of the ticket to fetch."
"integration_id=:[QUERY] The ID of the ticketing integration."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServicePostNotificationRecord)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceSearchNotificationRecords)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceTestIntegration)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      notificationsServiceUpdateNotificationRecord)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineGetSourceStatistics)
        local -a _op_arguments
        _op_arguments=(
                    "source.server_ip=:[QUERY] server ip."
"source.database_name=:[QUERY] database name."
"source.db_user=:[QUERY] db user name (optional)."
"attributes_limit=:[QUERY] The number of attributes to return for each SourceAttributeType - optional."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineGetStatistics)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineGetWorkingHoursPeriods)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineRunSimulator)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineUpdateWorkingHoursPeriods)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineUploadAndAnalyzePeriod)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      outliersEngineUserClustering)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      pipelineconfigServiceDeleteTenantResources)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] unique tenant ID"
"resource=:[PATH] resource specifies the specific resource to delete"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderClonePolicy)
        local -a _op_arguments
        _op_arguments=(
          "policy_id=:[PATH] Policy id that needs to be cloned."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderCreatePolicy)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderDeleteGdpSyncEntry)
        local -a _op_arguments
        _op_arguments=(
                    "sync_ids=:[QUERY] Policy sync entry id to delete from sync."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderDeletePolicies)
        local -a _op_arguments
        _op_arguments=(
                    "policy_ids=:[QUERY] Policy ids."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetGdpPolicyMetaData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetPolicies)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetPolicyDetails)
        local -a _op_arguments
        _op_arguments=(
          "policy_id=:[PATH] Policy id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetPolicyNamesFromRuleIDs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetPolicySyncList)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetReceivers)
        local -a _op_arguments
        _op_arguments=(
                    "action_id=:[QUERY] Action id."
"validate_cache=true:[QUERY] Flag that indicates if cache needs to be validated."
          "validate_cache=false:[QUERY] Flag that indicates if cache needs to be validated."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderGetRuleMetadata)
        local -a _op_arguments
        _op_arguments=(
                    "rule_type=:[QUERY] Rule type integer to indicate rule type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderInsertGdpPolicy)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderInsertGdpPolicyMetaData)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderInstallPolicies)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderIntegrationCheck)
        local -a _op_arguments
        _op_arguments=(
          "integration_id=:[PATH] Integration Id to check if it is being used in policies."
          "template_id=:[QUERY] Template Id to check if it is being used in policies."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderPoliciesGroups)
        local -a _op_arguments
        _op_arguments=(
                    "group_ids=:[QUERY] Group ids to check if they are being used in policies."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderRuleValidation)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      policyBuilderStorePoliciesGdp)
        local -a _op_arguments
        _op_arguments=(
          "central_manager_id=:[PATH] ID of central manager."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSDataLoaderQSfileValidator)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSDataLoaderUploadSyntheticDataLoader)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSDataManagerGetMasterData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSDataManagerGetPluginData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSDataManagerRegisterScan)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSDataManagerRetrieveScan)
        local -a _op_arguments
        _op_arguments=(
          "scan_id=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPluginManagerInvokeAppProv)
        local -a _op_arguments
        _op_arguments=(
          "plugin_id=:[PATH] Unique identifier for the plugin"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPluginManagerInvokeExplorerV1)
        local -a _op_arguments
        _op_arguments=(
          "plugin_id=:[PATH] Unique identifier for the plugin"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPluginManagerInvokeExplorerV2)
        local -a _op_arguments
        _op_arguments=(
          "plugin_id=:[PATH] Unique identifier for the plugin"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPluginManagerInvokePlugin)
        local -a _op_arguments
        _op_arguments=(
          "plugin_id=:[PATH] Unique identifier for the plugin"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPluginManagerInvokePolicy)
        local -a _op_arguments
        _op_arguments=(
          "plugin_id=:[PATH] Unique identifier for the plugin"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPolicyManagerBatchStatusUpdate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPolicyManagerConfigUpdate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPolicyManagerCreateTicket)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPolicyManagerFetchFilesfromBuckets)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPolicyManagerProcessPolicyDimentionRecords)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      qSPolicyManagerUpdateTicketStatus)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerGetActiveQueries)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerGetAuditDataCount)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerGetChartData)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerGetChartDatav2)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerGetReportColumnFacet)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerGetReportDataCount)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerRunAuditReport)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] The ID of the Report we wish to run (e.g. 000000000000000000000905)."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerRunReport)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsRunnerStopQuery)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateCategory)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateChart)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateChartTemplatev2)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateChartv2)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateFieldsByCategory)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateJoin)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateReport)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceCreateVariant)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteCategory)
        local -a _op_arguments
        _op_arguments=(
                    "category_id=:[QUERY] category id."
"table_name=:[QUERY] table name."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteChart)
        local -a _op_arguments
        _op_arguments=(
          "chart_id=:[PATH] The id of the chart to be deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteChartTemplatev2)
        local -a _op_arguments
        _op_arguments=(
          "template_id=:[PATH] Unique template ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteChartv2)
        local -a _op_arguments
        _op_arguments=(
          "chart_id=:[PATH] The ID of the chart for deletion."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteFieldsByCategory)
        local -a _op_arguments
        _op_arguments=(
                    "header_ids=:[QUERY] Header ids."
"table_name=:[QUERY] table name."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteJoin)
        local -a _op_arguments
        _op_arguments=(
          "join_id=:[PATH] The id of the join to be deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteReport)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] The id of the Report to be deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceDeleteVariant)
        local -a _op_arguments
        _op_arguments=(
          "variant_id=:[PATH] The id of the variant to delete"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetCategories)
        local -a _op_arguments
        _op_arguments=(
                    "report_id=:[QUERY] Report ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetChartSettings)
        local -a _op_arguments
        _op_arguments=(
                    "chart_id=:[QUERY] Unique Chart ID."
"report_id=:[QUERY] Unique Report ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetChartSettingsv2)
        local -a _op_arguments
        _op_arguments=(
                    "chart_id=:[QUERY] Unique Chart ID."
"report_id=:[QUERY] Unique Report ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetChartTemplatesv2)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetFieldsByCategories)
        local -a _op_arguments
        _op_arguments=(
                    "category_ids=:[QUERY] Category IDs."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetFieldsByCategory)
        local -a _op_arguments
        _op_arguments=(
                    "category_id=:[QUERY] Category ID."
"report_id=:[QUERY] Report ID."
"table_name=:[QUERY] optional table name parameter."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetJoins)
        local -a _op_arguments
        _op_arguments=(
                    "category_id=:[QUERY] Category ID (Optional)."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetQueryByReportDefinition)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetQueryByReportID)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReportDefinition)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] Unique Report ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReportGroups)
        local -a _op_arguments
        _op_arguments=(
                    "groups=:[QUERY] List of group IDs that should be checked for usage in each report."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReportSynopsis)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] Unique Report ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReportTimestampHeader)
        local -a _op_arguments
        _op_arguments=(
                    "category_id=:[QUERY] Category ID parameter."
"table_names=:[QUERY] List of all header tables."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReports)
        local -a _op_arguments
        _op_arguments=(
                    "category_id=:[QUERY] Optional Category ID parameter."
"table_name=:[QUERY] Optional table name parameter."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReportsForJoin)
        local -a _op_arguments
        _op_arguments=(
          "join_id=:[PATH] "
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetReportsTags)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetVariant)
        local -a _op_arguments
        _op_arguments=(
          "variant_id=:[PATH] The variant id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceGetVariants)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServicePartialChartUpdate)
        local -a _op_arguments
        _op_arguments=(
          "chart_id=:[PATH] Unique chart ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServicePartialReportUpdate)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] Unique Report ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceRunVariantOperation)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceTranspose)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceUpdateChart)
        local -a _op_arguments
        _op_arguments=(
          "chart_id=:[PATH] Unique chart ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceUpdateChartv2)
        local -a _op_arguments
        _op_arguments=(
          "chart_id=:[PATH] Unique chart ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceUpdateJoin)
        local -a _op_arguments
        _op_arguments=(
          "join_id=:[PATH] Unique join ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceUpdateReport)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] Unique Report ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      reportsServiceUpdateVariantOverride)
        local -a _op_arguments
        _op_arguments=(
          "variant_id=:[PATH] The variant id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceCreateController)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceCreateHeartBeat)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to invoke a heartbeat on."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceCreateHeartBeatEx)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] Optional: controller id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceCreateJob)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceCreateJobExecution)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceCreateKeypair)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get app tests for."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceDeleteController)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get the status."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceDeleteEdgeTenant)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] ID of the tenant to delete"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceDeleteEdgeTenantRequest)
        local -a _op_arguments
        _op_arguments=(
                    "tenant_id=:[QUERY] Tenant ID for the redge request."
"edge_id=:[QUERY] ID of the edge system."
"edge_name=:[QUERY] Edge gateway ID."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceDeleteJob)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] ID of the job that needs to be deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceDownloadControllerLogs)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to download logs for."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetControllerApps)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get apps for."
          "modified_since=:[QUERY] Only get the apps if any were modified since the given date."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetControllerCommands)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get commands for."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetControllerJobs)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get jobs for."
          "modified_since=:[QUERY] Optional: Only get the jobs if any were modified since the given date."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetControllerStatus)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get the status."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetControllers)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] The ID of the tenant to get controllers for."
          "want_local=true:[QUERY] Used to indicate the caller wants the local controller."
          "want_local=false:[QUERY] Used to indicate the caller wants the local controller."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetControllersWithStatus)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] The ID of the tenant to get controllers for."
          "want_local=true:[QUERY] Used to indicate the caller wants the local controller."
          "want_local=false:[QUERY] Used to indicate the caller wants the local controller."
"controller_id=:[QUERY] \&quot;ALL\&quot;: for getting all controllers; &lt;controller_id&gt;: for getting single controller."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetJob)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the job to get."
          "want_secret_values=true:[QUERY] Optional: True to return secret values, false otherwise."
          "want_secret_values=false:[QUERY] Optional: True to return secret values, false otherwise."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetJobExecution)
        local -a _op_arguments
        _op_arguments=(
          "jobexe_id=:[PATH] The ID of the job execution to get."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetJobExecutions)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the job to get status."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetJobStatus)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the job to get status."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetTenantApp)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] The ID of the tenant to get apps for."
"app_name=:[PATH] The name of the app to get."
          "return_level=:[QUERY] Optional: specify a return level for the data. This will control the amount of data returned."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetTenantApps)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] The ID of the tenant to get apps for."
          "return_level=:[QUERY] Optional: specify a return level for the data. This will control the amount of data returned."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetTenantJobs)
        local -a _op_arguments
        _op_arguments=(
          "tenant_id=:[PATH] The ID of the tenant to get jobs for."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceGetVersion)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceInstallEdgeTenantRequest)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceQueryControllerLogs)
        local -a _op_arguments
        _op_arguments=(
          "controller_id=:[PATH] The ID of the controller to get logs for."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateCommand)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the command."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateController)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] Optional: The internal ID of the controller."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateControllerStatus)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The internal ID of the controller."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateEdgeTenantRequest)
        local -a _op_arguments
        _op_arguments=(
          "edge_id=:[PATH] ID of the edge system"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateJob)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the job."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateJobExecution)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] The ID of the job execution to update."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      resourceControllerK8ServiceUpdateJobStatus)
        local -a _op_arguments
        _op_arguments=(
          "job_id=:[PATH] The ID of the job to get status."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerEnableDisableRiskEventFeedback)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerEnableDisableRiskEventProcess)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetAllClassificationsList)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskEventClassificationsList)
        local -a _op_arguments
        _op_arguments=(
          "risk_id=:[PATH] Risk id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskEventDataForSummarization)
        local -a _op_arguments
        _op_arguments=(
          "risk_id=:[PATH] Risk ID"
          "include_indicators=true:[QUERY] Indicates whether to include indicators in the response or not."
          "include_indicators=false:[QUERY] Indicates whether to include indicators in the response or not."
"num_findings_limit=:[QUERY] Max number of hours to get for the risk."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskEventDetails)
        local -a _op_arguments
        _op_arguments=(
          "risk_id=:[PATH] Risk id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskEventProcessStatus)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskEventRow)
        local -a _op_arguments
        _op_arguments=(
                    "status=:[QUERY] Status to retrieve only the status events, blank to retrieve all."
"date_from=:[QUERY] The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ."
"date_to=:[QUERY] The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ."
"pivot.type=:[QUERY] Pivot type - enum."
"pivot.id=:[QUERY] Pivot id -  all pivot fields separated by semicolon."
"pivot.db_user=:[QUERY] Optional db_user - if pivot is db user."
"pivot.database=:[QUERY] Optional database - if pivot is db user / database."
"pivot.server_ip=:[QUERY] Optional server_ip - if pivot is db user / database."
"pivot.os_user=:[QUERY] Optional os_user - if pivot is os user."
"pivot.database_source_field=:[QUERY] Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails)
        local -a _op_arguments
        _op_arguments=(
          "risk_id=:[PATH] Risk ID"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskFeedback)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetRiskObservationDetails)
        local -a _op_arguments
        _op_arguments=(
                    "lead_feature_id=:[QUERY] Lead feature id."
"observation_type=:[QUERY] Observation type."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerGetUserUISettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerRiskEventTuning)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerSetRiskEventStatus)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerSetUserUISettings)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsControllerUpdateRiskFeedback)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsDataProcessorGetRiskContext)
        local -a _op_arguments
        _op_arguments=(
          "risk_id=:[PATH] Risk id."
          "timezone=:[QUERY] Timezone in IANA format."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsDataProcessorGetRiskPredefinedQuestions)
        local -a _op_arguments
        _op_arguments=(
          "risk_id=:[PATH] Risk id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsEngineGetLeadGeneratorConfig)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsEngineUpdateLeadGeneratorConfig)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      riskAnalyticsMlClassificationResetModelToDefaults)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceCreateScheduledJob)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceDeleteScheduledJob)
        local -a _op_arguments
        _op_arguments=(
          "schedule_id=:[PATH] Unique ID, required for delete."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceGetDependencies)
        local -a _op_arguments
        _op_arguments=(
                    "config_type=:[QUERY] specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceGetDistributionRules)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceGetScheduledJobDetails)
        local -a _op_arguments
        _op_arguments=(
          "schedule_id=:[PATH] Used to return a single scheduledjob."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceGetScheduledJobs)
        local -a _op_arguments
        _op_arguments=(
                    "Offset=:[QUERY] Optional: the amount to offset the rows by for pagination."
"Limit=:[QUERY] Optional: the max amount of rows to return for pagination."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceGetSchedulesByReport)
        local -a _op_arguments
        _op_arguments=(
          "report_id=:[PATH] Report ID for the scheduled report."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceGetTags)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceSearchScheduledJobs)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceSearchScheduledTaskRuns)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      schedulerServiceUpdateScheduledJob)
        local -a _op_arguments
        _op_arguments=(
          "schedule_id=:[PATH] Unique ID, required for update."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      snifAssistServiceGetSnifConfig)
        local -a _op_arguments
        _op_arguments=(
                    "tenant_id=:[QUERY] Provide tenant_id."
"edge_id=:[QUERY] Provide edge_id."
"config_type=:[QUERY] Provide configuration type."
"config_id=:[QUERY] Specify config_id provided by configuration service."
"configuration_parameters_crc=:[QUERY] Provide CRC value of configuration parameters that sniffer is currently using."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      snifAssistServiceGetSnifPolicy)
        local -a _op_arguments
        _op_arguments=(
                    "tenant_id=:[QUERY] Specify tenant_id."
"edge_id=:[QUERY] Specify edge_id if known."
"policy_crc=:[QUERY] Provide CRC value of installed policy that sniffer is currently using."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      snifAssistServicePostSnifFeedback)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      snifAssistServiceTestRegex)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      streamsServiceCheckAWSCredentials)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      streamsServiceCheckAzureEventHub)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      streamsServiceCheckAzureStorageString)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      streamsServiceGetAWSRegions)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      streamsServiceListAWSStreams)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceCreateIntegration)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceCreateTemplate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceDeleteIntegration)
        local -a _op_arguments
        _op_arguments=(
          "integration_id=:[PATH] Delete the templates associated with the specified integration ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceDeleteTemplate)
        local -a _op_arguments
        _op_arguments=(
          "template_id=:[PATH] Delete the template with the specified unique ID."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceGetOriginDefaultContent)
        local -a _op_arguments
        _op_arguments=(
          "origin=:[PATH] Origin for the desired content."
          "integration=:[QUERY] Integration provides the context for the Request."
"mime_type=:[QUERY] MIME type for the desired content."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceGetOriginFields)
        local -a _op_arguments
        _op_arguments=(
          "origin=:[PATH] Origin for the desired fields."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceGetTemplate)
        local -a _op_arguments
        _op_arguments=(
          "template_id=:[PATH] The unique ID for the template to fetch."
          "include_integration_name=true:[QUERY] Include the Integration name in the returned template."
          "include_integration_name=false:[QUERY] Include the Integration name in the returned template."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceGetTemplates)
        local -a _op_arguments
        _op_arguments=(
                    "integration_id=:[QUERY] Filter on templates associated with a specific integration."
"filter_integration=:[QUERY] Filter on a set of integrations; ignored if empty."
"filter_origin=:[QUERY] Filter on a specific set of data origins; ignored if empty."
"filter_mime_type=:[QUERY] Filter on specific mime types; ignored if empty."
"filter_tags=:[QUERY] Filter on specific tags; ignored if empty."
"filter_enabled_only=true:[QUERY] Filter on all templates instead of just the enabled templates."
          "filter_enabled_only=false:[QUERY] Filter on all templates instead of just the enabled templates."
"include_integration_name=true:[QUERY] Include the Integration name in the returned templates."
          "include_integration_name=false:[QUERY] Include the Integration name in the returned templates."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceGetTemplatesForEdge)
        local -a _op_arguments
        _op_arguments=(
                    "integration_id=:[QUERY] Templates associated with a specific integration."
"filter_origin=:[QUERY] Filter on a specific set of data origins; ignored if empty."
"filter_enabled_only=true:[QUERY] Filter on all templates instead of just the enabled templates."
          "filter_enabled_only=false:[QUERY] Filter on all templates instead of just the enabled templates."
"include_integration_name=true:[QUERY] Include the Integration name in the returned templates."
          "include_integration_name=false:[QUERY] Include the Integration name in the returned templates."
"transform_to_gdp_format=true:[QUERY] Tranform template format to GDP style format."
          "transform_to_gdp_format=false:[QUERY] Tranform template format to GDP style format."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceTestTemplate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceTransformTemplate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceTransformTemplateJSON)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      templatesServiceUpdateTemplate)
        local -a _op_arguments
        _op_arguments=(
          "template_id=:[PATH] The template id to update."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserCreateAPIKey)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserDeleteAPIKey)
        local -a _op_arguments
        _op_arguments=(
          "id=:[PATH] Apikey id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserDeleteRole)
        local -a _op_arguments
        _op_arguments=(
          "role_id=:[PATH] ID or role deleted."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetAPIKeys)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetCurrentUser)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetPrivilege)
        local -a _op_arguments
        _op_arguments=(
          "privilege.privilege_id=:[PATH] Privilege ID."
          "privilege.type=:[QUERY] Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetPrivileges)
        local -a _op_arguments
        _op_arguments=(
                    "roles=:[QUERY] If empty, will return all privileges."
"type=:[QUERY] Type of privilege to return: group, page, permission, report, restapi, etc."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetRole)
        local -a _op_arguments
        _op_arguments=(
          "role_id=:[PATH] ID of role to be returned."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetRoles)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetUser)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] User id defaults to the current user or specify \&quot;current\&quot; or an actual user id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetUserNames)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserGetUserTenant)
        local -a _op_arguments
        _op_arguments=(
          "user_id=:[PATH] User id defaults to the current user or specify \&quot;current\&quot; or an actual user id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserPostPrivilegesBulk)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserPostRole)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserUpdatePrivilege)
        local -a _op_arguments
        _op_arguments=(
          "privilege_id=:[PATH] Permanent id of the privilege to be updated or created."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserUpdatePrivilegesRoleBulk)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserUpdateRole)
        local -a _op_arguments
        _op_arguments=(
          "role_id=:[PATH] Permanent id of the role."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      tenantuserUpdateUserRoleBulk)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getLinkedVendor)
        local -a _op_arguments
        _op_arguments=(
          "vendorId=:[PATH] The third party vendor&#39;s account ID"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      getSingleLinkedVendor)
        local -a _op_arguments
        _op_arguments=(
          "vendorId=:[PATH] vendor id"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listLinkedVendorDataStores)
        local -a _op_arguments
        _op_arguments=(
          "vendorId=:[PATH] The third party vendor&#39;s account ID"
          "filter=:[QUERY] "
"sort=:[QUERY] "
"pageSize=:[QUERY] "
"nextToken=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listLinkedVendors)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      listTrustedAssets)
        local -a _op_arguments
        _op_arguments=(
                    "filter=:[QUERY] "
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      universalConnectorManagerGetCertificate)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      universalConnectorManagerGetConnectors)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      universalConnectorManagerGetUCSetup)
        local -a _op_arguments
        _op_arguments=(
          "plugin_id=:[PATH] UC plugin id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      universalConnectorManagerListConnectionsSummary)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      universalConnectorManagerPluginsList)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      universalConnectorManagerUploadPlugin)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowCreateCase)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowCreateProductEntity)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowCreateTask)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Create tasks with common parent."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowCreateWorkflowEvent)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowDeleteProductEntity)
        local -a _op_arguments
        _op_arguments=(
          "entity_id=:[PATH] Unique id for the product entity"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetCases)
        local -a _op_arguments
        _op_arguments=(
                    "case_id=:[QUERY] Optional case_id to get a response of an array of one member."
"sort_by=:[QUERY] Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;)."
"offset=:[QUERY] Optional starting point for the page of data."
"limit=:[QUERY] Optional page size."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetCasesCount)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetFilename)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Can be \&quot;*\&quot; if JWT token contains the case_id."
"task_id=:[PATH] Can be \&quot;*\&quot; if JWT token contains the task_id."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetJobsCount)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Case ID - can be * for all"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetProductEntities)
        local -a _op_arguments
        _op_arguments=(
                    "offset=:[QUERY] Optional starting point for the page of data."
"limit=:[QUERY] Optional page size."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetProductEntity)
        local -a _op_arguments
        _op_arguments=(
          "entity_id=:[PATH] Unique id for the product entity"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetReportResult)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] ID to get the case  (read-only)."
"task_id=:[PATH] ID to get the task for case(read-only)."
          "offset=:[QUERY] Optional starting point for the page of data."
"limit=:[QUERY] Optional page size."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetTasks)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Mandaroty: The parent case which contains the tasks."
          "task_id=:[QUERY] Optional: task_id to return an array of one."
          )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowGetTasksCount)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Case ID - can be * for all"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowSearchCases)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowSearchReports)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowSearchTasks)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Case ID - can be * for all"
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowUpdateCases)
        local -a _op_arguments
        _op_arguments=(
                              )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowUpdateProductEntity)
        local -a _op_arguments
        _op_arguments=(
          "entity_id=:[PATH] Unique Entity id, required for update."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
      workflowUpdateTasks)
        local -a _op_arguments
        _op_arguments=(
          "case_id=:[PATH] Update tasks belonging to common parent."
                    )
        _describe -t actions 'operations' _op_arguments -S '' && ret=0
        ;;
    esac
    ;;

esac

return ret
