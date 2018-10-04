/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-09-26 19:19:48 UTC)
 * on 2017-10-23 at 22:53:17 UTC 
 * Modify at your own risk.
 */

package com.cloudaware.cloudmine.appengine.model.cloudtasks.v2beta2;

/**
 * A unit of scheduled work.
 * <p>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Task {

    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if
     * Queue.app_engine_http_target is set.
     * <p>
     * An App Engine task is a task that has AppEngineHttpRequest set.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AppEngineHttpRequest appEngineHttpRequest;

    /**
     * Deprecated. Use Task.app_engine_http_request.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private AppEngineTaskTarget appEngineTaskTarget;

    /**
     * Output only.
     * <p>
     * The time that the task was created.
     * <p>
     * `create_time` will be truncated to the nearest second.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String createTime;

    /**
     * The task name.
     * <p>
     * The task name must have the following format:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * <p>
     * * `PROJECT_ID` can contain uppercase and lowercase letters,   numbers, hyphens, colons, and
     * periods; that is, it must match   the regular expression: `[a-zA-Z\\d-:\\.]+`. * `QUEUE_ID` can
     * contain uppercase and lowercase letters,   numbers, and hyphens; that is, it must match the
     * regular   expression: `[a-zA-Z\\d-]+`. The maximum length is 100   characters. * `TASK_ID`
     * contain uppercase and lowercase letters, numbers,   underscores, and hyphens; that is, it must
     * match the regular   expression: `[a-zA-Z\\d_-]+`. The maximum length is 500   characters.
     * <p>
     * Optionally caller-specified in CreateTaskRequest.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String name;

    /**
     * Pull message contains data that should be used by the caller of CloudTasks.PullTasks to process
     * the task. Can be set only if Queue.pull_target is set.
     * <p>
     * A pull task is a task that has PullMessage set.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PullMessage pullMessage;

    /**
     * Deprecated. Use Task.pull_message.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private PullTaskTarget pullTaskTarget;

    /**
     * The time when the task is scheduled to be attempted.
     * <p>
     * For pull queues, this is the time when the task is available to be leased; if a task is
     * currently leased, this is the time when the current lease expires, that is, the time that the
     * task was leased plus the PullTasksRequest.lease_duration.
     * <p>
     * For App Engine queues, this is when the task will be attempted or retried.
     * <p>
     * `schedule_time` will be truncated to the nearest microsecond.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String scheduleTime;

    /**
     * Output only.
     * <p>
     * Task status.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private TaskStatus taskStatus;

    /**
     * Output only.
     * <p>
     * The view specifies which subset of the Task has been returned.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private String view;

    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if
     * Queue.app_engine_http_target is set.
     * <p>
     * An App Engine task is a task that has AppEngineHttpRequest set.
     *
     * @return value or {@code null} for none
     */
    public AppEngineHttpRequest getAppEngineHttpRequest() {
        return appEngineHttpRequest;
    }

    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if
     * Queue.app_engine_http_target is set.
     * <p>
     * An App Engine task is a task that has AppEngineHttpRequest set.
     *
     * @param appEngineHttpRequest appEngineHttpRequest or {@code null} for none
     */
    public Task setAppEngineHttpRequest(AppEngineHttpRequest appEngineHttpRequest) {
        this.appEngineHttpRequest = appEngineHttpRequest;
        return this;
    }

    /**
     * Deprecated. Use Task.app_engine_http_request.
     *
     * @return value or {@code null} for none
     */
    public AppEngineTaskTarget getAppEngineTaskTarget() {
        return appEngineTaskTarget;
    }

    /**
     * Deprecated. Use Task.app_engine_http_request.
     *
     * @param appEngineTaskTarget appEngineTaskTarget or {@code null} for none
     */
    public Task setAppEngineTaskTarget(AppEngineTaskTarget appEngineTaskTarget) {
        this.appEngineTaskTarget = appEngineTaskTarget;
        return this;
    }

    /**
     * Output only.
     * <p>
     * The time that the task was created.
     * <p>
     * `create_time` will be truncated to the nearest second.
     *
     * @return value or {@code null} for none
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Output only.
     * <p>
     * The time that the task was created.
     * <p>
     * `create_time` will be truncated to the nearest second.
     *
     * @param createTime createTime or {@code null} for none
     */
    public Task setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * The task name.
     * <p>
     * The task name must have the following format:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * <p>
     * * `PROJECT_ID` can contain uppercase and lowercase letters,   numbers, hyphens, colons, and
     * periods; that is, it must match   the regular expression: `[a-zA-Z\\d-:\\.]+`. * `QUEUE_ID` can
     * contain uppercase and lowercase letters,   numbers, and hyphens; that is, it must match the
     * regular   expression: `[a-zA-Z\\d-]+`. The maximum length is 100   characters. * `TASK_ID`
     * contain uppercase and lowercase letters, numbers,   underscores, and hyphens; that is, it must
     * match the regular   expression: `[a-zA-Z\\d_-]+`. The maximum length is 500   characters.
     * <p>
     * Optionally caller-specified in CreateTaskRequest.
     *
     * @return value or {@code null} for none
     */
    public String getName() {
        return name;
    }

    /**
     * The task name.
     * <p>
     * The task name must have the following format:
     * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
     * <p>
     * * `PROJECT_ID` can contain uppercase and lowercase letters,   numbers, hyphens, colons, and
     * periods; that is, it must match   the regular expression: `[a-zA-Z\\d-:\\.]+`. * `QUEUE_ID` can
     * contain uppercase and lowercase letters,   numbers, and hyphens; that is, it must match the
     * regular   expression: `[a-zA-Z\\d-]+`. The maximum length is 100   characters. * `TASK_ID`
     * contain uppercase and lowercase letters, numbers,   underscores, and hyphens; that is, it must
     * match the regular   expression: `[a-zA-Z\\d_-]+`. The maximum length is 500   characters.
     * <p>
     * Optionally caller-specified in CreateTaskRequest.
     *
     * @param name name or {@code null} for none
     */
    public Task setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Pull message contains data that should be used by the caller of CloudTasks.PullTasks to process
     * the task. Can be set only if Queue.pull_target is set.
     * <p>
     * A pull task is a task that has PullMessage set.
     *
     * @return value or {@code null} for none
     */
    public PullMessage getPullMessage() {
        return pullMessage;
    }

    /**
     * Pull message contains data that should be used by the caller of CloudTasks.PullTasks to process
     * the task. Can be set only if Queue.pull_target is set.
     * <p>
     * A pull task is a task that has PullMessage set.
     *
     * @param pullMessage pullMessage or {@code null} for none
     */
    public Task setPullMessage(PullMessage pullMessage) {
        this.pullMessage = pullMessage;
        return this;
    }

    /**
     * Deprecated. Use Task.pull_message.
     *
     * @return value or {@code null} for none
     */
    public PullTaskTarget getPullTaskTarget() {
        return pullTaskTarget;
    }

    /**
     * Deprecated. Use Task.pull_message.
     *
     * @param pullTaskTarget pullTaskTarget or {@code null} for none
     */
    public Task setPullTaskTarget(PullTaskTarget pullTaskTarget) {
        this.pullTaskTarget = pullTaskTarget;
        return this;
    }

    /**
     * The time when the task is scheduled to be attempted.
     * <p>
     * For pull queues, this is the time when the task is available to be leased; if a task is
     * currently leased, this is the time when the current lease expires, that is, the time that the
     * task was leased plus the PullTasksRequest.lease_duration.
     * <p>
     * For App Engine queues, this is when the task will be attempted or retried.
     * <p>
     * `schedule_time` will be truncated to the nearest microsecond.
     *
     * @return value or {@code null} for none
     */
    public String getScheduleTime() {
        return scheduleTime;
    }

    /**
     * The time when the task is scheduled to be attempted.
     * <p>
     * For pull queues, this is the time when the task is available to be leased; if a task is
     * currently leased, this is the time when the current lease expires, that is, the time that the
     * task was leased plus the PullTasksRequest.lease_duration.
     * <p>
     * For App Engine queues, this is when the task will be attempted or retried.
     * <p>
     * `schedule_time` will be truncated to the nearest microsecond.
     *
     * @param scheduleTime scheduleTime or {@code null} for none
     */
    public Task setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }

    /**
     * Output only.
     * <p>
     * Task status.
     *
     * @return value or {@code null} for none
     */
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    /**
     * Output only.
     * <p>
     * Task status.
     *
     * @param taskStatus taskStatus or {@code null} for none
     */
    public Task setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * Output only.
     * <p>
     * The view specifies which subset of the Task has been returned.
     *
     * @return value or {@code null} for none
     */
    public String getView() {
        return view;
    }

    /**
     * Output only.
     * <p>
     * The view specifies which subset of the Task has been returned.
     *
     * @param view view or {@code null} for none
     */
    public Task setView(String view) {
        this.view = view;
        return this;
    }

}