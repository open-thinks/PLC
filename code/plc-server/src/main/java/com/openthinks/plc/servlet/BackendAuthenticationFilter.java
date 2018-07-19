package com.openthinks.plc.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.openthinks.plc.core.ApplicationConfiguration;

import net.sourceforge.springframework.SpringContext;

/**
 * @author dailey.yet@outlook.com
 *
 */
public class BackendAuthenticationFilter implements Filter {

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse,
   * javax.servlet.FilterChain)
   */
  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    filterChain.doFilter(servletRequest, servletResponse);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
   */
  @Override
  public void init(FilterConfig arg0) throws ServletException {
    String appROOT = arg0.getServletContext().getContextPath();
    ApplicationConfiguration appConf =
        SpringContext.getContext().getBean(ApplicationConfiguration.class);
    appConf.setAppRoot(appROOT);
  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.Filter#destroy()
   */
  @Override
  public void destroy() {

  }
}
