/*
*Copyright (c) 2005-2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*WSO2 Inc. licenses this file to you under the Apache License,
*Version 2.0 (the "License"); you may not use this file except
*in compliance with the License.
*You may obtain a copy of the License at
*
*http://www.apache.org/licenses/LICENSE-2.0
*
*Unless required by applicable law or agreed to in writing,
*software distributed under the License is distributed on an
*"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*KIND, either express or implied.  See the License for the
*specific language governing permissions and limitations
*under the License.
*/

package org.wso2.carbon.identity.oauth.common;

public final class OAuthConstants {

    public static class OAuthVersions {
        public static final String VERSION_1A = "OAuth-1.0a";
        public static final String VERSION_2 = "OAuth-2.0";
    }

	// OAuth1.0a request parameters
    public static class OAuth10AParams {
        public static final String OAUTH_VERSION = "oauth_version";
        public static final String OAUTH_NONCE = "oauth_nonce";
        public static final String OAUTH_TIMESTAMP = "oauth_timestamp";
        public static final String OAUTH_CONSUMER_KEY = "oauth_consumer_key";
        public static final String OAUTH_CALLBACK = "oauth_callback";
        public static final String OAUTH_SIGNATURE_METHOD = "oauth_signature_method";
        public static final String OAUTH_SIGNATURE = "oauth_signature";
        public static final String SCOPE = "scope";
        public static final String OAUTH_DISPLAY_NAME = "xoauth_displayname";
    }

    // OAuth2.0 request parameters
    public static class OAuth20Params {
        public static final String SCOPE = "scope";
    }

    //OAuth2 request headers.
    public static final String HTTP_REQ_HEADER_AUTHZ = "Authorization";

    // OAuth2 response headers
    public static final String HTTP_RESP_HEADER_CACHE_CONTROL = "Cache-Control";
    public static final String HTTP_RESP_HEADER_PRAGMA = "Pragma";
    public static final String HTTP_RESP_HEADER_AUTHENTICATE = "WWW-Authenticate";

    // OAuth2 response header values
    public static final String HTTP_RESP_HEADER_VAL_CACHE_CONTROL_NO_STORE = "no-store";
    public static final String HTTP_RESP_HEADER_VAL_PRAGMA_NO_CACHE = "no-cache";

    // OAuth response parameters
	public static final String OAUTH_TOKEN = "oauth_token";
	public static final String OAUTH_TOKEN_SECRET = "oauth_token_secret";
	public static final String OAUTH_CALLBACK_CONFIRMED = "oauth_callback_confirmed";
	public static final String OAUTH_VERIFIER = "oauth_verifier";

    public static final String OAUTHORIZED_USER = "oauthorized_user";
    public static final String APPLICATION_NAME = "application_name";
    public final static String OAUTH_USER_CONSUMER_KEY = "consumer_key";
    public final static String OAUTH_APP_CALLBACK = "callback_url";
    public final static String OAUTH_APP_CONSUMER_KEY = "consumer_key";
    public final static String OAUTH_APP_CONSUMER_SECRET = "consumer_secret";
    public final static String OAUTH_APP_NAME = "oauth_app_name";
    public final static String OAUTH_USER_NAME = "oauth_user_name";
    public final static String OAUTH_ACCESS_TOKEN_ISSUED = "oauth_access_token_issued";

    // OAuth1.0a endpoints
    public static class OAuth10AEndpoints {
        public static final String ACCESS_TOKEN_URL = "/access-token";
        public static final String REQUEST_TOKEN_URL = "/request-token";
        public static final String AUTHORIZE_TOKEN_URL = "/authorize-token";
    }
    // OAuth2.0 endpoints
    public static class OAuth20Endpoints {
        public static final String OAUTH20_ACCESS_TOKEN_URL = "/token";
        public static final String OAUTH20_AUTHORIZE_TOKEN_URL = "/authorize";
    }

    // Constants to be used by error pages
    public static final String OAUTH_ERROR_CODE = "oauthErrorCode";
    public static final String OAUTH_ERROR_MESSAGE = "oauthErrorMsg";

    // Constants for paging in OAuth UI
    public static final int DEFAULT_ITEMS_PER_PAGE = 10;
    public static final String OAUTH_ADMIN_CLIENT = "OAuthAdminClient";
    public static final String OAUTH_DATA_PAGE_COUNT = "OAuthDataPageCount";

    // Token types
    public static final String USER_TYPE_FOR_USER_TOKEN = "APPLICATION_USER";
    public static final String USER_TYPE_FOR_APPLICATION_TOKEN = "APPLICATION";

    public static final String OIDC_LOGGED_IN_USER = "loggedInUser";

    public static class Consent {
        public static final String DENY = "deny";
        public static final String APPROVE = "approve";
        public static final String APPROVE_ALWAYS = "approveAlways";
    }

    // Constants that are used with the authentication framework
    public static final String SESSION_DATA_KEY = "sessionDataKey";
    public static final String SESSION_DATA_KEY_CONSENT = "sessionDataKeyConsent";

    public static final String OAUTH_CACHE_MANAGER = "OAuthCacheManager";

    // For storing SAML2 assertion in OAuthTokenReqMgtCtx
    public static final String OAUTH_SAML2_ASSERTION = "SAML2Assertion";

    public static final long UNASSIGNED_VALIDITY_PERIOD = -1l;

    // SAML2 Bearer Assertion Profile constants
    public static String OAUTH_SAML2_BEARER_METHOD = "urn:oasis:names:tc:SAML:2.0:cm:bearer";
    public static String OAUTH_SAML2_BEARER_GRANT_ENUM = "SAML20_BEARER";

    public static class TokenStates {
        public final static String TOKEN_STATE_ACTIVE = "ACTIVE";
        public final static String TOKEN_STATE_REVOKED = "REVOKED";
        public final static String TOKEN_STATE_EXPIRED = "EXPIRED";
    }

    public static final String ACCESS_TOKEN_STORE_TABLE = "IDN_OAUTH2_ACCESS_TOKEN";

    public static class OAuthError {
        public static class TokenResponse {
            public static final String UNSUPPORTED_CLIENT_AUTHENTICATION_METHOD = "unsupported_client_authentication_method";
        }
    }

    public static final int OAUTH_AUTHZ_CB_HANDLER_DEFAULT_PRIORITY = 1;
}
