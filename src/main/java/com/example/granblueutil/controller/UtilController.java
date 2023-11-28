package com.example.granblueutil.controller;
//
//import com.example.granblueutil.dto.GptSessionDto;
//import com.example.granblueutil.dto.CommonResult;
//import com.example.granblueutil.param.ChatParam;
//import com.example.granblueutil.service.GptService;
//import com.example.granblueutil.util.CommonUtil;
import com.alibaba.fastjson.JSONObject;
import com.example.granblueutil.bean.MsgBusDto;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("api/util")
public class UtilController {

}
