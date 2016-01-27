package org.mondo.collaboration.security.lens.offline.daemon.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LocalityFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// do nothing
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if ("127.0.0.1".equals(request.getRemoteAddr())) {
			chain.doFilter(request, response);
		} else {
			// block request processing
		}
	}

	@Override
	public void destroy() {
		// do nothing
	}

}
