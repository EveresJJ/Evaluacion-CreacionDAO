/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.95
 * Generated at: 2024-10-18 01:57:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.naviox;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.openxava.naviox.util.NaviOXPreferences;
import org.openxava.web.servlets.Servlets;
import org.openxava.util.Locales;
import org.openxava.util.XavaPreferences;
import org.openxava.web.style.XavaStyle;
import org.openxava.web.style.Themes;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


private static Log log = LogFactory.getLog("index.jsp"); 

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/Users/javie/Downloads/openxava-studio-7-r3-windows/openxava-studio-7-r3/workspace/facturacion/target/facturacion/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("/xava/imports.jsp", Long.valueOf(1728087410000L));
    _jspx_dependants.put("jar:file:/C:/Users/javie/Downloads/openxava-studio-7-r3-windows/openxava-studio-7-r3/workspace/facturacion/target/facturacion/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1729038465444L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1728087410000L));
    _jspx_dependants.put("/naviox/indexExt.jsp", Long.valueOf(1728087410000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(11);
    _jspx_imports_classes.add("com.openxava.naviox.util.NaviOXPreferences");
    _jspx_imports_classes.add("org.openxava.util.XavaPreferences");
    _jspx_imports_classes.add("org.openxava.web.style.XavaStyle");
    _jspx_imports_classes.add("org.openxava.web.style.Themes");
    _jspx_imports_classes.add("org.apache.commons.logging.Log");
    _jspx_imports_classes.add("org.apache.commons.logging.LogFactory");
    _jspx_imports_classes.add("org.openxava.web.servlets.Servlets");
    _jspx_imports_classes.add("org.openxava.util.Locales");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

Servlets.setCharacterEncoding(request, response);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      org.openxava.controller.ModuleContext context = null;
      synchronized (session) {
        context = (org.openxava.controller.ModuleContext) _jspx_page_context.getAttribute("context", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (context == null){
          context = new org.openxava.controller.ModuleContext();
          _jspx_page_context.setAttribute("context", context, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      com.openxava.naviox.Modules modules = null;
      synchronized (session) {
        modules = (com.openxava.naviox.Modules) _jspx_page_context.getAttribute("modules", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (modules == null){
          modules = new com.openxava.naviox.Modules();
          _jspx_page_context.setAttribute("modules", modules, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String windowId = context.getWindowId(request);
context.setCurrentWindowId(windowId);
if ("true".equals(request.getParameter("init"))) { 										
	context.resetModule(request);
}
String app = request.getParameter("application");
String module = context.getCurrentModule(request);
try {
	modules.setCurrent(request);
}
catch (org.openxava.util.ElementNotFoundException ex) {
	log.error(ex.getMessage(), ex);
	response.sendError(HttpServletResponse.SC_NOT_FOUND);
	return;
}
String oxVersion = org.openxava.controller.ModuleManager.getVersion();
String title = (String) request.getAttribute("naviox.pageTitle");
if (title == null) title = modules.getCurrentModuleDescription(request); 
boolean hasModules = modules.hasModules(request); 		
org.openxava.controller.ModuleManager manager = (org.openxava.controller.ModuleManager) context
		.get(app, module, "manager", "org.openxava.controller.ModuleManager");
manager.setSession(session);
manager.setApplicationName(request.getParameter("application"));
manager.setModuleName(module); // In order to show the correct description in head

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("	<title>");
      out.print(title);
      out.write("</title>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/jquery-ui.css?ox=");
      out.print(oxVersion);
      out.write("\"/>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/jquery-ui.structure.css?ox=");
      out.print(oxVersion);
      out.write("\"/>\r\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/smoothness/jquery-ui.css?ox=");
      out.print(oxVersion);
      out.write("\"/>\r\n");
      out.write("	<link href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/layout.css?ox=");
      out.print(oxVersion);
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/");
      out.print(Themes.getCSS(request));
      out.write("?ox=");
      out.print(oxVersion);
      out.write("\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("	<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/xava/style/materialdesignicons.css?ox=");
      out.print(oxVersion);
      out.write("\">\r\n");
      out.write("	<script type='text/javascript' ");
      if (_jspx_meth_xava_005fnonce_005f0(_jspx_page_context))
        return;
      out.write("> \r\n");
      out.write("		if (typeof dwr == 'undefined') dwr = {};\r\n");
      out.write("		if (!dwr.engine) dwr.engine = {};\r\n");
      out.write("		dwr.engine._contextPath = \"");
      out.print(request.getContextPath());
      out.write("\";\r\n");
      out.write("	</script>	\r\n");
      out.write("	<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/xava/js/dwr-engine.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\r\n");
      out.write("	");
 request.setAttribute("xava.dwr.loaded", true); 
      out.write("\r\n");
      out.write("	<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Modules.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\r\n");
      out.write("	<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/dwr/interface/Folders.js?ox=");
      out.print(oxVersion);
      out.write("'></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body ");
      out.print(XavaStyle.getBodyClass(request));
      out.write(">\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"main\"> \r\n");
      out.write("				\r\n");
      out.write("		");
 if (hasModules) { 
      out.write("\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write("\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<div class=\"module-wrapper\">\r\n");
      out.write("			<div id=\"module_header\">\r\n");
      out.write("				 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "moduleHeader.jsp", out, false);
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			");
 if ("SignIn".equals(module)) {  
      out.write("\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, NaviOXPreferences.getInstance().getSignInJSP(), out, false);
      out.write("\r\n");
      out.write("			");
 } else { 
      out.write("\r\n");
      out.write("			<div id=\"module\"> 	\r\n");
      out.write("				");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../xava/module.jsp?application=" + app + "&module=" + module + "&htmlHead=false", out, false);
      out.write("\r\n");
      out.write("			</div> \r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("	</div> \r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script type='text/javascript' src='");
      out.print(request.getContextPath());
      out.write("/naviox/js/naviox.js?ox=");
      out.print(oxVersion);
      out.write("'></script> \r\n");
      out.write("	\r\n");
      out.write("	<script ");
      if (_jspx_meth_xava_005fnonce_005f1(_jspx_page_context))
        return;
      out.write("> \r\n");
      out.write("	$(function() {\r\n");
      out.write("		naviox.lockSessionMilliseconds = ");
      out.print(com.openxava.naviox.model.Configuration.getInstance().getLockSessionMilliseconds());
      out.write("; \r\n");
      out.write("		naviox.application = \"");
      out.print(app);
      out.write("\";\r\n");
      out.write("		naviox.module = \"");
      out.print(module);
      out.write("\";\r\n");
      out.write("		naviox.locked = ");
      out.print(context.get(request, "naviox_locked"));
      out.write(";\r\n");
      out.write("		naviox.init();\r\n");
      out.write("	});\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_xava_005fnonce_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:nonce
    org.openxava.web.taglib.NonceTag _jspx_th_xava_005fnonce_005f0 = (org.openxava.web.taglib.NonceTag) _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.get(org.openxava.web.taglib.NonceTag.class);
    boolean _jspx_th_xava_005fnonce_005f0_reused = false;
    try {
      _jspx_th_xava_005fnonce_005f0.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fnonce_005f0.setParent(null);
      int _jspx_eval_xava_005fnonce_005f0 = _jspx_th_xava_005fnonce_005f0.doStartTag();
      if (_jspx_th_xava_005fnonce_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.reuse(_jspx_th_xava_005fnonce_005f0);
      _jspx_th_xava_005fnonce_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fnonce_005f0, _jsp_getInstanceManager(), _jspx_th_xava_005fnonce_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_xava_005fnonce_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  xava:nonce
    org.openxava.web.taglib.NonceTag _jspx_th_xava_005fnonce_005f1 = (org.openxava.web.taglib.NonceTag) _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.get(org.openxava.web.taglib.NonceTag.class);
    boolean _jspx_th_xava_005fnonce_005f1_reused = false;
    try {
      _jspx_th_xava_005fnonce_005f1.setPageContext(_jspx_page_context);
      _jspx_th_xava_005fnonce_005f1.setParent(null);
      int _jspx_eval_xava_005fnonce_005f1 = _jspx_th_xava_005fnonce_005f1.doStartTag();
      if (_jspx_th_xava_005fnonce_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fxava_005fnonce_005fnobody.reuse(_jspx_th_xava_005fnonce_005f1);
      _jspx_th_xava_005fnonce_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_xava_005fnonce_005f1, _jsp_getInstanceManager(), _jspx_th_xava_005fnonce_005f1_reused);
    }
    return false;
  }
}
