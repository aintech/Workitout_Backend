package com.workitout.config;

import com.workitout.service.ExerciseService;
import com.workitout.service.MediaService;
import com.workitout.service.RoundService;
import com.workitout.service.WorkoutHistoryService;
import com.workitout.service.WorkoutPlanService;
import com.workitout.service.WorkoutPlanToBindingService;
import com.workitout.service.WorkoutScheduleService;
import com.workitout.service.WorkoutService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ExerciseService exerciseService() {
        return new ExerciseService();
    }

    @Bean
    public MediaService mediaService() {
        return new MediaService();
    }

    @Bean
    public RoundService roundService() {
        return new RoundService();
    }

    @Bean
    public WorkoutHistoryService workoutHistoryService() {
        return new WorkoutHistoryService();
    }

    @Bean
    public WorkoutService workoutService() {
        return new WorkoutService();
    }

    @Bean
    public WorkoutPlanService workoutPlanService() {
        return new WorkoutPlanService();
    }

    @Bean
    public WorkoutPlanToBindingService workoutPlanToBindingService() {
        return new WorkoutPlanToBindingService();
    }

    @Bean
    public WorkoutScheduleService workoutScheduleService() {
        return new WorkoutScheduleService();
    }
}
