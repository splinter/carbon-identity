<!--
 ~ Copyright (c) 2005-2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 ~
 ~ WSO2 Inc. licenses this file to you under the Apache License,
 ~ Version 2.0 (the "License"); you may not use this file except
 ~ in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~    http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing,
 ~ software distributed under the License is distributed on an
 ~ "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 ~ KIND, either express or implied.  See the License for the
 ~ specific language governing permissions and limitations
 ~ under the License.
 -->

<%@ page import="org.apache.axis2.context.ConfigurationContext"%>
<%@ page import="org.wso2.carbon.CarbonConstants"%>
<%@ page import="org.wso2.carbon.identity.oauth.stub.dto.OAuthConsumerAppDTO"%>
<%@ page import="org.wso2.carbon.identity.oauth.common.OAuthConstants"%>
<%@ page import="org.wso2.carbon.identity.oauth.ui.client.OAuthAdminClient"%>
<%@ page import="org.wso2.carbon.ui.CarbonUIMessage"%>
<%@ page import="org.wso2.carbon.ui.CarbonUIUtil"%>
<%@ page import="org.wso2.carbon.ui.util.CharacterEncoder"%>
<%@ page import="org.wso2.carbon.utils.ServerConstants"%>
<%@ page import="org.wso2.carbon.identity.application.mgt.ui.ApplicationConfigBean"%>
<%@ page import="org.wso2.carbon.identity.application.mgt.ui.OAuthOIDCAppConfig"%>

<%@ page import="java.util.ResourceBundle" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://wso2.org/projects/carbon/taglibs/carbontags.jar" prefix="carbon"%>

<jsp:useBean id="appBean" class="org.wso2.carbon.identity.application.mgt.ui.ApplicationConfigBean" scope="session"/>

<script type="text/javascript" src="extensions/js/vui.js"></script>
<script type="text/javascript" src="../extensions/core/js/vui.js"></script>
<script type="text/javascript" src="../admin/js/main.js"></script>

<jsp:include page="../dialog/display_messages.jsp" />

<%
	String applicationName = CharacterEncoder.getSafeText(request.getParameter("application"));
    String callback = CharacterEncoder.getSafeText(request.getParameter("callback"));
    String oauthVersion = CharacterEncoder.getSafeText(request.getParameter("oauthVersion"));
    //-- start setting grants
    String grantCode = CharacterEncoder.getSafeText(request.getParameter("grant_code"));
    String grantImplicit = CharacterEncoder.getSafeText(request.getParameter("grant_implicit"));
    String grantPassword = CharacterEncoder.getSafeText(request.getParameter("grant_password"));
    String grantClient = CharacterEncoder.getSafeText(request.getParameter("grant_client"));
    String grantRefresh = CharacterEncoder.getSafeText(request.getParameter("grant_refresh"));
    String grantSAML = CharacterEncoder.getSafeText(request.getParameter("grant_saml"));
    String grants = null;
   	StringBuffer buff = new StringBuffer();
	if (grantCode != null) {
		buff.append(grantCode + " ");
	}
    if (grantImplicit != null) {
        buff.append(grantImplicit + " ");
    }
	if (grantPassword != null) {
		buff.append(grantPassword + " ");
	}
	if (grantClient != null) {
		buff.append(grantClient + " ");
	}
	if (grantRefresh != null) {
		buff.append(grantRefresh + " ");
	}
	if (grantSAML != null) {
		buff.append(grantSAML);
	}
	grants = buff.toString();
	// -- end setting grants
	String forwardTo = "index.jsp";
	String BUNDLE = "org.wso2.carbon.identity.oauth.ui.i18n.Resources";
	ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale());
	OAuthConsumerAppDTO app = new OAuthConsumerAppDTO();

	try {

		String cookie = (String) session.getAttribute(ServerConstants.ADMIN_SERVICE_COOKIE);
		String backendServerURL = CarbonUIUtil.getServerURL(config.getServletContext(), session);
		ConfigurationContext configContext =
		                                     (ConfigurationContext) config.getServletContext()
		                                                                  .getAttribute(CarbonConstants.CONFIGURATION_CONTEXT);
		OAuthAdminClient client = new OAuthAdminClient(cookie, backendServerURL, configContext);
		app.setApplicationName(applicationName);
		app.setCallbackUrl(callback);
		app.setOAuthVersion(oauthVersion);
        if(OAuthConstants.OAuthVersions.VERSION_2.equals(oauthVersion)){
            app.setGrantTypes(grants);
        }
		client.registerOAuthApplicationData(app);
		
		// set app bean
		OAuthConsumerAppDTO dto = client.getOAuthApplicationDataByName(app.getApplicationName());
		if(dto != null) {
			OAuthOIDCAppConfig oauthConfig = new OAuthOIDCAppConfig();
			oauthConfig.setClientID(dto.getOauthConsumerKey());
			oauthConfig.setClientSecret(dto.getOauthConsumerSecret());
			oauthConfig.setCallbackUrl(dto.getCallbackUrl());
			appBean.setOauthoidcConfig(oauthConfig);
		}
		
		String message = resourceBundle.getString("app.added.successfully");
		CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.INFO, request);

	} catch (Exception e) {
		String message = resourceBundle.getString("error.while.adding.app") + " : " + e.getMessage();
		CarbonUIMessage.sendCarbonUIMessage(message, CarbonUIMessage.ERROR, request, e);
	}
%>

<script type="text/javascript">
    function forward() {
        location.href = "../application/add-service-provider.jsp";
    }
</script>

<script type="text/javascript">
    forward();
</script>