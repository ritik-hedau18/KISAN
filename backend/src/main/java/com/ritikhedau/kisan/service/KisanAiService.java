package com.ritikhedau.kisan.service;
import org.springframework.stereotype.Service;

@Service
public class KisanAiService {
    public String performAction(String action) {
        return "Action '" + action + "' processed successfully in KisanAiService.";
    }
}