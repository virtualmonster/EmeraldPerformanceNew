/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.compare.IStringComparison;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.AssignVariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.CustomCodeAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.IHTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.http.vp.impl.HTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.If;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.TestFlowControlAction;
import com.ibm.rational.test.lt.kernel.custom.ICustomCode2;
import com.ibm.rational.test.lt.kernel.dc.IKDCCoreVar;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeExceptionEvent;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeVPFailureEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SuppressWarnings("all")
public class B2C_SearchBySearchterm_Test_A1ED3DEA7EF8F580E2DCB63931343539 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(8);
	private DataVar[] vars = new DataVar[41];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public B2C_SearchBySearchterm_Test_A1ED3DEA7EF8F580E2DCB63931343539(IContainer container, String invocationId) {
		super(container, "B2C_SearchBySearchterm", invocationId, "A1ED3DEA7EF8F580E2DCB63931343539", "/OneTestAssets_B2C/Modules_B2C/B2C_SearchBySearchterm.testsuite", "C:/Users/stuart.walker/HCL/devopstest/EmeraldPerformanceTest/OneTestAssets_B2C/Modules_B2C/B2C_SearchBySearchterm.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.RETRY);

	}

    public void execute() {
    	try {
			

	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	              this.add(datapool_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(varAction_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(confCon_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(dataVarAssign_4(this)); /* GENERIC CREATE TEMPLATE */

      this.add(dataVarAssign_5(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_2(this)); /* GENERIC CREATE TEMPLATE */

      this.add(page_3(this)); /* GENERIC CREATE TEMPLATE */

      this.add(ltIf_2(this)); /* GENERIC CREATE TEMPLATE */

	this.add(new CustomCode_3(this, dcVars[7]));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: B2C_SearchBySearchterm_Test_A1ED3DEA7EF8F580E2DCB63931343539 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "searchterm_oob.csv", "A1ED44D0D9DFE9D0C0FAB63839656538", false);
		Datapool dp = new Datapool(
				 "/L09uZVRlc3RBc3NldHNfQjJDL0RhdGFzZXRzL3NlYXJjaHRlcm1fb29iLmNzdg==.csv",
				 "C:\\Users\\stuart.walker\\HCL\\devopstest\\EmeraldPerformanceTest\\OneTestAssets_B2C\\Datasets\\searchterm_oob.csv",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("Column1", dcVars[0], false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EAAFEA94C30BDEED2AB33234333138");	
			vars[0] = new DataVar("category_identifiers", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("category_ids", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[2] = new DataVar("category_names", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[3] = new DataVar("hostname", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[4] = new DataVar("store_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[5] = new DataVar("store_name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[6] = new DataVar("lang_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[7] = new DataVar("catalog_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[8] = new DataVar("port_num", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[9] = new DataVar("category_identifier", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[10] = new DataVar("category_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[11] = new DataVar("category_name", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[12] = new DataVar("personalizationID", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[13] = new DataVar("WCToken", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[14] = new DataVar("WCTrustedToken", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[15] = new DataVar("contract_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[16] = new DataVar("product_identifier", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[17] = new DataVar("product_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[18] = new DataVar("part_number", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[19] = new DataVar("current_category", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[20] = new DataVar("category_name_lower", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[21] = new DataVar("category_name_espot", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[22] = new DataVar("inventoryQuantity", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[23] = new DataVar("sku_id", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[24] = new DataVar("sku_identifier", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[25] = new DataVar("sku_partnumber", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[26] = new DataVar("orderId", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[27] = new DataVar("orderItemId", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[28] = new DataVar("enable_80_20", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[29] = new DataVar("total_products", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[30] = new DataVar("current_page", "1", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[31] = new DataVar("number_of_pages", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[32] = new DataVar("offset", "0", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[33] = new DataVar("searchterm", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[34] = new DataVar("partial_searchterm", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[35] = new DataVar("limit", "12", IDataArea.TEST, "IGNORE", false, false);

	
		vars[36] = new DataVar("facet", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[37] = new DataVar("first_orderItemId", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[38] = new DataVar("productIds", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[39] = new DataVar("SKUs", "-1", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[40] = new DataVar("pick_prod_result", "false", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[3].getValue()== null?"HOSTNAME": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[8].getValue()== null?"443": (String)vars[8].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"HOSTNAME",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EB8DB122EA99A0C248B36131356464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "LoginIdentity", "A1EB8DB122EA99A0C248B36131356464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EB8DBF9DA8D8FDC248B36131356464", true, true,
						"Config_1", "/wcs/resources/store/STOREID/guestidentity?langId=LANGID",	"/wcs/resources/store/STOREID/guestidentity?langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

      this.add(dataVarAssign_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(dataVarAssign_2(this)); /* GENERIC CREATE TEMPLATE */

      this.add(dataVarAssign_3(this)); /* GENERIC CREATE TEMPLATE */

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(true);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB8DBF9DA8D6D3C248B36131356464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:80.0) Gecko/20100101 Firefox/80.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/SKUIDENTIFIER", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "2", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[1], "\"personalizationID\":\"(.*?)\"", 1, 1, 0, 0, false, "Content: personalizationID", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[2], "\"WCToken\":\"(.*?)\"", 1, 1, 0, 0, false, "WCToken_29", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[3], "\"WCTrustedToken\":\"(.*?)\"", 1, 1, 0, 0, false, "WCTrustedToken_29", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_uri", 50, 6, true, (IDCCoreVar)vars[6], false, "langId_4", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("req_hdr_Referer_1", 27, 13, false, (IDCCoreVar)vars[24], false, "Referer_9", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[4], false, "store_3", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[5], false, "Referer_8", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[3], false, "Referer_7", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("req_hdr_Origin_1", 8, 8, false, (IDCCoreVar)vars[3], false, "Origin", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[3], false, "Host_4", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EB8DBF9DA8D809C248B36131356464",
			true,
			false
		);
		
		req.setExpectedResponseCode(201);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(201)), IHTTPStatusCodeVP.SMART_MATCH, new RPTContinueLoopEvent("Response code verification failed", "OUTERMOST"), 2));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("{}");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1EB8DBF9DA8D7A7C248B36131356464", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

private AssignVariableAction dataVarAssign_1(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EB8DB189B91CB0C248B36131356464");

	varAction.add(vars[12] , dcVars[1]);

	return varAction;
}

private AssignVariableAction dataVarAssign_2(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EB8DB194A8F280C248B36131356464");

	varAction.add(vars[13] , dcVars[2]);

	return varAction;
}

private AssignVariableAction dataVarAssign_3(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EB8DB19DB22E00C248B36131356464");

	varAction.add(vars[14] , dcVars[3]);

	return varAction;
}

private AssignVariableAction dataVarAssign_4(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EB8DBD3691C3F3C248B36131356464");

	varAction.add(vars[33] , dcVars[0]);

	return varAction;
}

private AssignVariableAction dataVarAssign_5(final IContainer parent) {
	AssignVariableAction varAction = new AssignVariableAction(parent, "A1EB8DBD3691C437C248B36131356464");

	varAction.add(vars[34] , "");

	return varAction;
}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EB8DBD36934A96C248B36131356464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "KeywordSuggestion", "A1EB8DBD36934A96C248B36131356464") {
			
			public void execute() {   
				
	
	
	
	
			             
					For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[7],(IKDCCoreVar)vars[33],(IKDCCoreVar)vars[6],(IKDCCoreVar)vars[34],(IKDCCoreVar)vars[4],(IKDCCoreVar)vars[3],(IKDCCoreVar)vars[5],(IKDCCoreVar)dcVars[4]));
		
			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(true);
		page.setArmEnabled(false);  
		return page;
	}
	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "LoopThroughKeywordSuggestions",
				 "A1EB8DBD36934AA0C248B36131356464",
				 -1,
				 0,
				 0,
				 0,
				 1,
				 true, 
				 false,
				 null) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(new CustomCode_1(this, dcVars[4]));
{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1EAAFEA96161ABAED2AB33234333138", false, true,
						"Config_1", "/search/resources/store/STOREID/sitecontent/keywordSuggestionsByTerm/PARTIALSEARCHTERM?catalogId=CATALOGID&limit=4&langId=LANGID",	"/search/resources/store/STOREID/sitecontent/keywordSuggestionsByTerm/PARTIALSEARCHTERM?catalogId=CATALOGID&limit=4&langId=LANGID", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

      this.add(ltIf_1(this)); /* GENERIC CREATE TEMPLATE */

			super.executeLoop();
		    }
		
		};
		return forLoop;
	}

	public class CustomCode_1 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_1(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.GetPartialSearchterm", "A1EB8DBD36934AA4C248B36131356464");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				vars[33],
vars[34]
			};
			
			ICustomCode2 ccclass = 	new customcode.GetPartialSearchterm();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB8DBD36934AAAC248B36131356464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.190 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_7 = new SubRule("req_uri", 122, 6, true, (IDCCoreVar)vars[6], false, "langId_48", null, 0, false);
	subContainer_2.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_uri", 97, 9, true, (IDCCoreVar)vars[7], false, "catalogId_27", null, 0, false);
	subContainer_2.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_uri", 69, 17, false, (IDCCoreVar)vars[34], false, "keywordSuggestionsByTerm", null, 0, false);
	subContainer_2.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_uri", 24, 7, true, (IDCCoreVar)vars[4], false, "store", null, 0, false);
	subContainer_2.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[5], false, "Referer_48", null, 0, false);
	subContainer_2.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[3], false, "Referer_47", null, 0, false);
	subContainer_2.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[3], false, "Host_182", null, 0, false);
	subContainer_2.addSubInstruction(sub_13);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EB8DBD36934B8AC248B36131356464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private If ltIf_1(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB8DBD36934BF2C248B36131356464");
		ifObj.setCondition(stringComparison_1(ifObj));
		ifObj.setThen(ltContainer_1(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_1(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_1", "A1EB8DBD36934BF6C248B36131356464");
		cond.setOperands(dcVars[4], "stop");
		cond.setNegative(false);
		cond.setCaseSensitive(true);		
		cond.setIsInt(false);	
		return cond;
	}

	private Container ltContainer_1(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB8DBD36934C0CC248B36131356464") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB8DBD36934C10C248B36131356464",
     		new RPTEventStructure(null, new RPTBreakLoopEvent("", "INNERMOST"), 2, "")));

                super.execute();
            }
       
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }		
		};		
		return container;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EB8DBD36AD3B3FC248B36131356464");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "SearchBySearchterm", "A1EB8DBD36AD3B3FC248B36131356464") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_3(this, true, "A1EAAFEA96161ABAED2AB33234333138", false, true,
						"Config_1", "/wcs/resources/store/STOREID/searchdisplay/bySearchTerm?searchTerm=SERACHTERM&langId=LANGID",	"/wcs/resources/store/STOREID/searchdisplay/bySearchTerm?searchTerm=SERACHTERM&langId=LANGID", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1EAAFEA96161ABAED2AB33234333138", true, false,
						"Config_1", "/search/resources/api/v2/products?contractId=CONTRACTID&currency=USD&limit=12&offset=0&searchTerm=SEARCHTERM&storeId=STOREID&langId=LANGID",	"/search/resources/api/v2/products?contractId=CONTRACTID&currency=USD&limit=12&offset=0&searchTerm=SEARCHTERM&storeId=STOREID&langId=LANGID", true, false), 77, 100, "A1EB813A0C7E45CCFD7FE53364633238", 3);
			} // Parallal Block End 

	this.add(new CustomCode_2(this, dcVars[6]));
			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(true);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB8DBD36AD3B49C248B36131356464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.190 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_14 = new SubRule("req_uri", 85, 6, true, (IDCCoreVar)vars[6], false, "langId_49", null, 0, false);
	subContainer_3.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_uri", 67, 10, true, (IDCCoreVar)vars[33], false, "searchTerm_11", null, 0, false);
	subContainer_3.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_uri", 21, 7, true, (IDCCoreVar)vars[4], false, "store_2", null, 0, false);
	subContainer_3.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[5], false, "Referer_53", null, 0, false);
	subContainer_3.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[3], false, "Referer_52", null, 0, false);
	subContainer_3.addSubInstruction(sub_18);
		ISubRule sub_19 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[3], false, "Host_184", null, 0, false);
	subContainer_3.addSubInstruction(sub_19);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EB8DBD36AD3C47C248B36131356464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EB8DBD36AD3CAFC248B36131356464", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Host", "HOSTNAME", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.190 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json; charset=utf-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://HOSTNAME/STORENAME/search?searchTerm=SEARCHTERM", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[5], ".*", 1, 0, 0, 0, false, "Content:SearchResults", null, 0, false);
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_20 = new SubRule("req_uri", 132, 6, true, (IDCCoreVar)vars[6], false, "langId_50", null, 0, false);
	subContainer_4.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_uri", 117, 7, true, (IDCCoreVar)vars[4], false, "storeId_25", null, 0, false);
	subContainer_4.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_uri", 98, 10, true, (IDCCoreVar)vars[33], false, "searchTerm_12", null, 0, false);
	subContainer_4.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_uri", 45, 10, true, (IDCCoreVar)vars[15], false, "contractId_17", null, 0, false);
	subContainer_4.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Referer_1", 45, 10, false, (IDCCoreVar)vars[33], false, "Referer_51", null, 0, false);
	subContainer_4.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 17, 9, false, (IDCCoreVar)vars[5], false, "Referer_50", null, 0, false);
	subContainer_4.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_hdr_Referer_1", 8, 8, false, (IDCCoreVar)vars[3], false, "Referer_49", null, 0, false);
	subContainer_4.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 8, false, (IDCCoreVar)vars[3], false, "Host_183", null, 0, false);
	subContainer_4.addSubInstruction(sub_27);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EB8DBD36AD3E03C248B36131356464",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public class CustomCode_2 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_2(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.CheckProductsReturnedFromSearchterm", "A1EB8DBD36AD3E6BC248B36131356464");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[5]
			};
			
			ICustomCode2 ccclass = 	new customcode.CheckProductsReturnedFromSearchterm();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private If ltIf_2(IContainer parent) {
		If ifObj = new If(parent, "If", "A1EB8DBD36B4DC6BC248B36131356464");
		ifObj.setCondition(stringComparison_2(ifObj));
		ifObj.setThen(ltContainer_2(ifObj));
		ifObj.setElse(null);
		return ifObj;
	}


	private  IStringComparison stringComparison_2(IContainer parent) {
		IStringComparison cond = new com.ibm.rational.test.lt.compare.StringEquals(parent, "stringComparison_2", "A1EB8DBD36B4DC6FC248B36131356464");
		cond.setOperands(dcVars[6], "true");
		cond.setNegative(true);
		cond.setCaseSensitive(true);		
		cond.setIsInt(false);	
		return cond;
	}

	private Container ltContainer_2(final IContainer parent) {
		Container container = new Container(parent, "Then Block", "A1EB8DBD36B4DC85C248B36131356464") {

            public void execute() {                
                     	this.add(new TestFlowControlAction(this, "A1EB8DBD36B4DC89C248B36131356464",
     		new RPTEventStructure(null, new RPTContinueLoopEvent("", "INNERMOST"), 2, "")));

                super.execute();
            }
       
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }		
		};		
		return container;
	}

	public class CustomCode_3 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_3(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "customcode.PickProduct", "A1ED3E78897383C0D765B56463386264");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[5],
vars[28]
			};
			
			ICustomCode2 ccclass = 	new customcode.PickProduct();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}



}
