/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-02-03 15:34:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/nav.jsp", Long.valueOf(1580730214024L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1580730215777L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Fantastic_NMT</title>\r\n");
      out.write("   <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("   <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/member/main.css\">\r\n");
      out.write("   <script src=\"https://kit.fontawesome.com/226b55f414.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".main_img{\r\n");
      out.write("    height: 980px;\r\n");
      out.write("    background-image: url(");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_01.png);\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-position: top center;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    \r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("    border: 1px solid rgba(0,0, 0, 0);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t <nav>\r\n");
      out.write("        <div class=\"nav_bar\"></div>\r\n");
      out.write("        <div class=\"nav_wrap\">\r\n");
      out.write("            <div class=\"nav_content\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/logo.png\" class=\"logo\">\r\n");
      out.write("                <div class=\"left_select\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>menu1</li>\r\n");
      out.write("                        <li>menu2</li>\r\n");
      out.write("                        <li>menu3</li>\r\n");
      out.write("                        <li>menu4</li>\r\n");
      out.write("                        <li>menu5</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"rigth_select\">\r\n");
      out.write("                    <input type=\"button\" id=\"btn_login\" value=\"LOGIN\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberLoginView'\">\r\n");
      out.write("                    <input type=\"button\" id=\"btn_join\" value=\"JOIN\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/member/memberEnrollView'\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"main_img\">\r\n");
      out.write("            <div class=\"main_title\">\r\n");
      out.write("                <h1>NO MONEY ?<br>GO TRIP !</h1>\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the<br>\r\n");
      out.write("                printing and typesetting industry. Lorem<br>\r\n");
      out.write("                Ipsum has been the industry's</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"");
      out.print(request.getContextPath() );
      out.write("/main/mainfunction\" method=\"get\">\r\n");
      out.write("            <div class=\"main_skil1\">\r\n");
      out.write("                <div class=\"select_1\">\r\n");
      out.write("                    <h2>여행할 국가를 선택하세요</h2>\r\n");
      out.write("                    <select name=\"nation\" id=\"select_nation\">\r\n");
      out.write("                        <option id=\"europe\" value=\"유럽\">유럽</option>\r\n");
      out.write("                        <option id=\"asia\" value=\"아시아\">아시아</option>\r\n");
      out.write("                        <option id=\"amarica\" value=\"아메리카\">아메리카</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <select name=\"city\" id=\"select_city\">\r\n");
      out.write("                        <option id=\"france\" value=\"france\">프랑스</option>\r\n");
      out.write("                        <option id=\"switzerland\" value=\"swiss\">스위스</option>\r\n");
      out.write("                        <option id=\"uk\" value=\"englind\">영국</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"select_2\">\r\n");
      out.write("                    <h2>기간을 정해주세요</h2>\r\n");
      out.write("                    <select name=\"days\" id=\"select_days\">\r\n");
      out.write("                        <option id=\"tendays\" value=\"10\">10일</option>\r\n");
      out.write("                        <option id=\"fifteendays\" value=\"15\">15일</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"main_skil2\">\r\n");
      out.write("                <div class=\"btn_wrap\">\r\n");
      out.write("                    <input type=\"button\" id=\"btn_air\" value=\"항공권\">\r\n");
      out.write("                    <input type=\"button\" id=\"btn_hotel\" value=\"호텔/숙박\">\r\n");
      out.write("                    <input type=\"button\" id=\"btn_place\" value=\"관광명소\">    \r\n");
      out.write("                </div>    \r\n");
      out.write("                <div class=\"price_wrap\">\r\n");
      out.write("                    <input type=\"text\" id=\"price\" name=\"price\" placeholder=\"원하는 가격을 입력하세요\">\r\n");
      out.write("                    <input type=\"submit\" id=\"btn_letgo\" value=\"LET'S GO\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         </form>\r\n");
      out.write("    </header>\r\n");
      out.write("    <section class=\"sec1\">\r\n");
      out.write("            <div class=\"sub_title\">\r\n");
      out.write("                <h2>여기는 어때요?</h2>\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing<br>\r\n");
      out.write("                    Ipsum has been the industry's</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"recomand_list\">\r\n");
      out.write("                <div class=\"re_col1\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_04.png\" width=\"380px\" height=\"295px\">\r\n");
      out.write("                    <i class=\"fas fa-heart\" id=\"heart\" onclick=\"like();\"></i>\r\n");
      out.write("                    <div class=\"title_star1\">\r\n");
      out.write("                        <h3>서브타이틀</h3>\r\n");
      out.write("                        <div class=\"star_wrap1\">\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing\r\n");
      out.write("                        and typesetting industry. LoremIpsum has been th\r\n");
      out.write("                        e industry's Lorem Ipsum is simply</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"re_col2\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_06.png\" width=\"380px\" height=\"295px\">\r\n");
      out.write("                    <i class=\"fas fa-heart\" id=\"heart\" onclick=\"like();\"></i>\r\n");
      out.write("                    <div class=\"title_star2\">\r\n");
      out.write("                        <h3>서브타이틀</h3>\r\n");
      out.write("                        <div class=\"star_wrap2\">\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing\r\n");
      out.write("                        and typesetting industry. LoremIpsum has been th\r\n");
      out.write("                        e industry's Lorem Ipsum is simply</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"re_col3\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_08.png\" width=\"380px\" height=\"295px\">\r\n");
      out.write("                    <i class=\"fas fa-heart\" id=\"heart\" onclick=\"like();\"></i>\r\n");
      out.write("                    <div class=\"title_star3\">\r\n");
      out.write("                        <h3>서브타이틀</h3>\r\n");
      out.write("                        <div class=\"star_wrap3\">\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                            <i class=\"fas fa-star\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p>Lorem Ipsum is simply dummy text of the printing\r\n");
      out.write("                        and typesetting industry. LoremIpsum has been th\r\n");
      out.write("                        e industry's Lorem Ipsum is simply</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <section class=\"sec2\">\r\n");
      out.write("        <div class=\"red_bg\">\r\n");
      out.write("            <div class=\"trd_title\">\r\n");
      out.write("                <h2>최저가로 만나보세요</h2>\r\n");
      out.write("                <p>Lorem Ipsum is simply dummy text of the printing</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"hotel_wrap\">\r\n");
      out.write("                <div class=\"img_album\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_14.png\">\r\n");
      out.write("                    <div class=\"img_small\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_21.png\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_23.png\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_25.png\">\r\n");
      out.write("                        <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_27.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"hotel_content1\">\r\n");
      out.write("                    <div class=\"hotel_title_wrap\">\r\n");
      out.write("                        <h3>최저가</h3>\r\n");
      out.write("                        <h2>90,494₩</h2>\r\n");
      out.write("                        <h4>오요 뉴 돔 호텔</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"hotel_p_wrap\">\r\n");
      out.write("                        <div class=\"location_wrap\">\r\n");
      out.write("                            <p>영국,런던</p>\r\n");
      out.write("                            <i class=\"fas fa-map-marker-alt\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"days_wrap\">\r\n");
      out.write("                        <p>1박 기준</p>\r\n");
      out.write("                        <i class=\"fas fa-calendar-alt\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"hotel_content2\">\r\n");
      out.write("                    <h2>최저가 사이트</h2>\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/semiproject_main_crop_16.png\">\r\n");
      out.write("                    <input type=\"button\" id=\"btn_go\" value=\"상품보러가기\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write(" <footer>\r\n");
      out.write("        <div class=\"gray_bg\">\r\n");
      out.write("            <div class=\"footer_wrap\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"footer_logo\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/main/footer_icon.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"border1\"></div>\r\n");
      out.write("                <div class=\"footer_content1\">\r\n");
      out.write("                    <h2>About</h2>\r\n");
      out.write("                    <p>We as a company<br>\r\n");
      out.write("                        Media bank<br>\r\n");
      out.write("                        Pres</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"border2\"></div>\r\n");
      out.write("                <div class=\"footer_content2\">\r\n");
      out.write("                    <h2>Customer Service</h2>\r\n");
      out.write("                    <p>Delivery terms<br>\r\n");
      out.write("                        Shipping and payment methods<br>\r\n");
      out.write("                        Exchanges and returns<br>\r\n");
      out.write("                        Contact customer service<br>\r\n");
      out.write("                        </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"border3\"></div>\r\n");
      out.write("                <div class=\"footer_content3\">\r\n");
      out.write("                    <h2>Customer Service</h2>\r\n");
      out.write("                    <p>Delivery terms<br>\r\n");
      out.write("                        Shipping and payment methods<br>\r\n");
      out.write("                        Exchanges and returns<br>\r\n");
      out.write("                        Contact customer service<br>\r\n");
      out.write("                        </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"red_bg2\">\r\n");
      out.write("            <div class=\"p_wrap\">\r\n");
      out.write("                <p>개인정보처리방침</p>\r\n");
      out.write("                <p>| </p>\r\n");
      out.write("                <p>이용약관</p>\r\n");
      out.write("                <p>| </p>\r\n");
      out.write("                <p>영상정보 처리기기 운영정보 방침</p>\r\n");
      out.write("                <p>| </p>\r\n");
      out.write("                <p>SITE MAP</p>\r\n");
      out.write("                <p>| </p>\r\n");
      out.write("                <p>CONTECT  US</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}