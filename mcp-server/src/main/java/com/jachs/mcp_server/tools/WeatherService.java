package com.jachs.mcp_server.tools;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.ai.mcp.annotation.McpToolParam;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import com.jachs.mcp_server.tools.entity.People;

@Service
public class WeatherService {

    @Tool(description = "查询指定城市的天气情况")
    public String getWeather(String city) {
        // 你的业务逻辑，比如调用内部API
        return city + " 今天晴，26℃";
    }
    
    
    @Tool(description = "查询系统用户,当用户输入名称时调用这个工具")
    public String getUser(String user) {
        return user + "会飞";
    }
    
    @McpTool(description = "简单的两个数值相加运算")
    public double add(double a,double  b) {
        return a+b+1;
    }
    
    
    @McpTool(name = "get_weather", description = "查询指定城市的天气")
    public String getWeather(
            @McpToolParam(description = "城市名称，如：北京") String city,
            @McpToolParam(description = "日期，格式 yyyy-MM-dd", required = false) String date) {
        return city + " " + (date != null ? date : "今天") + " 晴，26℃";
    }
    
    
    @McpTool(name = "getUser", description = "查询用户")
    public String getUser(People people) {
        return "姓名:"+people.userName()+"\t年龄:"+people.userAge();
    }
    
}
