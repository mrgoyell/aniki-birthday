/**
 * 
 */
package life.goyell.akshit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author mrgoyell
 *
 */

@Configuration
public class JspConfig {
    @Value("${spring.view.prefix}")
    private String prefix;

    @Value("${spring.view.suffix}")
    private String suffix;

    @Value("${spring.view.view-names}")
    private String viewNames;

    @Bean
    InternalResourceViewResolver jspViewResolver() {
        final InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(prefix);
        viewResolver.setSuffix(suffix);
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setViewNames(viewNames);
        return viewResolver;
    }
}
