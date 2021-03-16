package com.sharad.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingServiceImpl")
public class I18nEnGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello -- EN -- I18N";
    }
}
