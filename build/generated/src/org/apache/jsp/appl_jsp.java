package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.BufferedReader;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Document;;
import org.jsoup.nodes.Element;;
import org.jsoup.select.Elements;;
import org.jsoup.nodes.Document;;
import org.jsoup.nodes.Element;;
import org.jsoup.select.Elements;;
import java.io.FileReader;

public final class appl_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html ng-app=\"AngularChartExample\">\n");
      out.write("\n");
      out.write("   <head>\n");
      out.write("      <title>The jQuery Example</title>\n");
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
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("   \n");
      out.write("  \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("         $(function() {\n");
      out.write("            var menu1 = $(\"#menu-4\").menu();\n");
      out.write("            $( \"#menu-4\" ).menu(\n");
      out.write("               \"focus\", null, $( \"#menu-4\" ).menu().find( \".ui-menu-item:last\" ));\n");
      out.write("            $(menu1).mouseleave(function () {\n");
      out.write("               menu1.menu('collapseAll');\n");
      out.write("            });\n");
      out.write("         });\n");
      out.write("      </script>  \n");
      out.write("      <script>\n");
      out.write("         $(function() {\n");
      out.write("            var menu2 = $(\"#menu-5\").menu();\n");
      out.write("            $( \"#menu-5\" ).menu(\n");
      out.write("               \"focus\", null, $( \"#menu-5\" ).menu().find( \".ui-menu-item:last\" ));\n");
      out.write("            $(menu2).mouseleave(function () {\n");
      out.write("               menu2.menu('collapseAll');\n");
      out.write("            });\n");
      out.write("         });\n");
      out.write("      </script>  \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("         $(function() {\n");
      out.write("            var menu3 = $(\"#menu-6\").menu();\n");
      out.write("            $( \"#menu-6\" ).menu(\n");
      out.write("               \"focus\", null, $( \"#menu-6\" ).menu().find( \".ui-menu-item:last\" ));\n");
      out.write("            $(menu3).mouseleave(function () {\n");
      out.write("               menu3.menu('collapseAll');\n");
      out.write("            });\n");
      out.write("         });\n");
      out.write("      </script>  \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("         $(function() {\n");
      out.write("            var menu4 = $(\"#menu-7\").menu();\n");
      out.write("            $( \"#menu-7\" ).menu(\n");
      out.write("               \"focus\", null, $( \"#menu-7\" ).menu().find( \".ui-menu-item:last\" ));\n");
      out.write("            $(menu4).mouseleave(function () {\n");
      out.write("               menu4.menu('collapseAll');\n");
      out.write("            });\n");
      out.write("         });\n");
      out.write("      </script>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("       \n");
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
      out.write("    \n");
      out.write("      \n");
      out.write("<script>\n");
      out.write("function loans() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState===4&&this.status===200) {\n");
      out.write("      document.getElementById(\"container\").innerHTML =\n");
      out.write("      this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"loans.jsp\", true);\n");
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
      out.write("            \n");
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
      out.write("    width: 200px; \n");
      out.write("}\n");
      out.write("\n");
      out.write(".vertical-menu a {\n");
      out.write("    background-color:#eee;\n");
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
      out.write("     <nav id=\"rcorner1\" class = \"navbar navbar-default navbar-fixed-top\" role = \"navigation\">\n");
      out.write("   \n");
      out.write("   <div class = \"navbar-header\">\n");
      out.write("      <img style=\"border:0px solid red; height:46px; width:120px\" src=\"stock.png\" />\n");
      out.write("             <p class = \"navbar-brand\"><font face=\"arial\" size=\"6\" color=\"black\">DSTREET</font></p>\n");
      out.write("\n");
      out.write("      \n");
      out.write("              \n");
      out.write("               ");

     String name=(String)session.getAttribute("user");
   out.println("<font color=yellow size=6 face=WildWest>Welcome  "+name+"</font>");
           
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("      \n");
      out.write("      \n");
      out.write("   </div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("      <ul style=\"position:relative;margin-left:0px;\"class = \"nav navbar-nav navbar-middle\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          <div class = \"ui-widget\" style=\"width:1000px;\">\n");
      out.write("              <form action=\"quotes.jsp\">\n");
      out.write("             <label for = \"tag\"> <button class=\"btn btn-warning\" style=\"position:relative;width:200px;height:50px;\">STOCK QUOTES </button></label>\n");
      out.write("             \n");
      out.write("             <input name=\"comp\" placeholder=\"search stock quotes of differentcompanies \" style=\"position:relative;width:600px;height:50px;\" type=\"text\" id= \"tag\"> <button class=\"btn btn-info\" style=\"position:relative;width:160px;height:40px;\" type=\"submit\">SEARCH</button>\n");
      out.write("            \n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("             \n");
      out.write("      </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("      </ul>\n");
      out.write("                                    \n");
      out.write("           <ul >\n");
      out.write("           \n");
      out.write("               <a href=\"watchlist2.jsp\"><button class=\"btn btn-danger\" style=\"position:relative;width:160px;height:40px;margin-top:5px;\">HOME PAGE</button></a>\n");
      out.write("              \n");
      out.write("              </ul>\n");
      out.write("          \n");
      out.write("   \n");
      out.write("   \n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("      <br><br>\n");
      out.write("     <nav class = \"navbar navbar-default\" role = \"navigation\">\n");
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
      out.write("  \n");
      out.write("  <ul><button id=\"button-1\" onclick=\"loans()\" style=\"position:relative;width:300px;height:60px;\">LOANS</button></ul>\n");
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
      out.write("    \n");
      out.write("    \n");
      out.write("    <div ng-view></div>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.0.3/angular.js\"></script>\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"http://code.highcharts.com/highcharts.js\"></script>\n");
      out.write("    <script src=\"chart.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        function MainCtrl($scope, $http){\n");
      out.write("            var data = {\"xData\": [\"4/28/2017\", \"2017-04-25\", \"2017-04-20\", \"2017-04-22\", \"2017-04-19\", \"2017-04-16\",\"2017-04-13\", \"2017-04-10\", \"2017-04-7\"],\"yData\":[{\n");
      out.write("                \"name\": \"IBM\",\n");
      out.write("                \"data\":           [20987,       20915.509766, 20406.679688,             , 18.2        , 21.5        , 25.2       , 26.5        , 23.3 ]\n");
      out.write("            }]}\n");
      out.write("            \n");
      out.write("            $scope.lineChartYData=data.yData\n");
      out.write("            $scope.lineChartXData=data.xData\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("    angular.module('AngularChartExample',['AngularChart'], function( $routeProvider, $locationProvider ){\n");
      out.write("        $routeProvider.when('/',{\n");
      out.write("            template: '<chart title=\"GRAPH WITH 1 MONTH DATA AND OPENING PRICE\" xData=\"lineChartXData\" yData=\"lineChartYData\" xName=\"DATES\" yName=\"OPENING PRICE\" subtitle=\"\"></chart>',\n");
      out.write("            controller: MainCtrl\n");
      out.write("            })\n");
      out.write("    })\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("         \n");
      out.write("    \n");
      out.write("                  \n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("    \n");
      out.write("                  <center>\n");
      out.write("    ");

        
 out.write("<table border='1'>");
out.write("<tr>");
out.write("<th>CURRENT VALUE</th>");
out.write("<th>1 YEAR DATA</th>");

out.write("</tr>");
out.write("<tr>");
out.write("<td>");
try
   

         {
             
             
        Document doc = Jsoup.connect("https://in.finance.yahoo.com/quote/APPL?p=APPL").get();
                     Elements elems= doc.select("div#quote-summary");
                     for(Element e:elems)
                {
                  out.println(e.html());
                }
         }catch(IOException ex) {
            System.out.println(ex.toString());
        }

 
out.write("</td>");
   out.write("<td>");
   try{
  FileReader fr=new FileReader("E:\\aapl.csv");
  BufferedReader br=new BufferedReader(fr);
String i;
while((i=br.readLine())!=null)
{
   out.print(i);
   out.println("<br><br>");
}
   fr.close();
br.close();
   }catch(Exception ex){
       
       out.println(ex.toString());
   }
out.write("</td>");
out.write("</tr>");
out.write("</table>");
        
      out.write("\n");
      out.write("                  </center>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("                  <br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        \n");
      out.write("        \n");
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
