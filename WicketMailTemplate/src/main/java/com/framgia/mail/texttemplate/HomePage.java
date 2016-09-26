package com.framgia.mail.texttemplate;

import java.util.HashMap;
import java.util.Map;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.template.PackageTextTemplate;

public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {

        Map<String, Object> variables = new HashMap<>();
        variables.put("name", "Viblo");
        variables.put("downloadLink", "https://viblo.asia/");

        PackageTextTemplate template = new PackageTextTemplate(HomePage.class, "mail-template.tmpl");
        CharSequence templateHtml = template.asString(variables);
        System.out.println(templateHtml.toString());

        add(new Label("message", templateHtml.toString()));

    }
}
