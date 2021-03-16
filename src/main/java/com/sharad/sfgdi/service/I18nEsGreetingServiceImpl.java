package com.sharad.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nGreetingServiceImpl")
public class I18nEsGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hole -- ES -- I18N";
    }
}
