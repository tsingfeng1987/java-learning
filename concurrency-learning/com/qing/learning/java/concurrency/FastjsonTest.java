package com.qing.learning.java.concurrency;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.stream.Collectors;

/**
 * @author guoqf
 * @date 2022/3/10 13:28
 */
public class FastjsonTest {
    public static void main(String[] args) throws URISyntaxException {
//        String obj = "{\"clientInfo\":\"{\\\"businessAddress\\\":\\\"172.1.0.11\\\",\\\"clientAddress\\\":\\\"172.1.0.11\\\",\\\"clientCpuSerial\\\":\\\"BFEBFBFF000806EC\\\",\\\"clientMac\\\":\\\"02-50-f2-00-00-02\\\",\\\"serverAddress\\\":\\\"137.32.25.48\\\",\\\"serverPort\\\":\\\"8082\\\"}\",\"mainAcct\":\"{\\\"acctPosition\\\":\\\"7\\\",\\\"acctType\\\":\\\"99\\\",\\\"areaId\\\":0,\\\"authenRuleId\\\":10001,\\\"birthDate\\\":252432000000,\\\"contractExpireDate\\\":1293724800000,\\\"createMainAcctId\\\":10000,\\\"createTime\\\":1290608165000,\\\"defaultOrg\\\":0,\\\"education\\\":\\\"2\\\",\\\"effectTime\\\":1230739200000,\\\"email\\\":\\\"gengyue@asiainfo.com\\\",\\\"expireTime\\\":4100688000000,\\\"gender\\\":\\\"1\\\",\\\"joinDate\\\":1230739200000,\\\"lastLoginTime\\\":1646882508000,\\\"lastUpdateTime\\\":1645004372000,\\\"localMainAcctId\\\":10000,\\\"lockStatus\\\":\\\"0\\\",\\\"lockTime\\\":1290669060000,\\\"loginName\\\":\\\"admin\\\",\\\"loginPwd\\\":\\\"16|-18|-80|123|4|-79|94|-100|-84|22|-49|50|-1|-5|86|-64|89\\\",\\\"loginType\\\":1,\\\"mainAcctId\\\":10000,\\\"mobile\\\":\\\"13598054870\\\",\\\"name\\\":\\\"超级管理员\\\",\\\"netflag\\\":\\\"0\\\",\\\"oaEmail\\\":\\\"gengyue@asiainfo.com\\\",\\\"personStatus\\\":\\\"1\\\",\\\"provinceCode\\\":\\\"IT\\\",\\\"pwdAnswer\\\":\\\"ok\\\",\\\"pwdQuestion\\\":\\\"您的偶像\\\",\\\"pwdRuleId\\\":10000,\\\"pwdType\\\":\\\"0\\\",\\\"pwdUpdateTime\\\":1645004372000,\\\"pwdWrongTimes\\\":0,\\\"rank\\\":1,\\\"remark\\\":\\\"系统内置超级管理员\\\",\\\"staffType\\\":\\\"1\\\"}\"}";


        InputStream resourceAsStream = FastjsonTest.class.getResourceAsStream("fastjson.json");


        if (resourceAsStream != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(resourceAsStream));
            String collect = reader.lines().collect(Collectors.joining("\n"));
            System.out.println(JSONObject.parseObject(collect));
        }


    }
}
