package com.easemob.daas.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SessionSurvey {

    private String channelType;
    private String sessionId;
    private String effective;
    private String visitorMark;
    private String originType;
    private String createTime;
    private String avgResTime;
    private String tenantId;
    private String sessionType;
    private String organId;
    private String workTime;
    private String startTime;
    private String stopTime;
    private String step;
    private String msgCount;
    private String state;
    private String channelId;
    private String visitorId;
    private String agentType;
    private String sessionTag;
    private String satisfactionTag;
    private String visitorTag;
    private String groupId;
}
