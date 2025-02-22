package com.example.products.InfrastructureLayer;


import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.listener.ContainerProperties;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;

import com.example.products.ApplicationLayer.DTO.in.CreateProductDTO;
import com.example.products.ApplicationLayer.DTO.in.ProductDTO;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.kafka.common.serialization.ByteArraySerializer;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.core.ConsumerFactory;

@Component
public class KafkaConfiguration {

    // @Value("${spring.kafka.payment.bootstrap-servers}")
    // private String bootstrapServers;

    // @Bean
    // public ProducerFactory<String, CreateProductDTO> requestCreateProductFactory() {
    //     Map<String, Object> props = new HashMap<>();
    //     props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    //     props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    //     props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
    //     return new DefaultKafkaProducerFactory<>(props);
    // }

    // @Bean
    // public KafkaTemplate<String, CreateProductDTO> requestCreateProductKafkaTemplate() {
    //     return new KafkaTemplate<>(requestCreateProductFactory());
    // }


    // @Bean
    // public ConsumerFactory<String, CreateProductDTO> responceCreateProductFactory() {
    //     Map<String, Object> props = new HashMap<>();
    //     props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    //     props.put(ConsumerConfig.CLIENT_ID_CONFIG, UUID.randomUUID().toString());
    //     props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    //     props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
    //     props.put(JsonDeserializer.VALUE_DEFAULT_TYPE, CreateProductDTO.class.getName());
    //     props.put(JsonDeserializer.USE_TYPE_INFO_HEADERS, false);
    //     props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
    //     props.put(JsonDeserializer.TRUSTED_PACKAGES, "*");

    //     return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(),
    //             new JsonDeserializer<>( CreateProductDTO.class));
    // }

    // @Bean("CreateProduct")
    // public ConcurrentKafkaListenerContainerFactory<String,  CreateProductDTO> responceCreateProductKafkaListenerContainerFactory() {
    //     ConcurrentKafkaListenerContainerFactory<String, CreateProductDTO> factory = new ConcurrentKafkaListenerContainerFactory<>();
    //     factory.setConsumerFactory(responceCreateProductFactory());
    //     factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
    //     return factory;
    // }


    // //получаем продукт по типу 
  
    // @Bean
    // public ProducerFactory<String, List<ProductDTO>> responceTakeProductByTypeFactory() {
    //     Map<String, Object> props = new HashMap<>();
    //     props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    //     props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    //     props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
    //     return new DefaultKafkaProducerFactory<>(props);
    // }


    // @Bean
    // public KafkaTemplate<String, List<ProductDTO>> responceTakeProductByTypeKafkaTemplate() {
    //     return new KafkaTemplate<>(responceTakeProductByTypeFactory());
    // }

    // @Bean
    // public ConsumerFactory<String, String> requestOrderTakeProductByTypeConsumerFactory() {
    //     Map<String, Object> props = new HashMap<>();
    //     props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    //     props.put(ConsumerConfig.CLIENT_ID_CONFIG, UUID.randomUUID().toString());
    //     props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
    //     props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName()); 
    //     props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);

    //     return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), new StringDeserializer());
    // }

    // @Bean("GetProductByTypeContainerFactory")
    // public ConcurrentKafkaListenerContainerFactory<String, String> requestTakeProductByTypeKafkaListenerContainerFactory() {
    //     ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
    //     factory.setConsumerFactory(requestOrderTakeProductByTypeConsumerFactory());
    //     factory.getContainerProperties().setAckMode(ContainerProperties.AckMode.MANUAL_IMMEDIATE);
    //     return factory;
    // }



}
