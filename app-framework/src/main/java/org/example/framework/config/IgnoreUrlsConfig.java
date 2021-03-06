package org.example.framework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * 匿名url配置
 * Created by myy on 2021/8/26.
 */

@ConfigurationProperties(prefix = "auth.ignored")
public class IgnoreUrlsConfig {

    // 匿名url
    public static List<String> urls = new ArrayList<>();


    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        IgnoreUrlsConfig.urls = urls;
    }
}
