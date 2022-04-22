package com.moma.test.filter;


import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import org.slf4j.MDC;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import java.io.IOException;

public class RequestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    // MDC.put("TraceId","1.2.3");
        if (StringUtils.hasLength(  TraceContext.traceId())
                &&TraceContext.traceId().contains(".")) {
            MDC.put("TraceId",TraceContext.traceId());
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        MDC.remove("TraceId");
        Filter.super.destroy();
    }

    public static void main(String[] args){
        String a="cccccc.cccccccc.1231231231231";

    }
}
