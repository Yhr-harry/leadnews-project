package com.heima.schedule.service;

import com.heima.model.schedule.dtos.Task;

public interface TaskService {
    public long addTask(Task task);

    public boolean cancelTask(long taskId);

    public Task poll(int type, int priority);
}
