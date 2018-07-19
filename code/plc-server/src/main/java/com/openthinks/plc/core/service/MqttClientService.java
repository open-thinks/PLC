/**
 * 
 */
package com.openthinks.plc.core.service;

import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * 负责进行mqtt消息的接受和处理
 * 
 * @author dailey
 *
 */
public interface MqttClientService {


  public void start() throws MqttException;

  public void stop() throws MqttException;

}
