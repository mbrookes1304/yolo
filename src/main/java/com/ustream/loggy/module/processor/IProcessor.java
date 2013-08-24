package com.ustream.loggy.module.processor;

import com.ustream.loggy.config.ConfigException;
import com.ustream.loggy.module.IModule;

import java.util.List;
import java.util.Map;

/**
 * @author bandesz <bandesz@ustream.tv>
 */
public interface IProcessor extends IModule
{

    public void validateProcessorParams(List<String> parserParams, Map<String, Object> params) throws ConfigException;

    public void process(Map<String, String> parserParams, Map<String, Object> processorParams);

}