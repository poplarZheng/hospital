package cn.yujian95.hospital.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuJian95  clj9509@163.com
 * @date 2020/3/12
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
@Component
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}
