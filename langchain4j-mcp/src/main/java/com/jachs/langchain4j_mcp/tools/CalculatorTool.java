package com.jachs.langchain4j_mcp.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;

/***
 * @author zhanchaohan
 */
public class CalculatorTool {
	
	
	@Tool(name = "add",value = """
			简单计算加法
			""")
    long add(@P("a") long a, @P("b") long b) {
        return a + b;
    }
	
	@Tool(name = "china",value = """
			用户输入开头以“中国人”开头就调用这个方法。
			第一个参数是用户输入的前2个字符。
			第二个参数是用户输入的最后2个字符。
			""")
	String china(@P("a") String a, @P("b") String b) {
        return a +"中國人會飛："+ b;
    }
}
