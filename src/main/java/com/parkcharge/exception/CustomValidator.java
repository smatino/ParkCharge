package com.parkcharge.exception;

import net.sf.oval.Validator;
import net.sf.oval.expression.ExpressionLanguage;

import javax.annotation.PostConstruct;

/**
 * Created on 24.09.15.
 */
public class CustomValidator extends Validator {

    private String scriptName;

    private ExpressionLanguage expressionLanguage;

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public void setExpressionLanguage(ExpressionLanguage expressionLanguage) {
        this.expressionLanguage = expressionLanguage;
    }

    @PostConstruct
    private void init() {
        this.getExpressionLanguageRegistry().registerExpressionLanguage(scriptName, expressionLanguage);
    }
}
