package com.jachs.mcp_server.tools.entity;

import org.springframework.ai.mcp.annotation.McpToolParam;


/***
 * @author zhanchaohan
 */
public record  People (
	 @McpToolParam(description = "用户名称") String userName,
	 @McpToolParam(description = "用户年龄") Integer userAge
){}
