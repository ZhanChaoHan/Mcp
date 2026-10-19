package com.jachs.langchain4j_mcp;

import java.util.List;

import com.jachs.langchain4j_mcp.tools.CalculatorTool;

import dev.langchain4j.community.mcp.server.McpServer;
import dev.langchain4j.community.mcp.server.transport.StdioMcpServerTransport;
import dev.langchain4j.mcp.protocol.McpImplementation;

/***
 * @author zhanchaohan
 */
public class App {
	
	
    public static void main( String[] args ) throws Exception    {
    	 	 McpImplementation serverInfo = new McpImplementation();
         serverInfo.setName("my-java-mcp-server");
         serverInfo.setVersion("1.0.0");

         McpServer server = new McpServer(List.of(new CalculatorTool()), serverInfo);
         new StdioMcpServerTransport(System.in, System.out, server);

         // Keep the process alive while stdio is open
         Thread.currentThread().join();
    }
}
