package org.example.core.factory;

import org.example.core.processor.AbstractProcessor;
import org.example.core.processor.BilibiliLiveProcessor;
import org.example.core.processor.DouyuRecordProcessor;
import org.example.pojo.download.LoadBarrageConfig;
import org.example.pojo.download.assign.BilibiliLiveLoadBarrageConfig;
import org.example.pojo.download.assign.DouyuRecordLoadBarrageConfig;
import org.example.utils.CreeperConfig;

/**
 * 处理器工厂
 *
 * @author 燧枫
 * @date 2023/4/23 21:28
 */
public class ProcessorFactory {

    private final String bi_userAgent = CreeperConfig.getProperty("dy.userAgent");
    private final int bi_retryTimes = CreeperConfig.getIntProperty("dy.retryTimes");
    private final int bi_retrySleepTime = CreeperConfig.getIntProperty("dy.retrySleepTime");
    private final int bi_sleepTime = CreeperConfig.getIntProperty("dy.sleepTime");

    private final String dy_userAgent = CreeperConfig.getProperty("bi.userAgent");
    private final int dy_retryTimes = CreeperConfig.getIntProperty("bi.retryTimes");
    private final int dy_retrySleepTime = CreeperConfig.getIntProperty("bi.retrySleepTime");
    private final int dy_sleepTime = CreeperConfig.getIntProperty("bi.sleepTime");

    /**
     * 通过配置信息来获取一个处理器
     *
     * @param loadBarrageConfig
     * @return AbstractProcessor
     */
    public AbstractProcessor getProcessor(LoadBarrageConfig loadBarrageConfig) {

        if (loadBarrageConfig == null) {
            return null;
        }

        // 斗鱼录播
        if (loadBarrageConfig instanceof DouyuRecordLoadBarrageConfig) {
            return new DouyuRecordProcessor((DouyuRecordLoadBarrageConfig) loadBarrageConfig, dy_retryTimes,
                    dy_retrySleepTime, dy_userAgent, dy_sleepTime);
        }
        // B站直播
        else if (loadBarrageConfig instanceof BilibiliLiveLoadBarrageConfig) {
            return new BilibiliLiveProcessor((BilibiliLiveLoadBarrageConfig) loadBarrageConfig, bi_retryTimes,
                    bi_retrySleepTime, bi_userAgent, bi_sleepTime);
        }

        return null;
    }
}
