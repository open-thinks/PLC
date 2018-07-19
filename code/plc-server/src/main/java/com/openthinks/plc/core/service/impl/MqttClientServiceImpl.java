/**
 * 
 */
package com.openthinks.plc.core.service.impl;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.openthinks.plc.core.service.MqttClientService;

/**
 * @author dailey
 *
 */
public class MqttClientServiceImpl implements MqttClientService, MqttCallback {

  private final static String broker = "tcp://127.0.0.1:11883";
  private final static String clientId = "inner-mqtt-tcp-client";
  private final static int keepAliveInterval = 600;
  //
  private final static String VEHICLE_TRACK_UPDATE = "bosch/vehicle/track";
  //
  MemoryPersistence persistence = new MemoryPersistence();
  MqttClient mqttClient;

  /**
   * 
   */
  public MqttClientServiceImpl() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.openthinks.plc.core.service.MqttClientService#start()
   */
  @Override
  public void start() throws MqttException {
    if (mqttClient != null && mqttClient.isConnected()) {
      mqttClient.disconnect();
    }
    mqttClient = null;
    mqttClient = new MqttClient(broker, clientId, persistence);
    MqttConnectOptions connOpts = new MqttConnectOptions();
    connOpts.setCleanSession(true);
    connOpts.setKeepAliveInterval(keepAliveInterval);
    mqttClient.setCallback(this);
    mqttClient.connect(connOpts);
    mqttClient.subscribe(VEHICLE_TRACK_UPDATE);


  }

  /*
   * (non-Javadoc)
   * 
   * @see com.openthinks.plc.core.service.MqttClientService#stop()
   */
  @Override
  public void stop() throws MqttException {
    if (mqttClient != null && mqttClient.isConnected()) {
      mqttClient.disconnect();
    }
    mqttClient = null;
  }

  @Override
  public void connectionLost(Throwable cause) {

  }

  @Override
  public void messageArrived(String topic, MqttMessage message) throws Exception {


  }

  @Override
  public void deliveryComplete(IMqttDeliveryToken token) {

  }

}
