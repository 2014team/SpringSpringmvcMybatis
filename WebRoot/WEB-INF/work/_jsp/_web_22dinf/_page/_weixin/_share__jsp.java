/*
 * JSP generated by Resin Professional 4.0.13 (built Tue, 09 Nov 2010 03:50:16 PST)
 */

package _jsp._web_22dinf._page._weixin;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _share__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");
    String _caucho_request_character_encoding = request.getCharacterEncoding();
    if (_caucho_request_character_encoding == null || "".equals(_caucho_request_character_encoding))
      request.setCharacterEncoding("utf-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    _caucho_expr_0.print(out, _jsp_env, false);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    _caucho_expr_1.print(out, _jsp_env, false);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    _caucho_expr_2.print(out, _jsp_env, false);
    out.write(_jsp_string3, 0, _jsp_string3.length);
    _caucho_expr_3.print(out, _jsp_env, false);
    out.write(_jsp_string4, 0, _jsp_string4.length);
    _caucho_expr_4.print(out, _jsp_env, false);
    out.write(_jsp_string5, 0, _jsp_string5.length);
    _caucho_expr_5.print(out, _jsp_env, false);
    out.write(_jsp_string6, 0, _jsp_string6.length);
    _caucho_expr_6.print(out, _jsp_env, false);
    out.write(_jsp_string7, 0, _jsp_string7.length);
    _caucho_expr_7.print(out, _jsp_env, false);
    out.write(_jsp_string8, 0, _jsp_string8.length);
    _caucho_expr_8.print(out, _jsp_env, false);
    out.write(_jsp_string9, 0, _jsp_string9.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != 72739197937975180L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/page/weixin/share.jsp"), 8373891939986553235L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
      manager.addTaglibFunctions(_jsp_functionMap, "fmt", "http://java.sun.com/jsp/jstl/fmt");
      manager.addTaglibFunctions(_jsp_functionMap, "fn", "http://java.sun.com/jsp/jstl/functions");
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
      _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${appId}");
      _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${timestamp}");
      _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${nonceStr}");
      _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${signature}");
      _caucho_expr_4 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${url}");
      _caucho_expr_5 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${title}");
      _caucho_expr_6 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${desc}");
      _caucho_expr_7 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${link}");
      _caucho_expr_8 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${imgUrl}");
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;
  private static com.caucho.el.Expr _caucho_expr_4;
  private static com.caucho.el.Expr _caucho_expr_5;
  private static com.caucho.el.Expr _caucho_expr_6;
  private static com.caucho.el.Expr _caucho_expr_7;
  private static com.caucho.el.Expr _caucho_expr_8;

  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string5;
  private final static char []_jsp_string0;
  private final static char []_jsp_string6;
  private final static char []_jsp_string8;
  private final static char []_jsp_string1;
  private final static char []_jsp_string7;
  private final static char []_jsp_string4;
  private final static char []_jsp_string9;
  static {
    _jsp_string3 = "';\r\n		var signature = '".toCharArray();
    _jsp_string2 = "';\r\n		var nonceStr = '".toCharArray();
    _jsp_string5 = "';\r\n		var title = '".toCharArray();
    _jsp_string0 = "   \r\n\r\n\r\n\r\n\r\n \r\n\r\n<head>\r\n    <title>\u5fae\u4fe1\u5206\u4eab\u6d4b\u8bd5</title>\r\n    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n    <meta name=\"format-detection\" content=\"telephone=no\">\r\n    <meta name=\"format-detection\" content=\"email=no\">   \r\n    \r\n	<script type=\"text/javascript\" src=\"/js/jquery-1.10.1.min.js\"></script>\r\n	\r\n	<!-- \u5fae\u4fe1\u5206\u4eab\u9700\u8981\u8c03\u7528\u7684JS -->\r\n	<script src=\"http://res.wx.qq.com/open/js/jweixin-1.0.0.js\"></script>\r\n	<script>\r\n		var appId = '".toCharArray();
    _jsp_string6 = "';\r\n		var desc = '".toCharArray();
    _jsp_string8 = "';\r\n		var imgUrl = '".toCharArray();
    _jsp_string1 = "';\r\n		var timestamp = '".toCharArray();
    _jsp_string7 = "';\r\n		var link = '".toCharArray();
    _jsp_string4 = "';\r\n		var url = '".toCharArray();
    _jsp_string9 = "';\r\n	\r\n		wx.config({\r\n		    debug: false, 	// \u5f00\u542f\u8c03\u8bd5\u6a21\u5f0f,\u8c03\u7528\u7684\u6240\u6709api\u7684\u8fd4\u56de\u503c\u4f1a\u5728\u5ba2\u6237\u7aefalert\u51fa\u6765\uff0c\u82e5\u8981\u67e5\u770b\u4f20\u5165\u7684\u53c2\u6570\uff0c\u53ef\u4ee5\u5728pc\u7aef\u6253\u5f00\uff0c\u53c2\u6570\u4fe1\u606f\u4f1a\u901a\u8fc7log\u6253\u51fa\uff0c\u4ec5\u5728pc\u7aef\u65f6\u624d\u4f1a\u6253\u5370\u3002\r\n		    appId: appId, 		// \u5fc5\u586b\uff0c\u516c\u4f17\u53f7\u7684\u552f\u4e00\u6807\u8bc6\r\n		    timestamp: timestamp, 	// \u5fc5\u586b\uff0c\u751f\u6210\u7b7e\u540d\u7684\u65f6\u95f4\u6233\r\n		    nonceStr: nonceStr, 	// \u5fc5\u586b\uff0c\u751f\u6210\u7b7e\u540d\u7684\u968f\u673a\u4e32\r\n		    signature: signature,	// \u5fc5\u586b\uff0c\u7b7e\u540d\uff0c\u89c1\u9644\u5f551\r\n		    jsApiList: ['onMenuShareTimeline', 'onMenuShareAppMessage', 'onMenuShareQQ', 'onMenuShareWeibo', 'onMenuShareQZone'] // \u5fc5\u586b\uff0c\u9700\u8981\u4f7f\u7528\u7684JS\u63a5\u53e3\u5217\u8868\uff0c\u6240\u6709JS\u63a5\u53e3\u5217\u8868\u89c1\u9644\u5f552\r\n		});\r\n	   \r\n		wx.ready(function(){\r\n			// config\u4fe1\u606f\u9a8c\u8bc1\u540e\u4f1a\u6267\u884cready\u65b9\u6cd5\uff0c\u6240\u6709\u63a5\u53e3\u8c03\u7528\u90fd\u5fc5\u987b\u5728config\u63a5\u53e3\u83b7\u5f97\u7ed3\u679c\u4e4b\u540e\uff0cconfig\u662f\u4e00\u4e2a\u5ba2\u6237\u7aef\u7684\u5f02\u6b65\u64cd\u4f5c\uff0c\r\n			// \u6240\u4ee5\u5982\u679c\u9700\u8981\u5728\u9875\u9762\u52a0\u8f7d\u65f6\u5c31\u8c03\u7528\u76f8\u5173\u63a5\u53e3\uff0c\u5219\u987b\u628a\u76f8\u5173\u63a5\u53e3\u653e\u5728ready\u51fd\u6570\u4e2d\u8c03\u7528\u6765\u786e\u4fdd\u6b63\u786e\u6267\u884c\u3002\u5bf9\u4e8e\u7528\u6237\u89e6\u53d1\u65f6\u624d\u8c03\u7528\u7684\u63a5\u53e3\uff0c\r\n			// \u5219\u53ef\u4ee5\u76f4\u63a5\u8c03\u7528\uff0c\u4e0d\u9700\u8981\u653e\u5728ready\u51fd\u6570\u4e2d\u3002\r\n			\r\n			\r\n			// \u5206\u4eab\u5230\u670b\u53cb\u5708\r\n			wx.onMenuShareTimeline({\r\n			    title: title, // \u5206\u4eab\u6807\u9898\r\n			    link: link, // \u5206\u4eab\u94fe\u63a5\r\n			    imgUrl: imgUrl, // \u5206\u4eab\u56fe\u6807\r\n			    success: function () {\r\n			        // \u7528\u6237\u786e\u8ba4\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    },\r\n			    cancel: function () { \r\n			        // \u7528\u6237\u53d6\u6d88\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    }\r\n			});\r\n			\r\n			\r\n			// \u5206\u4eab\u7ed9\u670b\u53cb\r\n			wx.onMenuShareAppMessage({\r\n			    title: title, // \u5206\u4eab\u6807\u9898\r\n			    desc: desc, // \u5206\u4eab\u63cf\u8ff0\r\n			    link: link, // \u5206\u4eab\u94fe\u63a5\r\n			    imgUrl: imgUrl, // \u5206\u4eab\u56fe\u6807\r\n			    type: '', // \u5206\u4eab\u7c7b\u578b,music\u3001video\u6216link\uff0c\u4e0d\u586b\u9ed8\u8ba4\u4e3alink\r\n			    dataUrl: '', // \u5982\u679ctype\u662fmusic\u6216video\uff0c\u5219\u8981\u63d0\u4f9b\u6570\u636e\u94fe\u63a5\uff0c\u9ed8\u8ba4\u4e3a\u7a7a\r\n			    success: function () { \r\n			        // \u7528\u6237\u786e\u8ba4\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    },\r\n			    cancel: function () { \r\n			        // \u7528\u6237\u53d6\u6d88\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    }\r\n			});\r\n			\r\n			// \u5206\u4eab\u5230QQ\r\n			wx.onMenuShareQQ({\r\n			    title: title, // \u5206\u4eab\u6807\u9898\r\n			    desc: desc, // \u5206\u4eab\u63cf\u8ff0\r\n			    link: link, // \u5206\u4eab\u94fe\u63a5\r\n			    imgUrl: imgUrl, // \u5206\u4eab\u56fe\u6807\r\n			    success: function () { \r\n			       // \u7528\u6237\u786e\u8ba4\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    },\r\n			    cancel: function () { \r\n			       // \u7528\u6237\u53d6\u6d88\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    }\r\n			});\r\n			\r\n			// \u5206\u4eab\u5230\u817e\u8baf\u5fae\u535a\r\n			wx.onMenuShareWeibo({\r\n			    title: title, // \u5206\u4eab\u6807\u9898\r\n			    desc: desc, // \u5206\u4eab\u63cf\u8ff0\r\n			    link: link, // \u5206\u4eab\u94fe\u63a5\r\n			    imgUrl: imgUrl, // \u5206\u4eab\u56fe\u6807\r\n			    success: function () { \r\n			       // \u7528\u6237\u786e\u8ba4\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    },\r\n			    cancel: function () { \r\n			        // \u7528\u6237\u53d6\u6d88\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    }\r\n			});\r\n			\r\n			// \u5206\u4eab\u5230QQ\u7a7a\u95f4\r\n			wx.onMenuShareQZone({\r\n			    title: title, // \u5206\u4eab\u6807\u9898\r\n			    desc: desc, // \u5206\u4eab\u63cf\u8ff0\r\n			    link: link, // \u5206\u4eab\u94fe\u63a5\r\n			    imgUrl: imgUrl, // \u5206\u4eab\u56fe\u6807\r\n			    success: function () { \r\n			       // \u7528\u6237\u786e\u8ba4\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    },\r\n			    cancel: function () {\r\n			        // \u7528\u6237\u53d6\u6d88\u5206\u4eab\u540e\u6267\u884c\u7684\u56de\u8c03\u51fd\u6570\r\n			    }\r\n			});\r\n			\r\n		});\r\n	</script>\r\n	\r\n</head>\r\n<body>\r\n \u5fae\u4fe1\u5206\u4eab\u6d4b\u8bd5\r\n</body>\r\n</html>".toCharArray();
  }
}