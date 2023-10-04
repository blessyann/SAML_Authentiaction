/* step1: - Using Spring initializer generate a project with dependencies Spring Web, Spring Security, and Thymleaf
  Step 2: -open the project in Netbeans, make sure the Maven and Java vesions locally are same in spring initializer versions..
  Step3: -Add HomeController.java in the path src/main/java/"package name added in spring initializer"/HomeController.java */

package Saml_com.example.Saml_demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.saml2.provider.service.authentication.Saml2AuthenticatedPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(@AuthenticationPrincipal Saml2AuthenticatedPrincipal principal, Model model) {
        model.addAttribute("name", principal.getName());
        model.addAttribute("emailAddress", principal.getFirstAttribute("email"));
        model.addAttribute("userAttributes", principal.getAttributes());
        return "home";
    }

}
