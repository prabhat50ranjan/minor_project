package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;;
import org.jsoup.nodes.Element;;
import org.jsoup.select.Elements;;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;;
import org.jsoup.nodes.Element;;
import org.jsoup.select.Elements;;

public final class watchlist2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("\n");
      out.write("   <head>\n");
      out.write("      <title>DSTREET</title>\n");
      out.write("      <script type = \"text/javascript\" \n");
      out.write("         src = \"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("         \n");
      out.write("         <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"bootstrap/scripts/jquery.min.js\"></script>\n");
      out.write("        <link rel = \"stylesheet\" \n");
      out.write("         href = \"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\n");
      out.write("\t\t\t\n");
      out.write("      <script type = \"text/javascript\" \n");
      out.write("         src = \"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("         \n");
      out.write("         <script type = \"text/javascript\" \n");
      out.write("         src = \"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("  \n");
      out.write("   <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("      <script type = \"text/javascript\" language = \"javascript\">\n");
      out.write("         $(document).ready(function() {\n");
      out.write("            $(\"#stage\").click(function(event){\n");
      out.write("               $('#driver').load('prediction.jsp');\n");
      out.write("            });\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("    $(document).on(\"click\", \"#predection\", function () { // When HTML DOM \"click\" event is invoked on element with ID \"somebutton\", execute the following function...\n");
      out.write("        var data = {\n");
      out.write("            foo: document.getElementById('mydiv').value\n");
      out.write("\n");
      out.write("        };\n");
      out.write("        $.get(\"predection\", data, function (responseText) {   // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("\n");
      out.write("            document.getElementById('mydiv').value = responseText;\n");
      out.write("            //$(\"#mydiv\").value(responseText);\n");
      out.write("            // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("          function loadtopgainer()\n");
      out.write("          {\n");
      out.write("              var xhttp=new XMLHttpRequest();\n");
      out.write("              xhttp.onreadystatechange=function()\n");
      out.write("              {\n");
      out.write("               if(this.readyState===4&&this.status===200)\n");
      out.write("               {\n");
      out.write("                   document.getElementById(\"container\").innerHTML=this.responseText;\n");
      out.write("                   \n");
      out.write("               }\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              };\n");
      out.write("              \n");
      out.write("              xhttp.open(\"GET\",\"topgainer.jsp\",true);\n");
      out.write("              xhttp.send();\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          </script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("          function loadprediction()\n");
      out.write("          {\n");
      out.write("              var xhttp=new XMLHttpRequest();\n");
      out.write("              xhttp.onreadystatechange=function(){\n");
      out.write("                  \n");
      out.write("                  if(this.readyState===4&&this.status===200)\n");
      out.write("                  {\n");
      out.write("                      document.getElementById(\"container\").innerHTML=this.responseText;\n");
      out.write("                  }\n");
      out.write("                  \n");
      out.write("              };\n");
      out.write("                xhttp.open(\"GET\",\"prediction.jsp\",true);      \n");
      out.write("                xhttp.send();\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          </script>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("       \n");
      out.write(" <script>\n");
      out.write("function aboutme() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"aboutme.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("<script type = \"text/javascript\" language = \"javascript\">\n");
      out.write("         $(document).ready(function() {    \n");
      out.write("               \n");
      out.write("               $('#predict').hover(function() {\n");
      out.write("               $( \"#predict\" ).effect( \"shake\", {\n");
      out.write("                  times:1,\n");
      out.write("                  distance:2\n");
      out.write("               }, 100, function() {\n");
      out.write("                  $( this ).css( \"background\", \"white\" );\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("        \n");
      out.write("        $('.panel.panel-info').hover(function() {\n");
      out.write("               $( \".panel.panel-info\" ).effect( \"shake\", {\n");
      out.write("                  times:1,\n");
      out.write("                  distance:2\n");
      out.write("               }, 100, function() {\n");
      out.write("                  $( this ).css( \"background\", \"white\" );\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $('.portfolio').hover(function() {\n");
      out.write("               $( \".portfolio\" ).effect( \"shake\", {\n");
      out.write("                  times:1,\n");
      out.write("                  distance: 2\n");
      out.write("               }, 100, function() {\n");
      out.write("                  $( this ).css( \"background\", \"white\" );\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            $('.trading').hover(function() {\n");
      out.write("               $( \".trading\" ).effect( \"shake\", {\n");
      out.write("                  times:1,\n");
      out.write("                  distance:2\n");
      out.write("               }, 100, function() {\n");
      out.write("                  $( this ).css( \"background\", \"white\" );\n");
      out.write("               });\n");
      out.write("               \n");
      out.write("             });\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        $('.market').hover(function() {\n");
      out.write("               $( \".market\" ).effect( \"shake\", {\n");
      out.write("                  times:1,\n");
      out.write("                  distance:2\n");
      out.write("               }, 100, function() {\n");
      out.write("                  $( this ).css( \"background\", \"white\" );\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            $('.charting').hover(function() {\n");
      out.write("               $( \".panel panel-info\" ).effect( \"shake\", {\n");
      out.write("                  times:1,\n");
      out.write("                  distance:2\n");
      out.write("               }, 100, function() {\n");
      out.write("                  $( this ).css( \"background\", \"white\" );\n");
      out.write("               });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("         $(function() {\n");
      out.write("            var availableTags = [\n");
      out.write("               \"hd\",\n");
      out.write("               \"ibm\",\n");
      out.write("               \"aapl\",\n");
      out.write("               \"nke\",\n");
      out.write("               \"mmm\",\n");
      out.write("               \"unh\",\n");
      out.write("               \"utx\",\n");
      out.write("               \"pfe\",\n");
      out.write("               \"dis\",\n");
      out.write("               \"jnj\",\n");
      out.write("               \"msft\",\n");
      out.write("               \"ge\",\n");
      out.write("               \"ko\",\n");
      out.write("               \"wmt\",\n");
      out.write("               \"mrk\",\n");
      out.write("               \"cat\",\n");
      out.write("               \"trv\",\n");
      out.write("               \"pg\",\n");
      out.write("               \"v\",\n");
      out.write("               \"dd\",\n");
      out.write("               \"xom\",\n");
      out.write("               \"mcd\",\n");
      out.write("               \"jpm\",\n");
      out.write("               \"ba\",\n");
      out.write("               \"gs\",\n");
      out.write("               \"csco\",\n");
      out.write("               \"cvx\",\n");
      out.write("               \"axp\",\n");
      out.write("               \"vz\",\n");
      out.write("               \"intc\"\n");
      out.write("            ];\n");
      out.write("\t\t\t\t\n");
      out.write("            $( \"#tag\" ).autocomplete({\n");
      out.write("               source: availableTags\n");
      out.write("            });\n");
      out.write("\t\t\t\t\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("         $(function() {\n");
      out.write("            $( \"#button-1, #button-2, #button-3, #button-4, #button-5, #button-6, #button-7, #button-8, #button-9, #button-10, #button-11, #button-12, #button-13, #button-14\" ).button();\n");
      out.write("            \n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("\n");
      out.write("\t <script>\n");
      out.write("         $(function() {\n");
      out.write("            $( \"#button-1, #button-2, #button-3, #button-4\" ).button();\n");
      out.write("            $( \"#button-5\" ).buttonset();\n");
      out.write("         });\n");
      out.write("      </script>\t\n");
      out.write("\t\t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link href = \"https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css\"\n");
      out.write("         rel = \"stylesheet\">\n");
      out.write("      <script src = \"https://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("      <script src = \"https://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("function insurance() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"insurance.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("   <script>\n");
      out.write("function fixedincome() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"fixedincome.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>   \n");
      out.write("      \n");
      out.write("<script>\n");
      out.write("function mutualfunds() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"mutualfunds.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("<script>\n");
      out.write("function tax() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"tax.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function investing() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"investing.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("      \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function topnews() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"topnews.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function latestnews() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"latestnews.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function mostreadnews() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"mostreadnews.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function newsvideo() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"newsvideo.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function energy() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"energy.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function financial() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"financial.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function healthcare() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"healthcare.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function informationtechnology() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"informationtechnology.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function telecomutilies() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"telecomutilies.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function fmcg() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"fmcg.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function realty() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"realty.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function basicmaterials() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"basicmaterials.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("     <script>\n");
      out.write("function consumerdurables() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"consumerdurables.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function industrials() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"industrials.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function power() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"power.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function auto() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"auto.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function stockadvice() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"stockadvice.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function topcompanies() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"topcompanies.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function technology() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"technology.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function property() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"property.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function opinion() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"opinion.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function startups() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"startups.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("function commodities() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"commodities.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function forum() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"forum.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#form{\n");
      out.write("             border-radius: 25px;\n");
      out.write("           \n");
      out.write("            padding: 50px;\n");
      out.write("         }\n");
      out.write("         #namebox{\n");
      out.write("             border-radius: 25px;\n");
      out.write("             padding: 50px;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("         #rcorner2{\n");
      out.write("            border-radius: 25px;\n");
      out.write("            background: #CCFFFF;\n");
      out.write("            padding: 50px;\n");
      out.write("            width: 1680px;\n");
      out.write("            height: 50px;\n");
      out.write("            background-color:rgba(255,0,0,0.2);\n");
      out.write("         }\n");
      out.write("            .animated.swing{\n");
      out.write("                background-color:#3399FF;\n");
      out.write("            } \n");
      out.write("            \n");
      out.write("            .footer{\n");
      out.write("                background-color:#FF00CC;\n");
      out.write("            }\n");
      out.write("            .news{\n");
      out.write("                background-color:white;\n");
      out.write("            }\n");
      out.write("              \n");
      out.write("            \n");
      out.write("            .sucess{\n");
      out.write("                \n");
      out.write("               background-color:#CCFFFF;\n");
      out.write("            }\n");
      out.write("            .navbar.navbar-default.navbar-fixed-top{\n");
      out.write("               \n");
      out.write("                background-color:#1b6d85;\n");
      out.write("               \n");
      out.write("                width:100%;\n");
      out.write("                height:20px;\n");
      out.write("            }\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("             .vertical-menu {\n");
      out.write("    width: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".vertical-menu a {\n");
      out.write("    background-color:#eee; \n");
      out.write("    color: black; \n");
      out.write("    display: block; \n");
      out.write("    padding: 12px; \n");
      out.write("    text-decoration: none; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".vertical-menu a:hover {\n");
      out.write("    background-color:#1b6d85; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".vertical-menu a.active {\n");
      out.write("    background-color: #4CAF50; \n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("            \n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("      </style>\n");
      out.write("\n");
      out.write("   \n");
      out.write("        \n");
      out.write("      \n");
      out.write("      \n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("\t\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <nav id=\"rcorner1\" class = \"navbar navbar-default navbar-fixed-top\" role = \"navigation\">\n");
      out.write("   \n");
      out.write("   <div class = \"navbar-header\">\n");
      out.write("      <img style=\"border:0px solid red; height:46px; width:120px\" src=\"stock.png\" />\n");
      out.write("             <p class = \"navbar-brand\"><font face=\"arial\" size=\"6\" color=\"black\">DSTREET</font></p>\n");
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("      <ul style=\"position:relative;margin-left:200px;\"class = \"nav navbar-nav navbar-middle\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <div class = \"ui-widget\" style=\"width:1000px;\">\n");
      out.write("              <form action=\"quotes.jsp\">\n");
      out.write("             <label for = \"tag\"> <button class=\"btn btn-warning\" style=\"position:relative;width:200px;height:50px;\">STOCK QUOTES </button></label>\n");
      out.write("             <input name=\"comp\" placeholder=\"search stock quotes of differentcompanies \" style=\"position:relative;width:600px;height:50px;\" type=\"text\" id= \"tag\"> <button class=\"btn btn-info\" style=\"position:relative;width:160px;height:40px;\" type=\"submit\">SEARCH</button>\n");
      out.write("              </form>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("      </ul>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("      <br><br>\n");
      out.write("  <div style=\"width:100%;height:200px;background-color:#CCFFFF\">\n");
      out.write("      <button class = \"btn bg-success\" data-toggle = \"modal\" style=\"float:right;position:relative;margin-top:40px\" data-target = \"#myModal\" style=\"width:100px;height:50px;\">\n");
      out.write("   LOGIN\n");
      out.write("</button>\n");
      out.write("            <button class =\"btn alert-success\" data-toggle = \"modal\" style=\"float:right;position:relative;margin-top:40px\" data-target = \"#myModalregister\" style=\"width:100px;height:90px;\">\n");
      out.write("   REGISTER\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class = \"modal fade\" id = \"myModal\" tabindex = \"-1\"  role = \"dialog\" \n");
      out.write("   aria-labelledby = \"myModalLabel\" aria-hidden = \"true\">\n");
      out.write("   \n");
      out.write("   <div class = \"modal-dialog\">\n");
      out.write("      <div class = \"modal-content\">\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <div class = \"modal-footer\" style=\"background-color:#3399FF\">\n");
      out.write("             \n");
      out.write("             <div id=\"form\" class=\"login\" >   \n");
      out.write("    <form action=\"validate.jsp\" name=\"myForm\" role=\"form\">\n");
      out.write("         <div id=\"element2\" class=\"form-group\" align=\"center\">\n");
      out.write("             \n");
      out.write("              \n");
      out.write("           \n");
      out.write("                \n");
      out.write("            \n");
      out.write("             <label for=\"name\"></label><font face=\"WildWest\" size=\"6\" color=\"#0033FF\">Name</font><div style=\"width:400px;\" ><input type=\"text\" name=\"Name\"class = \"form-control\" id = \"name\" placeholder = \"Enter Name\" /></div><br><br>\n");
      out.write("               \n");
      out.write("\n");
      out.write("                <label for=\"password\"></label><font face=\"WildWest\" size=\"6\" color=\"#0033FF\">Password</font><div style=\"width:400px;\"><input type=\"password\" name=\"password\"class = \"form-control\" id = \"name\" placeholder = \"Enter your password\" /></div><br><br>\n");
      out.write("   \n");
      out.write("             <button type = \"submit\" class = \"btn btn-danger\" />LOGIN</button>\n");
      out.write("            <button type = \"button\" class = \"btn btn-default\" data-dismiss = \"modal\">\n");
      out.write("               Close\n");
      out.write("            </button>\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("      </form>\n");
      out.write("   </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class = \"modal fade\" id = \"myModalregister\" tabindex = \"-1\" role = \"dialog\" \n");
      out.write("     aria-labelledby = \"myModalLabel\" aria-hidden = \"true\" >\n");
      out.write("   \n");
      out.write("   <div class = \"modal-dialog\">\n");
      out.write("      <div class = \"modal-content\">\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("          <div class = \"modal-footer\" style=\"background-color:#f7e9e9;\">\n");
      out.write("             \n");
      out.write("            <div id=\"form\" class=\"register\" >   \n");
      out.write("    <form action=\"registrationn.jsp\" name=\"myForm\" role=\"form\" \">\n");
      out.write("         <div id=\"element2\" class=\"form-group\" align=\"center\">\n");
      out.write("             \n");
      out.write("              \n");
      out.write("           \n");
      out.write("                \n");
      out.write("            \n");
      out.write("             <label for=\"name\"></label><font face=\"WildWest\" size=\"6\" color=\"#0033FF\">Name</font><div style=\"width:400px;\" ><input type=\"text\" name=\"Name\"class = \"form-control\" id = \"name\" placeholder = \"Enter Name\" /></div><br><br>\n");
      out.write("             \n");
      out.write("            <label for=\"email\"></label><font face=\"WildWest\" size=\"6\" color=\"#0033FF\">Email</font><div style=\"width:400px;\"><input type=\"text\" name=\"EMail\" class = \"form-control\" id = \"name\" placeholder = \"Enter your email address\" /></div><br><br>\n");
      out.write("\n");
      out.write("                <label for=\"password\"></label><font face=\"WildWest\" size=\"6\" color=\"#0033FF\">Password</font><div style=\"width:400px;\"><input type=\"password\" name=\"password\"class = \"form-control\" id = \"name\" placeholder = \"Enter your password\" /></div><br><br>\n");
      out.write("   \n");
      out.write("            <button type = \"submit\" class = \"btn btn-danger\" />REGISTER</button>\n");
      out.write("            \n");
      out.write("            <button type = \"button\" class = \"btn btn-default\" data-dismiss = \"modal\">\n");
      out.write("               Close\n");
      out.write("            </button>\n");
      out.write("         </div>\n");
      out.write("      </form>\n");
      out.write("   </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("      </div>\n");
      out.write("   </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("      <nav class = \"navbar navbar-default\" role = \"navigation\">\n");
      out.write("   \n");
      out.write("   <div class = \"navbar-header\">\n");
      out.write("      <a class = \"navbar-brand\"><font face=\"WildWest\" size=\"6\" color=\"#FF0033\">LIVE STOCK VALUES</font></a>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   <div>\n");
      out.write("      <ul class = \"nav navbar-nav\">\n");
      out.write("          <li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">NIFTY 50</font><br></br>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                  ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?site=&source=hp&q=nifty+index&oq=nifty+&gs_l=hp.3.1.0i67k1l2j0i20k1j0i131k1j0i67k1l5j0i131k1.3433.7636.0.14315.13.11.1.1.1.0.212.1499.0j7j2.9.0....0...1c.1.64.hp..2.9.1181.0..0j0i131i67k1j35i39k1.KDkAoIqV4HY").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("                   \n");
      out.write("                </a></li>\n");
      out.write("         <li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">DOW JONES INDUSTRIAL AVERAGE</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=dow+jones+industrial+average+stock+quotes&oq=dow+jones+INDUSTRIAL+stock+quotes&gs_l=serp.3.0.0i7i30k1.2170492.2182680.0.2184679.24.18.0.0.0.0.267.2550.0j13j2.15.0....0...1c.1.64.serp..9.15.2540...0j0i13k1j0i13i5i30k1j35i39k1j0i67k1j0i30k1j0i8i30k1.9DBIvAvJWgU").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("\n");
      out.write("             </a></li>\n");
      out.write("             <li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">NASDAQ</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=+nasdaq+stock+quotes&oq=+nasdaq+stock+quotes&gs_l=serp.3..0i7i30k1l4j0i20k1j0i7i30k1l5.892598.904077.0.905106.33.23.0.0.0.0.343.3283.0j14j3j1.18.0....0...1c.1.64.serp..17.16.2827...0i7i5i30k1j0i8i7i30k1j35i39k1j0i67k1.4RkMvm0CJQ4").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("\n");
      out.write("<li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">BSE SENSEX</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=bse+sensex+stock+quotes&oq=bse+sensex+stock+quotes&gs_l=serp.3...635376.640713.0.640950.16.13.0.0.0.0.351.2290.0j11j0j1.12.0....0...1c.1.64.serp..4.10.1942...0j35i39k1j0i7i30k1j0i67k1j0i20k1j0i30k1j0i13k1j0i8i7i30k1j0i13i30k1j0i13i5i30k1.hXcrVD_jrBw").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("<li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">HAN SENG</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=hang+seng+stock+quotes&oq=HAN+stock+quotes&gs_l=serp.3.0.0i7i30k1l2j0i7i5i30k1l2.30640.33198.0.36425.7.7.0.0.0.0.216.1103.0j6j1.7.0....0...1c.1.64.serp..0.7.1095...0i8i7i30k1j35i39k1j0i67k1.waAFEjaRGcc").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("<li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">NIKKEI</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=nikkei+stock+quotes&oq=nikkei+stock+quotes&gs_l=serp.3..0j0i5i30k1j0i8i30k1l2.122764.126455.0.127129.17.11.0.0.0.0.328.1670.0j5j2j1.8.0....0...1c.1.64.serp..9.8.1662...0i7i30k1j35i39k1j0i67k1j0i13k1j0i8i7i30k1.0pb1AQeIZkg").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("<li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">TCS</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=tcs+stock+quotes&oq=tcs+stock+quotes&gs_l=serp.3..0i30k1.125331.127926.0.130397.9.6.0.0.0.0.226.756.0j4j1.5.0....0...1c.1.64.serp..4.5.749...0i7i30k1j0i13k1j0i8i7i30k1j0i7i5i30k1j0i8i13i30k1j35i39k1j0i67k1.e_0HwM87veU").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("<li><a ><font face=\"WildWest\" size=\"6\" color=\"black\">INFOSYS</font><br></br>\n");
      out.write("             ");

   try
         {
         Document doc = Jsoup.connect("https://www.google.co.in/search?q=infosys+stock+quotes&oq=infosys+stock+&gs_l=serp.3.1.35i39k1l2j0i67k1j0i20k1j0l6.7825.8966.0.11864.6.6.0.0.0.0.185.532.0j3.3.0....0...1c.1.64.serp..3.3.529...0i22i30k1.dFPBEFJaQC0").get();
                     Elements elems= doc.select("div._FOc >span._Rnb.fmob_pr.fac-l");
                     for(Element e:elems)
                {
                  out.println(e.text());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }




      out.write("\n");
      out.write("</ul>\n");
      out.write("            \n");
      out.write("         </li>\n");
      out.write("\t\t\t\n");
      out.write("      </ul>\n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("</nav> \n");
      out.write("\n");
      out.write("    \n");
      out.write("      \n");
      out.write("<div id=\"left\" class=\"vertical-menu\" style=\"float:left;width:20%; height:3460px; background-color:#4ec926;\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("                \n");
      out.write("    <a class=\"active\"><button class=\"btn btn-primary\" style=\"position:relative;width:95%;margin-left:10px;height:100px;\">PERSONAL FINANCE ADVICE</button></a><br><br>\n");
      out.write("    <ul><button id=\"button-1\" onclick=\"insurance()\" style=\"position:relative;width:300px;height:60px;\">INSURANCE</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"fixedincome()\" style=\"position:relative;width:300px;height:60px;\">FIXED INCOME</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"mutualfunds()\" style=\"position:relative;width:300px;height:60px;\">MUTUAL FUNDS</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"tax()\" style=\"position:relative;width:300px;height:60px;\">TAX</ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"investing()\" style=\"position:relative;width:300px;height:60px;\">INVESTING</button></ul>\n");
      out.write("  \n");
      out.write("    <br><br>  \n");
      out.write("    <a class=\"active\"> <button class=\"btn btn-primary\" style=\"position:relative;width:95%;margin-left:10px;height:100px;\">NEWS SECTION</button></a><br><br>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"topnews()\" style=\"position:relative;width:300px;height:60px;\">TOP NEWS</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"latestnews()\" style=\"position:relative;width:300px;height:60px;\">LATEST NEWS</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"mostreadnews()\" style=\"position:relative;width:300px;height:60px;\">MOST READ NEWS</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"newsvideo()\" style=\"position:relative;width:300px;height:60px;\">NEWS VIDEOS</button></ul>\n");
      out.write("     \n");
      out.write("  <br><br>    \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write(" \n");
      out.write("  \n");
      out.write(" <a class=\"active\"><button class=\"btn btn-primary\" style=\"position:relative;width:95%;margin-left:10px;height:100px;\"> INDUSTRY NEWS</button></a><br><br>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"energy()\" style=\"position:relative;width:300px;height:60px;\">ENERGY</bitton></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"financial()\" style=\"position:relative;width:300px;height:60px;\">FINANCIAL</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"healthcare()\" style=\"position:relative;width:300px;height:60px;\">HEALTHCARE</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"informationtechnology()\" style=\"position:relative;width:300px;height:60px;\">INFORMATION TECHNOLOGY</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"telecomutilies()\" style=\"position:relative;width:300px;height:60px;\">TELECOM&UTILIIES</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"fmcg()\" style=\"position:relative;width:300px;height:60px;\">FMCG</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"realty()\" style=\"position:relative;width:300px;height:60px;\">REALTY</buttton></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"basicmaterials()\" style=\"position:relative;width:300px;height:60px;\">BASIC MATERIALS</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"consumerdurables()\" style=\"position:relative;width:300px;height:60px;\">CONSUMER DURABLES</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"industrials()\" style=\"position:relative;width:300px;height:60px;\">INDUSTRIALS</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"power()\" style=\"position:relative;width:300px;height:60px;\">POWER</button></ul>\n");
      out.write("  <ul><button id=\"button-1\" onclick=\"auto()\" style=\"position:relative;width:300px;height:60px;\">AUTO</button></ul>\n");
      out.write("  \n");
      out.write("  <br><br>\n");
      out.write("  \n");
      out.write("  <a class=\"active\"> <button id=\"button-1\" onclick=\"stockadvice()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">STOCK ADVICE</button></a>\n");
      out.write(" \n");
      out.write(" <a class=\"active\"><button id=\"button-1\" onclick=\"topcompanies()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\"> TOP COMPANIES IN INDIA</button></a>\n");
      out.write("\n");
      out.write("  \n");
      out.write(" <a class=\"active\"> <button id=\"button-1\" onclick=\"technology()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">TECHNOLOGY</button></a>\n");
      out.write("  <a class=\"active\"><button id=\"button-1\" onclick=\"property()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">PROPERTY</button></a>\n");
      out.write("  \n");
      out.write("  <a class=\"active\"><button id=\"button-1\" onclick=\"opinion()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">OPINION</button></a>\n");
      out.write("  \n");
      out.write("    <a class=\"active\"><button id=\"button-1\" onclick=\"startups()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">STARTUPS</button></a>\n");
      out.write("      <a class=\"active\"><button id=\"button-1\" onclick=\"commodities()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">COMMODITIES</button></a>\n");
      out.write("      <a class=\"active\"> <button id=\"button-1\" onclick=\"forum()\" style=\"position:relative;margin-left:15px;width:94%;height:75px;\">FORUM</button></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"middle\" class=\"all\" style=\"float:left;margin-right:0px;height:1000px;width:80%;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id = \"container\"  style = \"position:relative;margin-right:0px;width:100%;height:3450px;\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id =\"predict\" class=\"panel panel-info\" style=\"border-style:outset; position: relative;float:left;margin-left:50px; width:22%; height:300px;\">\n");
      out.write("        \n");
      out.write("        <div class = \"panel-heading\">\n");
      out.write("      \n");
      out.write("       STOCK PRICE PREDICTION TOOL\n");
      out.write("   \n");
      out.write("         </div>\n");
      out.write("\t\t\n");
      out.write("    \n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("        \n");
      out.write("            <button onclick=\"loadprediction()\" ><img src=\"prediction.jpg\" alt=\"PREDICTION IMAGE\"  id=\"prediction\" style=\"position:relative;width:230px;height:113px;\" ></img></button><br>\n");
      out.write("            <p1><font size=\"2\" face=\"WildWest\" color=\"black\"><input type=\"button\" id='predection' value='PREDICTION TOOL'/></font></p1>\n");
      out.write("        <input type=\"text\" id=\"mydiv\" readonly=\"\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("    \n");
      out.write("    <div id = \"middle\" class=\"panel panel-info\"  style = \"border-style:outset;position:relative;margin-left:40px;float:left; width:70%;height:300px;\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("     STOCK WATCHLIST<br>\n");
      out.write("   </div>\n");
      out.write("          \n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("      \n");
      out.write("                                          \n");
      out.write("                \n");
      out.write("     <button id=\"button-4\" style=\"position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;\">ADD STOCKS</button>\n");
      out.write("     <button id=\"button-5\" style=\"position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;\">REMOVE STOCKS</button>\n");
      out.write("     <button id=\"button-6\" style=\"position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;\">VIEW YOUR WATCHLIST</button>\n");
      out.write("     <button id=\"button-6\" style=\"position:relative;margin-left:10px;width:180px;height:178px;margin-top:10px;\">SET ALERT</button>\n");
      out.write("     <button id=\"button-6\" style=\"position:relative;margin-left:0px;width:180px;height:178px;margin-top:10px;\">NEWS FOR YOUR STOCKS</button>\n");
      out.write("\n");
      out.write("     <br/>\n");
      out.write("           \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("        <div id = \"right\" class=\"panel panel-info\" style = \"position: relative;margin-left:50px;margin-top:50px;border-style:outset;float:left; width:22%;height:300px;\">\n");
      out.write("        \n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("            \n");
      out.write("      TRADING\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <div class=\"panel-body\">\n");
      out.write("   \n");
      out.write("      <button id=\"button-14\" style=\"position:relative;margin-left:10px;width:120px;height:180px;\">BUY STOCKS</button>\n");
      out.write("      <button id=\"button-14\" style=\"position:relative;margin-left:10px;width:120px;height:180px;\">SELL STOCKS</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id =\"left\" class=\"panel panel-info\" style = \"position:relative;border-style:outset;margin-left:40px;margin-top:50px;float:left; width:70%; height:300px;\">\n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("      MARKET\n");
      out.write("   </div><br>\n");
      out.write("   \n");
      out.write("   <div class=\"panel-body\">\n");
      out.write("      <button onclick=\"loadtopgainer()\" id=\"button-2\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">BSE TOP GAINERS</button>\n");
      out.write("     <button id=\"button-3\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">BSE TOP LOSERS</button>\n");
      out.write("     <button id=\"button-3\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">NSE TOP GAINER</button>\n");
      out.write("     <button id=\"button-3\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">NSE TOP LOSERS</button>\n");
      out.write("   <button id=\"button-3\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">WORLD INDICES</button>\n");
      out.write("   <button id=\"button-3\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">TOP MUTUAL FUNDS</button>\n");
      out.write("   <button id=\"button-3\" href=\"#\"style=\"position:relative;margin-left:10px;width:120px;height:180px;\">MOST ACTIVE STOCKS</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <div id = \"right\" class=\"panel panel-info\"  style = \"position:relative;border-style:outset;margin-left:40px;float:left; width:97%;margin-top:50px;height:300px;\">\n");
      out.write("        \n");
      out.write("        <div class=\"panel-heading\"> \n");
      out.write("      PORTFOLIO MANAGEMENT<br>\n");
      out.write("   \n");
      out.write("     </div>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("<button id=\"button-11\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">ADD MUTUAL FUNDS</button>\n");
      out.write("<button id=\"button-12\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">REMOVE MUTUAL FUNDS</button>\n");
      out.write("<button id=\"button-13\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">BUY MUTUAL FUNDS</button>\n");
      out.write("<button id=\"button-13\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">SELL MUTUAL FUNDS</button>\n");
      out.write("<button id=\"button-11\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">ADD ULIPS</button>\n");
      out.write("<button id=\"button-12\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">SELL ULIPS</button>\n");
      out.write("<button id=\"button-13\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">BUY ULIPS</button>\n");
      out.write("<button id=\"button-13\" style=\"position:relative;margin-left:10px;width:150px;height:180px;\">SELL ULIPS</button>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <div id = \"middle\" class=\"panel panel-info\" style = \"background-color:#9999ff;position:relative;margin-left:50px;margin-top:50px;border-style:outset;float:left; width:94%;height:2400px;\">\n");
      out.write("        \n");
      out.write("        <div class=\"panel-heading\">\n");
      out.write("       TRENDING STOCK MARKET NEWS<br>\n");
      out.write("        </div><br>\n");
      out.write("        <div class=\"panel-body\">\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

   try
         {
         Document doc = Jsoup.connect("http://www.moneycontrol.com/news/news-all.html").get();
                     Elements elems= doc.select("div.fleft >ul >li >a >img");
                     

                      
           
         
    
                for(Element ll :elems)
                {
                   String txt=ll.attr("src");
                   String title=ll.attr("alt");


                   
                   
                  
                   out.write("<img src='"+txt+"' style='width:245px; height:90px;'>");
                   out.write("<font color=red size=6 face=WildWest>"+title+"</font>");
                 out.write("<br>");
                

               out.println(ll.html()); 
                
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

 


      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write(" <div id=\"container\" style=\"border-style:ridge;position:relative;margin-top:3470px;width:100%;background-color:#eee;height:300px;\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("       <form action=\"newsletter.jsp\">\n");
      out.write("             <label for = \"tag\"> </label>\n");
      out.write("             <input name=\"comp\" placeholder=\"enter your email to subscribe \" style=\"margin-top:100px;margin-left:200px;width:500px;height:50px;margin-right:10px;\" type=\"text\"> <br>\n");
      out.write("             <button id=\"button-1\" style=\"position:relative;width:160px;height:40px;margin-left:750px;\" type=\"submit\">SUBMIT</button>\n");
      out.write("              </form>\n");
      out.write("    \n");
      out.write("     <a href=\"#\"><button class=\"btn btn-danger\"style=\"position:relative;margin-left:1650px;width:100px;margin-top:-80px;\">TOP</button><a>\n");
      out.write("             <button id=\"button-1\" onclick=\"aboutme()\" style=\"position:relative;margin-top:-200px;\"><img src=\"picture.jpg\"style=\"width:300px;height:270px;\"></img></button>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write(" \n");
      out.write("\t\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
