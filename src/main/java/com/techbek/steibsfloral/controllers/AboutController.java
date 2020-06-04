package com.techbek.steibsfloral.controllers;

import com.techbek.steibsfloral.config.page.AboutPageProperties;
import com.techbek.steibsfloral.config.page.IPageProperties;
import com.techbek.steibsfloral.config.page.ModelPageAttributes;
import com.techbek.steibsfloral.service.EmailSender;
import com.techbek.steibsfloral.domain.ContactDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
@RequiredArgsConstructor
@Slf4j
public class AboutController {

    final AboutPageProperties pageProperties;
    final EmailSender emailSender;
    @GetMapping("")
    public String getAboutPage(Model model){
        ModelPageAttributes.addAttributes(model, pageProperties);
        model.addAttribute("contactForm", new ContactDto());
        return "about/index";
    }

    @GetMapping("team")
    public String getTeamPage(Model model){
        String title = "Team";
        String navCrumbTop = "Meet Our Professionals";
        String navCrumbDown = "Steibs Team";
        ModelPageAttributes.addAttributes(model, addPageProperties(pageProperties, title, navCrumbTop.toUpperCase(), navCrumbDown));
        return "about/team/index";
    }

    @GetMapping("contact")
    public String getContactPage(Model model){
        String title = "Contact";
        String navCrumbTop = "where to find us";
        String navCrumbDown = "contact us";
        ModelPageAttributes.addAttributes(model, addPageProperties(pageProperties, title, navCrumbTop.toUpperCase(), navCrumbDown.toUpperCase()));
        model.addAttribute("contactForm", new ContactDto());
        return "about/contact/index";
    }

    @PostMapping("contact")
    public String submitContactForm(@ModelAttribute("contact") ContactDto contactDto, Model model){
        log.info(contactDto.toString());
        emailSender.sendContactForm(contactDto);

        return "redirect:/about/contact/success";
    }

    @GetMapping("contact/success")
    public String returnSuccessSubmitPage(Model model){
        model.addAttribute("submitSuccess", "Your Form was Submitted Successfully");
        model.addAttribute("pageTitle", "Contact Form Submission");
        return "about/contact/submit";
    }

    @GetMapping("history")
    public String getHistoryPage(Model model){
        String title = "History";
        String navCrumbTop = "get to know us";
        String navCrumbDown = "Our History";
        ModelPageAttributes.addAttributes(model, addPageProperties(pageProperties, title, navCrumbTop.toUpperCase(), navCrumbDown));

        return "about/history/index";
    }

    @GetMapping("location")
    public String getLocationPage(Model model){
        String title = "Location";
        String navCrumbTop = "where to find us";
        String navCrumbDown = "Office Locations";
        ModelPageAttributes.addAttributes(model, addPageProperties(pageProperties, title, navCrumbTop.toUpperCase(), navCrumbDown));

        return "about/location/index";
    }

    @GetMapping("get-quote")
    public String getQuotePage(Model model){
        String title = "Get Quote";
        String navCrumbTop = "cost calculator";
        String navCrumbDown = title;
        ModelPageAttributes.addAttributes(model, addPageProperties(pageProperties, title, navCrumbTop.toUpperCase(), navCrumbDown.toUpperCase()));

        return "about/quote/index";
    }

    @GetMapping("testimonials")
    public String getTestimonialPage(Model model){
        String title = "Testimonials";
        String navCrumbTop = "what they say about us";
        String navCrumbDown = title;
        ModelPageAttributes.addAttributes(model, addPageProperties(pageProperties, title, navCrumbTop.toUpperCase(), navCrumbDown.toUpperCase()));

        return "about/testimonials/index";
    }

    private IPageProperties addPageProperties(AboutPageProperties pageProperties, String title, String navCrumbTop, String navCrumbDown){
        pageProperties.setTitle(title);
        pageProperties.setNavCrumbDown(navCrumbDown);
        pageProperties.setNavCrumbTop(navCrumbTop);
        return pageProperties;
    }
}
