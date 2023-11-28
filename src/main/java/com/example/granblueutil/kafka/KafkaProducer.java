//package com.example.granblueutil.kafka;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.SendResult;
//import org.springframework.stereotype.Service;
//import org.springframework.util.concurrent.ListenableFuture;
//
//@Slf4j
//@Service
////@Profile({"default", "other"})
//public class KafkaProducer {
//
//	@Value("${kafka.send.enable:true}")
//	private boolean kafkaSend;
//
//	@Autowired
//	@Qualifier("outerKafkaTemplate")
//	private KafkaTemplate<String, String> outerKafkaTemplate;
//
//	@Value("${kafka.send.content.show:true}")
//	private boolean showSendContent;
//
//	public boolean sendMessage(String message, String topic) {
//		if (!kafkaSend) {
//			if (showSendContent) {
//				log.info("sendMessage skip,msg:{}", message);
//			} else {
//				log.info("sendMessage skip, due to configuration kafka.send.content.show is false, msg content will not be shown");
//			}
//			return false;
//		}
//		if (showSendContent) {
//
//			log.info(String.format("sendMessage outer to topic -> %s,msg -> %s", topic, message));
//		} else {
//            log.info(String.format("sendMessage outer to topic -> %s, due to configuration kafka.send.content.show is false, msg content will not be shown",topic));
//		}
//		ListenableFuture<SendResult<String, String>> send = this.outerKafkaTemplate.send(topic, message);
//		if (send.isDone()) {
//			log.info("send message done");
//		}
//		return send.isDone();
//	}
//
//}
