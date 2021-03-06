package org.learning.app.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;


/**
 * This configuration is used to enable multithreading scheduling
 */
@Configuration
@EnableScheduling
public class SchedulerConfig implements SchedulingConfigurer {
  private final int size = 10;

  @Override
  public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
    ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
    threadPoolTaskScheduler.setPoolSize(size);
    threadPoolTaskScheduler.setThreadNamePrefix("my-scheduled-task-pool-");
    threadPoolTaskScheduler.initialize();
    scheduledTaskRegistrar.setTaskScheduler(threadPoolTaskScheduler);
    //threadPoolTaskScheduler.scheduleAtFixedRate(new RunnableTask("Specific time, 3 Seconds from now"),1000);
  }
}
