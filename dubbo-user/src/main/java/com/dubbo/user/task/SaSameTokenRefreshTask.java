package com.dubbo.user.task;

/**
 * @author yuke
 * @date 2025/2/15 14:40
 * @desc
 */
import cn.dev33.satoken.same.SaSameUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Same-Token，定时刷新
 */
@Configuration
public class SaSameTokenRefreshTask {
    // 从 0 分钟开始 每隔 5 分钟执行一次 Same-Token
    @Scheduled(cron = "0 0/1 * * * ? ")
    public void refreshToken(){
        System.out.println("Same-Token，定时刷新");
        SaSameUtil.refreshToken();
    }
}